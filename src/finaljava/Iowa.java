package finaljava;

import javax.swing.JOptionPane;

class Iowa{
    public static void main(Usuarios usuario) {
        byte entrada;
        byte Gano = 10;
        byte Perdio = -10;
        
        int deckAWin[] = {100,0,100,100,250,0,0,0,100,0,100,0,0,0,100,250};
        int deckALose[] = {0,100,50,0,0,100,100,250,0,100,50,250,100,100,50,0};
        int deckBWin[] = {250,0,100,100,0,0,0,100,250,0,100,0,0,0,100,250};
        int deckBLose[] = {0,250,0,0,250,100,100,0,0,100,50,100,100,100,50,150};
        int deckCWin[] = {50,50,50,0,50,50,50,50,50,50,50,50,50,50,0,0};
        int deckCLose[] = {0,0,0,50,0,0,50,50,0,0,0,50,0,0,50,50};
        int deckDWin[] = {50,0,50,50,50,50,50,50,50,50,50,50,50,50,50,50};
        int deckDLose[] = {0,50,0,50,0,0,0,50,0,0,0,50,0,0,0,50,50};
        
        int monedas = 1000;
        var continuar = true;
        
        JOptionPane.showMessageDialog(null, 
            "BIENVENIDO A IOWA\n\n"
            +"El juego consiste en elegir un maso de cuatro\n\n"
            +"Cada maso contiene una serie de cartas que pueden \n"
            +"sumar y/o restar monedas\n\n"
            +"Empezas con 1000 monedas, y el objetivo es llegar a\n"
            +"2000. Si lo consigues sumas 10 puntos, pero si tu \n"
            +"contador cae a cero, perdés 10 puntos. \n\n"
            + "Buena suerte!");

        while (true){
            entrada = Byte.parseByte(JOptionPane.showInputDialog(
                "Monedas: " + monedas + "\n\n"
                +"¿Que mazo elegís?:\n"
                +"1. Deck A\n"
                +"2. Deck B\n"
                +"3. Deck C\n"
                +"4. Deck D\n"));
            var rand = (int) Math.floor(Math.random()*(0-15+1)+15);
            switch (entrada){
                case 1:
                    
                    JOptionPane.showMessageDialog(null, 
                        "DECK A:\n\n"
                        +"Ganaste: " + deckAWin[rand] +"\n"
                        +"Perdiste: " + deckALose[rand]);
                    monedas += deckAWin[rand] - deckALose[rand];
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, 
                        "DECK B:\n\n"
                        +"Ganaste: " + deckBWin[rand] +"\n"
                        +"Perdiste: " + deckBLose[rand]);
                    monedas += deckBWin[rand] - deckBLose[rand];
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, 
                        "DECK C:\n\n"
                        +"Ganaste: " + deckCWin[rand] +"\n"
                        +"Perdiste: " + deckCLose[rand]);
                    monedas += deckCWin[rand] - deckCLose[rand];
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, 
                        "DECK D:\n\n"
                        +"Ganaste: " + deckDWin[rand] +"\n"
                        +"Perdiste: " + deckDLose[rand]);
                    monedas += deckDWin[rand] - deckDLose[rand];
                    break;
                case 5:
                    continuar = false;
                
            }
            if (!continuar || monedas <= 0 || monedas >= 2000){
                break;
            } 
        }
        if (monedas <= 0){ usuario.sumarPuntaje(Perdio); } else { usuario.sumarPuntaje(Gano); }
    }
}