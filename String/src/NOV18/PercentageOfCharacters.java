package NOV18;
import  java.util.Scanner;
public class PercentageOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.nextLine();
        int total = a.length()-1;
        int upperCase=0;
        int lowerCase=0;
        int digit=0;
        int special=0;
        for (int i = 0; i < a.length(); i++){
            if(Character.isUpperCase(a.charAt(i))){
                upperCase++;
            }
            else if(Character.isLowerCase(a.charAt(i))){
                lowerCase++;
            }
            else if(Character.isDigit(a.charAt(i))){
                digit++;
            }
            else{
                special++;
            }
        }
        double UC = (double) ((upperCase*100)/total);
        double LC = (double) ((lowerCase*100)/total);
        double d = (double) ((digit*100)/total);
        double sp = (double) ((special*100)/total);
        System.out.println("Uppercase: "+UC+"%");
        System.out.println("Lowercase: "+LC+"%");
        System.out.println("Digits: "+d+"%");
        System.out.println("Special: "+sp+"%");
    }
}
