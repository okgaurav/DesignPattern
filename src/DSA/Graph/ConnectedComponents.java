package DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConnectedComponents {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        int[] vis = new int[10];
        for (int i = 0; i < 10; i++) adj.add(new ArrayList<>());
        ConnectedComponents connectedComponents = new ConnectedComponents();
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

        adj.get(5).add(6);
        adj.get(5).add(7);
        adj.get(5).add(8);
        adj.get(8).add(6);
        int c=0;
        for(int i=1;i<=8;i++){
            if(vis[i]==0){
                c++;
                connectedComponents.connected(adj, vis,i);
            }
        }
        System.out.println();
        System.out.println("#of CC :  "+c);
    }

    private void connected(List<List<Integer>>li, int []vis,int start){
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.empty()){
            int data = stack.pop();
            System.out.print(data+"  ");
            for(int i:li.get(data)){
                if(vis[i]==0){
                    vis[i]=1;
                    stack.push(i);
                }
            }
        }
    }
}
