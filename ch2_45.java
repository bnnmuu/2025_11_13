import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch2_45 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請依序輸入5個人的分數:");
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            String inputStr = reader.readLine();
            scores[i] = Integer.parseInt(inputStr);
        }

        for (int s = 0; s < scores.length - 1; s++) {
            for (int t = 0; t < scores.length - 1; t++) {
                if (scores[t] < scores[t + 1]) {
                    int temp = scores[t];
                    scores[t] = scores[t + 1];
                    scores[t + 1] = temp;
                }
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第 " + (i + 1) + " 名得 " + scores[i] + " 分");
        }
    }
}