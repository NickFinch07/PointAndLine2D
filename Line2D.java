public class Line2D {
    
    private Point point1;
    private Point point2;


    public Line2D (Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }

    public Line2D (int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public String toString() {
        return "[(" + point1.getX() + ", " + point1.getY() + "), (" + point2.getX() + ", " + point2.getY() + ")]";
    }

    public double getSlope() {

        double yDiff = 0.0;
        double xDiff = 0.0;
        double slope = 0.0;
        
        
        yDiff = point1.getY() - point2.getY();
        xDiff = point1.getX() - point2.getX();

        slope = yDiff / xDiff;
        return slope;
    }

    public boolean isCollinear(Point p) {
        double b = point1.getY() - this.getSlope() * point1.getX();
        return (p.getY() == this.getSlope() * p.getX() + b);
    } 
    
}