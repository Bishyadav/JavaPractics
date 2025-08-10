package src.bishesh.Single_No;

import java.util.HashMap;
import java.util.Map;

public class Find_Element_Repeated_Once {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int no=nums[i];
            if(hm.containsKey(no)){
                hm.put(no,hm.get(no)+1);
            } else{
                hm.put(no,1);
            }
        }
        int res=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                res=entry.getKey();
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
}
