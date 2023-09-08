package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome do arquivo
        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        // Solicitar o número do vértice
        System.out.println("Digite o número do vértice: ");
        int numeroVertice = scanner.nextInt();

        // Ler o conteúdo do arquivo e construir o grafo
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            int numeroVertices = Integer.parseInt(br.readLine());
            Grafo grafo = new Grafo(numeroVertices);

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" ");
                int origem = Integer.parseInt(partes[0]);
                int destino = Integer.parseInt(partes[1]);
                grafo.adicionarAresta(origem, destino);
            }

            // Calcular e exibir as informações para o vértice informado
            int grauSaida = grafo.grauSaida(numeroVertice);
            int grauEntrada = grafo.grauEntrada(numeroVertice);
            List<Integer> sucessores = grafo.sucessores(numeroVertice);
            List<Integer> predecessores = grafo.predecessores(numeroVertice);

            System.out.println("Grau de Saída: " + grauSaida);
            System.out.println("Grau de Entrada: " + grauEntrada);
            System.out.println("Conjunto de Sucessores: " + sucessores);
            System.out.println("Conjunto de Predecessores: " + predecessores);

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}