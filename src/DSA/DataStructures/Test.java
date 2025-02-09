package DSA.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int arr[]={10,15,9,45,46,76,160, 1779};  // 10,15,160,1779
//        Arrays.stream(Arrays.stream(arr).toArray()).filter(a->  String.valueOf(a).startsWith("1")).forEach(System.out::println);
//        [   ["1/02/2025", 1000],
//            ["2/02/2025",2000],
//            ["3/02/2025", 1000]
//        ]

//        select date from orders where amount in (
//        select max(amount) from orders where amount not in (select  max(amount) from order orderBy date) orderBy Date desc);
//
//        >> select date from orders where amount not in (select  max(amount) from order orderBy date) orderBy Date desc  limit 1;
//
//
//
//
//        select date form orders  order by amount offet 1 Limit 1
//        [1,2,3]
//        [2,3,5]
//        >> [1,2,2,3,3,5]
        List<Integer> arr = Arrays.asList(1,3,5);
        List<Integer> brr = Arrays.asList(2,3,5);
        int n=arr.size();
        int m=brr.size();
        List<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(arr.get(i) > brr.get(j)){
                ans.add(brr.get(j));
                j++;
            }else{
                ans.add(arr.get(i));
                i++;
            }
        }
        while(i<n){
            ans.add(arr.get(i));
            i++;
        }
        while (j<m){
            ans.add(brr.get(j));
            j++;
        }

        ans.stream().forEach(a-> System.out.print(a+" "));

        System.out.println(Math.ceil((double) 10/3));
//        a-> s
//        proxy -> super
//         main -> super










    }
}