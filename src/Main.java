import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] massiv1 = new int[] {1, 2, 3,};
        double[] massiv2 = new double[] {1.57, 7.654, 9.986};
        int[] myMassiv = new int[] {16, 17, 18};

        System.out.println("Задание 2");

        for (int i = 0; i < massiv1.length; i++) {
            System.out.print(massiv1[i]);

            if (i != massiv1.length -1) {
                System.out.print(",");
            }
        }

        System.out.println();

        for (int i = 0; i < massiv2.length; i++) {
            System.out.print(massiv2[i]);

            if (i != massiv2.length -1) {
                System.out.print(",");
            }
        }

        System.out.println();

        for (int i = 0; i < myMassiv.length; i++) {
            System.out.print(myMassiv[i]);

            if (i != myMassiv.length -1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание 3");

        for (int i = massiv1.length - 1; i >= 0; i--) {
            System.out.print(massiv1[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = massiv2.length - 1; i >= 0; i--) {
            System.out.print(massiv2[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = myMassiv.length - 1; i >= 0; i--) {
            System.out.print(myMassiv[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание4");

        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] % 2 != 0) {
                massiv1[i]++;
            }
        }
        System.out.println(Arrays.toString(massiv1));
    }
}
