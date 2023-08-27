package Trabajos;

import B1.Estudiante;
import B1.Outin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    //*********** Mis Variables globales **************
    private String pausa="";
    private OutIn outin=new OutIn();

    //*********** Mis Funciones ************************
    static boolean primos(int num){
        int ceros=0;
        boolean es=false;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                ceros++;
            }
        }if(ceros==2){
            es=true;
        }return es;
    }

    static List<Integer> fibonacci(int limite){
        int sig=1;
        int ant=0;
        List<Integer> secuencia=new ArrayList<>();
        while (secuencia.size()<limite){
            secuencia.add(ant);
            sig=sig+ant;
            ant=sig-ant;
        }return secuencia;
    }

    static String aprobado(double nota){
        if(nota>=3){
            return "Estudiante APROBADO";
        }else{
            return "Estudiante REPROBADO";
        }
    }

    //******************  Ejercicios resueltos en clase ***********************
    public void porDefecto(){
        pausa= outin.promptStr("No existe el ejercicio");
    }

    /*  Vimos conceptos y fundamentos básicos del lenguaje JAVA, en especial
        los diferentes tipos de variables y wrappers */
        public void conceptos(){
            OutIn outin = new OutIn();
            outin.imprimir("*** Tipos de variables ***");
            outin.imprimir("1. Int: Representa números enteros");
            outin.imprimir("2. double: Representa números de punto flotante de doble precisión.");
            outin.imprimir("3. float: Representa números de punto flotante de precisión simple.");
            outin.imprimir("4. long: Representa números enteros largos.");
            outin.imprimir("5. short: Representa números enteros cortos.");
            outin.imprimir("6. byte: Representa números enteros pequeños.");
            outin.imprimir("7. char: Representa un único carácter Unicode.");
            outin.imprimir("8. boolean: Representa valores verdadero o falso.");
            outin.imprimir("*** Wrappers (Clases envolventes) ***");
            outin.imprimir("1. Integer: Envuelve un valor entero (int).");
            outin.imprimir("2. Double: Envuelve un valor de punto flotante de doble precisión (double).");
            outin.imprimir("3. Float: Envuelve un valor de punto flotante de precisión simple (float).");
            outin.imprimir("4. Long: Envuelve un valor entero largo (long).");
            outin.imprimir("5. Short: Envuelve un valor entero corto (short).");
            outin.imprimir("6. Byte: Envuelve un valor entero pequeño (byte).");
            outin.imprimir("7. Character: Envuelve un carácter Unicode (char).");
            outin.imprimir("8. Boolean: Envuelve un valor booleano (boolean).");

            pausa= outin.promptStr("Enter para continuar");
        }

        /* Vimos como hacer una clase, sus propiedades y constructor, tambien como
            hacer privada una propiedad y manipularla con get y set
            Aca me adelanto un poco y motivado por una pregunta que hice sobre como
            funciona el System.out.printLn() y por que se debe utilizar el Scanner para
            capturar un dato, creo mi propia clase OutIn con los métodos imprimir y prompt
            que me facilita la impresión y captura de datos.*/
        public void numeroMayor(){
            int mayor=0;
            OutIn outin=new OutIn();
            Estudent estudiante=new Estudent("123456789");
            String nombre= outin.promptStr("Ingrese nombre estudiante: ");
            estudiante.setNombre(nombre);
            System.out.printf("Bienvenido Sr. %s, %s", estudiante.getNombre(), estudiante.getId());
            outin.imprimir("");
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
            System.out.printf("El número mayor es: %d ", mayor);
            outin.imprimir("");
            pausa= outin.promptStr("Enter para continuar");
        }

        /* Vimos el concepto de Arrays o arreglos, que son tipos de variables donde se pueden
            almacenar varios datos, y que podemos recorrerlos con los diferentes ciclos*/
        public void invertirOrden(){
            int numeros[]=new int[5];
            int nums[]=new int[5];
            numeros[0]=3;
            numeros[1]=0;
            numeros[2]=-1;
            numeros[3]=2;
            numeros[4]=4;

           for (int i = numeros.length-1; i >=0 ; i--) {
                nums[(numeros.length-1)-i]=numeros[i];
            }
            System.out.println(Arrays.toString(nums));

            pausa= outin.promptStr("Enter para continuar");
        }

        /* Aca reforzamos el concepto de ciclos y listas y como podemos recorrerlas para
            guardar o devolver datos */
        public void numerosPrimos(){
            List<Integer>primoss=new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                if(primos(i)){
                    primoss.add(i);
                }
            }

            System.out.println("Primos de 1-1000: " + primoss.toString());

            pausa= outin.promptStr("Enter para continuar");
        }

        public void secuenciaFibonacci(){
            System.out.println("Fibonacci los perimeros 20: " + fibonacci(20).toString());

            pausa= outin.promptStr("Enter para continuar");
        }

        /* Vimos la estructura try{}catch, para la validación de errores
           Y como implementarla en la solicitud de datos por ejmeplo,
           también vimos como implementar alguna libreria de log de la
            página maven repository, como respuesta al tipo de errores*/

        public void proyectoFinal(){
            outin.imprimir("Solicitud datos Estudiante");
            Estudent estudent=new Estudent("S01");
            boolean error=false;
            do {
                try {
                    error=false;
                    estudent.setNombre(outin.promptSstr("Ingrese nombre del estudiante: "));
                    estudent.setApellido(outin.promptSstr("Ingrese apellido del estudiante: "));
                    estudent.setTelefono(outin.promptSstr("Ingrese teléfono del estudiante: "));
                    estudent.setCedula(outin.promptSstr("Ingrese cédula del estudiante: "));
                    estudent.setPrograma(outin.promptSstr("Ingrese programa del estudiante: "));
                    estudent.setPromedio(outin.promptDouble("Ingrese promedio del estudiante: "));
                } catch (Exception e) {
                    outin.imprimir("Tipo de datos incorrectos");
                    error=true;
                }
            }while(error);

            outin.imprimir(aprobado(estudent.getPromedio()) + ":");
            outin.imprimir("Nombre: " + estudent.getNombre());
            outin.imprimir("Apellido: " + estudent.getApellido());
            outin.imprimir("Teléfono: " + estudent.getTelefono());
            outin.imprimir("Cédula: " + estudent.getCedula());
            outin.imprimir("Programa: " + estudent.getPrograma());
            outin.imprimir("Promedio: " + String.valueOf(estudent.getPromedio()));
            outin.imprimir("Successful record in table " + aprobado(estudent.getPromedio()).substring(11));

            pausa= outin.promptStr("Enter para continuar");
        }

}

