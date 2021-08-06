
package test;

import dominio.JubilaciónPatronal;
import dominio.JubilaciónporDiscapacidad;
import dominio.JubilaciónporVejez;
import dominio.Jubilado;
import dominio.usuarios;
import dominio.Personas;       
import java.util.Scanner;

public class Jubilación {
public static void main(String[] args) {
    String nombre,cedula; 
    float salario;
    int anios;
    usuarios lista = new usuarios();
    int opcion;
Scanner scan = new Scanner(System.in);
    do{
System.out.println("\nMenu");
    System.out.println("1.- Ingresar jubilación patrolan");
       System.out.println("2.- Ingresar jubilación por discapacidad");
           System.out.println("3.- Ingresar jubilación por vejez");
             System.out.println("4.- Mostrar informe de todos los jubilados");
                System.out.println("5.- Salir");
                   System.out.println("Ingresar la opcion que desea: ");
opcion = Integer.parseInt(scan.nextLine());
    switch(opcion)
{
case 1:
{
System.out.println("Ingrese su cedula");
    cedula = scan.nextLine();
        System.out.println("Ingrese sus nombres");
            nombre = scan.nextLine();
                System.out.println("Ingrese el salario de la persona jubilada");
                    salario = Float.parseFloat(scan.nextLine());
                        System.out.println("Ingresar sus anios de servicio");
                    anios = Integer.parseInt(scan.nextLine());
                    Personas personas = new JubilaciónporVejez (cedula, nombre, salario, anios);
        Personas Personas;
                    lista.adicionarPersonas(Personas);
                          break;
}

case 2:
{
float dis;
System.out.println("Ingrese su cedula");
    cedula = scan.nextLine();
        System.out.println("Ingrese sus nombres");
            nombre = scan.nextLine();
                    System.out.println("Ingrese el salario de la persona junilada");
                          salario = Float.parseFloat(scan.nextLine());
                             System.out.println("Ingresar los anios de servicio");
                                  anios = Integer.parseInt(scan.nextLine());
                                      System.out.println("Ingrese el porcentja de discapacidad");
                                          dis = Float.parseFloat(scan.nextLine());
                                               Personas personas = new JubilaciónporDiscapacidad(dis, cedula, nombre, salario, anios);
                                                   lista.adicionarPersonas(personas);
                                                        break;
}
case 3:
{
float patronal;
String empresa;
System.out.println("Ingrese su cedula");
    cedula = scan.nextLine();
        System.out.println("Ingrese sus nombres");
                nombre = scan.nextLine();
                    System.out.println("Ingrese el salario de la persona jubilada");
                        salario = Float.parseFloat(scan.nextLine());
                            System.out.println("Ingrese los anios de servicio");
                                anios = Integer.parseInt(scan.nextLine());
                                    System.out.println("Ingrese el porcentja de inflacion");
                                          patronal = Float.parseFloat(scan.nextLine());
                                             System.out.println("Ingrese el tipo de empresa");
                                                empresa = scan.nextLine();
   Personas personas = new JubilaciónPatronal(patronal, empresa, cedula, nombre, salario, anios);
                    lista.adicionarPersonas(personas);
                    break;
}
case 4:
{
lista.mostrarusuarios();
    break;
}
case 5:
{
System.out.println("Saliendo....");
    scan.next();
    break;
}
default:
{
System.out.println("Opcion erronea");
    System.out.println("");
        scan.next();
            break;
}
}
}while(opcion!=5);
}
    
}

