public class Questao1_Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARACAO DE CLASSES COMO OBJETOS E INSTANCIACAO DOS OBJETOS

		Questao1_Modelo umaQuestao1_Modelo;
		umaQuestao1_Modelo = new Questao1_Modelo();

		Questao1_Interface umaQuestao1_Interface;
		umaQuestao1_Interface = new Questao1_Interface();

		// ALGORITOMO PARA EXECUSSAO DA TAREFA
		// PEGUAR A MASSA INICIAL; CALCULAR O TEMPO; MOSTRAR O RESULTADO.

		umaQuestao1_Modelo.MassaInicial(umaQuestao1_Interface
				.pegueDouble("Digite o valor da massa"));
		umaQuestao1_Interface.mostraMensagem("O Tempo necessário é: "
				+ umaQuestao1_Modelo.CalculoTempoPercorrido());

	}

}
