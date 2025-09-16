public class Armstrong_number {
    public static void main(String[] args) {
        int num = 153;
        int Num = num;
        int power = CountDigit(num);
        int sum = 0;
    
        while(num > 0) {
            int digit = num % 10;
            sum  = sum + Multiple(digit, power);
            num = num / 10;
        }
        if(sum == Num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    static int Multiple(int digit, int power) {
        int result = 1;
        for(int i = 0; i < power; i++) {
            result = result * digit;
        }
        return result;
    }  
    static int CountDigit(int num) {
        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }
        return count; 
    }
}