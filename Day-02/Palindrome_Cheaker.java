
public class Palindrome_Cheaker {
    public static void main(String[] args) {
        int num = 1221;
        System.out.println(Palindrome(num));

    }

    static boolean Palindrome(int num){
        int temp  = 0 ;
        int rev =0; 
        int og  = num;
        while (num>0) {
             temp  = num% 10;
             rev =  rev *10 +temp;
             num = num/10;

        }
        if (rev == og){
           return true;
        }
          return false;
     }
}
