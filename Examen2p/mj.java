import java.io.*;

public class mj{
    public void jugar2()throws IOException{
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        String juego[][];
        juego = new String[3][3];
        int n = 0;
        int fila;
        int columna;
        for (int a = 0; a <= 2; a = a + 1){
            for (int b = 0; b <= 2; b = b + 1){
                juego[a][b] = "?";
                int dato;
                int dato1;
                int datob;
                int datob2;
            }
        }

        try{
            System.out.println(" 0   1   2");
            System.out.println("0 " + juego[0][0] + " | " + juego[0][1] + " | " + juego[0][2]);
            System.out.println("  __________");
            System.out.println("2 " + juego[1][0] + " | " + juego[1][1] + " | " + juego[1][2]);
            System.out.println("  __________");
            System.out.println("3 " + juego[2][0] + " | " + juego[2][1] + " | " + juego[2][2]);

        while (n < 10){
            //Jugada del primer jugador.
            System.out.println("\nEs el turno del primer jugador.");
            System.out.println("\nIngrese la fila de su jugada.");
            int dato = Integer.parseInt(entrada.readLine());
            System.out.println("\nIngrese la columna de su jugada.");
            int dato1 = Integer.parseInt(entrada.readLine());
            
            //Comprobar si no se ha elegido una casilla previamente seleccionada.
            while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ){
                System.out.println("\nUbicaci\u00f3n ya ocupada. Ingrese una ubicaci\u00f3n libre.");
                System.out.println("\nIngrese una fila:");
                dato = Integer.parseInt(entrada.readLine());
                System.out.println("\nIngrese una columna:");
                dato1 = Integer.parseInt(entrada.readLine());
            }

            juego[dato][dato1] = "X";
            
            //Se imprime el tablero del gato con las jugadas realizadas.
            System.out.println("\n 0   1   2");
            System.out.println("0 " + juego[0][0] + " | " + juego[0][1] + " | " + juego[0][2]);
            System.out.println("  ___________");
            System.out.println("1 " + juego[1][0] + " | " + juego[1][1] + " | " + juego[1][2]);
            System.out.println("  ___________");
            System.out.println("2 " + juego[2][0] + " | " + juego[2][1] + " | " + juego[2][2]);

            //Condiciones de victoria del primer jugador.
            n = n + 1;

            if (juego[0][0]== "X" && juego[0][1]== "X" && juego [0][2]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }
        
            if (juego[1][0]== "X" && juego[1][1]== "X" && juego [1][2]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            else if (juego[2][0]== "X" && juego[2][1]== "X" && juego [2][2]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            if (juego[0][0]== "X" && juego[1][0]== "X" && juego [2][0]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            if (juego[0][1]== "X" && juego[1][1]== "X" && juego [2][1]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            if (juego[0][2]== "X" && juego[1][2]== "X" && juego [2][2]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            if (juego[0][0]== "X" && juego[1][1]== "X" && juego [2][2]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            if (juego[0][2]== "X" && juego[1][1]== "X" && juego [2][0]== "X"){
                System.out.println("El ganador es el primer jugador.");
            break;
            }

            if (n == 9){
            break;
            }

            //Jugada del segundo jugador.
            System.out.println("\nEs el turno del segundo jugador.");
            System.out.println("\nIngrese la fila de su jugada.");
            int datob = Integer.parseInt(entrada.readLine());
            System.out.println("\nIngrese la columna de su jugada.");
            int datob2 = Integer.parseInt(entrada.readLine());
        
            //Comprobar si no se ha elegido una casilla previamente seleccionada.
            while (juego[datob][datob2]== "O" || juego[datob][datob2]== "X" ){
                System.out.println("\nUbicaci\u00f3n ya ocupada. Ingrese una ubicaci\u00f3n libre.");
                System.out.println("\nIngrese una fila:");
                datob = Integer.parseInt(entrada.readLine());
                System.out.println("\nIngrese una columna:");
                datob2 = Integer.parseInt(entrada.readLine());
            }

            juego[datob][datob2] = "O";

            //Se imprime el tablero del gato con las jugadas realizadas.
            System.out.println("\n 0   1   2");
            System.out.println("0 " + juego[0][0] + " | " + juego[0][1] + " | " + juego[0][2]);
            System.out.println("  ____________");
            System.out.println("1 " + juego[1][0] + " | " + juego[1][1] + " | " + juego[1][2]);
            System.out.println("  ____________");
            System.out.println("2 " + juego[2][0] + " | " + juego[2][1] + " | " + juego[2][2]);

            n=n+1;
        
            //Condiciones de victoria del segundo jugador.
            if (juego[0][0]== "O" && juego[0][1]== "O" && juego [0][2]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[1][0]== "O" && juego[1][1]== "O" && juego [1][2]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[2][0]== "O" && juego[2][1]== "O" && juego [2][2]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[0][0]== "O" && juego[1][0]== "O" && juego [2][0]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[0][1]== "O" && juego[1][1]== "O" && juego [2][1]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[0][2]== "O" && juego[1][2]== "O" && juego [2][2]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[0][0]== "O" && juego[1][1]== "O" && juego [2][2]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            if (juego[0][2]== "O" && juego[1][1]== "O" && juego [2][0]== "O"){
                System.out.println("El ganador es el segundo jugador.");
            break;
            }

            //Condiciones para empate.
            if (n==9) {
            break;
            }
        }
        }catch(IOException io){
            System.out.println("Error" + io.getMessage() + ".");
        }
    }
}