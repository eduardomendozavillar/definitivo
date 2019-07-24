
package javaapplication19;

public class Planta extends Docente
{
    private String fechaContrato;
    private int cantProyectos;
    
    public Planta(
            String tipoDocumento,
            String documento,
            String Apellidos,
            String Nombres,
            int edad,
            boolean activo,
            String profesion,
            String asignatura,
            String fechaContrato,
            int cantProyectos){
        super(tipoDocumento, documento, Apellidos, Nombres, edad, activo, profesion, asignatura);
        this.fechaContrato = fechaContrato;
        this.cantProyectos = cantProyectos;
    }
    
    public String mostrar()
    {
        String resultado = "";
        resultado = mostrarInfo()+" "+profesion+" "+asignatura+" "+fechaContrato+" "+Integer.toString(cantProyectos);
        return resultado;
    }
    /* 
    public int setCantProyectos()
    {
        int resultado = 0;
        
    }
    */
    
}
