package src.bishesh.slidingWindowProblem;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] a={2,31,3,7,5,9};
        for(int element:result(a)){
            System.out.print(element+" ");
        }
    }
    public  static  int[] result(int[] a){
        int[] result=new int[2];
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
           sum=sum+a[i];
        }
        int maxSum=sum;
        for(int i=k;i<a.length;i++){
            sum=sum+a[i]-a[i-k];
          if (sum>maxSum){
              maxSum=sum;
               result[0]=i-2;
               result[1]=i;
           }
        }
        return result;
    }
}
