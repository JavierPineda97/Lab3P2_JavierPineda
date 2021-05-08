package tienda;

public class Cajero extends Empleados {
    int CantidadAnLaborando;
    int HorarioTrabajo;
    int HoraAlmuerzo;
    int MetaMes;
    int CantidadClientesAtendidos;
    
    public Cajero(String nombre, String apellido, int salario, String nacionalidad, int CantidadAnLaborando, int HorarioTrabajo,
    int HoraAlmuerzo,int MetaMes,int CantidadClientesAtendidos){
        
        super(nombre,apellido,salario,nacionalidad);
        this.CantidadAnLaborando=CantidadAnLaborando;
        this.HorarioTrabajo=HorarioTrabajo;
        this.HoraAlmuerzo=HoraAlmuerzo;
        this.MetaMes=MetaMes;
        this.CantidadClientesAtendidos=CantidadClientesAtendidos;
    }
}
    