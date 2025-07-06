package src.bishesh.StringProblem;

public class ReverseWordIII {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String rev="";

        int flag=0;
        String[] words=s.split("\\s");
        int leng=words.length;
        for(String word:words){
            String temp="";
            for(int i=word.length()-1;i>=0;i--){
                temp=temp+word.charAt(i);
            }
            if(flag<leng-1){
                flag++;
                rev=rev+temp+" ";
            }
            else{
                rev=rev+temp;
            }
            }
        System.out.print(rev);
        }
    }
