package objJJ.p06.figuros;

public class Figura extends Object {
    private int x;
    private int y;
    private double degree;  //pasukimo laipsnis

    public double plotas() {
        return 0;

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
