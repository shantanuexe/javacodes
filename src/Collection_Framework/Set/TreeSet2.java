package Collection_Framework.Set;

import java.util.SortedSet;
import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;

    public  Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else {
            if (this.y < p.y)
                return -1;
             else if (this.y > p.y)
                return -1;
            else return 0;
        }

    }

    @Override
    public String toString() {

        return "x="+x+" y= "+y;
    }
}
public class TreeSet2 {


    public static void main(String[] args) {
        TreeSet<Point> ts= new TreeSet<>();

        ts.add(new Point(1,4));
        ts.add(new Point(5,9));
        ts.add(new Point(5,2));
        //SortedSet<Point> st =ts.headSet(4,true);



        System.out.println(ts);


    }




}
