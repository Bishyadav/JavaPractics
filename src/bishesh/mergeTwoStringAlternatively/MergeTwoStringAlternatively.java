package src.bishesh.mergeTwoStringAlternatively;

public class MergeTwoStringAlternatively {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqrs";
        String res=result(word1,word2);
        System.out.println(res+" ");
    }
    public static String result(String word1,String word2){
        int s1=0;
        int s2=0;
        int leng1=word1.length();
        int leng2=word2.length();
        String words="";
        while(s1<leng1 || s2<leng2){
            if(s1<leng1){
                words=words+word1.charAt(s1);
            }
            if(s2<leng2){
                words=words+word2.charAt(s2);
            }
            s1++;
            s2++;
        }
        return words;
    }

}
