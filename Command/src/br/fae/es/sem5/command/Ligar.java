package br.fae.es.sem5.command;

public class Ligar implements ICommand {

	@Override
	public void precionar(Dispositivo d) {
		System.out.println(d.getNome() + " Ligado");	
	}
}