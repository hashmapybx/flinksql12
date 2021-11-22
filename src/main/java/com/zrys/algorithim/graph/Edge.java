package com.zrys.algorithim.graph;

/**
 * 图中的边
 * @author rocky
 * @create 2021 - 11 - 22 9:01
 */
public class Edge {
    int weight;
    Node from;
    Node to;

    public Edge(int weight, Node from, Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

}