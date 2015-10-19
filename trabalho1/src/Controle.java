/* 
 Matriz L: (quadrada)
 
 	jjjjjjjj
  [1][1][1][0]
  [0][1][1][0]
  [1][0][1][1]
  [0][0][1][1]
  
  i = linha (saida)
  j = coluna (chegada)
 
 */
public class Controle {

	public static void main(String[] args) {
		// Declaração da Interface como Objeto
		Interface aInterface = new Interface();
		// criação e inicialização de uma matriz (conforme o problema)
		int matriz[][] = { { 1, 1, 1, 0 }, { 0, 1, 1, 0 }, { 1, 0, 1, 0 }, { 0, 0, 1, 0}, };
		//Declaração de Rotas como Objeto e atribuição da matriz para o construtor do objeto
		Rotas aRotas = new Rotas(matriz);
		//Pedido da Constante correspondente a cidade de pesquisa
		int k = aInterface.getInteger("Informe a Cidade para Procura");
		
		// Resolução da Questão 1
		int saidas = aRotas.saidasCidadeK(k);
		int chegadas = aRotas.chegadasCidadeK(k);
		
		// Resolução da Questão 2		
		int maiorNChegadas = aRotas.maiorNumeroChegadas();
		
		// Resolução da Questão 3		
		boolean ligacoesDiretas = aRotas.ligacoesDiretas(k);
		
		// Resolução da Questão 4		
		String saidasDiretasK = aRotas.saidasDiretasK(k);
	
		// Resolução da Questão 5		
		String cidadesIsoladas = aRotas.cidadeIsolada();		
		String cidadesSemSaida = aRotas.cidadesSemSaida();		
		String cidadesSemChegada = aRotas.cidadesSemChegada();
		
		
		// Resultados
		aInterface.showMessage("1) A cidade " + k + " possui " + (saidas) + " saidas " + " e " + chegadas + " chegadas.\n\n" +
		
							   "2) A cidade " + maiorNChegadas + " possui o maior numero de chegadas\n\n" +
							   
							   "3) A cidade " + k + (ligacoesDiretas ? " possui" : " nao possui") + " todas as estradas de mao dupla\n\n" +
							   
							   "4) A cidade " + saidasDiretasK  +  " possue saida direta para a cidade " + k + "\n\n" +
							   
							   "5) \n" +
							   " - As cidades Isoladas sao: " + cidadesIsoladas + "\n" +
							   
							   " - As cidades das quais nao ha saida, apesar de haver entradas sao: " +  cidadesSemSaida + "\n" +
							   
							   " - As cidades das quais nao ha chegadas, apesar de haver saidas sao: " + cidadesSemChegada);
		
	}

}
