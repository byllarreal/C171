package Trabajos;

import B1.Estudiante;
import B1.Outin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

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
        while (ant<=limite){
            secuencia.add(ant);
            sig=sig+ant;
            ant=sig-ant;
        }return secuencia;
    }

    //******************  Ejercicios resueltos en clase ***********************

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
        }

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
        }

        public void numerosPrimos(){
            List<Integer>primoss=new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                if(primos(i)){
                    primoss.add(i);
                }
            }

            System.out.println("Primos de 1-1000: " + primoss.toString());
        }

        public void secuenciaFibonacci(){
            System.out.println("Fibonacci hasta 20: " + fibonacci(20).toString());
        }

}

