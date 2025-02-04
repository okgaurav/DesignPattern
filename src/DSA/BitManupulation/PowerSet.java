package DSA.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=3;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0;i<Math.pow(2,n);i++){
            List<Integer>li = new ArrayList<>();
            for(int j=0;j<n;j++){
                if( (i&(1<<j)) !=0 )
                    li.add(arr[j]);
            }
            ans.add(li);
        }

        for(var i: ans){
            for (var j:i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
