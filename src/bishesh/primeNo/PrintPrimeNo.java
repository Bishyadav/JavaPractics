package src.bishesh.primeNo;

public class PrintPrimeNo {
    public static void main(String[] args) {
        int no=16;
        System.out.println(isPrime(no));
    }
    public static  boolean isPrime(int no){
        boolean flag=false;
        int count=0;
        //first wat to find prime no
        //for(int i=1;i<=no;i++){

        //second way to find prime no
//        for(int i=1;i<=no/2;i++){
//        if (no%i==0){
//            count++;
//        }
//    }
//        if (count==1){
//        flag=true;
//    }
//        else {
//        flag=false;
//    }
//        return flag;

        //third way to find prime no
         for(int i=1;i<Math.sqrt(no);i++){
            if (no%i==0){
                count++;
            }
        }
        if (count==1){
            flag=true;
        }
        else {
            flag=false;
        }
        return flag;
    }
}
