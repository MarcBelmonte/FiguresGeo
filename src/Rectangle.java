public class Rectangle extends Figura{
    private double b;
    private double h;

    public Rectangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    @Override

    public double getArea() { return b*h;}

   /*
    //Get & Set
    public double getBase(){
        return b;
    }
    public void setBase(int l){
        this.b = l;
    }
    public double getAltura(){
        return h;
    }

    public void setAltura(int h){
        this.h = h;
    }

    public double getArea(){
        return getBase()*getAltura();
    }*/
}