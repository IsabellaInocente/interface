package InterfaceAnimal;

public class FJH {
	
	public static void main(String[]args) {
		Jornada jorn = new Jornada("ronald", "rua cesar", 5, "152368947", 80);
		Horista ho = new Horista("ronald", "rua cesar", 5, "152368947", 80);
		PessoaJurdica pesj = new PessoaJurdica("ronald", "rua cesar", 5, "152368947", 80);
		
		System.out.println(jorn.getId());
		System.out.println(jorn.getNome());
		System.out.println(jorn.getMatricula());
		System.out.println(jorn.getTelefone());
		System.out.println(jorn.getEndereco());
		
		System.out.println(ho.getId());
		System.out.println(ho.getNome());
		System.out.println(ho.getMatricula());
		System.out.println(ho.getTelefone());
		System.out.println(ho.getEndereco());
		
		System.out.println(pesj.getId());
		System.out.println(pesj.getNome());
		System.out.println(pesj.getMatricula());
		System.out.println(pesj.getTelefone());
		System.out.println(pesj.getEndereco());
		
		System.out.println("Seu salario é de:"+jorn.calcularSalario(8, 2));
		System.out.println("Seu salario é de:"+ho.calcularSalario(8, 2));
		System.out.println("Seu salario é de:"+pesj.calcularSalario(8, 2));
	}

}
