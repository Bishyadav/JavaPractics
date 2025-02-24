package src.bishesh.slidingWindowProblem;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] a={1,3,4,1,2,3,2};
        findIndex(a);
        for(int i:findIndex(a)){
          System.out.println(i+" ");
        }
    }
    public static  int[] findIndex(int[] a){
        int k=3;
        int target=7;
        int sum=0;
       int[] result=new int[2];
       for(int i=0;i<k;i++){
         sum=sum+a[i];
       }

       for(int i=k;i<a.length;i++){
           sum=sum+a[i]-a[i-k];
           if (sum==target){
               result[0]=i-2;
               result[1]=i;
               break;
           }
       }
       return result;
    }
}
