import java.util.ArrayList;

public class Sales{

  // sales Department
  // mantains records of sales data ( year of sale , book id)
  // to maintain this, created new class called Record

  // also have fuction to print data related to revenue
  // has method printSales to print all the sales data

  ArrayList<Record> records = new ArrayList<Record>();

  void addRecord(Book book, int yearSold){
    Record r =  new Record(book.getid(), yearSold, book.getsellPrice());
    this.records.add(r) ;
  }

  void getRevenue(int year){
    double r1 , r2, r3 ;
    r1 = r2 = r3 = 0 ;

    for(Record r: this.records){
      if( r.getyearSold() == year )
        {
          String[] str = r.getid().split("-") ;
          int y = Integer.parseInt(str[0]) ;
          if(y == year)
            r1 += r.getprice() ;
          else if(y == year-1)
            r2 += r.getprice() ;
          else if(y == year-2)
            r3 += r.getprice() ;
        }
    }

    int rev1 = (int) r1 ;
    int rev2 = (int) r2 ;
    int rev3 = (int) r3 ;
    System.out.println(year + " " + rev1 + " " + rev2 + " " + rev3) ;
  }

  void printSales(){
    // printing all the getRevenue in ascending order of year
    int min = this.getMinYear() ;
    int max = this.getMaxYear() ;

    for(int i = min ; i <= max ; i++){
      this.getRevenue(i) ;
    }
  }

  int getMaxYear(){
    // return max year in int of sales record
    int maxYear = 0 ;
    for(Record r: this.records){
      if( r.getyearSold() > maxYear )
          maxYear = r.getyearSold() ;
    }

    return maxYear ;
  }

  int getMinYear(){
    // return max year in int of sales record
    int minYear = 2050 ;
    for(Record r: this.records){
      if( r.getyearSold() < minYear )
          minYear = r.getyearSold() ;
    }
    return minYear ;
  }

} // END OF CLASS Sales
