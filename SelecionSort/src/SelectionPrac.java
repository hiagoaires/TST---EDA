import java.util.Arrays;
import java.util.Scanner;

class SelectionPrac {
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


        selectionSort(arrayInt);

    }

    public static void selectionSort(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            boolean houveTroca= false;
            int indexMenor = i;
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[j] < arrayInt[indexMenor]) {
                    indexMenor = j;
                    houveTroca= true;
                }
            }
            int aux = arrayInt[i];
            arrayInt[i] = arrayInt[indexMenor];
            arrayInt[indexMenor] = aux;

            if (houveTroca == true){
            System.out.println(Arrays.toString(arrayInt));
        }}
    }
}
