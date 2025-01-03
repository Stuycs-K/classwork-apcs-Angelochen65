public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(b.getY() - a.getY(),2) + Math.pow(b.getX() - a.getX(),2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(0,0);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println(distance(p1,p2)==Point.distance(p1,p2)&&Point.distance(p1,p2)==p1.distanceTo(p2));
    System.out.println(distance(p1,p3)==Point.distance(p1,p3)&&Point.distance(p1,p3)==p1.distanceTo(p3));
    System.out.println(distance(p2,p3)==Point.distance(p2,p3)&&Point.distance(p2,p3)==p2.distanceTo(p3));
    System.out.println(distance(p3,p4)==5);

    Point tri1 = new Point(0,0);
    Point tri2 = new Point(1,0);
    Point tri3 = new Point(0.5, Math.sqrt(0.75));
    System.out.println(distance(tri1,tri2));
    System.out.println(distance(tri2,tri3));
    System.out.println(distance(tri1,tri3));
  }
}
