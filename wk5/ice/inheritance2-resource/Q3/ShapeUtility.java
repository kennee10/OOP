import java.awt.Shape;
import java.util.ArrayList;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        double area = 0;
        int int_to_return=0;

        for (int i = 0; i < shapeList.size(); i++) {
            Shape curr_obj = shapeList.get(i);
            if (curr_obj instanceof Octagon) {
                double curr_area = curr_obj.getArea();
                if (curr_area > area) {
                    area = curr_area;
                    int_to_return = i;
                }
            }
        }
        return (Octagon)shapeList.get(int_to_return);
    }





    // public ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {

    // }
    // public ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {

    // }
    // public ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {

    // }
}