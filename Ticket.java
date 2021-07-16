/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.operaticketsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfossenidumbia
 */
public class Ticket {
    
    private float price;
    private int quantity;
    private float total;
    
    public List<Ticket>ListofTickets(){
        List<Ticket> ticketList = new ArrayList <Ticket>();
                      
        ticketList.add(new Ticket(10.50F,"Balcony"));
        ticketList.add(new Ticket(21.99F,"Upper Circle"));
        ticketList.add(new Ticket(35.65F,"Dress Circle"));
        ticketList.add(new Ticket(50.38F,"Rear Stalls"));
        ticketList.add(new Ticket(60.99F,"Front Stalls"));
        
        return ticketList;
        
    }

    public Ticket(float price, String name) {
        this.price = price;
        this.name = name;
        
    }

    public Ticket() {
    }
    
    private String name;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public float getCalcTotal(float price, int quantity){
        total = price * quantity;
        return total;
    }
    
    
}
