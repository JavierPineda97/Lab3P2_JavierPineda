package tienda;

public class Supervisor extends Empleados {
    String CajerosBajoSupervision;
    int SalPromEmpleSuperv;
    int MetPromCajSuperv;
    
    public Supervisor(String nombre, String apellido, int salario, String nacionalidad,String CajerosBajoSupervision,
           int SalPromEmpleSuperv,int MetPromCajSuperv){
        
        super(nombre,apellido,salario,nacionalidad);
        this.CajerosBajoSupervision=CajerosBajoSupervision;
        this.SalPromEmpleSuperv=SalPromEmpleSuperv;
        this.MetPromCajSuperv=MetPromCajSuperv;
    }
}
  
