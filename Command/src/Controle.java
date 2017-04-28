import java.util.ArrayList;

public class Controle {
	private ArrayList<ICommand> historico = new ArrayList<ICommand>();

	public void ArmazenarEAcionar(ICommand cmd, Dispositivo d) {
		historico.add(cmd);
		cmd.acionar(d);
	}

	public String listarHistorico() {
		StringBuilder builder = new StringBuilder();

		for (ICommand h : historico)
			builder.append("Comando: ").append(h.getClass().getName()).append("\n");

		return builder.toString();
	}
}