import java.util.Scanner;

public class Attempt {

    static Scanner read = new Scanner(System.in);  // Create a Scanner object

    public static String userWord (){

        String trial;
        do{
            System.out.print(" GUESS THE WORD : ");
            trial = read.nextLine().toUpperCase();
        }while (trial.length() != 8);

        return trial;
    }
    public static char[] attempt(String trial){
        return trial.toCharArray();
    }
}
