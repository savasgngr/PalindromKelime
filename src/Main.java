
import java.util.Scanner;
import java.util.Stack;


public class Main {
    
    // Girilen kelimenin palindrom kelime olup olmadığı kontrol edilecek
    // palindrom kelime:baştan ve sondan okunduğunda aynı olan kelimeler orn.kazak,kasaylabalyasak...
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        String cumle=scanner.nextLine();
        
        Stack<Character> stack=new Stack<Character>();
        
        for (int i = 0; i<cumle.length()/2 ; i++) {
            
            stack.push(cumle.charAt(i)); 
            
        }
        if (isPalindrom(cumle, stack)) {
            
            System.out.println("cumleniz palindrodur...");
            
        }
        else{
            
            System.out.println("palindrom cümle değil...");
        }
        
        
             
    }
    
    public static  boolean isPalindrom(String cumle, Stack<Character> stack){
        
        
        for (int i = (cumle.length()/2+1);i<cumle.length();i++) {
            
            if (cumle.charAt(i)!=stack.pop()) {
                
                return false;
            }
            
        }
        
        return true;
    }
    
}
