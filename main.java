// Class name same as file for entry point 
// class main {
//     public static void main(String[] arguments) { 
//         System.out.println("Hello World");
//     }
// }


// Declare variables with variable type first 
// class main {
//     public static void main(String[] arguments) { 
//         int age = 20;
//         System.out.println("I am " + age + " years old");
//     }
// }

// Static methods only work with static variables 
// class main { 
//     static int age = 20;
//     public static void main(String[] args) { 
//         System.out.println("I am "+age+" years old");
//     }
// }

// When you add variables on class levels without assigning anything, a default value gets assigned
// for integers it's zero 
// class main { 
//     static int age;
//     public static void main(String[] args) { 
//         System.out.println("I am "+age+" years old");
//     }
// }

// Since age is not local to the main method, reassigning it in the main method is okay 
// variables cannot be reassigned in the same code block
// class main { 
//     static int age;
//     public static void main(String[] args) {
//         int age = 20; 
//         System.out.println("I am "+age+" years old");
//     }
// }


//Add letter L at end of long numbers to let compiler know 
// class main { 
//     public static void main(String[] args){ 
//          int types 
//         byte aSingleByte = 100; // -128 to 127 
//         short aSmallNumber = 20000; // -32,768 to 32,767
//         int anInteger = 2147483647; // -2147483648 to 2147483647
//         long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
        
//          decimal types 
//         double aDouble = 1.79769313; 
//         float aFloat = 3.4028F; //smaller range 

//         booleans 
//         boolean isWeekend = false;
//         boolean isWorkday = true;

//         characters 
//         char copyrightSymbol = '\u00A9';

//         System.out.println("This is the copyright symbol: " + copyrightSymbol);
        
//     }
// }


// Conversions
// class main {
//     public static void main(String[] args) { 
//         int number1 = 20;
//         double number2 = number1;
//         System.out.println(number2);
//     }
// }

// Use explicit conversion (int) in case of lost of data when it comes to floats 
// class main {
//     public static void main(String[] args) { 
//         double number1 = 20;
//         int number2 = (int)number1;
//         System.out.println(number2);
//     }
// }

// class main {
//     public static void main(String[] args) {
//         int num1 = 20;
//         int num2 = 5; 

//         System.out.println(num1 + num2);
//         System.out.println(num2 - num1);
//         System.out.println(num1 * num2);
//         System.out.println(num1 / num2);
//         System.out.println(num1 % num2);

//         int num3 = 20;
//         int num4 = 3;

//         System.out.println(num3 / num4);

//         double num5 = num3;
        
//         System.out.println(num5 / num4);
//     }
// }

// class main {
//     public static void main(String[] args) {
//         int num1= 20;

//         num1 = num1+=5;
//         System.out.println(num1);
//     }
// }



// class main { 
//     public static void main(String[] args) { 
//         int num1= 20;
//         int num2 = 20; 

//         System.out.println(num1 == num2);

//         num1 += 5;

//         System.out.println(num1 > num2);
//         System.out.println(num1 < num2);
//         System.out.println(num1 != num2);
//         System.out.println(num1 >= num2);
//         System.out.println(num1 <= num2);
//     }
// }

// class main {
//     public static void main(String[] args) { 
//         int num1 = 20;
//         int num2 = 25;

//         System.out.println(num1 >= num2 && num1 <= num2);

//         boolean isStudent = false;
//         boolean isLibraryMember = true;

//         System.out.println(isStudent || isLibraryMember);

//         System.out.println(!isStudent);

//         num1 ++;
//         num2 --;
//         System.out.println(num1 +" "+ num2);

//         Java reads from left to right so it won't know that you added a value until finished 
//         System.out.println(num1++);
//         If you put it at the beginning it acct works!
//         System.out.println(++num1);
//     }
// }


// class main {
//     public static void main(String[] args) { 
//         String name = "Abdallah";
//         System.out.println(name);
//     }
// }


// class main {
//     public static void main(String[] args) { 
//         String name1 = "Abdallah";
//         String name2 = "Abdallah";

//         System.out.println(name1 == name2);

//         String name3 = new String("Abdallah");
//         String name4 = new String("Abdallah");

//         System.out.println(name3 == name4);
//     }
// }


// class main {
//     public static void main(String[] args) { 
//         String name = "Abdallah";
//         String country = "Egypt";
//         int age = 20;
        

