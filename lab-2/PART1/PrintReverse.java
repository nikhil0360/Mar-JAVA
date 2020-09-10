public class PrintReverse{

  public static void main(String args[]) {

    String str = "the Language Java is named after the island Java" ;
    String[] arr = str.split(" ");

    // printing in same order
    // for(String s: arr)
    //   System.out.println(s);

    // printing in reverse order

    for(int i=arr.length - 1; i>=0 ; i--)
      System.out.print(arr[i] + " ") ;

  }

}
