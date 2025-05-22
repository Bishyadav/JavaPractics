package src.bishesh;

public class HappyNoOrNot {
    public static void main(String[] args) {
        int n=19;
        System.out.print(isHappy(n));
    }
    public static boolean isHappy(int n){
        int no=n;
        if(n==1){
            return true;
        }
        int sum=0;
        while(no!=0){
            int rem=no%10;
            int mul=rem*rem;
            sum=sum+mul;
            no=no/10;
        }
        if(sum==4){
            return false;
        }
        if(sum!=1){
            return  isHappy(sum);
        }
        if(sum==1){
            return true;
        }
        return true;
    }
}
