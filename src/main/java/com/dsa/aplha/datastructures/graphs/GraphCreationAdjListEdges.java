package com.dsa.aplha.datastructures.graphs;

import java.util.ArrayList;

public class GraphCreationAdjListEdges {
	static class Edge {
		int src;
		int dest;
		int wt;

		public Edge(int src, int dest, int wt) {
			super();
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}

	}

	public static void main(String[] args) {
		
		ArrayList<Edge>[] graph = new ArrayList[3];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 5));
		graph[1].add(new Edge(1, 0, 5));
		graph[1].add(new Edge(1, 2, 5));
		graph[2].add(new Edge(2, 1, 5));
		int n = 1;
		for (Edge e : graph[n]) {
			System.out.println(e.dest);
		}

	}
//	TC = O[1]
}
