/*Exercícios

3.  Elabore  um  programa  que  calcula  o  salário  líquido  de  um
funcionário, assumindo que sobre seu salário bruto incide um
desconto de 8.5% para a previdência. Feito o desconto para a
previdência,  sobre  o  restante  é  aplicado  um  desconto  de
26,6%, a título de imposto de renda. O programa deve mostrar o nome do
funcionário e os salários bruto e líquido.
 */
public class Funcionario {

	String nome;
	double salLiquido, salLiqRenda, salLiqPrev, salBruto, descPrevidencia,
			descImpRenda;

	public Funcionario() {

		nome = "Nome Funcionario";

		if (salBruto < 0.0) {
			salBruto = 0.0;
		} else
			salBruto = 0.0;

		salLiquido = 0.0;

		salLiqRenda = 0.0;
		salLiqPrev = 0.0;

		descPrevidencia = 8.5;
		descImpRenda = 26.6;

	}

	public double CalculoDesconto() {

		salLiqPrev = (salBruto * descPrevidencia) / 100;

		salLiqRenda = (salLiqPrev * descImpRenda) / 100;

		salLiquido = salBruto - salLiqRenda;

		return salLiquido;
	}

	public void getNome(String vNome) {
		nome = vNome;
	}

	public void getSalBruto(double vSalBruto) {
		salBruto = vSalBruto;
	}

}
