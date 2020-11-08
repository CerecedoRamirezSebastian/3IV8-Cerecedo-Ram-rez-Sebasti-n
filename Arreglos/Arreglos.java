/*
*Programa que implementa soluciones 
*para arreglos 
*/

//Librerias
import java.util.Scanner;

//Clase donde se generaran los métodos a usar
public class Arreglos{
    //Variables globales del programa
    int numeros[] = new int[10];
    float promedio = 0;

    public static void main(String args[]){
        //Objetos a emplear en el programa
        Scanner input = new Scanner(System.in);
        Arreglos trial = new Arreglos();

        //Varibales a utilizar
        char repetir;
        
        //Ejecución principal del programa 
        do{
            //Función con el menu ejecutable
            trial.menu();

            //Opción para repetir el programa
            System.out.println("Desesa repetir el programa s/n: ");
            repetir = input.next().charAt(0);
        }while(repetir=='s');
    }
    //Método menu para la ejecución
    public void menu(){
        Scanner input = new Scanner(System.in);

        int seleccion;

        System.out.println("Seleccione la opcion a ejecutar: ");
        System.out.println("1.-Promedio de positivos");
        System.out.println("2.-Promedio de los pares");
        System.out.println("3.-Calificaciones grupo 3IV8");
        System.out.println("4.-Suma de matrices");
        seleccion = input.nextInt();

        switch(seleccion){
            case 1:
                promedioPoNe();
                break;
            case 2:
                promedioPa();
                break;
            case 3:
                calificaciones();
                break;
            case 4:
                sumaM();
                break;
            default:
                System.out.println("Valor inaceptable");

        }
    }

    public void promedioPoNe(){
        Scanner input = new Scanner(System.in);

        float promedioPo = 0, promedioNe = 0;
        int cpositivos = 0, cnegativos = 0;

        for(int i = 0;i < numeros.length;i++){
            System.out.println("Introduce el valor "+(i+1)+":");
            numeros[i] = input.nextInt();

            if(numeros[i] < 0){
                promedioNe += numeros[i];
                cnegativos++;
            }else{
                promedioPo += numeros[i];
                cpositivos++;
            }
        }

        promedioPo = promedioPo/cpositivos;
        promedioNe = promedioNe/cnegativos;

        System.out.println(String.format("El promedio de los positivos es: %.1f", promedioPo));
        System.out.println(String.format("El promedio de los negativos es: %.1f", promedioNe));
    }

    public void promedioPa(){
        Scanner input = new Scanner(System.in);

        for(int i = 0;i < numeros.length;i++){
            System.out.println("Introduce el valor "+i+":");
            numeros[i] = input.nextInt();

            if(i % 2 == 0){
                promedio += numeros[i];
            }
        }

        promedio /= 5;

        System.out.println(String.format("El promedio de los valores en lugares pares es: %.1f",promedio));

    }

    public void calificaciones(){
        Scanner input = new Scanner(System.in);

        int aprobados = 0, reprobados = 0, superiores = 0, baja = 10, alta = 0;
        promedio = 0;

        for(int i = 0; i < numeros.length;i++){
            System.out.println("Introduce el valor "+(i+1)+":");
            numeros[i] = input.nextInt();
            promedio += numeros[i];
            
            if(numeros[i] > alta){
                alta = numeros[i];
            }
            if(numeros[i] < baja){
                baja = numeros[i];
            }
            if(numeros[i] >= 6){
                aprobados++;
            }
        }

        reprobados = 10 - aprobados;
        promedio /= 10;

        for(int i = 0; i < 10;i++){
            System.out.println(String.format("La calificacion numero %d es: %d",i+1,numeros[i]));
            if(numeros[i] > promedio){
                superiores++;
            }
        }

        System.out.println(String.format("El promedio del grupo es: %.1f",promedio));
        System.out.println(String.format("La calificacion mas alta es: %d",alta));
        System.out.println(String.format("La calificacion mas baja es: %d",baja));
        System.out.println(String.format("Las cantidad de calificaciones superiores al promedio es de: %d",superiores));
        System.out.println(String.format("Los alumnos aprobados son: %d",aprobados));
        System.out.println(String.format("Los alumnos reprobados son: %d",reprobados));

    }

    public void sumaM(){
        Scanner input = new Scanner(System.in);

        int ma1[][] = new int [3][3];
        int ma2[][] = new int[3][3];
        int resul[][] = new int[3][3];

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("Introduce el valor numero "+(i+j+1)+" de la primer matriz:");
                ma1[i][j] = input.nextInt();
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("Introduce el valor numero "+(i+j+1)+" de la segunda matriz:");
                ma2[i][j] = input.nextInt();
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                resul[i][j] = ma1[i][j] + ma2[i][j];
            }
        }
        System.out.println("El resultado de la suma de matrices es : ");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(" "+resul[i][j]+" ");
            }
            System.out.println("");
        }

    }

}