package src.bishesh.primeNo;

public class PrintPrimeNo {
    public static void main(String[] args) {
        int no=17;
        System.out.println(isPrime(no));
    }
    public static  boolean isPrime(int no){
        boolean flag=false;
        int count=0;
        for(int i=1;i<=no;i++){
            if (no%i==0){
                count++;
            }
        }
        if (count==2){
            flag=true;
        }
        else {
            flag=false;
        }
        return flag;
    }
}
