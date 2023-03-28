package Item10;

import java.sql.Timestamp;

public class ColorPoint extends Point{

    private final Color color;

    public enum Color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

    public ColorPoint(int x, int y, Color color){
        super(x,y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o){

        if (! (o instanceof Point))
            return false;

        if (! (o instanceof ColorPoint)) // o가 Point면 색상을 무시하고 비교한다.
            return o.equals(this);

        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public static void main(String[] args) {

        // 추이성 위배
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.printf("%s %s %s%n",
                p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }

}
