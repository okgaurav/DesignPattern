package DSA.DP;

import java.util.List;

public class MinSubsetSum {
    static boolean [][]dp = new boolean[100][100];
    static void subset(List<Integer> li, int w){
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
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(5,11,5);
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

        subset(list,sum);
        for(int i=0;i<sum;i++){
            System.out.print(dp[list.size()-1][i]+"  ");
        }
        int min = Integer.MAX_VALUE;
        for (int i=1;i<=sum/2+1;i++) {
            if (dp[list.size() - 1][i]) {
                min = Math.min(min, sum - 2 * i);
                System.out.print("  "+dp[list.size() - 1][i]);

            }
        }
        System.out.println("ANS "+min);
    }
}
