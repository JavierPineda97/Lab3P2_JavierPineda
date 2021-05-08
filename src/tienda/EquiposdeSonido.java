package tienda;

import java.awt.Color;
import tienda.Tienda.Productos;


public class EquiposdeSonido extends Productos {
    int CantAltavoces;
    int PotMaxima;
    int PuertosAUX;
    int CantMaxDiscos;
    int PuertosUSB;
    
    public EquiposdeSonido(int NumSerie, int precio, Color color, String garantia){
         
        super(NumSerie, precio, color, garantia);
        this.CantAltavoces=CantAltavoces;
        this.PotMaxima=PotMaxima;
        this.PuertosAUX=PuertosAUX;
        this.CantMaxDiscos=CantMaxDiscos;
        this.PuertosUSB=PuertosUSB;
    }
}
