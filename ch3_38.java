import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch3_38 {

    public static void main(String[] args) throws IOException {
        System.out.println("輸入字串:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceStr = reader.readLine();

        System.out.println("輸入要找的文字:");
        String searchStr = reader.readLine();
        char searchChar = searchStr.charAt(0);

        int indexNum = sourceStr.indexOf(searchChar);

        if (indexNum != -1) {
            System.out.println("剛剛字串 " + sourceStr + " 的第 " + (indexNum + 1) + " 個字就是 「" + searchChar + "」");
        } else {
            System.out.println(sourceStr + " 中沒有 「" + searchChar + "」 這個字");
        }
    }
}