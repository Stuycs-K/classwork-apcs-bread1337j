/* When I overrided getName, the result given by speak() went from displaying the name as OtherName [the name of the Bird] to displaying
The Mighty OtherName, which was the name but with "The Mighty" put before it.

Bird to animal didn't work because Bird is a more complex Class than animal, and changing it to animal would remove information, which is
not allowed by Java.
*/


public class Driver{

public static void main(String[]args)
{
System.out.println("\n\n\n");


Animal creature = new Animal("Spoken Noise", 9207, "Name");
creature.speak();

System.out.println("\n---------------");
Bird creature2 = new Bird("Chirped Noise", 1862, "OtherName",1674,"Beige");
creature2.speak();

System.out.println("\n---------------");
Animal testeranimal = new Animal("A", 1, "B");
Bird testerbird = new Bird("A",1,"B",2,"C");

Animal a1 = testeranimal;
Bird b1 = testerbird;
//Bird b2 = testeranimal;
Animal a2 = testerbird;
System.out.println("\n---------------");
a1.speak();
System.out.println("\n---------------");
b1.speak();
System.out.println("\n---------------");
a2.speak();








