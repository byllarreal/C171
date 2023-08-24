package Trabajos;

public class Index {
    public static void main(String[] args) {
        OutIn outin=new OutIn();
        outin.imprimir("*** Trabajos en clase **");
        outin.imprimir("Por Byron Villarreal");
        outin.imprimir("*** Lista de trabajos ***");
        outin.imprimir("1. Concepto de variables y wrappers");
        outin.imprimir("2. Ejemplo de clase y número mayor");
        outin.imprimir("3. Arreglo: Invertir orden");
        outin.imprimir("4. Ciclos: Primos del 1 al 1000");
        outin.imprimir("5. Ciclos: Secuencia Fibonacci limite 20");
        int ejercicio=outin.promptInt("Ingrese número de ejercicio: ");
        Exercises exercises=new Exercises();
        switch (ejercicio){
            case 1:exercises.conceptos();break;
            case 2:exercises.numeroMayor();break;
            case 3:exercises.invertirOrden();break;
            case 4:exercises.numerosPrimos();break;
            case 5:exercises.secuenciaFibonacci();break;
            default:outin.imprimir("Ejercicio inexistente!");
        }

    }
}
