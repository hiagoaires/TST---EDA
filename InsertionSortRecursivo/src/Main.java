import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] aux = entrada.split(" ");
        int[] inteiros = new int[aux.length];

        for(int i = 0; i<aux.length; i++){
            inteiros[i] = Integer.parseInt(aux[i]);
        }
        insertionRecursivo(inteiros, 1);
    }


    private static void insertionRecursivo(int[] v, int currentIndex){
        if(currentIndex>=v.length){
            return;
        }
        int j = currentIndex;
        while(j>0 && v[j]<v[j-1]){
            int aux = v[j];
            v[j] = v[j-1];
            v[j-1] = aux;
            j--;
        }
        System.out.println(Arrays.toString(v));
        insertionRecursivo(v, currentIndex+1);
    }
    }