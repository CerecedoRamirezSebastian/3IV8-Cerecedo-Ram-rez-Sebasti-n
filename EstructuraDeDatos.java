import java.util.Scanner;
class EstructuraDeDatos{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion, edad, entero, numeros, positivos, negativos, iterador2, factorial, iterador, opcion2, modulo;
        double valor, lado1, lado2, area, perimetro, grados, conversion, suma;
        char letra;  
        String binario="";
        factorial=1;
        iterador=5;
        do{
            System.out.println("3IV8_Cerecedo_Ramírez_Sebastián");
            System.out.println("Bienvenido al menu, ¿Qué opción desea?: ");
            System.out.println("1. Descuento");
            System.out.println("2. Convertidor de decimal a binario");
            System.out.println("3. Convertidor de temperatura");
            System.out.println("4. Numeros positivos y numeros negativos");
            System.out.println("5. Total a pagar");
            System.out.println("6. Figuras geometricas");
            System.out.println("7. Tabla de valores");
            System.out.println("8. Numero factorial");
            System.out.println("9. Calculadora");
            System.out.println("10. Salir");
            System.out.println("Escoja una opcion");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: 
                    do{
                        System.out.println("Ingrese su edad (debe ser un entero positivo mayor o igual a 10 y menor o igual a 80)");
                        edad = entrada.nextInt();
                        if(edad>=10&&edad<=80){
                            if (edad>65){
                                System.out.println("usted tiene un descuento de 45%");
                            }
                            else{
                                if (edad<21){
                                    System.out.println("Sus papas son socios? Escriba una s si es cierto o una n si no");
                                    letra = entrada.next().charAt(0);
                                    if(letra=='s'){
                                        System.out.println("Su descuento es del 45%");
                                    }
                                    else{
                                        System.out.println("Su descuento es del 25%");
                                    }
                                }
                                else{
                                    System.out.println("Su descuento es del 25%");
                                }
                            }
                        }
                        else{
                            System.out.println("Usted ingreso una edad que no esta dentro de los limites");
                        }
                        System.out.println("Elija una de las siguientes opciones: ");
                        System.out.println("Ingrese una s si desea volver a repetir este programa");
                        System.out.println("Ingrese una v si quiere volver al menu principal");
                        letra=entrada.next().charAt(0);
                    } while (letra=='s');
                    break;
                case 2:
                    do{
                        System.out.println("Ingrese un entero positivo");
                        entero=entrada.nextInt();
                        numeros=entero;
                        if(entero>0){
                            while (entero > 0) {
                                modulo=entero%2;
                                binario=modulo+binario;
                                entero/=2;
                            }
                            System.out.println("El numero base 10: "+numeros+" convertido a base 2: "+binario);
                        }
                        else{ 
                            if (entero == 0) {
                                System.out.println("El numero base 10: 0 convertido a base 2: 0");
                            } 
                            else {
                                System.out.println("Usted ingreso un entero no positivo");
                            }
                        }
                        binario="";
                        System.out.println("Elija una de las siguientes opciones: ");
                        System.out.println("Ingrese una s si desea volver a repetir este programa");
                        System.out.println("Ingrese una v si quiere volver al menu principal");
                        letra=entrada.next().charAt(0);
                    } while(letra=='s');
                    break;
                case 3:
                    do{
                        System.out.println("Elija el tipo de cambio de unidad");
                        System.out.println("1. Fahrenheit a Celsius");
                        System.out.println("2. Fahrenheit a Kelvine");
                        System.out.println("3. Fahrenheit a Rankine");
                        System.out.println("4. Celsius a Fahrenheit");
                        System.out.println("5. Celsius a Kelvine");
                        System.out.println("6. Celsius a Rankine");
                        System.out.println("7. Kelvine a Fahrenheit");
                        System.out.println("8. Kelvine a Celsius");
                        System.out.println("9. Kelvine a Rankine");
                        System.out.println("10. Rankine a Fahrenheit");
                        System.out.println("11. Rankine a Celsius");
                        System.out.println("12. Rankine a Kelvine");
                        opcion2=entrada.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.println("Ingresa los grados Fahrenheit a convertir (debe de ser mayor o igual a -459.67)");
                                grados=entrada.nextDouble();
                                if(grados>=-459.67){
                                    conversion=(grados-32)*5/9;
                                    System.out.println(grados+" los grados Fahrenheit son "+conversion+" grados Celsius");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 2:
                                System.out.println("Ingresa los grados Fahrenheit a convertir (debe de ser mayor o igual a -459.67)");
                                grados=entrada.nextDouble();
                                if(grados>=-459.67){
                                    conversion=((grados-32)/1.8)+273.15;
                                    System.out.println(grados+" Los grados Fahrenheit son "+conversion+" grados Kelvine");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }                           
                                break;
                            case 3:
                                System.out.println("Ingresa los grados Fahrenheit a convertir (debe de ser mayor o igual a -459.67)");
                                grados=entrada.nextDouble();
                                if (grados>=-459.67){
                                    conversion=grados+459.67;
                                    System.out.println(grados+" Los grados Fahrenheit son "+conversion+" grados Rankine");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 4:
                                System.out.println("Ingresa los grados Celsius a convertir (debe de ser mayor o igual a -273.15)");
                                grados=entrada.nextDouble();
                                if (grados>=-273.15){
                                    conversion=(grados*1.8)+32;
                                    System.out.println(grados+" Los grados Celsius son "+conversion+" grados Fahrenheit");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 5:
                                System.out.println("Ingresa los grados Celsius a convertir (debe de ser mayor o igual a -273.15)");
                                grados=entrada.nextDouble();
                                if (grados>=-273.15){
                                    conversion=grados+273.15;
                                    System.out.println(grados+" Los grados Celsius "+conversion+" grados Kelvine");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 6:
                                System.out.println("Ingresa los grados Celsius a convertir (debe de ser mayor o igual a -273.15)");
                                grados=entrada.nextDouble();
                                if(grados>=-273.15){
                                    conversion=(grados*1.8)+491.68;
                                    System.out.println(grados+" Los grados Celsius son "+conversion+" grados Rankine");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 7:
                                System.out.println("Ingresa los grados Kelvine a convertir (debe de ser mayor o igual a 0)");
                                grados=entrada.nextDouble();
                                if(grados>=0){
                                    conversion=(grados-273.15)*1.8;
                                    System.out.println(grados+" Los grados Kelvine son "+conversion+" grados Fahrenheit");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 8:
                                System.out.println("Ingresa los grados Kelvine a convertir (debe de ser mayor o igual a 0)");
                                grados=entrada.nextDouble();
                                if (grados>=0){
                                    conversion=grados-273.15;
                                    System.out.println(grados+" Los grados Kelvine son "+conversion+" grados Celsius");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 9:
                                System.out.println("Ingresa los grados Kelvine a convertir (debe de ser mayor o igual a 0)");
                                grados=entrada.nextDouble();
                                if (grados>=0){
                                    conversion=(grados-273.15)*1.8+491.69;
                                    System.out.println(grados+" Los grados Kelvine "+conversion+" grados Rankine");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 10:
                                System.out.println("Ingresa los grados Rankine a convertir (debe de ser mayor o igual a 0)");
                                grados=entrada.nextDouble();
                                if (grados>=0){
                                    conversion=grados-459.67;
                                    System.out.println(grados+" Los grados Rankine "+conversion+" grados Fahrenheit");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 11:
                                System.out.println("Ingresa los grados Rankine a convertir (debe de ser mayor o igual a 0)");
                                grados=entrada.nextDouble();
                                if (grados>=0){
                                    conversion=(grados-491.67)/1.8;
                                    System.out.println(grados+" Los grados Rankine son "+conversion+" grados Celsius");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 12:
                                System.out.println("Ingresa los grados Rankine a convertir (debe de ser mayor o igual a 0)");
                                grados=entrada.nextDouble();
                                if (grados>=0){
                                    conversion=(grados-491.67)/1.8+273.15;
                                    System.out.println(grados+" Los grados Rankine son "+conversion+" grados Kelvine");
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            default:
                                System.out.println("Usted no eligio ninguna opcion"); 
                        }
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere volver a ver la tabla");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    }while(letra=='s');
                    break;
                case 4:
                    do{
                        System.out.println("Ingrese un numero entero positivo");
                        numeros=entrada.nextInt();
                        if (numeros>0){
                            iterador2=numeros;
                            positivos=0;
                            negativos=0;
                            while(iterador2>0){
                                System.out.println("Ingrese un numero");
                                valor=entrada.nextDouble();
                                if(valor<0){
                                    negativos++;
                                }
                                else{
                                    if(valor>0){
                                        positivos++;
                                    }
                                }
                                iterador2--;
                            }
                            System.out.println("Usted ingreso "+negativos+" numeros negativos");
                            System.out.println("usted ingreso "+positivos+" numeros positivos");
                        }
                        else{
                            System.out.println("Numero no valido");
                        }
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere repetir el mismo problema");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    } while(letra=='s');
                    break;
                case 5:
                    do{
                        System.out.println("Ingrese un entero positivo");
                        entero=entrada.nextInt();
                        numeros=0;
                        suma=0;
                        if(entero>0){
                            iterador2=entero;
                            while(iterador2>0){
                                System.out.println("Ingresa una cantidad mayor a 0");
                                valor=entrada.nextDouble();
                                if(valor>0){
                                    suma+=valor;
                                    numeros++;
                                }
                                iterador2--;
                            }
                            System.out.println("Usted comopro "+numeros+" articulos y el monto total es de: "+suma);
                        }
                        else{
                            System.out.println("Numero no valido");
                        }
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere repetir el mismo problema");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    }while(letra=='s');
                    break;
                case 6:
                    do{
                        System.out.println("Elija una de las siguiente opciones");
                        System.out.println("1. Calcular el area y perimetro de un rectangulo");
                        System.out.println("2. Calcular el area y perimetro de un triangulo");
                        System.out.println("3. Calcular el volumen de una esfera y de un cilindro");
                        opcion2=entrada.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.println("Ingrese el primer lado (debe de ser un numero positivo)");
                                lado1=entrada.nextDouble();
                                if (lado1>0){
                                    System.out.println("Ingrese el segundo lado (debe de ser un numero positivo diferente al primero)");
                                    lado2=entrada.nextDouble();
                                    if (lado2>0&&lado2!=lado1){
                                        area=lado1*lado2;
                                        perimetro=(lado1*2)+(lado2*2);
                                        System.out.println("El area del rectangulo es: "+area+", y el perimetro es: "+perimetro);
                                    }
                                    else{
                                        System.out.println("Usted no ingreso un numero positivo o un numero diferente al primer numero");
                                    }
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese la base (debe de ser un numero positivo)");
                                lado1=entrada.nextDouble();
                                if (lado1>0){
                                    System.out.println("Ingrese la altura (debe de ser un numero positivo)");
                                    lado2=entrada.nextDouble();
                                    if (lado2>0){
                                        area=lado1*lado2/2;
                                        perimetro=lado1*3;
                                        System.out.println("El area del triangulo es: "+area+", el perimetro es: "+perimetro);
                                    }
                                    else{
                                        System.out.println("Numero no valido");
                                    }
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            case 3:
                                System.out.println("Ingresa el radio de la esfera (debe de ser un numero positivo)");
                                lado1=entrada.nextDouble();
                                if (lado1>0){
                                    area=(4/3)*3.1416*(lado1*lado1*lado1);
                                    System.out.println("El area de la esfera es: "+area);
                                }
                                else{
                                    System.out.println("Usted no ingreso un numero positivo");
                                }
                                System.out.println("Ingresa el radio del cilindro (debe de ser un numero positivo)");
                                lado1=entrada.nextDouble();
                                if (lado1>0){
                                    System.out.println("Ingresa la altura del cilindro (debe de ser un numero positivo)");
                                    lado2=entrada.nextDouble();
                                    if (lado2>0){
                                        area=3.1416*(lado1*lado1)*lado2;
                                        System.out.println("El area del cilindro es: "+area);
                                    }
                                    else{
                                        System.out.println("Numero no valido");
                                    }
                                }
                                else{
                                    System.out.println("Numero no valido");
                                }
                                break;
                            default:
                        }
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere repetir el mismo problema");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    }while(letra=='s');
                    break;
                case 7: 
                    do{
                        System.out.println("La tabla es la siguiente");
                        System.out.println("-------------------------");
                        System.out.println("|N    |     |     |     |");
                        System.out.println("-------------------------");
                        iterador=1;
                        while(iterador<10){
                            System.out.println("|"+iterador+"    |"+iterador+"0   |"+iterador+"00  |"+iterador+"000 |");
                            System.out.println("-------------------------");
                            iterador++;
                        }
                        iterador=1;
                        System.out.println("|10   |100  |1000 |1000 |");
                        System.out.println("-------------------------");
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere volver a ver la tabla");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    }while(letra=='s');
                    break;
                case 8:
                    do{
                        System.out.println("Ingrese un numero entero positivo menor o igual a 12");
                        numeros=entrada.nextInt();
                        if (numeros>0&&numeros<=12){
                            iterador2=numeros;
                            while(iterador2>0){
                                factorial*=iterador2;
                                iterador2--;
                            }
                            System.out.println("El numero "+numeros+"! es igual a "+factorial);
                            factorial=1;
                        }
                        else{
                            System.out.println("Numero no valido");
                        }
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere repetir el mismo problema");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    }while(letra=='s');
                    break;
                case 9: 
                    do{
                        System.out.println("Si quiere salir de la calculadora usted debe de ingresar un 0");
                        System.out.println("Ingrese el valor inicial de su cuenta");
                        valor=entrada.nextDouble();
                        suma=valor;
                        if(valor==0){
                            System.out.println("Usted ingreso una cantidad 0");
                        }
                        while(valor!=0){
                            System.out.println("Escoja una opcion de las siguientes");
                            System.out.println("1. Multiplicacion");
                            System.out.println("2. Division");
                            System.out.println("3. Suma");
                            System.out.println("4. Resta");
                            opcion2=entrada.nextInt();
                            System.out.println("Ingresa el valor a acumular en la cuenta");
                            System.out.println("Recuerda si quieres salir debes de ingresar un 0");
                            valor=entrada.nextDouble();
                            if (valor!=0){
                                switch(opcion2){
                                    case 1:
                                        suma*=valor;
                                        System.out.println("El total de la cuenta hasta ahorita es de "+suma);
                                        break;
                                    case 2:
                                        suma/=valor;
                                        System.out.println("El total de la cuenta hasta ahorita es de "+suma);
                                        break;
                                    case 3:
                                        suma+=valor;
                                        System.out.println("El total de la cuenta hasta ahorita es de "+suma);
                                        break;
                                    case 4:
                                        suma-=valor;
                                        System.out.println("El total de la cuenta hasta ahorita es de "+suma);
                                        break;
                                    default:
                                        System.out.println("Usted no escogio ninguna opcion");
                                }
                            }
                            else{
                                System.out.println("El total de la cuenta es "+suma);
                            }
                        }
                        suma=0;
                        System.out.println("Elija una de las siguientes opciones");
                        System.out.println("Escriba una s si quiere repetir el mismo problema");
                        System.out.println("Escriba una v si quiere volver al menu principal");
                        System.out.println("Escriba una n si quiere salir");
                        letra=entrada.next().charAt(0);
                    }while(letra=='s');
                    break;
                default: 
                    System.out.println("Muchas gracias por usar el menu");
            }
            System.out.println("Elija una de las siguientes opciones");
            System.out.println("Escriba una s si quiere volver a repetir el menu");
            System.out.println("Escriba una n si quiere salir");
            letra=entrada.next().charAt(0);
        } while (letra=='s');

    }
}