import java.util.* ;
public class Box implements Comparable<Box> {

    public Box(int s) {

        size = s;

   }

    public int compareTo(Box other) {
           return size - other.size;
     }

     private int size;


     public static void main(String[] args){
       Arraylist<Box> boxes = new Arraylist<>() ;
       boxes.add(new Box(1)) ;
       boxes.add(new Box(5)) ;
       boxes.add(new Box(3)) ;
       boxes.add(new Box(7)) ;
       boxes.add(new Box(3)) ;
       boxes.add(new Box(9)) ;
       boxes.add(new Box(4)) ;

       Collections.sort(boxes);

     }

}
