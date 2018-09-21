public abstract class Figura {
    public abstract double getArea();

    public static void main(String[] args){
        //Asignem valors:

        Figura q1 = new Quadrat(4);
        Figura t1 = new Triangle(3,5);
        Figura c1 = new Cercle(6);
        Figura r1 = new Rectangle(6,2);
        Figura q2 = new Quadrat(7);

        //Vector de figures
       /* Figura[] = v = new Figura [5];
        v[0]=q1;
        v[1]=t1;
        v[2]=c1;
        v[3]=q2;
        v[4]=r1;
        */

        //Imprimir areas por consola
        System.out.printf("Area Quadrat: \t\t" + q1.getArea() + "\n");
        System.out.printf("Area Quadrat2: \t\t" + q2.getArea() + "\n");
        System.out.printf("Area Rectangle: \t" + r1.getArea() + "\n");
        System.out.printf("Area Cercle: \t\t" + c1.getArea() + "\n");
        System.out.printf("Area Triangle: \t\t" + t1.getArea() + "\n");
    }
}