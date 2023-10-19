package InterfaceAnimal;

public class PessoaJurdica extends Funcionario {
	
	
	public PessoaJurdica(String nome, String telefone, int matricula, String endereco, long id) {
		super(nome, telefone, matricula, endereco, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario(double horas, double valor) {
		return horas*valor;
	}
}
