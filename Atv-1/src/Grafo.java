package src;

import java.io.*;
import java.util.*;

class Grafo {
    private int V; // Número de vértices
    private LinkedList<Integer>[] adj; // Lista de adjacência

    // Construtor do grafo
    public Grafo(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Método para adicionar uma aresta ao grafo
    public void adicionarAresta(int v, int w) {
        adj[v].add(w);
    }

    // Método para calcular o grau de saída de um vértice
    public int grauSaida(int v) {
        return adj[v].size();
    }

    // Método para calcular o grau de entrada de um vértice
    public int grauEntrada(int v) {
        int grau = 0;
        for (int i = 0; i < V; i++) {
            for (int j : adj[i]) {
                if (j == v) {
                    grau++;
                }
            }
        }
        return grau;
    }

    // Método para obter o conjunto de sucessores de um vértice
    public List<Integer> sucessores(int v) {
        return adj[v];
    }

    // Método para obter o conjunto de predecessores de um vértice
    public List<Integer> predecessores(int v) {
        List<Integer> predecessores = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (adj[i].contains(v)) {
                predecessores.add(i);
            }
        }
        return predecessores;
    }
}




