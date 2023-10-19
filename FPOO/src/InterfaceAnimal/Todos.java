package InterfaceAnimal;

public class Todos {

	public static void main(String[]args) {
		Game game = new Game();
		
		game.carregandoSistema();
		game.desligar();
		game.ligar();
		game.reiniciar();
		
		Home home = new Home();
		
		home.carregandoSistema();
		home.desligar();
		home.ligar();
		home.reiniciar();
	}
}
