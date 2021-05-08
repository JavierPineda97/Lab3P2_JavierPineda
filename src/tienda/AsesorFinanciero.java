package tienda;

public class AsesorFinanciero extends Empleados{
    int ClientesAtendidos;
    int CantProdClienCompra;
    int CreditosConcedidos;
    
    public AsesorFinanciero(String nombre, String apellido, int salario, String nacionalidad,int ClientesAtendidos,
           int CantProdClienCompra,int CreditosConcedidos){
        
        super(nombre,apellido,salario,nacionalidad);
        this.ClientesAtendidos=ClientesAtendidos;
        this.CantProdClienCompra=CantProdClienCompra;
        this.CreditosConcedidos=CreditosConcedidos;
    } 
}
  
