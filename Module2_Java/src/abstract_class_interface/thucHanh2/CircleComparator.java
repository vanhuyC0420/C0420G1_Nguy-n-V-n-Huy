package abstract_class_interface.thucHanh2;
import inheritance.hinh.Circle;

import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()>o2.getRadius())
            return 1;
        else if (o1.getRadius()<o2.getRadius())
            return -1;
        return 0;
    }
}
