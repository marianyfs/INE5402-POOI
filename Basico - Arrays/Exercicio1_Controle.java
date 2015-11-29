
public class Exercicio1_Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercicio1_Aluno Aluno;
		Exercicio1_Interface Interface;
		
		Aluno = new Exercicio1_Aluno(null, 0);
		Interface = new Exercicio1_Interface();
		
		
		Aluno.setNome(Interface.pedePalavra("Digite o nome do Aluno"));
		Aluno.setMatricula(Interface.pedeInteiro("Digite a Matrícula do Aluno"));
		
		double notas [] = new double[3];
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Interface.pedeDecimal("Informe a Nota " + i);
		}

		Aluno.setNotas(notas.clone());
		
		double maiorNota = Aluno.calculoMaiorNota();
		double menorNota = Aluno.calculoMenorNota();
		double diferencaNotas = Aluno.diferencaNotas();
		
		Interface.mostraMensagem("O Resultado obtido foi: " + "\n" + "\n" +
		
								"Maior Nota: " + maiorNota + "\n" +
								"Menor Nota: " + menorNota  + "\n" +
								"Diferenca : " + diferencaNotas);
	}

}
