import java.util.*;
public class pinGuesser{
  public static void main(String[] args){
   
  String answer = "0900";
  
  int test[] = {0,0,0,0};
  
  /**
  for(int i = 3; i >= 0; i--){
      for(int j = 0; j<=9; j++){
      System.out.println(Arrays.toString(test));
         test[i]++; 
         if(test[i] == 10){
           test[i] = 0;
           test[i-1]++;
           break;
         }
       **/
         
      
     int i = 3;
     int current = 3;
     
     while(!Arrays.toString(test).replaceAll("\\[|\\]|,|\\s", "").equals(answer)){
     System.out.println(Arrays.toString(test));
    
     test[i]++;
     ;
      if(test[i] == 10 && i != 0){
         test [current-1]++;
         test[i] = 0;
         i = 3;   
         current--;
         }
      
      
      }
      
      
   }  
}