package DSA.DP;

import java.util.List;

public class CountSubsetWithSum {
    static int[][] dp = new int[100][100];

    static int subset(List<Integer> li, int w) {
        int n = li.size();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j < li.get(i - 1))
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - li.get(i - 1)];
            }
        }
    return dp[n][w];
}
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,3);
        int diff=1;
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        for(int i=0;i<sum/2;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<list.size();j++){
            dp[j][0]=1;
        }

        System.out.println(subset(list,(diff+sum)/2));
        for(int i=0;i<=list.size() ;i++){
            for(int j=0; j <= sum/2;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
