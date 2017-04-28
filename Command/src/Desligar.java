
public class Desligar implements ICommand{

	@Override
	public void acionar(Dispositivo d) {
		System.out.println(d.getNome() + " Desligado");
	}
}