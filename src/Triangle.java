public class Triangle extends Shape{
    private double side1=1;
    private double side2=1;
    private double side3=1;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return (this.side1+this.side2+this.side3)/2;
    }

    public double getArea(){
        return Math.sqrt(this.getPerimeter()*(this.getPerimeter()-this.side1)*(this.getPerimeter()-this.side2)*(this.getPerimeter()-this.side3));
    }
    @Override
    public String toString(){
        return "Hình tam giác, "+super.toString() + ", độ dài canh 1= "+this.side1+", độ dài cạnh 2= "
                +this.side2+", độ dài canh 3= "+this.side3+",có diện tích="+this.getArea()+",có chu vi= "+this.getPerimeter();
    }


}
