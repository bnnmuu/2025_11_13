import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_32 {

    public static void main(String[] args) throws IOException {
        System.out.println("請問要做幾次迴圈呢? (1~10)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        int breakPoint = Integer.parseInt(inputStr);

        for (int i = 1; i <= 10; i++) {
            System.out.println("第 " + i + " 次");
            if (i == breakPoint) {
                break;
            }
        }
    }
}