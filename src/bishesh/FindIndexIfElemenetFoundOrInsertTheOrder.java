package src.bishesh;

public class FindIndexIfElemenetFoundOrInsertTheOrder {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
       int result= getResult(nums,target);
        System.out.println(result+" ");
    }
    public static int getResult(int[] nums,int target){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target || nums[i]>target){
               index=i;
               break;
            }
            else if(nums.length==i+1){
                index=i+1;
                break;
            }
        }
        return index;
    }
}
