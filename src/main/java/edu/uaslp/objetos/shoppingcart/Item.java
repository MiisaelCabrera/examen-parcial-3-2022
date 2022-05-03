package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private String code;
    private BigDecimal unitCost;
    private int quantity;
    private String providerCode;

    public Item()
    {
    }

    public Item( String code, String providerCode,BigDecimal unitCost,int quantity)
    {
        this.code=code;
        this.providerCode=providerCode;
        this.unitCost=unitCost;
        this.quantity=quantity;
    }

    public void setCode(String itemCode) {
        code=itemCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public void setQuantity(int i) {
        quantity=i;
    }

    public void setUnitCost(BigDecimal bigDecimal) {
        unitCost=bigDecimal;
    }

    public String getCode() {
        return code;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }
}
