import java.util.Scanner;
public class VerificaDuplicados{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] v = entrada.split(" ");

        System.out.println(verificador(v));
    }
    private static boolean verificador(String[] v){
        for (int i = 0; i<v.length; i++){
            for(int j=+1; j<v.length; j++){
                if (v[i].equals(v[j])){
                    return true;
                }
            }
        } return false;
    }
}