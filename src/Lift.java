import java.util.Scanner;
import java.util.Arrays;
public class Lift {
    static void createArray() {
        Scanner scan = new Scanner(System.in);
        String[][] newArray = new String[10][1];
        for(int i = 0; i < 10; i++) {
            newArray[i][0] = scan.nextLine();
        }
        printArray(newArray);
    };

    static void convertArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
        }
    }

    static void printArray(String[][] arr) {
        for(String[] row : arr) System.out.println(Arrays.toString(row));
    };

    public static void main(String[] args) {
        createArray();
    };
}