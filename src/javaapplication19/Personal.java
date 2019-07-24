
package javaapplication19;

//clase padre

public class Personal {
    
    protected String tipoDocumento;
    protected String documento;
    protected String Apellidos;
    protected String Nombres;
    protected int edad;
    protected boolean activo;
    
    public Personal (
            String tipoDocumento,
            String documento,
            String Apellidos, 
            String Nombres,
            int edad, 
            boolean activo){
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.edad = edad;
        this.activo = activo;
    }
    
    public String mostrarInfo(){
        String resultado = "";        
        String estado = "";
        
        if (this.activo){
            estado = "activo";
        }else{
            estado = "inactivo";
        }
        
        resultado = tipoDocumento+" "+documento+" "+Apellidos+" "+Nombres+" "+Integer.toString(edad)+" "+estado;
        return resultado;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
  
}
