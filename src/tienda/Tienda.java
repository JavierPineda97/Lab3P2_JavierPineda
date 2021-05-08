package tienda;

import java.awt.Color;

public class Tienda {

    public class Productos {
        private int NumSerie;
        private int precio;
        private Color color;
        private String garantia;

        public Productos(int NumSerie, int precio, Color color, String garantia) {
            this.NumSerie = NumSerie;
            this.precio = precio;
            this.color = color;
            this.garantia = garantia;
        }

        public int getNumSerie() {
            return NumSerie;
        }

        public int getPrecio() {
            return precio;
        }

        public Color getColor() {
            return color;
        }

        public String getGarantia() {
            return garantia;
        }
        
    }
    
    public class Personas {
        private String nombre;
        private String apellido;
        private int salario;
        private String nacionalidad;

        public Personas(String nombre, String apellido, int salario, String nacionalidad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.salario = salario;
            this.nacionalidad = nacionalidad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getSalario() {
            return salario;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }
        
    }
        
  public static void main(String[] args) {
       
    }
    
}
