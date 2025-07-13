import java.util.HashSet;

class Solutions {
    public static void main(String[] args) {
        int[] nums={2,2};
        for(int item:findErrorNums(nums)) {
            System.out.print(item+" ");
        }
    }
    public static int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
       int[] arr=new int[2];
        int dublicated=0;
        int missing=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                dublicated=nums[i];
            }else{
                hs.add(nums[i]);
            }
        }
        int leng=nums.length;
        for(int i=1;i<=leng;i++){
            if(hs.contains(i)==false){
                missing=i;
                break;
            }
        }
        arr[0]=dublicated;
        arr[1]=missing;
        return arr;
    }
}
