package tienda;

import java.awt.Color;
import tienda.Tienda.Productos;


public class TeatroenCasa extends Productos{
    int CantAltavoces;
    int CantDiscBluRay;
    String InfoLimpieza;
    String InfoLectorDisco;
    
    public TeatroenCasa(int NumSerie, int precio, Color color, String garantia){
        
        super(NumSerie,  precio, color, garantia);
        this.CantAltavoces=CantAltavoces;
        this.CantDiscBluRay=CantDiscBluRay;
        this.InfoLimpieza=InfoLimpieza;
        this.InfoLectorDisco=InfoLectorDisco;
        
    }
}
