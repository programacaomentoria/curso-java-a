package exercicios.grupo2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClass {
   public void printNameAndAge(String nameToBePrinted, int age) {
        //print name and then age
        System.out.println(nameToBePrinted);
        this.printAge(age);
    }

    private void printAge(int ageToBePrinted) {
        System.out.println(ageToBePrinted);
    }

    public static void main(String[] args) {
        // new MyClass().printNameAndAge("Rodrigo", 45);
        usandoLoops();
    }

    public static void usandoLoops() {
        // int condicaoWhile = 0;
        // while (condicaoWhile < 10) {
            
        //     condicaoWhile++;
        // }
        
        // int condicaoDoWhile = 0;
        // do {
            
        //     condicaoDoWhile++;
        // } while(condicaoDoWhile < 10);

        for (int condicaoFor = 0; condicaoFor < 10; condicaoFor++) {
            if (condicaoFor % 2 == 0)
                continue;

            System.out.println("NUmero é " + condicaoFor + " impar seguramente!!! ");
        }
        
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 4, 9, 11, 2, 7, 5));
        System.out.println("Loop 1");
        for (Integer numero : array) {
            System.out.println(numero);
        }

        

        System.out.println("Loop 2");
        for (int indiceArray = 0; indiceArray < array.size(); indiceArray++){
            Integer numero = array.get(indiceArray);
            System.out.println(numero);
        }

        // for (; true;) {

        // }
        
        // int indiceSequencia = 0;
        // int condicaoDeParada = 100;
        // while(true){
        //     if (indiceSequencia == condicaoDeParada) {
        //         break;
        //     }

        //     if (indiceSequencia % 2 == 0)
        //         continue;

        //     System.out.println("Escrevendo indice na tela " + indiceSequencia);

        // }
    }
}
