/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;
import gradleproject1.Contact;
import gradleproject1.Order;
import gradleproject1.Performance;
/**
 *
 * @author Èãîð¸ê
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact contact = new Contact("Mark" , "Scies", "mark@gmail.com");
        System.out.println(contact.toString());
        Order order = new Order(1 , "Guitar", "4684Ivan");
        System.out.println(order.toString());
        Performance performance = new Performance( 1 , "Sies", "Mark" , 35, "TUT VASHA COFFEdra", "Programmer");
        System.out.println(performance.toString());
    }
   
    
}
