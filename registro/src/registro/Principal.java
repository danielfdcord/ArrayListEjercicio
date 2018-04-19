

package registro;

import java.util.ArrayList;
import java.util.Random;


public class Principal {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona ("Daniel","Fernandez de Cordova",true);
        Persona persona2 = new Persona ("Diego","Perez",false);
        Persona persona3 = new Persona ("Enrique","Suarez",false);
        Persona persona4 = new Persona ("Reggina","Botta",true);
        Persona persona5 = new Persona ("Penelope","Ray",false);
        Persona persona6 = new Persona ("Cesar","Loza",true);
        Persona persona7 = new Persona ("Marcos","Nios",false);
        Persona persona8 = new Persona ("Pepe","Diaz",true);
        
        ArrayList <Persona> registroPersonas = new ArrayList <>();
        
        registroPersonas.add(persona1);
        registroPersonas.add(persona2);
        registroPersonas.add(persona3);
        registroPersonas.add(persona4);
        registroPersonas.add(persona5);
        registroPersonas.add(persona6);
        registroPersonas.add(persona7);
        registroPersonas.add(persona8);
        
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
        
        Random random = new Random ();
        
        System.out.println(" ");
        System.out.println("Las personas Presentes aleatorias: ");
        
        while(personasPresentes.size()!= 0){
              
        int x = random.nextInt(personasPresentes.size());
        
        System.out.println(personasPresentes.get(x).getNombre()+" "+personasPresentes.get(x).getApellido());
        
        personasPresentes.remove(x);

        }  
    }
   
}
