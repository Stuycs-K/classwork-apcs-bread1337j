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
    Tester.fire(1, true);
    }
}
