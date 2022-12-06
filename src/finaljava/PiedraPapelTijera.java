
package finaljava;

import javax.swing.JOptionPane;


public class PiedraPapelTijera {
    public static void main(Usuarios usuario1,Usuarios usuario2){
      
      JOptionPane.showMessageDialog(null, "Bienvenido a Piedra Papel o Tijera.\n\n"
                + "El juego de piedra, papel o tijera es uno de los más conocidos del mundo\n"
                +"Se cree que empezó a practicarse en China en la época de la dinastía Han (206 a.C – 220 d.C),\n"
                +"de allí se exportó a Japón, y en el siglo XX llegó a Occidente, donde se hizo enormemente \n"
                +"popular a partir de los años 20  .\n\n"
                +" Autor Alumno: David Mato");
               
      JOptionPane.showMessageDialog(null,"Hoy les tocara a uds. mostrar sus Habilidades.\n"
                + "en este Juego.\n");

      JOptionPane.showMessageDialog(null, "COMENZAMOS.");
        
        
        int elec1;
	int elec2;
	boolean salir;
	// salir es la variable que finaliza el juego
	salir = false;
	while (salir==false) {
			// leemos la eleccion que toma tanto el jugador 1 y el 2 y resolvemos el juego a traves del condicional
			JOptionPane.showMessageDialog(null, 
                                "Opciones para el Juego \n"
                                     + "[1] Piedra \n"
                                     + "[2] Papel \n"
                                     + "[3] Tijera \n");
                        elec1 = Integer.parseInt(JOptionPane.showInputDialog(null, usuario1.nombre()+" Ingrese una Opcion"));
	                elec2 = Integer.parseInt(JOptionPane.showInputDialog(null, usuario2.nombre()+" Ingrese una Opcion"));
			if ((elec1!=elec2)) {
				if ((elec1==1 && elec2==3) || (elec1==2 && elec2==1) || (elec1==3 && elec2==2)) {
					usuario1.sumarPuntaje();
                                        JOptionPane.showMessageDialog(null, 
                                            " Ganador es el Jugador \n"
                                            + usuario1.nombre()
                                            + " FELICITACIONES \n "
                                            + " Sumaste 1 Punto");
                                        salir = true;
				} else {
					if ((elec2==1 && elec1==3) || (elec2==2 && elec1==1) || (elec2==3 && elec1==2)) {
                                           usuario1.sumarPuntaje(); 
                                            JOptionPane.showMessageDialog(null, 
                                                " Ganador es el Jugador \n"
                                                + usuario2.nombre()
                                                + " FELICITACIONES \n "
                                                + " Sumaste 1 Punto");
                                            salir = true;
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, 
                                       " Es  un Empate \n" );
                                salir = true;
			}
		}
		
	}

        
        
        
        
        
    
    
    }
    

