package pkPoliEstudiante;

import java.util.Arrays;

public class Estudiante{
    public String nombre;
    public int codigo;
    private String[][] horario;
    public Estudiante(String nombre,int codigo,String[][] horario){
        this.nombre=nombre;
        this.codigo=codigo;
        this.horario=horario;
    }
    public void ShowMe()
    {
        System.out.println("Codigo = " + codigo);
        System.out.println("Nombre = " + nombre);
        System.out.println("\nHorario:");
        int n=0;
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                char[] c=horario[i][j].toCharArray();
                if(c.length>9){
                    int p=0;
                    while(p<9){
                        System.out.print(c[p]);
                        n++;
                        p++;
                    }
                }else{
                    for(int k=0; k<c.length; k++){
                        System.out.print(c[k]);
                        n++;
                    }
                }
                while(n<=9){
                    System.err.print(" ");
                    n++;
                }
                n=0;
            }
            System.out.println();
        }
    }
}