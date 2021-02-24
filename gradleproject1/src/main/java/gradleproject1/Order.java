/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

public class Order {    
    int id, type;
    String name, courier, dateTime;

    public Order(int id,String name, String courier) {
        this.id = id;
        this.name = name;
        this.courier = courier;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCourier() {
        return courier;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", type=" + type + ", name=" + name + ", courier=" + courier + ", dateTime=" + dateTime + '}';
    }
    
}