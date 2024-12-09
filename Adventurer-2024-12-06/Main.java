import java.util.Scanner;
import java.util.Random;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		Adventurer plr = new Skibidi("" + sc.nextLine(), 10, 100, 100);
		Adventurer Enemy = new CodeWarrior();
		while(plr != null && Enemy != null){
				Random rand = new Random(8800);
				System.out.println(plr.getName() + " | HP: " + plr.getHP() + " | " + plr.getSpecialName() + ": " + plr.getSpecial() + "/" + plr.getSpecialMax());
				System.out.println(Enemy.getName() + " | HP: " + Enemy.getHP() + " | " + Enemy.getSpecialName() + ": " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax());

				System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
				String in = sc.nextLine() + "";
				if(in.equals("a") || in.equals("attack")){
					System.out.println(plr.attack(Enemy));
				}else if (in.equals("sp") || in.equals("special")) {
					System.out.println(plr.specialAttack(Enemy));
				}else if (in.equals("su") || in.equals("support")) {
					System.out.println(plr.support());
				}else if (in.equals("quit")){
					System.out.println("Quitting");
					System.exit(1);
				}else{
					System.out.println("Invalid input, you die of terminal dyslexia.");
					plr = null;
					continue;
				}
				if(Enemy.getHP() < 0){
					Enemy = null;
					continue;
				}
				if(plr.getHP() < 0){
					plr = null;
					continue;
				}

				if(in.equals("1")){
					System.out.println(Enemy.attack(plr));
				}else if (in.equals("2")) {
					System.out.println(Enemy.specialAttack(plr));
				}else if (in.equals("3")) {
					System.out.println(Enemy.support());
				}
				if(Enemy.getHP() < 0){
					Enemy = null;
					continue;
				}
				if(plr.getHP() < 0){
					if(plr.getHP() < -10000000){
						System.out.println("integer overflow moment");
					}
					plr = null;
					continue;
				}
		}
		System.out.println((plr == null)? "you lose":"you win");
	}
}
