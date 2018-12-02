import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Array before sort
        int array[] = new int[args.length];
        System.out.print("Array before sort: {");
        for (int i = 0; i < args.length; i++) {
            try {
                int j = Integer.parseInt(args[i]);
                array[i] = j;
                System.out.print(j);
                if (i != args.length - 1) System.out.print(", ");
            } catch (Exception e) {
                System.out.print(e);
            }
        }
        System.out.print("]" + "\n");

        // Array after sort
        Arrays.sort(array);
        System.out.print("Array after sort: " + Arrays.toString(array));
    }
}
