package DSA.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIS {
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(10,9,2,5,3,7,101,18);
        int n= lis.size();
        int[] parent=new int[n];
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
            parent[i]=-1;
        }
        for (int i=n-1;i>=0;i--){
            for (int j=i+1;j<n;j++){
                if(lis.get(i)<lis.get(j)){
                    if(dp[i] < 1+dp[j]){
                        dp[i] = 1+dp[j];
                        parent[i]=j;
                    }
                }
            }
        }
        for(var i:dp)
            System.out.print(i+" ");
        System.out.println();
        for(var i:parent)
            System.out.print(i+" ");

    }
}
