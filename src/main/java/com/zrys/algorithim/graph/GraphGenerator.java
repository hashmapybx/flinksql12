package com.zrys.algorithim.graph;

import scala.Int;

import java.util.Random;

/**
 * @author rocky
 * @create 2021 - 11 - 22 9:08
 */
public class GraphGenerator {
    /**
     * <p>
     *     产生图
     * </p>
     * @param matrix
     * @return
     */
    public static Graph createGraph(Integer[][] matrix) {

        Graph graph = new Graph();

        for (int i = 0; i < matrix.length; i++) {
            Integer weight = matrix[i][0];
            Integer from = matrix[i][1];
            Integer to = matrix[i][2];
            if (!graph.nodes.containsKey(from)) {
                graph.nodes.put(from, new Node(from));
            }
            if (!graph.nodes.containsKey(to)) {
                graph.nodes.put(to, new Node(to));
            }
            Node fromNode = graph.nodes.get(from);
            Node toNode = graph.nodes.get(to);
            Edge newEdge = new Edge(weight, fromNode, toNode);
            fromNode.nexts.add(toNode);
            fromNode.outDegree++;
            toNode.inDegree++;
            fromNode.edges.add(newEdge);
            graph.edges.add(newEdge);

        }

        return graph;
    }

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(5);
            }
        }
//        System.out.println(matrix);
        Graph graph = createGraph(matrix);
        System.out.println(graph);
    }

}