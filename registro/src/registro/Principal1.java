/*
package registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    String nombre;
    String apellido;
    boolean isPresente;
    
    ArrayList <Persona> registroPersonas = new ArrayList <>();
            
    
    
    for (int i = 0; i<=registroPersonas.size()+1;i++){
        
        System.out.println("1) Agregar una Persona");
        System.out.println("2) Cancelar");
        int index = scan.nextInt();

        if (index==1){
        
            System.out.println("Nombre");
            nombre = scan.nextLine();

            String saltoDeLinea = scan.nextLine();

            System.out.println("Condicion: ");
            isPresente = scan.hasNext();

            String saltoDeLinea2 = scan.nextLine();

            System.out.println("Apellido: ");
            apellido = scan.nextLine();

            Persona x= new Persona (nombre,apellido,isPresente);
            registroPersonas.add(x);          
  
        }
        else{
                break;
            }
    }
    
    ArrayList <Persona> personasPresentes = new ArrayList <>();
    ArrayList <Persona> personasAusentes = new ArrayList <> ();
        

        for (Persona siguientePersona : registroPersonas){  //for que recorre todos los objetos guardados en el arraylist llamado registroPersonas de la clase Persona, el siguiente persona es la variable que va cambiando en cada bucle 
            if (siguientePersona.getIsPresente() == true){
               personasPresentes.add(siguientePersona);
            }
            else{
                personasAusentes.add(siguientePersona);
            }
        }
        
        System.out.println("Las personas Presentes son: ");
        
        for (Persona x : personasPresentes){
            System.out.println(x.getNombre()+" "+x.getApellido());
        }
        
        System.out.println(" ");
        
        System.out.println("Las personas Ausentes son: ");
        
        for (Persona x : personasAusentes){
            System.out.println(x.getNombre()+" "+x.getApellido());
        }
        
}
}
*/