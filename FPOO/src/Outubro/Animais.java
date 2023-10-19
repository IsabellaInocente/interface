package Outubro;

public class Animais {
	public static void main(String[] args) {
		
	Animal animal = new Animal("Princesa", "femea","vira-lata");
	animal.emitirSom();
	
	Lobo lobo = new Lobo("Scar", "M","ns");
	lobo.emitirSom();
	
	Tigre tigre = new Tigre("tiger", "M", "albino");
	tigre.emitirSom();
	
	Cachorro cachorro = new Cachorro("Mike", "M", "Rotweiler");
	cachorro.emitirSom();
	
	Gato gato = new Gato("marie", "F", "vl");
	gato.emitirSom();

	}
}
