import java.lang.*;
public class EquTwoLines {
    public static void main(String[] args){
            double x1 = 2 , y1 = 5 , x2 = 2 , y2 = 8 , x3 = 7 , y3 = 9 , x4 = 6 , y4 = 0 ;
            double dist = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2- y1 , 2));
            double dist1 = Math.sqrt(Math.pow(x4 - x3 , 2) + Math.pow(y4- y3 , 2));
            String line1 = Double.toString(dist);
            String line2 = Double.toString(dist1);
            Boolean equal = line1.equals(line2);
            if ( equal == true ) {
                System.out.println("Equal");
            }
            else {
                System.out.println("Not Equal");
            }

        }

    }
