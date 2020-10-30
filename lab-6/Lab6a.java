import java.util.* ;
import java.io.* ;

public class Lab6a {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine(); // a string of multiple words separated by space

    str = str.toLowerCase() ;
    String[] arr = str.split(" ");

    List<String> list = new ArrayList<String>() ;
    list = Arrays.asList(arr) ;

    // // 1
    // System.out.println(list.size());
    //
    // // 2
    // System.out.println(Collections.min(list));
    // System.out.println(Collections.max(list));
    //
    // // 3
    // System.out.println(list);
    // Collections.shuffle(list) ;
    // System.out.println(list);


    // 4
    // a
    // HashSet<String> set = new HashSet<String>(list);
    // System.out.println(set) ;

    // b
    // SortedSet<String> set = new TreeSet<String>(list) ;
    // System.out.println(set) ;

    // c
    // SortedSet<String> set = new TreeSet<String>(new SortBySize());
    // set.addAll(list);
    // System.out.println(set);

    // d
    LinkedHashSet<String> set = new LinkedHashSet<String>(list);
    System.out.println(set);

  }
}

class SortBySize implements Comparator<String>
{
  public int compare(String a, String b)
  {
    if (a.length() != b.length())
      return a.length() - b.length();

    return a.compareTo(b);
  }
}
