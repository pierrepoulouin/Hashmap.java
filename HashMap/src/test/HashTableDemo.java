package test;
import java.util.*;
public class HashTableDemo {

   public static void main(String args[])  {
      // Create a hash map
      Hashtable balance = new Hashtable();
      Enumeration names;
      String str;
      double bal;

      balance.put("Pierre", new Double(15000.00));
      balance.put("Vanessa", new Double(30000.00));
      balance.put("Laetis", new Double(-1378.00));
      balance.put("Greg", new Double(0));
      balance.put("LOGAN", new Double(103948.00));

      // Show all balances in hash table.
      names = balance.keys();
      
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " + balance.get(str));
      }        
      System.out.println();
      
      // Deposit 1,000 into Pierre's account
      bal = ((Double)balance.get("Pierre")).doubleValue();
      balance.put("Pierre", new Double(bal + 1000));
      System.out.println("Pierre's new balance: " + balance.get("Pierre"));
   }
}
