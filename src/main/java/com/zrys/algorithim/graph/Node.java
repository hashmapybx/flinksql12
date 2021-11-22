package com.zrys.algorithim.graph;

import java.util.ArrayList;

/**
 * 图中的节点
 *
 * @author rocky
 * @create 2021 - 11 - 22 8:59
 */
public class Node {

    int value;
    int inDegree;
    int outDegree;
    ArrayList<Edge> edges;
    ArrayList<Node> nexts; //表示和当前节点项链的节点

    public Node(int data) {
        this.value = data;
        this.inDegree =0;
        this.outDegree = 0;
        edges = new ArrayList<>();
        nexts = new ArrayList<>();
    }


}