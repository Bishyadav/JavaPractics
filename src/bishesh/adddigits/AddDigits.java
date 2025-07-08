package src.bishesh.adddigits;

public class AddDigits {
    public static void main(String[] args) {
        int num=199;
        addDigits(num);
        System.out.print(addDigits(num));
    }
    public static int addDigits(int num){
        int sum=0;
        int no=num;
        while (no!=0) {
            sum=0;
            while (no != 0) {
                int rem = no % 10;
                sum = sum + rem;
                no = no / 10;
            }
            boolean flag=false;
            if(sum<10){
                flag=true;
                return sum;
            }
            else {
                no=sum;
            }
           if(flag){
               break;
           }
        }
        return sum;
    }
}

