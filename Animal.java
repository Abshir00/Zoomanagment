package zoo.MS; // Declare the package name where this class resides

//Animal.java
public class Animal { // Define the Animal class
 String name; // Declare a string variable to hold the animal's name
 int age; // Declare an integer variable to hold the animal's age

 public void makeSound() { // Define a method to simulate the animal making a sound
     System.out.println("Animal makes a sound"); // Print a message to the console
 }

 public void eat() { // Define a method to simulate the animal eating
     System.out.println("Animal eats"); // Print a message to the console
 }

 public void makeSound(int times) { // Overload the makeSound method to accept an integer parameter
     for (int i = 0; i < times; i++) { // Loop 'times' number of times
         makeSound(); // Call the makeSound method within the loop
     }
 }

 public void eat(String foodType) { // Overload the eat method to accept a string parameter
     System.out.println("Animal eats " + foodType); // Print a message to the console with the specified food type
 }
}
