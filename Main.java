import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String greeting = " Hello World!";
    greeting = greeting.trim();
    System.out.println(greeting);
    int greetinglength = greeting.length(); //.length() asks how long it is
    System.out.println(greetinglength);
    String newGreeting = greeting.replace("Hell", "Yol");
    System.out.println(newGreeting);

    System.out.println( "Testing String methods... " );
        Scanner input = new Scanner( System.in );
        String statement = input.nextLine();
        // Computer
        // 01234567
        String trimmedStatemnt = statement.trim();
        System.out.println( "You typed: " + statement );
        System.out.println( "Length of String is: " + statement.length() );
        System.out.println( "Result of substring: " + statement.substring(3) ); //substring that starts at index 3 and goes to the end of the string
        System.out.println( "Result of substring: " + statement.substring(3,6) ); // creates a substring starting at 3 and goes to 6 but doesn't include 6
        System.out.println( "Result of intexOf: " + statement.indexOf( "e" ) );
        System.out.println( "Result of compareTo: " + statement.compareTo("Computer"));
        System.out.println( "Result of toLowerCase: " + statement.toLowerCase() );
        System.out.println( "Result of trim: " + statement.trim() );
        System.out.println( "The last letter is..." + statement.substring(statement.length()-2,statement.length()-1));
    

  }
}