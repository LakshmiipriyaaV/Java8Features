package java8;

import java.util.ArrayList;
import java.util.List;
 
public class Greater5 {
    public static void main(String[] args) {
    	  List<String> list = new ArrayList<String>();
          list.add("Priya");
          list.add("Lakshmiii");
          list.add("lakshmipriya");
          list.add("Prii");
           
        

          long count = list.stream().filter(str ->str.length() > 5).count();
           
       
          System.out.println("We have " + count + " strings with length greater than 5");

      }
  }