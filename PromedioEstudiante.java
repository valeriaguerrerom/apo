// Codigo promedioestudiante
package promedioestudiante;
// Se utiliza para mostrar ventanas de diaologo, entrada y salida de datos 
import javax.swing.JOptionPane;

public class promedioestudiante {
// En este metodo se muestra un cuadro de diálogo
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Ponderación del Estud.");
//Este arreglo se utilizará para almacenar las calificaciones ingresadas por el usuario		
		float [] nota=new float [3];
//Se declaran estas variables para calcular la suma de las calificaciones y almacenar el promedio 
		double suma=0;
		double prom=0;
//Se inicia un bucle "for" para ejecutar tres veces (cada calificación)
		for (int i=0; i<3; i++) {
//Se utiliza este arreglo para capturar posibles excepciones 
			try {
			    nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Calificación " + (i+1)));
			    suma+=nota[i];
			} catch (NumberFormatException e) {
//Se muestra un cuadro de dialogo con el mensaje indicado 
			    JOptionPane.showMessageDialog(null, "¡ERROR!\n Ingrese Un Número\n (Entero o Decimal)");
			    i--;
			}
		}
		
		prom=suma/3;
		JOptionPane.showMessageDialog(null, "Promedio: "+prom); 
		
	}
} 