package edu.uaslp.objetos.shoppingcart;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException()
    {
        super("Item was not found");
    }
}
