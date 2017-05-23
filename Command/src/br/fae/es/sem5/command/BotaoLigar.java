package br.fae.es.sem5.command;

public class BotaoLigar implements ICommand {

	@Override
	public void precionar(Dispositivo d) {
		System.out.println(d.getNome() + " Ligado");	
	}
        
        public String toString() {
            return "Ligado";
        }
}