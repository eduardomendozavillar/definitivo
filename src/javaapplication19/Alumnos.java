
package javaapplication19;

public class Alumnos extends Personal {
    private String codigo; 
    private String facultad;
    private String programa;
    private int semestre;
    
    public Alumnos(
            String tipoDocumento,
            String documento,
            String Apellidos,
            String Nombres,
            int edad,
            boolean activo,
            String codigo,
            String facultad,
            String programa,
            int semestre){
        super(tipoDocumento, documento, Apellidos, Nombres, edad, activo);
        this.codigo = codigo;
        this.facultad = facultad;
        this.programa = programa;
        this.semestre = semestre;
    }
    
    public String mostrar(){
        String resultado = "";
        resultado = mostrarInfo()+" "+codigo+" "+facultad+" "+programa+" "+Integer.toString(semestre);
        return resultado;
    }    
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setFacultad(String facultad){
        this.facultad = facultad;
    }
    
    public void setPrograma(String programa){
        this.programa = programa;
    }
    
    public void setSemestre(int semestre){
        this.semestre = semestre;
    } 
        
}
