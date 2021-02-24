package gradleproject1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Èãîğ¸ê
 */
public class Contact {
    int id;
    String firstname, lastname, address;
    
    public Contact(String firstname, String lastname, String address){
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + '}';
    }
    
}
