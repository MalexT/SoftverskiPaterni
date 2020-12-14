/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import java.util.Map;

/**
 *
 * @author Stefan
 */
public abstract class Node {

    protected Node next;

    public void setNext(Node next) {
        this.next = next;
    }

    public abstract void getCurrency(Currency currency, Map<String, Integer> map);
    
}
