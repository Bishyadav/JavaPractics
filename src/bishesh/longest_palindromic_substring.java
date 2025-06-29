package src.bishesh;

public class longest_palindromic_substring {
    public static void main(String[] args) {
        String s="babad";
       String res=longestPalindrome(s);
       System.out.print(res+" ");
    }
    public static String longestPalindrome(String s) {
        String st="";
        int max_len=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp="";
                String str=s.substring(i,j);
                for(int k=str.length()-1;k>=0;k--){
                    temp=temp+str.charAt(k);
                }
                if(str.equals(temp)) {
                    int leng = str.length();
                   if (max_len < leng) {
                        max_len = leng;
                        st = temp;
                    }
                }
            }
        }
        return st;
    }
}
