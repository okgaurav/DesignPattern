package DSA.LeetCode;

public class PaceficWaterFlow {

    public static void main(String[] args) {
       int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
       int n=heights.length;
       int m= heights[0].length;
       boolean atlantic[][] = new boolean[n][m];
       boolean pacific[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if( i==0 || j==0 ){
                    pacific[i][j] = true;
                }
                else if(i>0 && j>0){
                    if( heights[i][j]>=heights[i-1][j] || heights[i][j]>=heights[i-1][j-1] || heights[i][j]>=heights[i][j-1]) {
                        pacific[i][j]=true;
                    }
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for (int j=m-1;j>=0;j--){
                if( i==n-1 || j==m-1 ){
                    atlantic[i][j] = true;
                }
                else if(i<n-1 && j<m-1){
                    if( heights[i][j]>=heights[i+1][j] || heights[i][j]>=heights[i+1][j+1] || heights[i][j]>=heights[i][j+1]) {
                        atlantic[i][j]=true;
                    }
                }
            }
        }



        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                System.out.print((atlantic[i][j]&&pacific[i][j])+" ");
            }
            System.out.println();
        }

            }
}
