import javax.swing.JOptionPane;

public class Exercicio3 {
	/*
	 
	 * Para um grupo de valores reais, determinar o desvio
	padrão em relação à média dos valores. Armazene os
	valores em um array de reais.
	• O desvio padrão (DP) pode ser obtido por:

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] array = new double [5];
		
		double resultado = 0.0,
			   somatorioA = 0.0,
			   somaValores = 0.0,
			   somatorioB = 0.0;
		
		for (int i = 0; i < array.length; i++){
			
			array[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de [ " + (i+1) + " ]"));
			
			somatorioA += Math.pow(array[i], 2);
			somaValores += array[i];
		}
		
		somatorioB += Math.pow(somaValores, 2);	
		resultado = ((somatorioA - (somatorioB / array.length)) / (array.length - 1));
		
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}
	
}