import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String word;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");        
        word = scanner.nextLine();
        System.out.println(word);

        char[] array = word.toCharArray();
        int length = word.length();

        System.out.println("Reversed String: ");
        for(int i=length; i>0; i--){
            System.out.print(array[i-1]);
        }
    }
}
