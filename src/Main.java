import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] dataPoints = new int[100];
        int sum = 0;
        int max = 0;
        int min = 101;

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) ((Math.random() * (100 - 1)) + 1);

        }

        for(int j = 0; j < dataPoints.length; j++) {
            System.out.print(dataPoints[j] + " | ");
            sum += dataPoints[j];
            if(dataPoints[j] > max) {
                max = dataPoints[j];
            }
            if(dataPoints[j] < min) {
                min = dataPoints[j];
            }

        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/100.0);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        int userInput = InputHelper.getRangedInt(scan, "Enter an integer", 1, 100);
        int userInputCount = 0;

        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] == userInput){
                userInputCount++;
            }
        }

        System.out.println("Inputted value found: " + userInputCount);

    }


}