import java.io.*;
public class JuegoGato{
  //Variables.  
    public char [] [] tablero;
    public char jugadorUno;
    public char jugadorDos;
    public boolean turno;
    int contador;        

 //Constructor(Inicializa Variables).
    public JuegoGato(){
       
        tablero      = new char[3][3];               
        jugadorUno   = 'X';
        jugadorDos   = 'O';
        turno        = true;  //Si El Valor De "turno" Es Igual A "true" El Turno Es Del Jugador 1, De Lo Contrario Es Jugador 2.
        int contador = 0;     //Lleva Cuenta De Las Veces Que Han Participado Los Jugadores 1 y 2.
        inicializarTablero();  
    }
       
  //Inicia El Arreglo, Especifica El Numero Que Le Corresponde A Cada Casilla.
    public void inicializarTablero(){
       
        int posicion = 1;
       
        for(int i=0;i<3;i++){
               
                for(int j=0; j<3;j++){
                       
                        tablero[i][j] = Integer.toString(posicion).charAt(0);
                        posicion++;
                }                      
        }
    }
   
  //Imprime El Formato Del Tablero.
    public void imprimirTablero(){
               
        for(int i=0;i<3;i++){
               
                for(int j=0;j<3;j++){
                       
                        if(j<2)
                       
                                System.out.print(" " + tablero[i][j] + " |");
                       
                        else
                               
                                System.out.print(" " + tablero[i][j] + " ");
                                                               
                }
               
                if(i<2)
                       
                        System.out.println("\n-----------");                                                                   
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
   
  //Indica La Posicion Donde Se Ingresara El Dato Dentro Del Arreglo Por Medio De Parametros.  
    public void indicarPosicionArreglo (int a, int b, char c) {tablero [a][b]=c;}
  //Manipula el valor De La Variable "turno".  
    public void setTurno               (boolean d)            {turno         =d;}
  //Manipula el valor De La Variable "contador".  
    public void setContador            (int e)                {contador      =e;}
   
  //Regresa Valor De La Posicion Del Arreglo Indicada Por Medio De Parametros.  
    public char getPosicionArreglo (int a, int b)  {return tablero[a][b];}
       
  //Regresa Valor De La Variable "jugadorUno".
    public char getJugadorUno      ()  {return jugadorUno   ;}            
   
  //Regresa Valor De La Variable "jugadorDos".
    public char getJugadorDos      ()  {return jugadorDos   ;}            
 
  //Regresa Valor De La Variable "turno".
    public boolean getTurno        ()  {return turno        ;}
  //Regresa Valor De La Variable "contador".              
    public int getContador         ()  {return contador     ;}          
   
   
  //Imprime e Indica El El Turno Del Jugador Que Le Toca Elejir Una Casilla Con Ayuda del Metodo "getTurno()".
    public void indicarTurno(){
       
        if(getTurno()==true)
               
                System.out.println("JUGADOR 1: Elija Una Casilla Ingresando El Numero Correspondiente.");
               
        else
               
                System.out.println("JUGADOR 2: Elija Una Casilla Ingresando El Numero Correspondiente.");      
    }
   
  //Regresa El Caracter De Tipo Char Para Posteriormente Ingresarlo A Alguna Posicion Del Arreglo, Usandolo En Otro Metodo.
    public char obtenerFigura(){
       
        if(getTurno()==true)
               
                return jugadorUno;
               
        else
               
                return jugadorDos;     
    }
   
  //Cambia El Valor De La Variable "turno" Para Llevar El Orden Correcto De Los Turnos Entre Los 2 Jugadores.    
    public void cambiarTurno(){        
       
        if(obtenerFigura()=='X') //Si el Metodo regresa un valor char igual a "X" cambia el valor de "turno" a "false".
               
                setTurno(false);
       
        else
               
                setTurno(true);
    }
     
  //Verifica Si La Posicion Del Arreglo Al Que El Jugador Desea Ingresar El Caracter No Fue Utilizada Antes.  
    public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){
     
      //Si Se Cumple La Condicion Se Ingresa El Valor En La Posicion Del Arreglo Especificada. 
        if(espacio!=getJugadorUno()&&espacio!=getJugadorDos()){
               
           indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());//Ingresa EL Caracter Si Se Cumple La Condicion.
           cambiarTurno();                                                  //Cambia El Turno Si Se Cumple La Condicion.  
           contador++;                                                      //Solo Incremente Cuando Se Cumple La Anterior Condicion.              
        }
       
        else
         
         //Imprime El Siguiente Mensaje En Caso De Que No Se Cumpla La Anterior Condicion.                             
           System.out.println("La Casilla Esta Ocupada, Elija Otra Por Favor");                
    }
           
