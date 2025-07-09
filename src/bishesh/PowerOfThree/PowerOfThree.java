package src.bishesh.PowerOfThree;

public class PowerOfThree {
    public static void main(String[] args) {
        int n=45;
        boolean res=isPowerOfThree(n);
        System.out.print(res+" ");
    }
    public static boolean isPowerOfThree(int no){
        boolean flag=false;
        if(no<=0){
            flag=false;
        }else{
            while (no%3==0){
                no=no/3;
            }
            if (no==1){
                flag=true;
            }
        }
        return flag;
    }
}
