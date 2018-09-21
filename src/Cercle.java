public class Cercle extends Figura {

    private double r;
    public Cercle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(r,2);
    }

    /*Get & Set
    public double getRadi() {
        return r;
    }

    public void setRadi(int l) {
        this.r = l;
    }*/

}
