import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int piso =0 , aux=-1, longitud=0;
        Scanner s=new Scanner(System.in);
        do{
            piso=s.nextInt();
            if(piso>=0){
                if(aux!=-1){
                    if(aux>piso){
                        longitud=longitud+(aux-piso);
                    }else{
                        longitud=longitud+(piso-aux);
                    }

                }
            }
            aux=piso;
        }while(piso!=-1);

        System.out.println(longitud);

    }
}
