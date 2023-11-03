import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce numero impar: ");
        n = s.nextInt();
        if(n % 2 == 0 || n<1){
            System.out.print("Número no válido: ");
        }else{
            for(int i=0; i<n; i++){
                for(int j=0; j<n-3; j++){
                    System.out.print(" ");
                }
                System.out.println("X");
            }
        }

    }
}
