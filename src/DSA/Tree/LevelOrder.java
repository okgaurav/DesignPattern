package DSA.Tree;

import java.util.*;

import static DSA.DSAUtils.getTree;

public class LevelOrder {

    public static int[] level(Node root){
        List<Integer> list = new ArrayList<>();
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            int sum=0;
            for(int i=0;i<n;i++){
                Node front = queue.poll();
                sum+=front.data;
                if(front.left!=null)
                    queue.add(front.left);
                if(front.right!=null)
                    queue.add(front.right);
            }
            list.add(sum);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Node root = getTree();
        int[] arr= level(root);
        for (int i:arr)
            System.out.print(i+" ");

    }
}
