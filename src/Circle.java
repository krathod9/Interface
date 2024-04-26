public class Circle implements Shape{
    String color;
    int radius;
    public Circle(String color, int radius){
        this.color=color;
        this.radius=radius;
    }
    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "I am a " +color+" Cicle with area "+area();
    }
}
