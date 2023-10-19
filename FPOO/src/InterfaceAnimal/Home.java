package InterfaceAnimal;

public class Home implements Computador {

	@Override
	public void ligar() {
		System.out.println("lgiando a home");
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
