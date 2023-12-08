import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первого массива: ");
        int length = sc.nextInt();
        System.out.println("Заполняем массив длины ".concat(String.valueOf(length)).concat(" случайными числами от -10 до 10..."));
        int[] firstArray = new int[length];
        randomEntering(firstArray, -10, 10);
        System.out.println("Получившийся массив: ".concat(firstArray.toString()));
        System.out.println("Введите длину второго массива: ");
        length = sc.nextInt();
        System.out.println("Заполняем массив длины ".concat(String.valueOf(length)).concat(" случайными числами от -10 до 10..."));
        int[] secondArray = new int[length];
        randomEntering(secondArray, -10, 10);
        System.out.println("Получившийся массив: ".concat(secondArray.toString()));
        System.out.println("Теперь объединим эти массивы в один\nВот такой из них массив получился:\n".concat(arraysConcat(firstArray, secondArray).toString()));
        System.out.println("Вообще это омжно было реализовать методом addAll класса ArrayList, ну да ладно");
    }

    private static void randomEntering(int[] arr, int min, int max) {
        max -= min;
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * ++max) + min;
    }

    private static int[] arraysConcat(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length + arr2.length; i++){
            for (int j = 0; j < arr1.length; j++, index++)
                result[j] = arr1[j];
            for (int j = 0; j < arr2.length; j++, index++)
                result[index] = arr2[j];
        }
        return result;
    }
}