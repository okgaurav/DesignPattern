package DSA.Tree;

import java.util.*;

import static DSA.DSAUtils.getTree;

public class TopView {
    static ArrayList<Integer> topView(Node root) {
        Map<Integer, Integer> mp = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));

        while (!queue.isEmpty()){
            Node temp = queue.peek().node;
            int distance = queue.peek().dist;
            int n=queue.size();
            queue.poll();
            if(!mp.containsKey(distance)){
                mp.put(distance, temp.data);
            }
            if (temp.left!=null){
                queue.add(new Pair(temp.left,distance-1));
            }
            if(temp.right!=null){
                queue.add(new Pair(temp.right, distance+1));
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(var i: mp.entrySet()){
            System.out.println("key = " + i.getKey() +"\t value = "+i.getValue());
            li.add(i.getValue());
        }
        return li;
    }
    public static void main(String[] args) {
        Node root = getTree();
        ArrayList<Integer> result = topView(root);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
