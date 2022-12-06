package finaljava;

import javax.swing.JOptionPane;

public class FinalJava {

    public static void main(String[] args) {
        Usuarios usuario1 = new Usuarios(); //Creo los objetos usuarios
        Usuarios usuario2 = new Usuarios();

        String nombreUsuario; //variable que almacenará la cadena de caracteres con el nombre de usuario
        nombreUsuario = JOptionPane.showInputDialog(null,
                "Bienvenido a Bestias Binarias Games\n\n"
                + ""
                + "Ingrese el nombre del jugador 1:\n", "Crear usuario", JOptionPane.INFORMATION_MESSAGE);
        usuario1.crearUsuario(nombreUsuario); //asigno el valor de nombreUsuario al argumento PRIVADO "nombre"

        nombreUsuario = JOptionPane.showInputDialog(null,
                "Bienvenido a Bestias Binarias Games\n\n"
                + ""
                + "Ingrese el nombre del jugador 2:\n", "Crear usuario", JOptionPane.INFORMATION_MESSAGE);
        usuario2.crearUsuario(nombreUsuario); //asigno el valor de nombreUsuario al argumento PRIVADO "nombre"

        boolean continuar = true;
        while (continuar) {
            byte eleccion;
            eleccion = mostrarMenu(usuario1, usuario2);

            switch (eleccion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    Iowa.main(seleccionarUsuarios(usuario1, usuario2));
                    break;
                case 2:
                    Calamar.main(seleccionarUsuarios(usuario1, usuario2));
                    break;
                case 3:
                    ProblemaMatematico.main(seleccionarUsuarios(usuario1, usuario2));
                    break;
                case 4:
                    BlackJack.main(seleccionarUsuarios(usuario1, usuario2));
                    break;
                case 5:
                    CaraCruz.main(seleccionarUsuarios(usuario1, usuario2));
                    break;
                case 6:
                    Tateti.main(usuario1, usuario2);
                    break;
                case 7:
                    PiedraPapelTijera.main(usuario1, usuario2);
                    break;
                case 8:
                    TirarDados.main(usuario1, usuario2);
                    break;
                //case 9:
                //    Problemas.main(seleccionarUsuarios(usuario1, usuario2));
                //    break;
                // case 10:
                //      AdivinaelNumero.main(seleccionarUsuarios(usuario1, usuario2));
                //      break;
            }
        }
    }

    public static Usuarios seleccionarUsuarios(Usuarios usuario1, Usuarios usuario2) {
        var eleccion = Byte.parseByte(JOptionPane.showInputDialog(null,
                "SELECCIONAR USUARIO\n"
                + "1: " + usuario1.nombre() + "\n"
                + "2: " + usuario2.nombre()));
        if (eleccion == 1) {
            return usuario1;
        } else {
            return usuario2;
        }
    }

    public static byte mostrarMenu(Usuarios usuario1, Usuarios usuario2) {
        while (true) {
            /* Para mostrar un menú con muchas lineas, se agrega \n al final de cada una. */
            var eleccion = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "MENU PRINCIPAL\n"
                    + usuario1.nombre() + ": " + usuario1.puntaje() + "\n"
                    + usuario2.nombre() + ": " + usuario2.puntaje() + "\n\n"
                    + "1. Iowa Gambling (single player)\n"
                    + "2. Juego del Calamar (single player)\n"
                    + "3. Problema Matematico (single player)\n"
                    + "4. Black Jack (single player)\n"
                    + "5. Cara o Cruz (single player)\n"
                    + "6. Tateti (multiplayer)\n"
                    + "7. Piedra Papel o Tijeras (multiplayer)\n"
                    + "8. Tirar dados (multiplayer)\n"
                    + "9. Problema Matematico 2 (single player)\n"
                    + "10. Adivina el número (single player)\n"
                    + "0. Salir", 0));

            if (eleccion >= 0 && eleccion <= 10) {
                return eleccion;
            }
        }
    }

}
