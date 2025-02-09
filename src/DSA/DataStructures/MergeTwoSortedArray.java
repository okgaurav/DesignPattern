package DSA.DataStructures;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
            int arr[]={0}, m=0;
            int brr[]={1}, n=1;
            int ai=m-1,bj=n-1, index=arr.length-1;

            while(index>=0 && ai>=0 && bj>=0){
                if(arr[ai]>brr[bj]){
                    int temp = arr[ai];
                    arr[ai]=arr[index];
                    arr[index]=temp;
                    ai--;
                }else{
                    arr[index]=brr[bj];
                    bj--;
                }
                index--;
            }
            for(int i:arr)
                System.out.print(i+"  ");
    }
}
