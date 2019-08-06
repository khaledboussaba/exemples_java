package fr.tableau;

public class LargestInt {

    public static void main(String[] args) {

        int[] numbers = {1, -28, 88, 200, 7};

        int result = Algorithme.findLargest(numbers);

        System.out.println(result);

    }

}

class Algorithme {

    static int findLargest(int[] numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        return result;
    }

}
