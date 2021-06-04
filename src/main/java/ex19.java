/*
Exercise 19 - BMI Calculator

You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.

Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703

If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.
Example Output

Your BMI is 19.5.
You are within the ideal weight range.

or

Your BMI is 32.5.
You are overweight. You should see your doctor.

Constraint

    Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.

Challenges

    Make the user interface accept height and weight in Imperial or metric units. You’ll need a slightly different formula for metric units.
    For Imperial measurements, prompt for feet and inches and convert feet to inches so the user doesn’t have to.
    Use a GUI interface with sliders for height and weight. Update the user interface on the fly. Use colors as well as text to indicate health.
*/

import java.util.Scanner;

public class ex19 {
    public static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);

        System.out.print("What is your height in inches? ");
        String height = cursor.nextLine();
        while(isNumeric(height) == false){
            System.out.print("Please enter a numeric value. ");
            height = cursor.nextLine();
        }
        double h = Double.parseDouble(height);


        System.out.print("What is your weight in pounds? ");
        String weight = cursor.nextLine();
        while(isNumeric(weight) == false){
            System.out.print("Please enter a numeric value. ");
            weight = cursor.nextLine();
        }
        double w = Double.parseDouble(weight);

        double BMI = (w / (h*h)) * 703;
        BMI = Math.round(BMI * 100.0)/100.0;
        System.out.println("Your BMI is " + BMI);

        String ret = "";
        if(BMI > 25){
            ret = "You are overweight. You should see your doctor.";
        }
        else if(BMI < 18.5){
            ret = "You are underweight. You should see your doctor.";
        }
        else{
            ret = "You are within the ideal weight range";
        }

        System.out.println(ret);
    }
}
