

import java.io.IOException;
/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
       try{
        divideByZero();
       }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
    public static void divideByZero(){
       
        int m =  8 / 0;  
       System.out.println(m);
     
    }
