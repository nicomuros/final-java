package finaljava;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class TirarDados {

    static String[] jugadores;
    //Por cada Jugador, habrán 5 lanzamientos.Dichas puntuaciones las podemos guardar en una matriz de n x 5

    static int[][] tablaPuntuaciones;
    //Metodos


    /*

	 * Simula el lanzamiento de tres dados y devuelve los

	 * tres resultados en un array de tres elementos. 

     */
    static int[] lanzamiento() {

        int[] resultados = new int[3]; //Se tiran tres dados

        resultados[0] = (int) (Math.random() * 6 + 1); //Primer dado

        resultados[1] = (int) (Math.random() * 6 + 1); //Segundo dado

        resultados[2] = (int) (Math.random() * 6 + 1); //Tercer dado

        return resultados;

    }

    static void main(Usuarios usuario1, Usuarios usuario2) {

        int n = 2;
        JOptionPane.showMessageDialog(null, "Bienvenidos a Tirar Dados");
        JOptionPane.showMessageDialog(null,"FORMA DE JUEGO: " +"\n\nSon 5 turnos y cada jugador tirará los datos una vez."
                +"\nCada tirada son con tres dados los cuales se lanzan a la vez."
                +"\nSi saca tres números iguales habrá ganado. Si no, se suma el valor de los dados."
                + "\nEl jugador que mayor número sume en cualquiera de esas 5 tiradas será el ganador.");
        //Inicializamos los arrays con el numero de jugadores.
        JOptionPane.showMessageDialog(null, "¡¡¡  COMENCEMOS  !!!");
        jugadores = new String[n];

        tablaPuntuaciones = new int[n][5];

        jugadores[0] = usuario1.nombre();
        jugadores[1] = usuario2.nombre();

        /*

		 * Comienza el juego.

		 * Son 5 turnos y cada jugador tirará los datos una vez.

		 * Si saca tres números iguales habrá ganado.

		 * Si no, se suma el valor de los dados, se guarda

		 * en la casilla correspondiente de la tablaPuntuaciones

		 * y lanza el siguiente jugador.

		 * 

		 * Con un booleano podemos detener el flujo del juego

		 * en el caso de que haya ganador por tres números iguales.

         */
        boolean hayGanador = false;

        for (int i = 0; i < 5 && !hayGanador; i++) {

            JOptionPane.showMessageDialog(null, "Turno Nº " + (i + 1));

            //Ahora cada Jugador lanzará una vez
            for (int j = 0; j < jugadores.length && !hayGanador; j++) {

                JOptionPane.showMessageDialog(null, "Lanza el jugador: " + jugadores[j]);

                //Pedimos a nuestro metodo que lance dados y recogemos resultado
                int[] dados = lanzamiento();
                JOptionPane.showMessageDialog(null, "Dado1: " + dados[0] + "\nDado2: " + dados[1] + "\nDado3: " + dados[2]);

                //Si ha sacado tres iguales, habrá ganado y los bucles finalizarán
                if (dados[0] == dados[1] && dados[1] == dados[2]) {
                    JOptionPane.showMessageDialog(null, "\nHA GANADO EL JUGADOR:  " + "¡¡¡" + jugadores[j] + "!!!");

                    hayGanador = true; //Esto pone fin al juego
                } else { //No ha ganado, sumamos y guardamos resultado

                    tablaPuntuaciones[j][i] = dados[0] + dados[1] + dados[2];
                }
                //Ahora lanzará el siguente jugador...
            }

            JOptionPane.showMessageDialog(null, "PULSE INTRO PARA CONTINUAR");

            //Ya han lanzado todos, comienza el siguiente turno..
        }


        /*

		 * Bucle de turnos finalizado.

		 * Si es porque hayGanador no hay que hacer nada, ya se informó en pantalla de quien ganó.

		 * De lo contrario, hay que evaluar la tablaPuntuaciones y ver quien ha ganado.

		 * 

		 * Podemos recorrer la tabla para ir mostrando los resultados y al mismo tiempo controlar

		 * cual ha sido la puntuacion mayor y a que jugador pertenece

         */
        if (!hayGanador) {

            int mayorPunt = 0;

            String jugadorMayorPunt = new String();

            JOptionPane.showMessageDialog(null,"TABLA DE RESULTADOS\n\n" +"JUGADOR: "+ jugadores[0]
                    +"\nTURNO Nº1 Puntos: " + tablaPuntuaciones[0][0]+
                     "\nTURNO Nº2 Puntos: " + tablaPuntuaciones[0][1]+
                     "\nTURNO Nº3 Puntos: " + tablaPuntuaciones[0][2]+
                     "\nTURNO Nº4 Puntos: " + tablaPuntuaciones[0][3]+
                     "\nTURNO Nº5 Puntos: " + tablaPuntuaciones[0][4]+
                    "\n\nJUGADOR: "+ jugadores[1]
                    +"\nTURNO Nº1 Puntos: " + tablaPuntuaciones[1][0]
                    +"\nTURNO Nº2 Puntos: " + tablaPuntuaciones[1][1]
                    +"\nTURNO Nº3 Puntos: " + tablaPuntuaciones[1][2]
                    +"\nTURNO Nº4 Puntos: " + tablaPuntuaciones[1][3]
                    +"\nTURNO Nº5 Puntos: " + tablaPuntuaciones[1][4]);

            for (int i = 0; i < jugadores.length; i++) {

                for (int j = 0; j < 5; j++) {

                    int puntos = tablaPuntuaciones[i][j]; //Recogemos puntuacion

                    if (puntos > mayorPunt) { //Controlamos si es la mayor puntuacion hasta ahora

                        mayorPunt = puntos;

                        jugadorMayorPunt = jugadores[i];
                        
                    }

                }

            }

            //TAbla mostrada y evaluada. Anunciamos ganador
            JOptionPane.showMessageDialog(null, "\n¡¡¡HA GANADO!!! " +"|||  "+ jugadorMayorPunt +"  |||"+" al conseguir un puntaje mas alto que es de: " + mayorPunt);

        }

        JOptionPane.showMessageDialog(null, "FIN DEL JUEGO");

    }

}
