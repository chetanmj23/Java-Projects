/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Akhilesh Kashyap
 */
public class Order {
    private String status;
    private String issueDate;
    private String shippingDate;
    public static int orderumber = 0;
    private int ordernumber1;
    private ArrayList<OrderItem> orderList;
    
    public Order () {
        orderumber += 1;
        //ordernumber1 = orderumber;
        orderList = new ArrayList<OrderItem>();
    }

//    public int getOrdernumber1() {
//        return ordernumber1;
//    }
//
//    public void setOrdernumber1(int ordernumber1) {
//        this.ordernumber1 = ordernumber1;
//    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    public static int getOrderumber() {
        return orderumber;
    }

    public static void setOrderumber(int orderumber) {
        Order.orderumber = orderumber;
    }

    public ArrayList<OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderItem> orderList) {
        this.orderList = orderList;
    }

    public OrderItem addORderItem() {
        OrderItem orderItem = new OrderItem();
        orderList.add(orderItem);
        return orderItem;
    }
    
     public void removeOrderItem(OrderItem orderitem){
        orderList.remove(orderitem);
    }
}
