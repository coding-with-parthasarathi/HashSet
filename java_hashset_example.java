import java.util.*;
public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.contains("Mazda"));
    cars.remove("Volvo");
    System.out.println(cars);
    System.out.println(cars.size());
    cars.add("Ford");
    Iterator<String> itr=cars.iterator();  
    while(itr.hasNext()){  
      System.out.println(itr.next());  
    }  
    cars.clear();
    System.out.println(cars);
  }
}
