package src.bishesh.recursionproblem;

public class FibonacciesSeries {
    //    public static void main(String[] args) {
//       int N=10;
//       for(int i=0;i<N;i++){
//           System.out.print(fibo(i)+" ");
//       }
//    }
//    public static int fibo(int n){
//        if (n<=1){
//            return n;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
//==============================================2nd way and easy way to find fibonaccies series
//    public static void main(String[] args) {
//        int N = 10;
//        int no1 = 0, no2 = 1;
//        fibo(N, no1, no2);
//    }
//
//    public static void fibo(int N, int no1, int no2) {
//        if (N >= 1) {
//            System.out.print(no1 + " ");
//            int no3 = no1 + no2;
//            no1 = no2;
//            no2 = no3;
//            fibo(N-1,no1,no2);
//        }
//    }
    //========================================3rd way using for loop in below
    public static void main(String[] args) {
        int N = 10;
       int no1 = 0, no2 = 1;
       fibo(N, no1, no2);
    }
    public static void  fibo(int N,int no1,int no2){
        for(int i=1;i<=N;i++){
            System.out.print(no1 + " ");
            int no3 = no1 + no2;
             no1 = no2;
             no2 = no3;
        }
    }

}