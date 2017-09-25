import java.util.Scanner;

public class yui {
    public static void main(String[] args){
        Scanner swn=new Scanner(System.in);
        String str = swn.nextLine();
        char chOld=swn.next().charAt(0);
        char chnew=swn.next().charAt(0);
        System.out.println(str.replace(chOld,chnew));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}