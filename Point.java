public class Point {

    private int firstPoint;
    private int secondPoint;

    public Point () {
        firstPoint = 0;
        secondPoint = 0;
    }

    public Point (int initP1, int initP2) {
        firstPoint = initP1;
        secondPoint = initP2;
    }

    public int getX() {
        return firstPoint;
    }

    public int getY() {
        return secondPoint;
    }

    public void setFirstPoint (int newFirstPoint) {
        firstPoint = newFirstPoint;
    }

    public void setSecondPoint (int newSecondPoint) {
        secondPoint = newSecondPoint;
    }

    public int manhattanDistance(Point other) {
        int xDifference = Math.abs(this.getX() - other.getX());
        int yDifference = Math.abs(this.getY() - other.getY());
        return xDifference + yDifference;
    }

    public boolean isCollinear(Point p1, Point p2) {
        boolean test = false;

        int a = this.getX() * (p1.getY() - p2.getY()) + p1.getX() * (p2.getY()
        - this.getY()) + p2.getX() * (this.getY() - p1.getY());

        if (a == 0) {
            test = true;
        }
        
        return test;
    }

    public String toString() {
        return "x = " + this.getX() + ", y = " + this.getY();
    }

}