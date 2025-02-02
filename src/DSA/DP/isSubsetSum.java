package DSA.DP;

import java.util.List;

public class isSubsetSum {
   static boolean [][]dp = new boolean[100][100];
    static boolean subset(List<Integer>li, int w){
        int n= li.size();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(li.get(i-1)>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-li.get(i-1)];
                }
            }
        }
        return  dp[n][w];
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,11,5);
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        for(int i=0;i<sum/2;i++){
            dp[0][i]=false;
        }
        for(int j=0;j<list.size();j++){
            dp[j][0]=true;
        }
        for(var i:dp){
            for(var j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println(subset(list,sum/2));

    }
}
