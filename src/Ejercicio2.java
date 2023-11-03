import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int nota, total=0, contAlumno=0, aprobados=0, suspensos=0;

        Scanner s =new Scanner(System.in);
        System.out.println("Introduce notas (-1 SALIR):");

        do{
            nota=s.nextInt();
            if(contAlumno==0 && nota==-1){
                break;
            }
            if(nota>=0){
                total=total+nota;
                contAlumno++;
                if(nota<5){
                    suspensos++;
                }else{
                    aprobados++;
                }
            }

        }while (nota!=-1);

        if(contAlumno!=0) {
            double media = ((double) (total / contAlumno));
            //%02d ??
            System.out.println("La media es "+ media);
            System.out.println("Aprobados: " + aprobados + " - Suspensos: " + suspensos);
        }else{
            System.out.println("No se han introducido calificaciones");
        }
    }
}
