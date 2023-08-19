package B1;

import java.util.Scanner;

public class TrabajoBloque1 {
    public static void main(String[] args) {
        int mayor=0;
        Outin outin=new Outin();
        Estudiante estudiante=new Estudiante("123456789");
        String nombre= outin.promptStr("Ingrese nombre estudiante: ");
        estudiante.setNombre(nombre);
        System.out.printf("Bienvenido Sr. %s, %s", estudiante.getNombre(), estudiante.getId());
        System.out.println("");
        int num=outin.promptInt("Ingrese número: ");
        if(num>mayor){
            mayor=num;
        }
        num=outin.promptInt("Ingrese número: ");
        if(num>mayor){
            mayor=num;
        }
        num=outin.promptInt("Ingrese número: ");
        if(num>mayor){
            mayor=num;
        }

        System.out.printf("El número mayor es: %d ",mayor);

    }
}
