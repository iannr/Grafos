package src;

import java.util.*;

public class FilaPrioridades {
    public static void main(String[] args) {
        // Defina os processos e suas prioridades aqui
        Processo[] processos = {
            new Processo("P1", 8, 0),
            new Processo("P2", 4, 1),
            new Processo("P3", 9, 2),
            new Processo("P4", 5, 3),
            new Processo("P5", 4, 4)
        };

        PriorityQueue<Processo2> fila = new PriorityQueue<>(Comparator.comparingInt(Processo2::getPrioridade));

        Collections.addAll(fila, processos);

        int tempoAtual = 0;
        double tempoRetornoMedio = 0;

        System.out.println("Tempo de Retorno para cada processo:");

        while (!fila.isEmpty()) {
            Processo2 processo = fila.poll();
            int tempoRetorno = tempoAtual + processo.getTempoExecucao() - processo.getTempoChegada();
            System.out.println(processo.getNome() + ": " + tempoRetorno);
            tempoRetornoMedio += tempoRetorno;
            tempoAtual += processo.getTempoExecucao();
        }

        tempoRetornoMedio /= processos.length;
        System.out.println("\nTempo de Retorno Médio: " + tempoRetornoMedio);
    }
}

