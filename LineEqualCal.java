public class LineEqualCal {
    public static void main(String[] args) {
        double x1 = 2 , y1 = 5 , x2 = 4 , y2 = 8 , x3 = 7 , y3 = 9 , x4 = 6 , y4 = 0 ;
        double dist = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2- y1 , 2));
        double dist1 = Math.sqrt(Math.pow(x4 - x3 , 2) + Math.pow(y4- y3 , 2));
        String line1 = Double.toString(dist);
        String line2 = Double.toString(dist1);
        Boolean equal = line1.equals(line2);
        int compare = line1.compareTo(line2);
        if ( compare == 0 ) {
            System.out.println("Equal");
        }
        else if ( compare >= 1)
        {
            System.out.println("Line1 Greater then Line2 ");
        }
        else {
            System.out.println("line1 Smaller then Line2 ");
        }
    }

}
