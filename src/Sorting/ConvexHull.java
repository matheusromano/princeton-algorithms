package Sorting;

public class ConvexHull {

    private final double x;
    private final double y;

    public ConvexHull (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static int ccw(ConvexHull  a, ConvexHull  b, ConvexHull  c) {
        double area2 = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
        if (area2 < 0) return -1; // clockwise
        else if (area2 > 0) return +1; // counter-clockwise
        else return 0; // collinear
    }
}
