import java.util.Scanner;

public class Case {
  
  static final char[] capitalLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  static final char specialCharacter = '_';

  static String to_case(String s) {
    String answer = "";
    for(int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == specialCharacter) {
        char letter = (char)(s.charAt(i + 1) - 32);
        answer += letter;
        i += 1;
      }
      else {
        for (int j = 0; j < 26; j++){
          if (s.charAt(i) == capitalLetter[j]) {
          char letter = (char)(s.charAt(i) + 32);
            answer += specialCharacter;
            answer += letter;
            i++;
          }
        }
        answer += s.charAt(i);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Iborani kiriting > ");
    String s = scan.nextLine();
    System.out.println(to_case(s));
  }
}