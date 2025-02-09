package DSA.DataStructures;

public class LOngestRepeatingChar {
    int max(int[] freq){
        int index=-1,max=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                index=i;
                max=freq[i];
            }
        }
        return index;
    }
    public int characterReplacement(String s, int k) {
        int[] freq = new int[27];
        int i=0,max=0,n=s.length();
        for(int j=0;j<n;j++){
            char c=s.charAt(j);
            freq[c-'A']++;
            while( j-i+1 - freq[max(freq)] >k ){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            max=Math.max(max, j-i+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        LOngestRepeatingChar lOngestRepeatingChar=new LOngestRepeatingChar();
        System.out.println(lOngestRepeatingChar.characterReplacement(s,k));
    }
}
