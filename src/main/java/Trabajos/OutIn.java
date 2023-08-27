package Trabajos;

import java.util.Scanner;
//import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class vacio extends Exception {
    public vacio(String mensaje) {
        super(mensaje);
    }
}
public class OutIn {

    private static final Logger logger = LogManager.getLogger(OutIn.class);
    public void imprimir(String texto){
        System.out.println(texto);
    }

    public int promptInt(String solicitud){
        Scanner scanner=new Scanner(System.in);
        System.out.println(solicitud);
        return scanner.nextInt();
    }

    public double promptDou(String solicitud){
        Scanner scanner=new Scanner(System.in);
        System.out.println(solicitud);
        return scanner.nextDouble();
    }
    public String promptStr(String solicitud){
        Scanner scanner = new Scanner(System.in);
        System.out.println(solicitud);
        return scanner.nextLine();
    }
    public String promptSstr(String solicitud){
        String error="";
        String dato="";
        do {
            try {
                error="";
                Scanner scanner = new Scanner(System.in);
                System.out.println(solicitud);
                dato = scanner.nextLine();
                if (dato == "" || dato == null) {
                    throw new vacio("Debe ingresar dato");
                }
            } catch (vacio e) {
                error = e.getMessage();
                logger.atError().log(e);
            }finally {
                logger.atInfo().log("Validacion información");
            }
        }while(error!="");
        return dato;
    }

    public double promptDouble(String solicitud){
        String error="";
        String dato="";
        double num=0;
        do {
            dato="";
            Scanner scanner=new Scanner(System.in);
            System.out.println(solicitud);
            dato=scanner.nextLine();
            try {
                error="";
                num = Double.parseDouble(dato);
            } catch (Exception e) {
                error = e.getMessage();
                logger.atError().log(e);
            }finally {
                logger.atInfo().log("Validacion información");
            }
        }while(error!="" || dato.isEmpty() || (num<1 || num>5));
        return num;
    }




}
