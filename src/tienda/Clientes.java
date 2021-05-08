package tienda;

import tienda.Tienda.Personas;

public class Clientes extends Personas{
    int CantCrediAcceder;
    String ArtComprPreviamente;
    String Domicilio;
    
    public Clientes(String nombre, String apellido, int salario, String nacionalidad,int CantCrediAcceder,
           String ArtComprPreviamente, String Domicilio){
        
        super(nombre,apellido,salario,nacionalidad);
        this.CantCrediAcceder=CantCrediAcceder;
        this.ArtComprPreviamente=ArtComprPreviamente;
        this.Domicilio=Domicilio;
    }
}
