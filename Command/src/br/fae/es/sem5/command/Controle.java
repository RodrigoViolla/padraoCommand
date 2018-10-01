package br.fae.es.sem5.command;

import java.util.ArrayList;

public class Controle {
    private ArrayList<String> historico = new ArrayList<String>();

    public String ArmazenarEAcionar(ICommand cmd, Dispositivo d) {
        String novoComando = d.getNome() + " - " + cmd.toString() + "\n";
        historico.add(0, novoComando);
        return cmd.precionar(d);
    }

    public String listarHistorico() {
        StringBuilder builder = new StringBuilder();

        for(String h : historico)
            builder.append(h);

        return builder.toString();
    }
}