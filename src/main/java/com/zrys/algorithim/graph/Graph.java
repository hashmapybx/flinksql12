package com.zrys.algorithim.graph;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 图结构
 *
 * @author rocky
 * @create 2021 - 11 - 22 9:05
 */
public class Graph {

    HashMap<Integer, Node> nodes;
    HashSet<Edge> edges;

    public Graph() {
        this.nodes = new HashMap<>();
        this.edges = new HashSet<>();
    }



}