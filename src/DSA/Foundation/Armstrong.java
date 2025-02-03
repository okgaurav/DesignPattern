package DSA.Foundation;

public class Armstrong {
    boolean arm(int num){
        int sum=0,org=num;
        while(org!=0){
            sum+= Math.pow(org%10,3);
            org/=10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        System.out.println(armstrong.arm(153));
    }
}
