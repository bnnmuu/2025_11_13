import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_14 {

    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int number = Integer.parseInt(inputStr);

        switch (number) {
            case 1:

                System.out.println("輸入的是 1!");
                break;
            case 2:

                System.out.println("輸入的是 2!");
                break;
            default:

                System.out.println("請輸入 1 或 2");
                break;
        }
    }
}