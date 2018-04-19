
package registro;

public class Persona {
   
    public String nombre;
    public String apellido;
    public boolean isPresente;

    public Persona(String nombre, String apellido, boolean isPresente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.isPresente = isPresente;
    }
    
    public String getNombre(){
        return nombre;
        
    }
   public String getApellido(){
       return apellido;
   }
   
   public boolean getIsPresente(){
    return isPresente;
}
    
}
