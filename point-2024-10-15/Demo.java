import Util.*;


public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return a.distanceTo(b);
  }

  public static void main(String[]args) throws Exception{
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    JohnTests Tester = new JohnTests(4);
    Tester.queue( p3, "(3.0, 4.0)");
    Tester.queue( distance(p1,p2), Math.sqrt(8));
    Tester.queue( Point.distance(p1,p2), Math.sqrt(8));
    Tester.queue( p1.distanceTo(p2), Math.sqrt(8));
    Tester.fire(0, true);

    Point t1 = new Point(0,0);
    Point t2 = new Point(1,0);
    Point t3 = new Point(0.5, Math.sqrt(3)/2);

    System.out.println("Triangle");
    System.out.println(t1.distanceTo(t2));
    System.out.println(t1.distanceTo(t3));
    System.out.println(t2.distanceTo(t3));

    }
}
