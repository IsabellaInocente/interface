package InterfaceAnimal;

public class Game implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("lgiando o game");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("reiniciando o game");
	}
	
	@Override
	public void desligar() {
		System.out.println("desligando o game");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("carregando");
	}

}
