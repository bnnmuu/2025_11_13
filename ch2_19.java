import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_19 {

    public static void main(String[] args) throws IOException {
        System.out.println("請問你是男生嗎?");
        System.out.println("是的話輸入 Y ，不是的話輸入 N ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        char genderChar = inputStr.charAt(0);

        if (genderChar == 'Y' || genderChar == 'y') {
            System.out.println("你是男的!");
        } else if (genderChar == 'N' || genderChar == 'n') {
            System.out.println("你是女的!");
        } else {
            System.out.println("請輸入 Y 或 N");
        }
    }
}