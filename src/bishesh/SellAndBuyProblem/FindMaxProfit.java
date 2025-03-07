package src.bishesh.SellAndBuyProblem;

public class FindMaxProfit {
    public static void main(String[] args) {
        int[] arr={9,9,4,10,1};
        int maxProfit=resutl(arr);
        System.out.print(maxProfit+" ");
    }
    public static  int resutl(int[] arr){
        int initialMax =0;
        int s=0;
        for(int e=0;e<arr.length;e++){
            if(arr[s]>arr[e]){
                s=e;
                initialMax = Math.max(initialMax,arr[e]-arr[s]);
            }
            else{
                initialMax = Math.max(initialMax,arr[e]-arr[s]);

            }
        }
        return initialMax;
    }
}
