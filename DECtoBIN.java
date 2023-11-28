import java.util.*;
class Aaa {
    public static void main(String args[]) {
        int n=17,i=0,res=0;
 while(n!=0){
     int r=n%2;
    res=res+(r*(int)Math.pow(10,i)); 
     n=n/2;
     i++;
 }
 System.out.println(res);
    }
}
