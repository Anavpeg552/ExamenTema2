import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num_limite=s.nextInt();

        if(num_limite%2==0){
            for(int i=1; 5*i+5<=num_limite; i++) {
                if(i!=1){
                    System.out.print(", ");
                }
                System.out.print(5*i+5);
            }
        }else{
            for(int i=0; 3*i+10<=num_limite; i++) {
                if(i!=0){
                    System.out.print(", ");
                }
                System.out.print(3*i+10);
            }
        }
    }
}
