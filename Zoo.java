package zoo.MS; // Declare the package name where this class resides

//Zoo.java
public class Zoo { // Define the Zoo class
 public static void main(String[] args) { // Define the main method, the entry point of the application
     Lion lion = new Lion(); // Create an instance of the Lion class
     Elephant elephant = new Elephant(); // Create an instance of the Elephant class
     Monkey monkey = new Monkey(); // Create an instance of the Monkey class

     System.out.println("Lion"); // Print a header for the lion section
     lion.makeSound(); // Call the makeSound method on the lion instance
     lion.eat(); // Call the eat method on the lion instance
     
     System.out.println("Elephant"); // Print a header for the elephant section
     elephant.makeSound(); // Call the makeSound method on the elephant instance
     elephant.eat(); // Call the eat method on the elephant instance
     
     System.out.println("Monkey"); // Print a header for the monkey section
     monkey.makeSound(); // Call the makeSound method on the monkey instance
     monkey.eat(); // Call the eat method on the monkey instance
 }
}
