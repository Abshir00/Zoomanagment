package zoo.MS; // Declare the package name where this class resides

//Lion.java
public class Lion extends Animal { // Define the Lion class that inherits from the Animal class
	
 @Override // Indicate that this method overrides a method in the superclass
 public void makeSound() { // Override the makeSound method from the Animal class
     System.out.println("Lion Sound: Roar"); // Print a message to the console specific to a lion's sound
 }

 @Override // Indicate that this method overrides a method in the superclass
 public void eat() { // Override the eat method from the Animal class
     System.out.println("Lion Eats Meat"); // Print a message to the console specific to a lion's eating habits
 }
}
