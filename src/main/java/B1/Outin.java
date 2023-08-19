package B1;

import java.util.Scanner;

public class Outin {

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
