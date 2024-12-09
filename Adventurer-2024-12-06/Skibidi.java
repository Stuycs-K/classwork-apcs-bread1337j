public class Skibidi extends Adventurer{
	int special;
	int maxspecial;
	public Skibidi(String name, int hp){
		this(name, hp, 0, 100);
	}
	public Skibidi(String name, int hp, int special, int maxspecial){
		super(name, hp);
		this.special = special;
		this.maxspecial = maxspecial;
	}

	public String getSpecialName(){
		return "Skibidi aura";
	}

	public int getSpecial(){
		return this.special;
	}
	public void setSpecial(int n){
		this.special = n;
	}
	public void setMaxSpecial(int n){
		this.maxspecial = n;
	}
	public int getSpecialMax(){
		return this.maxspecial;
	}

	public String specialAttack(Adventurer other){
		if(this.getSpecial() >= 100){
			other.setName("Skibidi " + other.getName());
			other.setSpecial(0);
			this.setSpecial(this.getSpecial() - 100);
		}
		return other.getName() + " gets 360 no-scoped so hard that " + other.getName() + " is brought down to " + other.getSpecial() + " special";
	}
	public String support(Adventurer other){
		String real = other + " is freed";
		if(this.getSpecial() >= 1){
			other = null; //free the user from having to deal with my code
		}
		return(real);
	}
	public String support(){
		//nevermind it went very wrong this = this(name, super.getHP()*100, this.getSpecial()*5, this.getMaxSpecial()*5); //very safe code that has no possible ways of going wrong!!!!!


		super.setHP(super.getHP()*100);
		this.setSpecial(this.getSpecial()*5);
		this.setMaxSpecial(this.getSpecialMax()*5);
		return(this.getName() + " got real");
	}
	public String attack(Adventurer other){
		int damage = (5000-this.getHP()) * (this.getSpecial() / this.getSpecialMax()); //This will not be documented because not even I know what it does.
		other.applyDamage(damage + 5);
		if(this.getHP() < damage){damage = this.getHP()-5;}
		this.applyDamage(Math.abs(damage)); //game design is my passion
		return("Was attacked: " + other.getHP() + " Not attacked: "  + this.getHP() + " Info about the attack: No one knows");

	}


}