//         String formated_string = String.format("Hello! My name is %s, I am from %s and I am %d years old.", name, country,age);
//         System.out.println("Hello! My name is " + name + " , I am from " + country + " and I am " + age + " years old");

//         System.out.println("This is a formated string! " + formated_string);
//     }
// }


// class main {
//     public static void main(String[] args) { 
//         String name = "Abdallah";
//         System.out.println(name.length());
//         System.out.println(name.isEmpty());
//         System.out.println(name.toUpperCase());
//         System.out.println(name.toUpperCase());
//         System.out.println(name.toLowerCase());
//     }
// }


// class main {
//     public static void main(String[] args) { 
//         String name = new String("Abdallah");
//         String name1 = new String("Abdallah");

//         System.out.println(name.equals(name1));

//         String name2 = new String("Abdallah");
//         String name3 = new String("ABDALLAH");

//         System.out.println(name2.equalsIgnoreCase(name3));

//     }
// }

// class main { 
//     public static void main(String[] args) { 
//         String string = "The sky is blue";
//         string = "blue is the sky";
//         System.out.println(string.replace("blue", "red"));
//         System.out.println(string.contains("sky"));
//     }
// }


//println prints new line after the string. print does not
// import java.util.Scanner;

// class main {
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("What is your name? ");
//         String name = scanner.nextLine();
//         System.out.printf("Hello %s. How old are you? ", name);
        
//         cleans the input buffer
//         int age = scanner.nextInt();
//         scanner.nextLine();

//         System.out.printf("%d is an excellent age to start programming!\nEnter another number ", age);

//         int age2 = Integer.parseInt(scanner.nextLine());

//         scanner.close();
//     }
// }

// import java.util.Scanner;
// class main { 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first num: ");

//         double num1 = Double.parseDouble(scanner.nextLine());

//         System.out.print("Enter second num: ");

//         double num2 = Double.parseDouble(scanner.nextLine());

//         System.out.print("What operation would you like to perform? ");

//         String operation = scanner.nextLine();

//         if (operation.equals("sum")) { 
//             System.out.printf("%f + %f = %f", num1, num2, num1+num2);
//         } else if  (operation.equals("sub")) { 
//             System.out.printf("%f - %f = %f", num1, num2, num1-num2);
//         }
//         else {
//             System.out.printf("%s is not a supported operation", operation);
//         }
//         scanner.close();

//     }
// }


// import java.util.Arrays;
// class main { 
//     public static void main(String[] args) { 
//         char vowels[] = new char[5];

//         // a e i o u
//         vowels[0] = 'a';
//         vowels[1] = 'e';
//         vowels[2] = 'i';
//         vowels[3] = 'o';
//         vowels[4] = 'u';

//         System.out.print(vowels[1]);
//         System.out.print(Arrays.toString(vowels));

//     }
// }
// import java.util.Arrays;
// class main {
//     public static void main(String[] args) { 
//         char vowels[] = {'a','e','i','o','u'};
//         System.out.println(Arrays.toString(vowels));
//         System.out.println(vowels.length);


//         char unsorted_vowels[] = {'e','a','o','i','u'};
//         int startingindex = 1;
//         int endingindex = 4;

//         Arrays.sort(unsorted_vowels, startingindex, endingindex);
//         System.out.println(Arrays.toString(unsorted_vowels));

        

//     }
// }
// import java.util.Arrays;
// class main {
//     public static void main(String[] args) {
//         char vowels[] = {'a','i','o','u','e'};

//         Arrays.sort(vowels);
        
//         char chartobefound = 'o';
//         int startingindex=1;
//         int endingindex=4;

//         int indexofchartobefound = Arrays.binarySearch(vowels,startingindex,endingindex, chartobefound);
//         System.out.println(Arrays.toString(vowels));
//         System.out.println(indexofchartobefound);
//     }
// }

import java.util.Arrays;
class main { 
    public static void main(String[] args) { 
        char vowels[] = {'a','e','i','o','u'};
        int startingindex = 1;
        int endingindex = 3;

        Arrays.fill(vowels,startingindex,endingindex,'x');

        System.out.print(vowels);
        
        int nums[] = {1,2,3,4,5,6};
        int copyofNums[] = Arrays.copyOf(nums, nums.length);

        int startingindex1 = 1;
        int endingindex1 = 4;

        int copyofRangeNums[] = Arrays.copyOfRange(nums, startingindex1, endingindex1);


    }
}