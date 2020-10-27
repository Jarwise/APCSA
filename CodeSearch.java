import java.util.Scanner;
public class CodeSearch {
    public static void main(String[] args){
        Scanner scany = new Scanner(System.in);
        String s = scany.nextLine();
        int count = CountCode(s);
        System.out.println(count);
    }

    public static int CountCode(String str){
        int count = 0;
        for(int i = 0; i < str.length()-3; i++){
            if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e') count++;
        }
        return(count);
    }
}
