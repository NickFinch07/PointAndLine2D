public class TestLine2D {
    
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);


        Line2D a = new Line2D(p1, p2);
        Line2D b = new Line2D(p3, p4);
        Line2D c = new Line2D(4, 9, 6, 8);

        System.out.println("The end points: ");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println(" ");

        System.out.println("Testing constructor using 2 Point objects and the toString method");
        System.out.println("Line 1: " + a);
        System.out.println("Line 2: " + b);
        System.out.println(" ");

        System.out.println("Testing constructor using 4 int's and the toString method");
        System.out.println("Line 3: " + c); 
        System.out.println(" ");

        System.out.println("Testing getP1 and getP2 methods: ");
        System.out.println("Line 1, getP1: x=" + a.getP1().getX() + ", y=" + a.getP1().getY());
        System.out.println("Line 1, getP2: x=" + a.getP2().getX() + ", y=" + a.getP2().getY());
        System.out.println("Line 2, getP1: x=" + b.getP1().getX() + ", y=" + b.getP1().getY());
        System.out.println("Line 2, getP2: x=" + b.getP2().getX() + ", y=" + b.getP2().getY());
        System.out.println(" ");

        System.out.println("Testing getSlope:");
        System.out.println("Line 1 slope: " + a.getSlope());
        System.out.println("Line 2 slope: " + b.getSlope());
        System.out.println(" ");

        System.out.println("Testing isCollinear:");
        System.out.println("Line 1 and p3: " + a.isCollinear(p3));
        System.out.println("Line 1 and p3: " + a.isCollinear(p4));

    }

}