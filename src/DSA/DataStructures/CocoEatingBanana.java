package DSA.DataStructures;

public class CocoEatingBanana {
    static int getTotal(int arr[],int val){
        int t=0;
        for(int i=0;i<arr.length;i++){
            t += (int)Math.ceil((double) arr[i] /val);
        }
         return t;
    }
    public static void main(String[] args) {
        int arr[] =  {805306368,805306368,805306368}, h = 1000000000;
        int max=0;
        for (int I:arr){
            max=Math.max(max,I);
        }
        int l=1,mid;
        int ans=max;
        while(l<=max){
            mid=l+(max-l)/2;
            int speed = getTotal(arr,mid);
            if(speed<=h){
                ans=Math.min(ans,mid);
                max=mid-1;
            } else if (speed>h) {
                l = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
