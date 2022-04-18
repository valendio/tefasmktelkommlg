package selection_sort;
import java.util.*;
public class arr4 {

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

    public static void main(String[] args){
        ArrayList<Integer> list = randomArrInt(100, 1, 100);
        System.out.println("Sebelum diurutkan");

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
