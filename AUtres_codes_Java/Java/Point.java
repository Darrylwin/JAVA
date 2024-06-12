package Java;

public class Point {
    
    private int abs, ord;

    public int getAbs(){

        return abs;
    }

    public int getOrd(){

        return ord;
    }

    // les setteurs n tpour type de retour void

    public void setAbs(int unAbs){

        abs = unAbs;
    }

    public void setOrd(int unOrd){

        ord = unOrd;
    }

    public Point(){}

    // public int distance(){}

    // public void toString(){
    //     System.out.println("...")
    // }

    public static void main(String[] args) {

        Point point1 = new Point();
        System.out.println(point1.getAbs());
        System.out.println(point1.getOrd());
        System.out.println(point1.ord);

    }
}
