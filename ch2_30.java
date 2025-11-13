public class ch2_30 {

    public static void main(String[] args) {

        int outerIndex, innerIndex;
        for (outerIndex = 0; outerIndex < 5; outerIndex++) {
            for (innerIndex = 0; innerIndex < 3; innerIndex++) {
                System.out.println("外面是:" + outerIndex + "裡面是:" + innerIndex);
            }
        }
    }
}