public class Principal {
	public static void main(String[] args) {
		Controle gerenciar = new Controle();
		
		Dispositivo tv = new Dispositivo("TV da Sala");
		Dispositivo radio = new Dispositivo("Rádio do Quarto");
		
		gerenciar.ArmazenarEAcionar(new Ligar(), tv);
		gerenciar.ArmazenarEAcionar(new Desligar(), radio);
		gerenciar.ArmazenarEAcionar(new Desligar(), tv);
		
		System.out.println(gerenciar.listarHistorico());
	}
}