
import java.util.Scanner;

public class sdf {
    public static void main (String[] args){
        Scanner sum =new Scanner (System.in);
        float edu=sum.nextInt();
        System.out .println(Math.round(edu/600f*10)/10f);
    }
}