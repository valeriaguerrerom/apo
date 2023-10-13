package ej08;

import javax.swing.JOptionPane;

public class Ej08 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Ponderación del Estud.");
		
		float [] nota=new float [3];
		double suma=0;
		double prom=0;
		
		for (int i=0; i<3; i++) {
			try {
			    nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Calificación " + (i+1)));
			    suma+=nota[i];
			} catch (NumberFormatException e) {
			    JOptionPane.showMessageDialog(null, "¡ERROR!\n Ingrese Un Número\n (Entero o Decimal)");
			    i--;
			}
		}
		
		prom=suma/3;
		JOptionPane.showMessageDialog(null, "Promedio: "+prom); 
		
	}
}