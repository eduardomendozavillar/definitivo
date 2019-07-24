
package javaapplication19;

public class Docente extends Personal{
    
    protected String profesion;
    protected String asignatura;
    
    public Docente(
            String tipoDocumento,
            String documento,
            String Apellidos,
            String Nombres,
            int edad,
            boolean activo,
            String profesion,
            String asignatura)
    {
        super(tipoDocumento, documento, Apellidos, Nombres, edad, activo);
        this.profesion = profesion;
        this.asignatura = asignatura;
    }
    public void setAsignatura(String asignatura)
    {
        this.asignatura = asignatura;
    }  
    
}
