import java.util.Arrays;
import javax.swing.JOptionPane;

public class QuestaoOBI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* --------------------------- RESUMO DA QUESTÃO------------------------
		Escrever um programa que, dadas as áreas das quatro zonas, determine
		se ele poderá ou não manter seu projeto (ou seja, se existe um retângulo
		que possa ser dividido por duas retas perpendiculares, cada uma paralela
		a dois dos lados do retângulo, tal que as quatro áreas formadas obedeçam
		às exigências do governo).
		-------------------------------------------------------------------------*/
		
		
		int[] vector = null;
		vector = new int[4];
		
		for (int i = 0; i <= 3; i++) {
			
			String vVetor = JOptionPane.showInputDialog("Digite a Area");
			
			vector[i] = Integer.parseInt(vVetor);
		}
		
		Arrays.sort(vector);
		
		if ((vector[0] * vector[3]) == (vector[1] * vector[2])) {
			
			JOptionPane.showMessageDialog(null, "SIM");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "NAO");
		}
	}

}