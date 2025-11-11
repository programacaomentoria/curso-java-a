package exercicios.grupo5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ExerciseFileBuilder {
    private static ExerciseFileBuilder instanceFileBuilder = null;

    public static ExerciseFileBuilder getInstance() {
        return (instanceFileBuilder == null) ? new ExerciseFileBuilder() : instanceFileBuilder;
    }

    class ContentExerciseFile {
        String exerciseNumber;
        String exerciseGroup;
        String exerciseObjective;

        public ContentExerciseFile(String wholeContent) {
            String[] contentArray = wholeContent.split("\t");
            this.exerciseNumber = contentArray[0];
            this.exerciseGroup = contentArray[1];
            this.exerciseObjective = contentArray[2];
        }
    }

    private static ContentExerciseFile createContentInstance(String contentFile) {
        return getInstance().createNewContentExerciseInstance(contentFile);
    }

    private ContentExerciseFile createNewContentExerciseInstance(String contentFile) {
        return new ContentExerciseFile(contentFile);
    }

    private static enum SupportedLanguages {
        JAVA, PYTHON
    }

    public static void makeDir() {

    }

    public static ArrayList<ContentExerciseFile> getContentFileByFilename(String path, String filename) throws IOException{
        ArrayList<ContentExerciseFile> contentLine = new ArrayList<ContentExerciseFile>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path + filename, StandardCharsets.UTF_8))) {
            String contentInLine = reader.readLine();
            while (contentInLine != null) {
                ContentExerciseFile content = createContentInstance(contentInLine);
                contentLine.add(content);

                contentInLine = reader.readLine();
            }
        }
        catch (FileNotFoundException ex) {
            throw ex;
        }
        catch (IOException ex) {
            throw ex;
        }
        return contentLine;
    }

    public static void createFileByNameAndContent(String path, String filenameWithExtension, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + filenameWithExtension, StandardCharsets.UTF_8))) {
            writer.write(content);
        }
        catch (FileNotFoundException ex) {
            throw ex;
        }
        catch (IOException ex) {
            throw ex;
        }
    }

    public static String getBasicContentByLanguage(String header, SupportedLanguages language, String bodyContent, String pathFromRef, String filename) {
        StringBuilder fullContent = new StringBuilder();
        switch (language){
            case JAVA:
                String packageInfo = pathFromRef.toLowerCase().replace("/", ".");
                if (packageInfo.startsWith(".")) {
                    packageInfo = packageInfo.substring(1, packageInfo.length());
                }
                if (packageInfo.endsWith(".")) {
                    packageInfo = packageInfo.substring(0, packageInfo.length() - 1);
                }

                packageInfo += ";";
                fullContent.append(header);
                fullContent.append("\n\npackage " + packageInfo);
                fullContent.append("\n\npublic class " + filename.replace(".java", "") + "{\n");
                fullContent.append("\tpublic static void main(String[] args) {\n");
                for (String lineBody : bodyContent.split(";")){
                    fullContent.append("\t\t" + lineBody.replace("'", "\"") + ";\n");
                }
                // fullContent.append(bodyContent.replace("'", "\""));
                fullContent.append("\t}\n}");
                break;
            case PYTHON:
                
                break;

        }
        return fullContent.toString();
    }

    public static void main(String[] args) {
        try{
            String pathRoot = "/Users/rodrigofischer/apps/projetos/github/curso-java-a/";
            for(ContentExerciseFile content : getContentFileByFilename(pathRoot, "lista_exercicios_g4.txt")){
                String groupFolder = "/exercicios/grupo" + content.exerciseGroup + "/";
                String filenameToCreate = "Exercicio" + content.exerciseNumber + ".java";
                String fileContent = getBasicContentByLanguage("//" + content.exerciseObjective, SupportedLanguages.JAVA, 
                "System.out.println('Ola mundo');", groupFolder, filenameToCreate);
                createFileByNameAndContent(pathRoot + groupFolder, filenameToCreate, fileContent);
            }
            
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
    }    
}