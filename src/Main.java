import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean palindrom = true;
        String sent ;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input string");
            sent = scanner.nextLine();
            String res = "";
            var stringmrev  = sent.toCharArray();
            var stringm = sent.toCharArray();

            for (int i = 0; i < stringm.length; i++){
                if (stringm[i] == ' '){
                    continue;
                }
                else {
                    System.out.print(Character.toLowerCase(stringm[i]));
                }
            }
            for (int i = stringm.length - 1; i >= 0; i --){
                res = res + stringm[i];
            }
            stringmrev = res.toCharArray();
            if (Arrays.equals(stringm, stringmrev)){
                System.out.println();
                System.out.println("palindrom");
                System.out.println();
            }
            else {
                System.out.println();
                palindrom = false;
            }



        }while(palindrom == true);

    }
}