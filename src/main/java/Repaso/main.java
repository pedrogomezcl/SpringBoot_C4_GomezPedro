package Repaso;

import java.util.ArrayList;
import java.util.Scanner;

//System.out.println("Hello World");
        /*
        ArrayList<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona();
        Persona p3 = new Persona("Pedro","Gomez",25);
        System.out.println(p1);
        p1.setNombre("Juan");
        System.out.println(p1);
        System.out.println(p1.getNombre());
        System.out.println("###############");
        personas.add(p1);
        personas.add(p1);
        personas.add(p1);

        texto.add("Marlon");
        texto.add("Juan");
        texto.add("Pedro");
        System.out.println(texto);
        System.out.println(texto.get(0));

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }



*/
public class main {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
        Boolean booleanito = true;
        while(booleanito){
            System.out.println("1. Crear Persona");
            System.out.println("2. Modificar Persona");
            System.out.println("3. Eliminar Persona");
            System.out.println("4. Mostrar Personas");
            System.out.println("5. Salir");
            System.out.println("Escoja la opción:");
            Scanner sc = new Scanner(System.in);
            int opcionUsuario=sc.nextInt();
            if(opcionUsuario==1){
                Persona persona = new Persona();
                System.out.println("Ingrese el id de la persona:");
                persona.setId(sc.nextInt());
                System.out.println("Ingrese el nombre del persona:");
                persona.setNombre(sc.next());
                System.out.println("Ingrese el apellido del persona:");
                persona.setApellido(sc.next());
                System.out.println("Ingrese la edad de la persona:");
                persona.setEdad(sc.nextInt());
                personas.add(persona);
                System.out.println("Personas agregadas: " + personas.size());
                for (int i = 0; i < personas.size(); i++) {
                    System.out.println(personas.get(i));
                }
            }
            else if(opcionUsuario==2){
                System.out.println("Ingrese el numero de la persona:");
                int ubicacionPersona=sc.nextInt()-1;
                Persona personaTemp = personas.get(ubicacionPersona);
                System.out.println("Ingrese el nombre del persona:");
                personaTemp.setNombre(sc.next());
                System.out.println("Ingrese el apellido del persona:");
                personaTemp.setApellido(sc.next());
                System.out.println("Ingrese la edad de la persona:");
                personaTemp.setEdad(sc.nextInt());
                personas.set(ubicacionPersona, personaTemp);
                System.out.println("Persona reemplazada de manera exitosa!");


            } else if (opcionUsuario==4) {
                for (int i = 0; i < personas.size(); i++) {
                    System.out.println("Persona #"+(i+1));

                    System.out.println("Nombre: "+personas.get(i).getNombre());
                    System.out.println("Apellido: "+personas.get(i).getApellido());
                    System.out.println("Edad: "+personas.get(i).getEdad());
                }

            }
            else if(opcionUsuario==3){
                System.out.println("Ingrese el numero de la persona:");
                int ubicacionPersona=sc.nextInt()-1;
                personas.remove(ubicacionPersona);
                System.out.println("Persona eliminada de manera exitosa!");

            }
            else if(opcionUsuario==5){
                booleanito=false;
                System.out.println(
                        "Chausssssss!!!!!"
                );
            }

        }
    }


}
