package rectangulo;

/*1. Clase Rectángulo:
- Crea una clase Rectángulo con atributos ancho y alto de tipo double.
- Implementa métodos para calcular el Área y el perí­metro del rectángulo.
- Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
ancho y alto son iguales.*/

public class rectangulo {
    
    double ancho;
    double alto;
    
    public double calcularArea(){
        double area = ancho * alto;
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro = (ancho * 2) + (alto * 2);
        return perimetro;
    }
    
    public boolean esCuadrado(){
        if(ancho == alto){
            return true;
        }else
            {
                return false;
            }
    }
}
