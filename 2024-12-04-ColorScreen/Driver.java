import java.util.Random;
import java.util.SplittableRandom;

public class Driver{
    public static void main(String[] args) {
//


        SplittableRandom rand = new SplittableRandom(100);
        Text.color(Text.background(Text.WHITE));
        for(int i=0; i<1000; i++){
            System.out.print(" ");
            if(i%25==0){
                System.out.println();
            }
        }
        for(int j=0; j<25; j++) {
            for (int i = 0; i < 25; i++) {
                Text.go(i-j, i);
                Text.color(Text.background(rand.nextInt(9) + 30));
                System.out.print(" ");
            }
        }
        for(int j=0; j<25; j++) {
            for (int i = 0; i < 25; i++) {
                Text.go(i+j, i+25);
                Text.color(Text.background(rand.nextInt(9) + 30));
                System.out.print(" ");
            }
        }

        System.out.println(Text.RESET);
    }
}