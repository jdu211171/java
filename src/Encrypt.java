import java.util.Scanner;
public class Encrypt {
  static String caesar_cipher(String text, int number) {
    String answer = "";
    for(int i = 0; i < text.length(); i++) {
      char reminder = text.charAt(i);
      if (reminder != ' ') reminder += number;
      answer += reminder;
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Shifrlamoqchi bo'lgan matningizni kiriting > ");
    String encryptText = scan.nextLine();
    System.out.println();
    System.out.print("Shifrlash uchun son kiriting > ");
    int encryptNum = scan.nextInt();
    System.out.println(caesar_cipher(encryptText, encryptNum));
  }
}