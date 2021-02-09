package com.learning.DataStructures.Graphs.bfs;

import com.learning.DataStructures.Graphs.node.GraphNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class PathFindingByBFS {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	
	//Constructor
	public PathFindingByBFS(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}//end of method

	
	
	//Print path of each of the vertex from source
	public static void pathPrint(GraphNode node) {
		if(node.getParent()!=null)
			pathPrint(node.getParent());  //recursive call to parent
		System.out.print(node+" ");
	}//end of method
	
	
	
	//BFS Traversal by a source node
	void BFSForSSSP(GraphNode node) {
		LinkedList<GraphNode>queue = new LinkedList<>();
		queue.add(node);  //add source node to queue
		while(!queue.isEmpty()) {
			GraphNode presentNode = queue.remove(0);
			presentNode.setVisited(true);
			System.out.print("Printing path for node "+presentNode.getName()+": ");
			pathPrint(presentNode);
			System.out.println();
			for(GraphNode neighbor: presentNode.getNeighbors()) {  //for each neighbor of present node
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
					neighbor.setParent(presentNode);
				}//end of if
			}//end of for loop
		}//end of while loop
	}//end of method

	Boolean findShortestPathBFSbetween2Points(GraphNode source, GraphNode destination) {
		LinkedList<GraphNode> nextVisitNode = new LinkedList<GraphNode>();
		HashSet<GraphNode> isVisited = new HashSet<GraphNode>();
		nextVisitNode.add(source);
		while (!nextVisitNode.isEmpty()) {
			GraphNode currentNode = nextVisitNode.remove();
			if (currentNode == destination) {
				return true;
			}
			if (currentNode.isVisited()) {
				continue;
			}
			for (GraphNode neighbourNode :
					currentNode.getNeighbors()) {
				nextVisitNode.add(neighbourNode);
			}
		}
		return false;
	}

	Boolean findShortestPathDFSbetween2Points(GraphNode source, GraphNode destination) {

		HashSet<GraphNode> visitedNodes = new HashSet<GraphNode>();
		return findShortestPathDFSbetween2Points(source, destination, visitedNodes);

	}

	private Boolean findShortestPathDFSbetween2Points(GraphNode source, GraphNode destination,
													  HashSet<GraphNode> visitedNodes) {
		if(visitedNodes.contains(source)){
			return false;
		}

		visitedNodes.add(source);
		if(source == destination){
			return true;
		}

		for (GraphNode currentNode:
			 source.getNeighbors()) {
			if(findShortestPathDFSbetween2Points(currentNode, destination, visitedNodes)){
				return true;
			}
		}
		return false;
	}


	// add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}//end of method
	
}//end of class