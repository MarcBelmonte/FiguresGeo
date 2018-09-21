public class Triangle extends Figura{
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    @Override
    public double getArea() {
        return ((b*h)/ 2);
    }
/*
    //Get & Set
    public double getBase() {
        return b;
    }

    public void setBase(int l) {
        this.b = l;
    }

    public double getAltura() {
        return h;
    }

    public void setAltura(int h) {
        this.h = h;
    }

    public double getArea() {
        return (getBase() * getAltura()) / 2;
    }
    */
}
