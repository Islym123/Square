import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randGenerator = new Random();
        int[] numbersArray = new int[10000];

        // Заполняем массив случайными числами
        for (int index = 0; index < numbersArray.length; index++) {
            numbersArray[index] = randGenerator.nextInt(100);
        }

        int maxSumSquares = 0; // Переменная для хранения максимальной суммы квадратов
        int maxElementOffset = 0; // Максимальный элемент с отступом >= 10

        // Проходим по массиву начиная с индекса 10
        for (int index = 10; index < numbersArray.length; index++) {
            maxElementOffset = Math.max(maxElementOffset, numbersArray[index - 10]);
            int currentSum = numbersArray[index] * numbersArray[index] + maxElementOffset * maxElementOffset;

            if (currentSum > maxSumSquares) {
                maxSumSquares = currentSum;
            }
        }

        System.out.println("Максимальная сумма квадратов: " + maxSumSquares);
    }
}
