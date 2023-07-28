public class Task2 {
    public static void main(String[] args) {

        int[] intArray = new int[]{5, 8, 44, 2, 6, 55, 8, 945, 4, 5, 6, 3};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя ");
        }
    }
}
