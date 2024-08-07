import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] aux= entrada.split(" ");
        int[] inteiros = new int[aux.length];

        for(int i =0; i<aux.length; i++){
            inteiros[i] = Integer.parseInt(aux[i]);
        }

        System.out.println(Arrays.toString(insertion(inteiros)));
    }

    private static int[] insertion(int[]v){
        int i = 0;

        while (i<v.length-1 && v[i]>v[i+1]){
            int c = v[i];
            v[i] = v[i+1];
            v[i+1] = c;
            i++;
        }
        return v;
    }
}