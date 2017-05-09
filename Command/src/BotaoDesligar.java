
public class BotaoDesligar implements ICommand{

	@Override
	public void precionar(Dispositivo d) {
		System.out.println(d.getNome() + " Desligado");
	}
}