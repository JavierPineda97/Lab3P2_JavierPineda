package tienda;

import java.awt.Color;
import tienda.Tienda.Productos;


public class Consolas extends Productos{
    String marca;
    int CantAlmacenamiento;
    int CantControles;
    int NumAccesorios;
    String InfoTarjetaVideo;
    
    public Consolas(int NumSerie, int precio, Color color, String garantia){
         
        super(NumSerie,  precio, color, garantia);
        this.marca=marca;
        this.CantAlmacenamiento=CantAlmacenamiento;
        this.CantControles=CantControles;
        this.NumAccesorios=NumAccesorios;
        this.InfoTarjetaVideo=InfoTarjetaVideo;
    }
}
