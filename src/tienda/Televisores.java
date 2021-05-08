package tienda;

import java.awt.Color;
import tienda.Tienda.Productos;

public class Televisores extends Productos {
    int TamPantalla;
    String smart;
    String marca;
    int CantConectores;
    int grosor;
    
    public Televisores(int NumSerie, int precio, Color color, String garantia){
         
        super(NumSerie, precio, color, garantia);
        this.TamPantalla=TamPantalla;
        this.smart=smart;
        this.marca=marca;
        this.CantConectores=CantConectores;
        this.grosor=grosor;
        
    }
    
    public void datos(){
        System.out.println("Numero de serie:"+getNumSerie()+"\nPrecio:"+getPrecio()+"\nColor:"+getColor()+"\nGarantia"+getGarantia()
        +"\nTamano de Pantalla:"+TamPantalla+"\nSmart:"+smart+"\nMarca:"+marca+"\nCantidad de Conectores:"+CantConectores+"\nGrosor:"+grosor);
    }
}
