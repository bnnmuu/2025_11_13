import java.lang.reflect.Array;

public class ch2_40 {

    public static void main(String[] args) {
        int[] intArray = (int[]) Array.newInstance(int.class, 3);
        Array.set(intArray, 0, 555);
        Array.set(intArray, 1, 666);
        Array.set(intArray, 2, 777);
        System.out.println("intArray[0] = " + Array.get(intArray, 0));
        System.out.println("intArray[1] = " + Array.get(intArray, 1));
        System.out.println("intArray[2] = " + Array.get(intArray, 2));
    }
}