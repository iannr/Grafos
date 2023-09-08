package src;

import java.util.*;

public class SJF {
    public static void main(String[] args) {
        // Defina os processos e seus tempos de execução e chegada aqui
        Processo[] processos = {
            new Processo("P1", 8, 0),
            new Processo("P2", 4, 1),
            new Processo("P3", 9, 2),
            new Processo("P4", 5, 3),
            new Processo("P5", 4, 4)
        };

        Arrays.sort(processos, Comparator.comparingInt(Processo::getTempoExecucao));

        int tempoAtual = 0;
        double tempoRetornoMedio = 0;

        System.out.println("Tempo de Retorno para cada processo:");

        for (Processo processo : processos) {
            int tempoRetorno = tempoAtual + processo.getTempoExecucao() - processo.getTempoChegada();
            System.out.println(processo.getNome() + ": " + tempoRetorno);
            tempoRetornoMedio += tempoRetorno;
            tempoAtual += processo.getTempoExecucao();
        }

        tempoRetornoMedio /= processos.length;
        System.out.println("\nTempo de Retorno Médio: " + tempoRetornoMedio);
    }
}

class Processo {
    private String nome;
    private int tempoExecucao;
    private int tempoChegada;

    public Processo(String nome, int tempoExecucao, int tempoChegada) {
        this.nome = nome;
        this.tempoExecucao = tempoExecucao;
        this.tempoChegada = tempoChegada;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

	public void setTempoExecucao(int i) {
		// TODO Auto-generated method stub
		
	}
}

