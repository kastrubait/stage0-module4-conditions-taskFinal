package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0) {
            if (x * y > 0) {
                System.out.println("first");
            } else System.out.println("fourth");
        } else {
            if (x * y > 0) {
                System.out.println("second");
            } else {
                System.out.println("third");
            }
        }
        if (x == 0 || y == 0) System.out.println("zero");
    }
}
