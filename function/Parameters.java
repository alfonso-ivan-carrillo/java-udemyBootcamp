package function;
public class Parameters {
    
    public static void calArea(double length, double width){
        System.out.println("Area: " + length * width);
    }

    public static int areaInt(int length, int width){
        int area = length * width;
        return area;
    }


    public static void main(String[] args) {
        
        calArea(5.5, 3.0);

        System.out.println(areaInt(5, 4));


    }
}
