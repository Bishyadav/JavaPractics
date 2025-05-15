package src.bishesh;

public class TwoSumOfIndexOfArrayEqualToTargetElement {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        twoSum(arr,target);
        for(int no:twoSum(arr,target)){
            System.out.print(no+" ");
        }
    }
    public static int[] twoSum(int[] nums,int target){
        int[] result = new int[2];

//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    break;
//                }
//            }
//        }

        //2nd way

        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+nums[i+1])==target){
                result[0]=i;
                result[1]=i+1;
                break;
            }
        }
        return result;
    }
}
