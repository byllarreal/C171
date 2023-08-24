package Trabajos;

import java.util.Scanner;

public class OutIn {

    public void imprimir(String texto){
        System.out.println(texto);
    }

    public int promptInt(String solicitud){
        Scanner scanner=new Scanner(System.in);
        System.out.println(solicitud);
        return scanner.nextInt();
    }
    public String promptStr(String solicitud){
        Scanner scanner=new Scanner(System.in);
        System.out.println(solicitud);
        return scanner.nextLine();
    }



}
