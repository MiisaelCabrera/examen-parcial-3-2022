package edu.uaslp.objetos.shoppingcart;

public class EmptyShoppingCartException extends Exception {

    public EmptyShoppingCartException(){
        super("Cart is Empty");
    }
}
