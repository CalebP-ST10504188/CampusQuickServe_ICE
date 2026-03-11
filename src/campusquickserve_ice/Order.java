package campusquickserve_ice;

import javax.swing.JOptionPane;

public class Order {
   private String customerName, itemOrdered, studentNum, quantityInput, PriceInput;
   private int quantity;
   private double pricePerItem;
     
    
   //Constructor
    public Order(){      
    customerName = JOptionPane.showInputDialog(null, "Enter your full name:");
    
    studentNum = JOptionPane.showInputDialog(null, "Enter your student number:");
    
    itemOrdered = JOptionPane.showInputDialog(null, "Enter your order:");
    
    quantityInput = JOptionPane.showInputDialog(null, "Enter the number of items ordered:");
    quantity = Integer.parseInt(quantityInput);
    
    PriceInput = JOptionPane.showInputDialog(null, "Enter the price per item:");
    pricePerItem = Double.parseDouble(PriceInput);
  
    }
    
    //Getters
    public String getCustomerName(){
     return customerName; 
    }
    
    public String getStudentNum(){
     return studentNum; 
    }
    
    public String getItemOrdered(){ 
     return itemOrdered; 
    }
    
    public int getQuantity(){
     return quantity; 
    }
    
    public double getPricePerItem(){
     return pricePerItem; 
    }
    
    //Discount Calculation method that uses an if statement to determine whether a discount is required or not
    public static double discountCalc(int quant, double priceItem){
     double discnt;
        if (quant > 3) {
          discnt = priceItem * 0.10; 
          
        } else { 
            discnt = 0;
        }
        
     return discnt;
    }
    
    //Subtotal Calculation method that multiplies quantity with price per item
    public static double subtotalCalc(int quant, double priceItem){
    return quant * priceItem;
    }
    
    //VAT calculation method determining how much VAT must be added
    public static double vatCalc(double subtot){
    final double VAT_RATE = 0.15; //Constant declared for Vat Rate
    return subtot * VAT_RATE;
    }
    
    //Total Calculation method that adds together the subtotal and VAT
    public static double totalCalc(double subtotal, double VAT){
    return subtotal + VAT;
    }
    
}
