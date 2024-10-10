public class Kitty {
    private String name;
    private int age;


    public Kitty(String nam, int ag){
        name = nam;
        age = ag;
    }
    public Kitty(){
        name = "Mittens";
        age = 2;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }//a

    public void makeOlder(){
        age += 1;
    }
    public void changeName(String str){
        name = str;
    }




}
