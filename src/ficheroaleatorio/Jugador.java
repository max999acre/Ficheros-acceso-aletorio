/*
 * Clase que almacena valores para el jugador 
 */
package ficheroaleatorio;


public class Jugador {
    
    private int numero;
    private String nombre;
    private int partidos_jugados;
    private int edad;
    private String equipo;
    private String activo;
    
    
    
    public Jugador() {}
    
    public void Numero(int num){
        numero = num;
    }
    
    public void Nombre(String nom){
        nombre = nom;
    }
    
    public void Partidos(int partidos){
        partidos_jugados = partidos;
    }
    
    public void Edad(int ed){
        edad = ed;
    }
    
    
    public void Equipo(String eq){
        equipo = eq;
    }
    
    public void Activo(String activ){
        activo = activ;
    }
        
    public int getNumero(){
        return this.numero;
    }
    
    public String getNombre(){
        return nombre;
    }
        
    public int getPartido(){
        return partidos_jugados;        
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getEquipo(){
        return equipo;
    }

    public String getActivo(){
        return activo;
    }
    
}
