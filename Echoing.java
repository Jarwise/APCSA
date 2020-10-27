import java.util.Scanner;
public class Echoing {
    public static void main(String[] args){
        Scanner scany = new Scanner(System.in);
        String s = scany.nextLine();
        int x = scany.nextInt();
        s = Echoing(s, x);
        System.out.println(s);
        scany.close();
    }
    
    public static String Echoing(String str, int n){
        String out = "";
        String sub = str.substring(str.length() - n);
        for(int i = 0; i < n; i++){
            out = out + sub;
        }
        return(out);
    }
}