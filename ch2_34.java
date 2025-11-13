import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_34 {

    public static void main(String[] args) throws IOException {
        System.out.println("請問要跳過第幾次呢? (1~10)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int skipPoint = Integer.parseInt(inputStr);

        for (int i = 1; i <= 10; i++) {

            if (i == skipPoint) {
                continue;
            }

            System.out.println("第 " + i + " 次");
        }
    }
}