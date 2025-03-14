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
//       int k=3;
//        int target=7;
//        int sum=0;
//       int[] result=new int[2];
//       for(int i=0;i<k;i++){
//         sum=sum+a[i];
//       }
//
//       for(int i=k;i<a.length;i++){
//           sum=sum+a[i]-a[i-k];
//           if (sum==target){
//               result[0]=i-2;
//               result[1]=i;
//               break;
//           }
//       }
        //OR 2nd Way
        int target=7;
        int[] arr=new int[2];
        for(int i=0;i<a.length-2;i++){
            int j=i+1;
            int sum=0;
            int k=1;
            while (k<=2){
                if (k<=1){
                 sum=sum+(a[i]+a[j]);
                 j++;
                 k++;
                }
                else{
                    sum=sum+a[j];
                    k++;
                }
            }
            if (sum==target){
              arr[0]=i;
              arr[1]=j;
              break;
            }
        }
       return arr;
    }
}
