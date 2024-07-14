public class A16DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        double x1 = 50;
        double x2 = 30;
        double y1 = 10;
        double y2 = 20;
        
        double distance = Math.sqrt(Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2));
        System.out.println("The distance between two point: "+ distance);


    }
    
}
