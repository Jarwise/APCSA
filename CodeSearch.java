import java.util.Scanner;
public class CodeSearch {
    public static void main(String[] args){
        Scanner scany = new Scanner(System.in);
        String s = scany.nextLine();
        int count = 0;
        for(int i = 0; i < s.length()-3; i++){
            if(s.charAt(i)=='c' && s.charAt(i+1)=='o' && s.charAt(i+3)=='e') count++;
        }
        System.out.println(count);
    }
}
