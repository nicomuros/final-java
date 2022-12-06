package finaljava;
class Usuarios{
    private String nombre;
    private int puntaje;
    
    public void crearUsuario(String args){
        this.nombre = args;
    }
    
    public void Usuarios(){
        this.puntaje = 0;
    }
    
    public String nombre(){
        return this.nombre;
    }
    
    public int puntaje(){
        return this.puntaje;
    }
    
    public void sumarPuntaje(){
        this.puntaje++;
    }
    
    public void sumarPuntaje(int args){
        this.puntaje += args;
    }
}