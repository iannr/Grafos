package src;

import java.util.*;

public class RoundRobin {
    public static void main(String[] args) {
        // Defina os processos e seus tempos de execução e chegada aqui
        Processo[] processos = {
            new Processo("P1", 8, 0),
            new Processo("P2", 4, 1),
            new Processo("P3", 9, 2),
            new Processo("P4", 5, 3),
            new Processo("P5", 4, 4)
        };

        int quantum = 1;
        Queue<Processo> fila = new LinkedList<>(Arrays.asList(processos));
        int tempoAtual = 0;
        double tempoRetornoMedio = 0;

        System.out.println("Tempo de Retorno para cada processo:");

        while (!fila.isEmpty()) {
            Processo processo = fila.poll();
            int tempoExecucao = Math.min(quantum, processo.getTempoExecucao());
            
            tempoAtual += tempoExecucao;

            if (processo.getTempoExecucao() > 0) {
                fila.offer(processo); // Coloca de volta na fila se ainda não terminou
            } else {
                int tempoRetorno = tempoAtual - processo.getTempoChegada();
                System.out.println(processo.getNome() + ": " + tempoRetorno);
                tempoRetornoMedio += tempoRetorno;
            }
        }

        tempoRetornoMedio /= processos.length;
        System.out.println("\nTempo de Retorno Médio: " + tempoRetornoMedio);
    }
}


