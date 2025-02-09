package DSA.DataStructures;

public class Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,2,3,3,3};
        int n = arr.length;
        int i=0,j=0,c=1;
        while(j<n){
            c=1;
            while (j+1< n && arr[j]==arr[j+1]){
                j++;
                c++;
            }
            for (int t=0;t< Math.min(2, c);t++){
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
        for(int k:arr)
            System.out.print(k+" ");
    }
}
