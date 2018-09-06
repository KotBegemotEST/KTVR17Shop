/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopktvr17;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author pupil
 */
public class shopKTVR17 {
    public static void main(String[] args) {
        
          Product product1 = new Product(1L, "Hispania cheese",20,35);
          Product product2 = new Product(2L, "Saremaa",50,100);
          Product product3 = new Product(3L, "Pink",70,83);
          
          
          Customer customer1 = new Customer(1L , 1000, "Vasja","Pupkin");
          Customer customer2 = new Customer(2L , 1000, "John","Weak");
          Customer customer3 = new Customer(3L, 1000, "Zac","Efron");
          
          
          Calendar calendar = new GregorianCalendar();
          
          Purchase purchase1 = new Purchase(1L,calendar.getTime(), product1, customer1,2);
          Purchase purchase2 = new Purchase(2L,calendar.getTime(), product2, customer2,3);
          Purchase purchase3 = new Purchase(3L,calendar.getTime(), product3, customer3,4); 
          
          product1.setCount(product1.getCount() - purchase1.getQuantity());
          customer1.setMoney(customer1.getMoney() - purchase1.getQuantity()*product1.getPrice());
          
          System.out.println(product1.toString());
          System.out.println(customer1.toString());
          
          System.out.println(customer1.getFirstName() + " Купил " + product1.getName() + " в кол-ве "+ purchase1.getQuantity() +"шт" );
          
          System.out.println("Status: " + product1.getName() +" на складе " +  product1.getCount()+ "шт");
          System.out.println("Status: " + customer1.toString());

                   // return "Статус{" + ", Покупатель=" + customer.name + "купил, product=" + product.name +  "в колличевстве, quantity=" + purchase3.quantity + '}';

                 // return "Purchase{" + ", Покупатель=" + customer + "купил, product=" + product +  "в колличевстве, quantity=" + quantity + '}';

                    
   
                  
          
          // Purchase (Long id, Date date, Product product, Customer customer, Integer quantity)
          //Customer public Customer(Long id, Integer money, String firstName, String lastName)
          //Product  public Product(Long id, String name, Integer price, Integer count) {
          
//        book1.setIsbn("123");
//        book1.setName("Война и Мир");
//        book1.setAuthor("Л.Толстой");
//        System.out.println(book1.getName());
//        Reader reader1 = new Reader();
//        reader1.setCode("12345678901");
//        reader1.setName("Juri");
//        reader1.setSurname("Melnikov");
//        System.out.println(reader1.toString());
//        History history1 = new History();
//        history1.setBook(book1);
//        history1.setReader(reader1);
//        Calendar c = new GregorianCalendar();
//        history1.setDateBegin(c.getTime());
//        System.out.println(history1.toString());
        
    }
}
