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
		return "Skibidi " + this.name;
	}

	public int getSpecial(){
		return this.special;
	}
	public void setSpecial(int n){
		this.special = n;
	}
	public int getSpecialMax(){
		return this.maxspecial;
	}



}
