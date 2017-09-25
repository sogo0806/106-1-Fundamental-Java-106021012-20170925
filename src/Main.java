import java.util.Scanner;
public class Main {
        public static void main (String[] args) {
            Scanner scn= new Scanner(System.in);
            float val=scn.nextInt();
            System.out .println(Math.round(val *0.26418f*10)/10f);

        }
    }