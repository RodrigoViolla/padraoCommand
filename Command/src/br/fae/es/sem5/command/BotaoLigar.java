package br.fae.es.sem5.command;

public class BotaoLigar implements ICommand {
    @Override
    public String precionar(Dispositivo d) {
		return d.getNome() + " Ligado";	
    }
        
    public String toString() {
        return "Ligado";
    }
}