import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void maxFinder (int[] array)
    {
        int maxValue = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i]>maxValue)
            {
                maxValue = array[i];
            }
        }

        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static void minFinder (int[] array)
    {
        int minValue = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < minValue)
            {
                minValue = array[i];
            }
        }

        System.out.println("The minimum value in the array is: " + minValue);
    }

    public static int sumOfOddIndexes(int[] array){
        int sum = 0;
        for(int i = 1; i < array.length; i += 2){
            sum += array[i];
        }
        return sum;
    }

    public static int sumOfEvenIndexes(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i += 2){
            sum += array[i];
        }
        return sum;
    }

    public static double averageOfArray(int[] array)
    {
        int sum = sumOfEvenIndexes(array) +  sumOfOddIndexes(array);
        double average = sum / array.length;
        return average;
    }

    public static void differencesFromAverage(int[] array)
    {
        double average = averageOfArray(array);
        
        System.out.println("The distance of the numbers from the average: "); 
        for(int i = 0; i < array.length; i++)
        {
            if (i == array.length - 1)
            {
                System.out.print(array[i] - average);
            }
            else
            {
                System.out.print(array[i] - average + ", ");
            }
        }
        System.out.println();
    }

    public static void displayMenu()
    {  
        System.out.println("\nMenu:");
        System.out.println("1. Display the minimum of the array.");
        System.out.println("2. Display the maximum of the array.");
        System.out.println("3. Display how each element differs from the average.");
        System.out.println("4. Display the sum of elements with odd and even indexes.");
        System.out.println("5. Exit.");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in); 
        Random random = new Random();
        
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt(); // Take input for array size
        
        int[] array = new int[size]; // Create array of that size
        
        // Fill array with random numbers
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101); // Random numbers between 0-100
        }
        
        // Print array size
        System.out.println("Array size: " + size);
        
        // Print array elements
        for (int num : array) {
            System.out.print(num + " ");
        }
        boolean exit = false;
        do
        {
            displayMenu();
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice)
                {
                    case 1:
                        minFinder(array); 
                        break;
                    case 2:
                        maxFinder(array); 
                        break;
                    case 3:
                       //differs from average method
                        System.out.println("The average of the array: " + averageOfArray(array)); 
                        differencesFromAverage(array); 
                        break;
                    case 4:
                        System.out.println("Sum of the odd-numbered indexes: " + sumOfOddIndexes(array)); 
                        System.out.println("Sum of the even-numbered indexes: " + sumOfEvenIndexes(array));
                        break;
                    case 5:
                        exit=true;
                        System.out.println("Exiting the menu.");
                        scan.close();
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
            while(!exit);
    }
}
