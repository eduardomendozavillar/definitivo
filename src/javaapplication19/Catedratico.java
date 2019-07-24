
package javaapplication19;

public class Catedratico extends Docente
{    
    private String fechaInicio, fechaFin;
    
    public Catedratico(
            String tipoDocumento,
            String documento,
            String Apellidos,
            String Nombres,
            int edad,
            boolean activo, 
            String profesion,
            String asignatura,
            String fechaInicio,
            String fechaFin) 
    {
        super(tipoDocumento, documento, Apellidos, Nombres, edad, activo, profesion, asignatura);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public String mostrar(){
        String resultado = "";
        resultado = mostrarInfo()+" "+profesion+" "+asignatura+" "+fechaInicio+" "+fechaFin;
        return resultado;
    }
    
}
