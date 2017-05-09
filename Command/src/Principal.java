public class Principal {
	public static void main(String[] args) {
		Controle gerenciar = new Controle();
		
		Dispositivo tv = new Dispositivo("TV da Sala");
		Dispositivo radio = new Dispositivo("Rádio do Quarto");
		
		gerenciar.ArmazenarEAcionar(new BotaoLigar(), tv);
		gerenciar.ArmazenarEAcionar(new BotaoDesligar(), radio);
		gerenciar.ArmazenarEAcionar(new BotaoDesligar(), tv);
		
		System.out.println(gerenciar.listarHistorico());
	}
}