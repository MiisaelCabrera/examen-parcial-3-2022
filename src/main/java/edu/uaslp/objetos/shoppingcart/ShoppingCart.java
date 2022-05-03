package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items=new ArrayList<>();


    public boolean isEmpty() {
        if(items.size()==0)
            return true;
        else
            return false;
    }

    public BigDecimal getTotalCost() {
        BigDecimal totalCost = BigDecimal.ZERO;

        for(Item item: items){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getItemsCount() {
        return items.size();
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeItem(String itemCode1) throws ItemNotFoundException{
        int index=0;
        for(Item item:items)
            if(item.getCode() == itemCode1)
                items.remove(item);
    }
}
