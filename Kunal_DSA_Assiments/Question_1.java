public class Question_1{
    public static  void main(String[] args){
     int days = 31;
       int day = 1;
     int  evenCount = 0; 
       while(days> day){
          if(day % 2 == 0 ){
            evenCount++;
          }
          day++;
       }
       System.out.println(evenCount);
    }
}