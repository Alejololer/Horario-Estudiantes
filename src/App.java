import pkPoliEstudiante.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("0.Salir del sistema\n"
                          +"1.Crear estudiante\n"
                          +"2.Mostrar estudiante\n"
                          +"Ingrese la opcion: ");
        int i=sc.nextInt();
        return i;
    }

    public static String[][] crearHorario(){
        String[][] m=new String[6][7];
        m[0][0]="      ";
        m[1][0]="Lunes ";
        m[2][0]="Martes";
        m[3][0]="Miercoles";
        m[4][0]="Jueves";
        m[5][0]="Viernes";
        m[0][1]="7-9";
        m[0][2]="9-11";
        m[0][3]="11-13";
        m[0][4]="14-16";
        m[0][5]="16-18";
        m[0][6]="18-20";
        Scanner sc=new Scanner(System.in);
        int n=0;
        int j=7,k=9;
        for (int x=1; x < m.length; x++) {
            for (int y=1; y < m[x].length; y++) {
                if(j==20&&k==22){
                    j=7;
                    k=9;
                    n++;
                }
                System.out.println();
                switch(n){
                    case 0: System.err.println("Lunes"); break;
                    case 1: System.err.println("Martes"); break;
                    case 2: System.err.println("Miercoles"); break;
                    case 3: System.err.println("Jueves"); break;
                    case 4: System.err.println("Viernes"); break;
                }
                System.out.println("Ingrese la actividad a realizarse de "+j+" a "+k+": ");
                m[x][y]=sc.nextLine();
                j=j+2;
                k=k+2;
                if(j==13&&k==15){
                    j=14;
                    k=16;
                }
 
            }
        }

        return m;
    }

    public static void crearEstudiante(List<Estudiante>  lsProg){
        System.out.println();
        System.out.println("Ingrese el nombre del estudiante: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println();
        System.out.println("Ingrese el codigo del estudiante: ");
        int i=sc.nextInt();
        String[][] m=crearHorario();
        lsProg.add(new Estudiante(s,i,m));
    }

    public static void mostrarEstudiantes(List<Estudiante> lsProg){
        Scanner sc=new Scanner(System.in);
        System.err.println("Ingrese el codigo del estudiante: ");
        int i=sc.nextInt();
        for (Estudiante estudiante : lsProg) {
            if(i==estudiante.codigo){
                estudiante.ShowMe();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        List<Estudiante>  lsProg = new ArrayList<>();
        int i;
        do{
            i=menu();
            switch(i){
                case 0: System.exit(0);
                case 1: crearEstudiante(lsProg); break;
                case 2: mostrarEstudiantes(lsProg); break;
            }
        }while (true);
    }
}
