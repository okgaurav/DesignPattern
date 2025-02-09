package DSA.DataStructures;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        String s = "bm";
        Set<Character> characters = new java.util.HashSet<>();
        int i=0,j=0, n=s.length();
        int max = Integer.MIN_VALUE;
        while(j<n){
            char c = s.charAt(i);
            while (characters.contains(c)){
                char cc = s.charAt(i);
                characters.remove(cc);
                i++;
            }
            characters.add(c);
            max = Math.max(max, j-i+1);
            j++;
        }
        System.out.println(max);
    }
}
