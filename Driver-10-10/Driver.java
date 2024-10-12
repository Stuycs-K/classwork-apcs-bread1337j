import Util.Brainrotlib;
import Util.JohnTests;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Driver{
    public static void main(String[]args) throws Exception {

//makes a Kitty named Matcha that is 3 years old
        Kitty a = new Kitty("Matcha", 3);
        Brainrotlib.print(a);

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
        //Tester.fireScreen();


        JohnTests te = new JohnTests();
        Random rand = new Random();
        for(int j=0; j<10000; j++) {
            for (int i = 0; i < 100; i++) {
                te.queue(rand.nextInt(i + 1), rand.nextInt(i + 1));
            }
            if(te.fireScreen() > 50) {
                TimeUnit.SECONDS.sleep(10);
            }else{
                TimeUnit.MILLISECONDS.sleep(1);
            }
        }
        /*TimeUnit.SECONDS.sleep(1);

        JohnTests AlwaysCorrect = new JohnTests();
        for(int i=0; i<100; i++){
            AlwaysCorrect.queue(i, i);
        }
        AlwaysCorrect.fireScreen();*/
        //Tester.fire();
        //JohnTests err = new JohnTests(-1);
    }
}