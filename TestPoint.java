public class TestPoint {
    
    public static void main(String[] args) {
        System.out.println("The points:");
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(-5,7);
        Point p4 = new Point(3,-10);
        Point p5 = new Point(3,10);
        Point p6 = new Point(6,8);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);

        System.out.println("Testing manhattanDistance:");
        System.out.println("p2 to p3: " + p2.manhattanDistance(p3));
        System.out.println("p3 to p4: " + p3.manhattanDistance(p4));

        System.out.println("Testing isCollinear:");
        System.out.println("p2, p4, p5: " + p2.isCollinear(p4, p5));
        System.out.println("p2, p3, p4: " + p2.isCollinear(p3, p4));
        System.out.println("p1, p2, p6: " + p1.isCollinear(p2, p6));
        System.out.println("p1, p2, p3: " + p1.isCollinear(p2, p3));


    }

}