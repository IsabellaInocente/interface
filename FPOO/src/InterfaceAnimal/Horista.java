package InterfaceAnimal;

public class Horista extends Funcionario {
	
	
	public Horista(String nome, String telefone, int matricula, String endereco, long id) {
		super(nome, telefone, matricula, endereco, id);
	}

	@Override
	public double calcularSalario(double horas, double valor) {
		return horas*valor;
	}


}
