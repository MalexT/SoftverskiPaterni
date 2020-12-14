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
public class Node50 extends Node{

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) {
          if (currency.getAmount() >= 50) {
            int broj = currency.getAmount() / 50;
            int ostatak = currency.getAmount() % 50;
            map.put("50", broj);
            if (ostatak != 0) {
                this.next.getCurrency(new Currency(ostatak), map);
            }
        } else {
            map.put("50", 0);
            if (this.next != null) {
                this.next.getCurrency(currency, map);
            }
        }
    }
    
}