  //Metodo Que Hace Uso De Un "switch" Para Indicar La Posicion Del Arreglo Que El Jugador Elijio En El Juego.  
    public void elegirPosicion(int posicion){
                           
            switch(posicion){
               
                  //Comprueba Si La Posicion Esta Disponible Valiendose Del Metodo "comprobarEspacio()"
                        case 1:comprobarEspacio(getPosicionArreglo(0,0),0,0);break;
                        case 2:comprobarEspacio(getPosicionArreglo(0,1),0,1);break;
                        case 3:comprobarEspacio(getPosicionArreglo(0,2),0,2);break;
                        case 4:comprobarEspacio(getPosicionArreglo(1,0),1,0);break;
                        case 5:comprobarEspacio(getPosicionArreglo(1,1),1,1);break;
                        case 6:comprobarEspacio(getPosicionArreglo(1,2),1,2);break;
                        case 7:comprobarEspacio(getPosicionArreglo(2,0),2,0);break;
                        case 8:comprobarEspacio(getPosicionArreglo(2,1),2,1);break;
                        case 9:comprobarEspacio(getPosicionArreglo(2,2),2,2);break;
                        default:
                          //Imprime El Siguiente Mensaje En Caso De Que El "switch" No Reciba Un Digito Del 1 al 9.    
                                System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");break;                             
            }          
    }
   
  //Solo Imprime Un Mensaje Distinto Dependiendo Del Jugador Que Haya Resultado Ganador.
    public void decirGanador(char a){
       
       
        if(a=='X')
                               
                System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 1!, HA GANADO!.");
       
               
        else if(a=='O')
                           
                    System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 2!, HA GANADO!.");                      
               
                               
    }
   
 //Verifica Las Unicas 8 Combinaciones Que Pueden Dar La Victoria A Uno De Los Jugadores.
    public void buscarGanador(){
                 
      //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Horizontal.
        for(int i=0;i<3;i++){
               
                for(int j=1;j<2;j++){
                       
                        if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){
                                                       
                           decirGanador(tablero[i][j]);
                           imprimirTablero();
                           setContador(10);
                        }                              
                }                      
        }
   
      //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Vertical.  
        for(int i=0;i<3;i++){
               
                for(int j=1;j<2;j++){
                       
                        if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
                       
                           decirGanador(tablero[j][i]);
                           imprimirTablero();
                           setContador(10);
                        }                              
                }
        }
       
      //Instrucciones Para Comprobar La Unica Posibilidad De Ganar De Forma Diagonal.  
        if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
       
           decirGanador(tablero[1][1]);
           imprimirTablero();
           setContador(10);
        }  
           
      //Ciclo Con Instrucciones Para Comprobar La Unica Posibilidade De Ganar De Forma Diagonal Inversa.
        if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
               
           decirGanador(tablero[1][1]);
           imprimirTablero();                  
           setContador(10);
        }      
    }    
       
  //Metodo Que Contiene El Flujo Y El Orden Del Juego.
    public void jugarGato(){
       
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("BIENVENIDO A GATO Ver. 1.0");      
               
        do{
       
                indicarTurno();                
                imprimirTablero();     
                try{elegirPosicion(Integer.parseInt(entrada.readLine()));}
                catch(IOException e){}    
                catch(NumberFormatException e){
                       
                        if(getTurno()==true)
                           
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 1.");
                       
                        else
                               
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 2.");      
                }
                         
                buscarGanador();
       
        }while(getContador()<9);
       
          if(getContador()==9){
               
                System.out.println("¡GATO!¡JUEGO EMPATADO!");                                        
            imprimirTablero();
            System.out.println("THANKS FOR PLAYING!");             
          }
         
         System.out.println("THANKS FOR PLAYING!");            
    }
   
    public static void main(String [] args){
       
        JuegoGato Objeto = new JuegoGato();
       
        Objeto.jugarGato();    
                                                                                       
    }    
}