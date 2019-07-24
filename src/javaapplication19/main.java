
package javaapplication19;

import java.util.*;

public class main {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        ArrayList <Administrativo> admin1 = new ArrayList(); 
        ArrayList <Alumnos> alum1 = new ArrayList(); 
        
        
        boolean fin = false;   
        
        System.out.println("escoja administrativo(1) alumnos(2)  docente(3)");
        int option = sc.nextInt();
        
        switch (option){
            case 1:
                while(!fin){                    
                    System.out.println("ingrese tipo  de documento (String)");
                    String tipoDocumento = sc.next();
                    System.out.println("ingrese el documento (String)");
                    String documento = sc.next();
                    System.out.println("ingrese apellido (String)");
                    String appelido = sc.next();
                    System.out.println("ingrese nombre (String)");
                    String nombre = sc.next();
                    System.out.println("ingrese edad (int)");
                    int edad = sc.nextInt();
                    System.out.println("estado activo(1) inactivo(2)");
                    int des = sc.nextInt();
                    if(des == 1){
                        boolean activo = true;
                    }else{
                        boolean activo = false;
                    }
                    System.out.println("ingrese cargo (String)");
                    String cargo = sc.next();
                    System.out.println("ingrese fecha de contrato (String)");
                    String fechaContrato = sc.next();
                    System.out.println("desea continuar si(1) no(2)");
                    int c = sc.nextInt();
                    if(c == 2){
                        fin = true;
                    }
                }
            break;
            case 2:
                while(!fin){                    
                    System.out.println("ingrese tipo  de documento (String)");
                    String tipoDocumento = sc.next();
                    System.out.println("ingrese el documento (String)");
                    String documento = sc.next();
                    System.out.println("ingrese apellido (String)");
                    String appelido = sc.next();
                    System.out.println("ingrese nombre (String)");
                    String nombre = sc.next();
                    System.out.println("ingrese edad (int)");
                    int edad = sc.nextInt();
                    System.out.println("estado activo(1) inactivo(2)");
                    int des = sc.nextInt();
                    if(des == 1){
                        boolean activo = true;
                    }else{
                        boolean activo = false;
                    }
                    System.out.println("ingrese codigo (String)");
                    String codigo = sc.next();
                    System.out.println("ingrese facultad (String)");
                    String facultad = sc.next();
                    System.out.println("ingrese programa (String)");
                    String programa = sc.next();
                    System.out.println("ingrese el semestre (int)");
                    int semestre = sc.nextInt();   
                    System.out.println("desea continuar si(1) no(2)");
                    int c = sc.nextInt();
                    if(c == 2){
                        fin = true;
                    }
                }              
            break;
            case 3: 
                System.out.println("ingrese catedratico(1) planta(2)");
                int tDocente = sc.nextInt();
                
                switch (tDocente){
                    case 1:
                        ArrayList <Catedratico> cate1 = new ArrayList();
                            while(!fin){                    
                                System.out.println("ingrese tipo  de documento (String)");
                                String tipoDocumento = sc.next();
                                System.out.println("ingrese el documento (String)");
                                String documento = sc.next();
                                System.out.println("ingrese apellido (String)");
                                String appelido = sc.next();
                                System.out.println("ingrese nombre (String)");
                                String nombre = sc.next();
                                System.out.println("ingrese edad (int)");
                                int edad = sc.nextInt();
                                System.out.println("estado activo(1) inactivo(2)");
                                int des = sc.nextInt();
                                if(des == 1){
                                    boolean activo = true;
                                }else{
                                    boolean activo = false;
                                }
                                System.out.println("ingrese profesion (String)");
                                String profesion = sc.next();
                                System.out.println("ingrese asignatura(String)");
                                String asignatura = sc.next();
                                System.out.println("ingrese fecha Incio (String)");
                                String fechaInicio = sc.next();
                                System.out.println("ingrese fecha Fin (String)");
                                String fechaFin = sc.next();
                                System.out.println("desea continuar si(1) no(2)");
                                int c = sc.nextInt();
                                if(c == 2){
                                    fin = true;
                                }
                            }                                                  
                    break;
                    case 2:
                        ArrayList <Planta> planta1 = new ArrayList();
                            while(!fin){                    
                                System.out.println("ingrese tipo  de documento (String)");
                                String tipoDocumento = sc.next();
                                System.out.println("ingrese el documento (String)");
                                String documento = sc.next();
                                System.out.println("ingrese apellido (String)");
                                String appelido = sc.next();
                                System.out.println("ingrese nombre (String)");
                                String nombre = sc.next();
                                System.out.println("ingrese edad (int)");
                                int edad = sc.nextInt();
                                System.out.println("estado activo(1) inactivo(2)");
                                int des = sc.nextInt();
                                if(des == 1){
                                    boolean activo = true;
                                }else{
                                    boolean activo = false;
                                }
                                System.out.println("Ingrese la profesion (String)");
                                String profesion = sc.next();
                                System.out.println("Ingrese la asignatura (String)");
                                String asignatura = sc.next();
                                System.out.println("Ingrese la Fecha de Contrato (String)");
                                String fechaContrato = sc.next();
                                System.out.println("Ingrese la cantidad de proyectos (Int)");
                                int cantProyectos = sc.nextInt();
                                System.out.println("desea continuar si(1) no(2)");
                                int c = sc.nextInt();
                                if(c == 2){
                                    fin = true;
                                }
                            }               
                    break;    
                }               
            break;        
        }
        
        
        
        
        
        
        //fin
   }
    
}
