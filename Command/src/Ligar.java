
public class Ligar implements ICommand {

	@Override
	public void acionar(Dispositivo d) {
		System.out.println(d.getNome() + " Ligado");	
	}
}