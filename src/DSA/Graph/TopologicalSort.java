package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        int[] vis = new int[10];
        for (int i = 0; i < 10; i++) adj.add(new ArrayList<>());
        ConnectedComponents connectedComponents = new ConnectedComponents();
        adj.get(1).add(2);
        adj.get(2).add(3);

        adj.get(3).add(4);
        adj.get(4).add(6);
        adj.get(6).add(7);
        adj.get(8).add(6);

        int []indegree = new int[9];
        for(int i=0;i<adj.size();i++){
            for(int j:adj.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> queue  =new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)
                queue.add(i);
        }

        while (!queue.isEmpty()){
            int data=queue.poll();
            System.out.print(data+"  ");
            for(int i:adj.get(data)){
                indegree[i]--;
                if(indegree[i]==0)
                    queue.add(i);
            }
        }
    }
}
