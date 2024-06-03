package zoo.MS; // Declare the package name where this class resides

//Elephant.java
public class Elephant extends Animal { // Define the Elephant class that inherits from the Animal class
 @Override // Indicate that this method overrides a method in the superclass
 public void makeSound() { // Override the makeSound method from the Animal class
     System.out.println("Elephant Sound: Trumpet"); // Print a message to the console specific to an elephant's sound
 }

 @Override // Indicate that this method overrides a method in the superclass
 public void eat() { // Override the eat method from the Animal class
     System.out.println("Elephant Eats grass"); // Print a message to the console specific to an elephant's eating habits
 }
}
