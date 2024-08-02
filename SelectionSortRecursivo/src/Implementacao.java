import java.util.Arrays;
import java.util.Scanner;

public class Implementacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        String[] arrayStr = entrada.split(" ");
        int[] arrayInt = new int[arrayStr.length];

        for (int i = 0; i < arrayStr.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayStr[i]);
        } // transforma array de str em array de int

        selectionSort(arrayInt);
    }

    private static void selectionSort(int[] arrayInt) {
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

            if (i < arrayInt.length - 1) {
                System.out.println(Arrays.toString(arrayInt));
            }
        }
    }
}