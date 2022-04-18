package selection_sort;
import java.util.*;
public class arr3 {

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<Integer> randomArrInt(int size, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (numbers.size() < size) {
            int random = getRandomInt(min, max);

            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        return numbers;
    }

    public static void sortAscending(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;

            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> list = randomArrInt(50, 1, 50);
        System.out.println("Sebelum diurutkan");
//        for (Integer integer : list) {
//            System.out.println("" + integer);
//        }

        ArrayList<ArrayList<Integer>> integers = new ArrayList<>(); //memasukkan output ke dalam array
        integers.add(list);
        System.out.println(integers);

        System.out.println("\n");
        System.out.println("Sesudah diurutkan");

        for (int i = 0; i < list.size() - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(maxElementIndex) < list.get(j)) {
                    maxElementIndex = j;
                }
            }

            if (maxElementIndex != i) {
                int temp = list.get(i);
                list.set(i, list.get(maxElementIndex));
                list.set(maxElementIndex, temp);
            }
            System.out.println(list);
        }



    }
}
