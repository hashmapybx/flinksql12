package com.zrys.algorithim.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** <p>
 *  无向图 有向图表示构建
 *  </p>
 * @author rocky
 * @create 2021 - 11 - 22 13:09
 */
public class AdjMatrix {
    //顶点个数
    private int V;
    //边的个数
    private int E;
    private int[][] adjoin; //邻接矩阵

    public AdjMatrix(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            V = scanner.nextInt();
            adjoin = new int[V][V];
            E = scanner.nextInt();
            for (int i = 0; i < E; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                adjoin[a][b] = 1; // a b 表示的是顶点之间的边  对应的就是矩阵对应位置的值为1
                adjoin[b][a] = 1; //无向图
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        // 打印无向图的信息
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("V= %d, E= %d\n",V,E));
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                stringBuilder.append(String.format("%d\t", adjoin[i][j]));
            }
            //换行打印
            stringBuilder.append("\n");

        }

        return stringBuilder.toString();

    }



    public static void main(String[] args) {
        String path = "D:\\Idea_file\\flinksql12\\src\\main\\resources\\a.txt";
        AdjMatrix adjMatrix = new AdjMatrix(path);
        System.out.println(adjMatrix);
    }

}