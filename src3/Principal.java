public class Principal {

	public static void main(String[] args) {
		
//------- Declaração da Classe como um Objeto --------------------------

		Pessoa umaPessoa;
		Interface umaInterface;
		
//------- Instanciação do Objeto de determinada Classe -----------------
		umaPessoa = new Pessoa();
		umaInterface = new Interface();
		
//-------Declaração de Variaveis Locais --------------------------------
		String nome;
		int idade;
		double altura, pesoIdeal;

//------- Execução do Algorítimo----------------------------------------

		nome = umaInterface.PegueNome();						// 1.
		umaPessoa.getNome(nome);								// 2.
		idade = umaInterface.PegueIdade();						// 3.
		umaPessoa.getIdade(idade);								// 4.
		altura = umaInterface.PegueAltura();					// 5.
		umaPessoa.getAltura(altura);							// 6.

		pesoIdeal = umaPessoa.FornecaPesoIdeal();				// 7.
		
		umaInterface.MostrePesoIdeal(nome, idade, altura, pesoIdeal); // 8.
	}

}

/*------- ALGORITIMO ---------------------------------------------------
 * 
 * 1. Solicite ao Usuário que informe o Nome;
 * 2. Grave o Nome;
 * 
 * 3. Solicite ao Usuário que informe a Idade;
 * 4. Grave a Idade;
 * 
 * 5. Solicite ao Usuário que Informe a Altura;
 * 6. Grave a Altura;
 * 
 * 7. Faça o Calculo do Peso Ideal onde:
 * 		Peso Ideal = 72.7 * altura - 58.0
 * 
 * 8. Mostre o Resultado Obtido
 * /
