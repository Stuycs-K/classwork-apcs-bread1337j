public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return a.distanceTo(b);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3+ " with expected value of: " + "(" + p3.getX() + ",  " + p3.getY() + ")");
    System.out.println( distance(p1,p2) + " with expected value of: " + Math.sqrt(8));
    System.out.println( Point.distance(p1,p2)+ " with expected value of: " + Math.sqrt(8));
    System.out.println( p1.distanceTo(p2)+ " with expected value of: " + Math.sqrt(8));}
}