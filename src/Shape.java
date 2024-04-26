public interface Shape {

    String color();
    double area();
    String info();
    final static int i = 12;

    default String mydefault(){
        return "This is default method in interface";
    }

    static String mystatic(){
        return "This is static method in interface";
    }
}
