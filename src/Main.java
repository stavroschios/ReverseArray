import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter array size ;");
        int arraySize = scanner.nextInt();

        int[] array = getArray(arraySize);
        System.out.println("Array : " + Arrays.toString(array));


        int[] reverse = findReverseArray(array);
        System.out.println("Reverse Array " + Arrays.toString(reverse));


    }

    public static int[] getArray(int count){
        int[] array = new int[count];

        for(int i=0; i < array.length; i++){
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }


    public static int[] findReverseArray(int[] array) {
        int[] finalArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length/2; i++) {
        int temp = finalArray[i];
        finalArray[i] =finalArray[finalArray.length -1 -i];
        finalArray[finalArray.length -1 -i] = temp;
        }

        return finalArray;
    }
    }

