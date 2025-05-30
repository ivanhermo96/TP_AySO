/*Clase Círculo:
- Define una clase Círculo con un atributo radio de tipo double.
- Crea métodos para calcular el área y la circunferencia del círculo.
 -Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un
  porcentaje dado.
*/

package rectangulo;
import java.text.DecimalFormat;

public class circulo {
    
    double radio;
    
    public String calcularArea(){
         double area = Math.PI * (radio * radio);
         DecimalFormat dfArea = new DecimalFormat("#.##");
         String redondeadoDosDecimales = dfArea.format(area);
         return redondeadoDosDecimales;
    }
    
    public String calcularCircunferencia(){
        double circunferencia = 2 * Math.PI * radio;
        DecimalFormat dfCircunferencia = new DecimalFormat("#.##");
        String redondeadoDosDecimales = dfCircunferencia.format(circunferencia);
        return redondeadoDosDecimales;
    }
    
}
