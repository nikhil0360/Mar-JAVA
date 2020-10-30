import java.util.*;
import java.io.*;
public class LoginManager {

  HashMap<String, String> map = new HashMap<>();

  boolean addUser( String name, String password ){
    if(map.containsKey(name)==false){
      map.put(name, password) ;
      return true ;
    }


    return false ;
  }

  boolean checkLogin( String name, String password ){

    if(map.containsKey(name)==true){
      if(map.get(name).equals(password)){
        return true ;
      }
    }

    return false ;
  }

  Set<String> listAllUserName(){
    return map.keySet() ;
  }
}
