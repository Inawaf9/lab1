import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        /*
        * 1.
        * */

        System.out.println("**** 1. Print all equations ****");

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        System.out.println("=============================");
        /*
        * 2.
        * */

        System.out.println("**** 2. Print multiplication to 10");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("=============================");
        /*
        * 3.
        * */

        System.out.println("**** 3. Print area and perimeter of a circle ****");

        double pi = 3.14;

        System.out.print("Enter the radios: ");
        double radios = input.nextDouble();

        double perimeter = radios * pi * 2;
        double area = (radios * radios) * pi;
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

        System.out.println("=============================");
        /*
        *  4.
        * */

        System.out.println("*** 4. find average set of numbers ****");

        System.out.print("Enter the count of numbers: ");
        int count = input.nextInt();

        double average = 0;

        for (int i = 1; i <= count; i++){
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            average += number;
        }

        System.out.println("The average is: " + (average/count));

        System.out.println("=============================");
        /*
        * 5.
        * */

        System.out.println("**** 5. check numbers ****");

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
        System.out.println("Third number: " + number3);

        if((number1 + number2) == number3) System.out.println("The result is True");
        else System.out.println("The result is false");

        System.out.println("=============================");
        /*
        * 6.
        * */
        input.nextLine();
        System.out.println("**** 6. Reverse the word ****");

        System.out.print("Enter the word to reverse it: ");
        String word = input.nextLine();
        String reverseWord = "";

        for (int i = word.length()-1 ; i>= 0; i-- ){
            reverseWord += word.charAt(i);
        };

        System.out.println("Regular word: " + word);
        System.out.println("Revers word: " + reverseWord);


        System.out.println("=============================");
        /*
         * 7.
         * */

        System.out.println("**** 7. Check if number is even or odd ****");

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if(number % 2 == 0 ) System.out.println("The number is even");
        else System.out.println("The number is odd");

        System.out.println("=============================");
        /*
         * 8.
         * */

        System.out.println("*** 8. convert temperature ****");

        System.out.print("Enter temperature in Centigrade: ");
        double temperature = input.nextDouble();

        System.out.println("Temperature in Fahrenheit: " + (temperature * 1.8 + 32));

        System.out.println("=============================");
        /*
         * 9.
         * */

        System.out.println("**** 9. Print index of word ****");
        input.nextLine();

        System.out.print("Enter string: ");
        String string = input.nextLine();

        System.out.print("Enter index: ");
        int index = input.nextInt();

        System.out.println(string.charAt(index));

        System.out.println("=============================");
        /*
         * 10.
         * */

        System.out.println("**** 10. Print area and perimeter of a rectangle ****");

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double rectangleArea = width * height;
        double rectanglePerimeter = (width + height) * 2;

        System.out.println("Area is: " + rectangleArea);
        System.out.println("Perimeter is: " + rectanglePerimeter);

        System.out.println("=============================");
        /*
         * 11.
         * */

        System.out.println("**** 11. Compare two numbers ****");

        System.out.print("Enter first number: ");
        int numb1 = input.nextInt();
        System.out.print("Enter second number: ");
        int numb2 = input.nextInt();

        if(numb1 == numb2) {
            System.out.println(numb1 + " == " + numb2);
        }else if(numb1 >= numb2){
            System.out.println(numb1 + " > " + numb2);
            System.out.println(numb1 + " >= " + numb2);
            System.out.println(numb1 + " != " + numb2);
        }else {
            System.out.println(numb1 + " < " + numb2);
            System.out.println(numb1 + " <= " + numb2);
            System.out.println(numb1 + " != " + numb2);
        }

        System.out.println("=============================");
        /*
         * 12.
         * */

        System.out.println("**** 12. Convert seconds to time ****");

        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
         int hours = seconds / 3600;
         int minutes = (seconds % 3600)/60;
         int second = (seconds %3600);

        System.out.println(hours + ":" + minutes + ":" + second);


        System.out.println("=============================");
        /*
         * 13.
         * */

        System.out.println("**** 13. compare four numbers ****");

        System.out.print("Enter first number: ");
        int numbe1 = input.nextInt();

        System.out.print("Enter second number: ");
        int numbe2 = input.nextInt();

        System.out.print("Enter third number: ");
        int numbe3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int numbe4 = input.nextInt();

        if(numbe1 == numbe2 && numbe2 == numbe3 && numbe3 == numbe4) System.out.println("All numbers are equals");
        else System.out.println("All numbers are not equals");

        System.out.println("=============================");
        /*
         * 14.
         * */

        System.out.println("**** 14. Check if number is positive or negative or zero ****");

        System.out.print("Enter number: ");
        int numb = input.nextInt();

        if(numb == 0) System.out.println("The number is zero ");
        else if (numb > 0) System.out.println("The number is positive");
        else System.out.println("the number is negative");

        System.out.println("=============================");
        /*
         * 15.
         * */

        System.out.println("**** 15. Check if numbers are positive or negative or zero ****");

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;
        int numbe;

        do{
            System.out.print("Enter number: ");
            numbe = input.nextInt();

            if(numbe == 0) ++zeros;
            else if (numbe > 0) ++positiveNumbers;
            else ++negativeNumbers;
        } while (numbe != -1);

        System.out.println("The positive numbers is: " + positiveNumbers);
        System.out.println("The zero numbers is: " + zeros);
        System.out.println("The negative numbers is: " + negativeNumbers);

        System.out.println("=============================");
        /*
         * 16.
         * */

        System.out.println("**** 16. reverse a number ****");

        System.out.print("Enter number: ");
        int numbe = input.nextInt();
        String reverseNumber = Integer.toString(numbe);
        String reverse = "";

        for (int i = reverseNumber.length() -1; i >= 0; i--){
            reverse += reverseNumber.charAt(i);
        }

        System.out.println("Reverse number: " + reverse);



        System.out.println("=============================");
        /*
         * 17.
         * */

        System.out.println("**** 17. Check the large and small number ****");

        int largeNumber = 0;
        int smallNumber = 0;
        boolean out;
        do{
            System.out.print("Enter number" + ": ");
            int numbee = input.nextInt();
            if(largeNumber == 0 && smallNumber == 0){
                largeNumber = numbee;
                smallNumber = numbee;
            }

            if(largeNumber <= numbee) largeNumber = numbee;
            if(smallNumber >= numbee) smallNumber = numbee;

            System.out.print("Do you want continue? true/false: ");
            out = input.nextBoolean();
        }
            while(out);

        System.out.println("The large numbers is: " + largeNumber);
        System.out.println("The small numbers is: " + smallNumber);

        System.out.println("=============================");
        /*
         * 18.
         * */

        System.out.println("**** 18. Check the letter 'a' in a word ****");
        input.nextLine();

        System.out.print("Enter a word: ");
        String woord = input.nextLine();
        int aCount = 0;

        for(int i = 0; i < woord.length(); i++){
            if('a' == woord.charAt(i)){
                aCount++;
            }
        }
        System.out.println("Number of a in the word: " + aCount);

    }
}
