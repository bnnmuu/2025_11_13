import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_10 {

    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int number = Integer.parseInt(inputStr);

        if (number == 1) {
            System.out.println("輸入的是 1!");
        } else {
            System.out.println("選擇的 是 1 以外的數字");
        }
    }
}