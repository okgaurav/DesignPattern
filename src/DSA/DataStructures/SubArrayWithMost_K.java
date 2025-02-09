package DSA.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithMost_K {
    public static void main(String[] args) {
        String s="aaabbccd"; int k=2;
        Map<Character, Integer> mp = new HashMap<>();
        int l=0, n=s.length(),max=0;
        for(int r=0;r<n;r++){
            char c= s.charAt(r);
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }else{
                mp.put(c,1);
            }
            while(mp.size()>k){
                char front = s.charAt(l);
                mp.put(front, mp.get(front)-1);
                if(mp.get(front)==0)
                    mp.remove(front);
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        System.out.println(max);
    }
}
