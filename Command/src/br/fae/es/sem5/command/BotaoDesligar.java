package br.fae.es.sem5.command;

public class BotaoDesligar implements ICommand{
    @Override
    public void precionar(Dispositivo d) {
	System.out.println(d.getNome() + " Desligado");
    }
        
    public String toString() {
	return "Desligado";
    }
}