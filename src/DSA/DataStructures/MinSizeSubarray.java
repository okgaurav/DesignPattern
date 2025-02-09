package DSA.DataStructures;

public class MinSizeSubarray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int i=0;
        int target = 11;
        int sum=0,size=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                if(sum==target)
                    size = Math.min(size, j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        System.out.println(size==Integer.MAX_VALUE?0:size);
    }
}
