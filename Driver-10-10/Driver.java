import java.util.Random;

public class Driver{
    public static void main(String[]args){

//makes a Kitty named Matcha that is 3 years old
        Kitty a = new Kitty("Matcha", 3);
        System.out.println(a);

//makes a Kitty named Mittens that is 2 years old
        Kitty b = new Kitty();
        System.out.println(b);

        System.out.println(a.getName() + " is "+a.getAge() + " years old.");
//should print "Matcha is 3 years old."

        a.makeOlder();
        System.out.println(a.getName() + " is "+a.getAge() + " years old.");
//should print "Matcha is 4 years old."

        a.makeOlder();
        a.changeName("Katya");
        b.changeName("Aytak");
        b.makeOlder();

        System.out.println(a.getName() + " is " + a.getAge() + " years old.");
        System.out.println(b.getName() + " is " + b.getAge() + " years old.");
//should print "Katya is 5 years old."
//should print "Aytak is 3 years old."a
        System.out.println(b);

        JohnTests Tester = new JohnTests(2);
        b.changeName("aaaaaaaaaaaa");
        Tester.queue("Katya", a.getName());
        Tester.queue("Aytak", b.getName());
        Tester.fire();

        JohnTests te = new JohnTests(100000);
        Random rand = new Random();
        for(int i=1; i<100000; i++){
            te.queue(rand.nextInt(i), rand.nextInt(i));
        }
        te.fire();
    }
}