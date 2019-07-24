
package javaapplication19;

public class Administrativo extends Personal{
    
    private String cargo;
    private String fechaContrato;
    
    public Administrativo(
            String tipoDocumento,
            String documento,
            String Apellidos,
            String Nombres,
            int edad,
            boolean activo,
            String cargo,
            String fechaContrato) 
    {
        super(tipoDocumento, documento, Apellidos, Nombres, edad, activo);
        this.cargo = cargo;
        this.fechaContrato = fechaContrato;
    }
    
    public String mostrar()
    {
        String resultado = "";
        resultado = mostrarInfo()+" "+cargo+" "+fechaContrato;
        return resultado;
    }
  
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
}
