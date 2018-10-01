package br.fae.es.sem5.command;

public class BotaoDesligar implements ICommand{
    @Override
    public String precionar(Dispositivo d) {
		return d.getNome() + " Desligado";
    }
        
    public String toString() {
	return "Desligado";
    }
}