import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weight[i]);
        }
        System.out.println(" ");
        double[] weight1 = {1.57, 7.654, 9.986};
        for (int k = 0; k < 3; k++) {
            System.out.println(weight1[k]);
        }
        System.out.println(" ");
        int[] floors = {1, 2, 3, 4, 5, 6, 7};
        for (int l = 0; l < 3; l++) {
            System.out.println(floors[l]);
        }

        System.out.println("Задача №2");
        for (int index = 0; index < weight.length; index++) {
            if (index == weight.length - 1) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + " ");
        }
        for (int index = 0; index < weight1.length; index++) {
            if (index == weight1.length - 1) {
                System.out.println(weight1[index]);
                break;
            }
            System.out.print(weight1[index] + " ");
        }
        for (int index = 0; index < floors.length; index++) {
            if (index == floors.length - 1) {
                System.out.println(floors[index]);
                break;
            }
            System.out.print(floors[index] + " ");
        }
        System.out.println("Задача №3");
        for (int index = weight.length - 1; index >= 0; index--) {
            System.out.print(weight[index] + " ");
        }
        System.out.println(" ");
        for (int index = weight1.length - 1; index >= 0; index--) {
            System.out.print(weight1[index] + " ");
        }
        System.out.println(" ");
        for (int index = floors.length - 1; index >= 0; index--) {
            System.out.print(floors[index] + " ");
        }
        System.out.println(" ");
        System.out.println("Задача №4");
        for (int a=0; a<weight.length; a++) {
            if (weight[a] % 2 != 0) {
                weight[a] += 1;
            }
        }
            System.out.println(Arrays.toString(weight));
        }
    }
