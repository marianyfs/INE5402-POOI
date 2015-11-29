public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario umFuncionario;
		Interface umaInterface;

		umFuncionario = new Funcionario();
		umaInterface = new Interface();

		String vNome;
		double vSalLiquido, vSalBruto;

		vNome = umaInterface.PegueNome();
		umFuncionario.getNome(vNome);

		vSalBruto = umaInterface.PegueSalarioBruto();
		umFuncionario.getSalBruto(vSalBruto);

		vSalLiquido = umFuncionario.CalculoDesconto();

		umaInterface.MostreMensagem(vNome, vSalBruto, vSalLiquido);

	}

}
