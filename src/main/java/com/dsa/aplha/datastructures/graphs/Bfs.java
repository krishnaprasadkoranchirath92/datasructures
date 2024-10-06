package com.dsa.aplha.datastructures.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	static class NodeEdge {
		int source;
		int destination;

		public NodeEdge(int source, int destination) {
			super();
			this.source = source;
			this.destination = destination;
		}

	}

	public static void main(String[] args) {
		ArrayList<NodeEdge>[] graph = new ArrayList[7];
		graph = createGraph(graph);
		bfs(graph);
	}

	private static void bfs(ArrayList<NodeEdge>[] graph) {
		int n = graph.length;
		int[] visited = new int[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			queue.add(i);
			
		}
	}

	private static ArrayList<NodeEdge>[] createGraph(ArrayList<NodeEdge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new NodeEdge(0, 1));
		graph[0].add(new NodeEdge(0, 2));
		graph[1].add(new NodeEdge(1, 0));
		graph[1].add(new NodeEdge(1, 3));
		graph[2].add(new NodeEdge(2, 0));
		graph[2].add(new NodeEdge(2, 4));
		graph[3].add(new NodeEdge(3, 1));
		graph[3].add(new NodeEdge(3, 4));
		graph[3].add(new NodeEdge(3, 5));
		graph[4].add(new NodeEdge(4, 2));
		graph[4].add(new NodeEdge(4, 3));
		graph[4].add(new NodeEdge(4, 5));
		graph[5].add(new NodeEdge(5, 4));
		graph[5].add(new NodeEdge(5, 3));
		graph[5].add(new NodeEdge(5, 6));
		graph[6].add(new NodeEdge(6, 5));
		return graph;
	}
}
