/**
 * Created by Upoma on 1/17/2017.
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;

    public  Invoice(String partNum,String partDes,int itemQuan,double price_Item)
    {
       partNumber =partNum;
       partDescription=partDes;
       if (itemQuan>0) {
           itemQuantity = itemQuan;
       }
       else
       {
           itemQuantity=0;
       }
       if(price_Item>0.0) {
           pricePerItem = price_Item;
       }
       else
           pricePerItem=0.0;

    }

    public void setPartNumber(String partNum) {
        partNumber = partNum;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDes) {
        this.partDescription = partDes;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setItemQuantity(int itemQuan) {
        if (itemQuan > 0) {
            itemQuantity = itemQuan;
        } else {
            itemQuantity = 0;
        }
    }
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setPricePerItem(double price_Item) {
        if(price_Item>0.0){pricePerItem=price_Item;
        }
        else {
            itemQuantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public Double getInvoiceAmount(){
      double invoiceAmount= itemQuantity*pricePerItem;
      return  invoiceAmount;
    }
}
