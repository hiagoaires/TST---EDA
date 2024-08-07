import java.util.Arrays;
import java.util.Scanner;

class Implementacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] arrayStr = entrada.split(" ");
        int[] inteiros = new int[arrayStr.length];

        for (int i = 0; i < arrayStr.length; i++) {
            inteiros[i] = Integer.parseInt(arrayStr[i]);
        } // transforma array de str em array de int

        selectionSort(inteiros,0);
    }

    private static void selectionSort(int[] v, int inicio) {
        if (inicio>=v.length){
            return;}

        int indexMenor = inicio;

        for(int j = indexMenor+1 ; j<v.length; j++){
            if (v[j] < v[indexMenor]){
                indexMenor = j;
            }
        }
        int aux = v[inicio];
        v[inicio] = v[indexMenor];
        v[indexMenor] = aux;
        if(inicio<v.length-1) {
            System.out.println(Arrays.toString(v));
        }
        selectionSort(v, inicio+1);
    }
}
