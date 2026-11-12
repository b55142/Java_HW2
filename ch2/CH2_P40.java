import java.lang.reflect.Array;

public class CH2_P40 {
    public static void main(String[] args) {
        int[] values = (int[]) Array.newInstance(int.class, 3);
        Array.setInt(values, 0, 123);
        Array.setInt(values, 1, 456);
        Array.setInt(values, 2, 789);
        for (int i = 0; i < values.length; i++) {
            System.out.println("intArray[" + i + "] = " + Array.getInt(values, i));
        }
    }
}
