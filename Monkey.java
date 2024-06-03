package zoo.MS; // Declare the package name where this class resides

//Monkey.java
public class Monkey extends Animal { // Define the Monkey class that inherits from the Animal class
 @Override // Indicate that this method overrides a method in the superclass
 public void makeSound() { // Override the makeSound method from the Animal class
     System.out.println("Monkey Sound: Chatter"); // Print a message to the console specific to a monkey's sound
 }

 @Override // Indicate that this method overrides a method in the superclass
 public void eat() { // Override the eat method from the Animal class
     System.out.println("Monkey Eats bananas"); // Print a message to the console specific to a monkey's eating habits
 }
}
