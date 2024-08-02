import java.util.Arrays;
import java.util.Scanner;

public class SelectionPrac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // inicia o scanner (input)
        String entrada = sc.nextLine(); // atribui a string Entrada o input

        String[] elementos = new String[(entrada.split(" ")).length];
        elementos = entrada.split(" ");
                 // transforma a entrada em um array de strings
        int[] arrayInt = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) { //transforma o array de str em um array int
            arrayInt[i] = Integer.parseInt(elementos[i]);
        }


        System.out.println(Arrays.toString(selectionSort(arrayInt)));

    }

    public static int[] selectionSort(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            int indexMenor = i;
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[j] < arrayInt[indexMenor]) {
                    indexMenor = j;
                }
            }
            int aux = arrayInt[i];
            arrayInt[i] = arrayInt[indexMenor];
            arrayInt[indexMenor] = aux;

        }
        return arrayInt;
    }
}