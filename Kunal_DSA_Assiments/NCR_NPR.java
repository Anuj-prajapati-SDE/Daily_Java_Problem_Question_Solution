import java.util.Scanner;
public class NCR_NPR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the total number of items n: ");
         int   n = sc.nextInt();
        System.out.println("Enter  the selected  items r: ");
         int   r = sc.nextInt();
              int ncr = NCR(n, r);
                int npr = NPR(n, r);
                System.out.println("ncr is :" + ncr);    
                System.out.println("npr is :" + npr);    
    }
     static int NCR(int n, int r){
        int totalNumber = Fact(n);
        int selectItem = Fact(r);
        int diff  = n-r;
        int diffFact = Fact(diff);
      int   baseValue =   selectItem * diffFact;
        int nCr =   totalNumber/baseValue;
       
        return nCr;
     }
     static int NPR(int n, int r){
         int totalNumber = Fact(n);
        int diff  = n-r;
        int diffFact = Fact(diff);  
        int  nCr =   totalNumber/diffFact;
      
        return nCr;
     }
     static int Fact(int n){
        int  num = n;
        int fact  = 1;
        while(num>1){
             fact= fact*num;
             num--;
        }
        return fact;
     }
}