package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // se usara scanner ya que el usuario ingresara datos y estos se capturaran
    Scanner teclado = new Scanner(System.in);
    
    // se instanciara un objeto de la clase Agenda
    Agenda agenda = new Agenda(10); // se le da el tamaño, es decir, la agenda puede tener máximo 10 contactos
    
    // se usara while para que el menu aparezca varias veces hasta que el usuario escoja la opcion 8
    while (true) {
      System.out.println("---------------------------------- MENU ----------------------------------");
      System.out.println("Elija la opción que necesite. Ejemplo: si necesita la opción uno, digite 1");
      System.out.println("--------------------------------------------------------------------------");
      System.out.println("| 1. Añadir contacto a la agenda                                         |");
      System.out.println("| 2. Verificar si el contacto existe en la agenda                        |");
      System.out.println("| 3. Lista todos los contactos que hay en la agenda                      |");
      System.out.println("| 4. Busca un contacto en la agenda y le muestra su respectivo teléfono  |");
      System.out.println("| 5. Elimina un contacto de la agenda                                    |");
      System.out.println("| 6. Verifica si la agenda está llena                                    |");
      System.out.println("| 7. Muestra los espacios libres para que puedas agregar más contactos   |");
      System.out.println("| 8. Salir del programa                                                  |");
      System.out.println("--------------------------------------------------------------------------");
      
      // se atrapara el dato mediante el scanner y se guardara en una variable
      int opcion = teclado.nextInt();
      teclado.nextLine(); // Consumir la nueva línea después de nextInt()
      
      System.out.println("--------------------------------------------------------------------------");
      
      // este switch es util ya que dependiendo de la opcion del usuario se ejecutaran ciertas instrucciones
      switch (opcion) {
        case 1: // Añadir contacto a la agenda
          System.out.println("Ingrese el nombre de la persona que desea agregar a su agenda de contactos");
          String nombre = teclado.nextLine();
          
          System.out.println("Ingrese el número de la persona que acaba de ingresar en la agenda");
          int telefono = teclado.nextInt();
          teclado.nextLine(); // Consumir la nueva línea después de nextInt()
          
          Contacto c = new Contacto(nombre, telefono);
          System.out.println(agenda.añadirContacto(c));
          break;
        
        case 2: // Verificar si el contacto existe en la agenda
          System.out.println("Ingrese el nombre de la persona que desea verificar si existe o no en la agenda");
          nombre = teclado.nextLine();
          
          c = new Contacto(nombre, 0); // El número no importa para la verificación
          System.out.println(agenda.existeContacto(c));
          break;
        
        case 3: // Lista todos los contactos que hay en la agenda
          agenda.listarContactos();
          break;
        
        case 4: // Busca un contacto en la agenda y le muestra su respectivo teléfono
          System.out.println("Ingrese el nombre del contacto que desea buscar");
          nombre = teclado.nextLine();
          agenda.buscaContacto(nombre);
          break;
        
        case 5: // Elimina un contacto de la agenda
          System.out.println("Ingrese el nombre del contacto que desea eliminar");
          nombre = teclado.nextLine();
          
          c = new Contacto(nombre, 0); // El número no importa para la eliminación
          agenda.eliminarContacto(c);
          break;
        
        case 6: // Verifica si la agenda está llena
          System.out.println(agenda.agendaLlena());
          break;
        
        case 7: // Muestra los espacios libres para que puedas agregar más contactos
          System.out.println(agenda.espacioLibres());
          break;
        
        case 8: // Salir del programa
          System.out.println("Programa finalizado, ¡Hasta pronto ;) !");
          teclado.close();
          System.exit(0);
          break;
        
        default:// si el usuario digita un numero diferente del 1 al 8, le saldra este mensaje
          System.out.println("Opción no válida. Vuelva a revisar el menu y verifique las opciones. Gracias!");
          break;
      }
    }
  }
}
