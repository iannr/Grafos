
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Graph {
  private Map<Integer, Map<Integer, Boolean>> edges;
  private Set<Integer> nodes;

  public Graph() {
    edges = new HashMap<>();
    nodes = new HashSet<>();
  }

  public void addEdge(int u, int v) {
    nodes.add(u);
    nodes.add(v);

    if (!edges.containsKey(u)) {
      edges.put(u, new HashMap<>());
    }
    edges.get(u).put(v, true);
  }

  public int outDegree(int v) {
    return edges.get(v).size();
  }

  public int inDegree(int v) {
    int count = 0;
    for (int u : nodes) {
      if (edges.get(u).containsKey(v)) {
        count++;
      }
    }
    return count;
  }

  public Set<Integer> successors(int v) {
    return edges.get(v).keySet();
  }

  public Set<Integer> predecessors(int v) {
    Set<Integer> preds = new HashSet<>();
    for (int u : nodes) {
      if (edges.get(u).containsKey(v)) {
        preds.add(u);
      }
    }
    return preds;
  }
}

