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

    public static void sumOfOddIndexes(int[] array){
        int sum = 0;
        for(int i = 1; i < array.length; i += 2){
            sum += array[i];
        }
        System.out.println("Sum of the odd-numbered indexes: " + sum);
    }

    public static void sumOfEvenIndexes(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i += 2){
            sum += array[i];
        }
        System.out.println("Sum of the even-numbered indexes: " + sum);
    }

    public static void displayMenu()
    {  
        System.out.println("Menu:");
        System.out.println("1. Display the minimum of the array.");
        System.out.println("2. Display the maximum of the array.");
        System.out.println("3. Display how each element differs from the average.");
        System.out.println("4. Display the sum of elements with odd and even indexes.");
        System.out.println("5. Exit.");
        System.out.println("Choose an option: ");
    }

    public static void main(String[] args){
        
        //create an array

        Scanner scan = new Scanner (System.in);
        boolean exit = false;
        do
        {
            displayMenu();
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice)
                {
                    case 1:
                        minFinder(null); // write the array's name instead of null. (Mehmetcan)
                        break;
                    case 2:
                        maxFinder(null); // write the array's name instead of null. 
                        break;
                    case 3:
                        //differs from average method
                        break;
                    case 4:
                        sumOfEvenIndexes(null); // write the array's name instead of null.
                        sumOfOddIndexes(null); // write the array's name instead of null.
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
