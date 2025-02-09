package DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        int[] vis = new int[5];
        for (int i = 0; i < 5; i++) adj.add(new ArrayList<>());

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(4).add(3);
        adj.get(3).add(4);

        DFS dfs = new DFS();
        dfs.algo(adj, vis, 1);
    }

    private void algo(List<List<Integer>> adj, int vis[], int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        vis[start] = 1;
        while (!stack.isEmpty()) {
            int data = stack.pop();
            System.out.print(data + " ");
            for (int i : adj.get(data)) {
                if (vis[i] == 0) {
                    vis[i] = 1;
                    stack.push(i);
                }
            }
        }
    }
}

