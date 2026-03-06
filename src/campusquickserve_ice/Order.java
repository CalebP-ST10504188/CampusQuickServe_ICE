package campusquickserve_ice;

import javax.swing.JOptionPane;

public class Order {
    String customerName, itemOrdered, StudentNumberInput, quantityInput, PriceInput;
    int studentNum, Quantity;
    double pricePerItem; 
    
    //Subtotal Calculation method that multiplies quantity with price per item
    public static double subtotalCalc(int quant, double priceItem){
    return quant * priceItem;
    }
    
    public static double vatAddedCalc(double subtotal){
    final double VAT_RATE = 0.15; //Constant declared for Vat Rate
    return subtotal * VAT_RATE;
    }
    
    //Constructor
    public Order(){      
    customerName = JOptionPane.showInputDialog(null, "Enter your full name:");
    
    StudentNumberInput = JOptionPane.showInputDialog(null, "Enter your student number:");
    studentNum = Integer.parseInt(StudentNumberInput);
    
    itemOrdered = JOptionPane.showInputDialog(null, "Enter your order:");
    
    quantityInput = JOptionPane.showInputDialog(null, "Enter the number of items ordered:");
    Quantity = Integer.parseInt(quantityInput);
    
    PriceInput = JOptionPane.showInputDialog(null, "Enter the price per item:");
    pricePerItem = Double.parseDouble(PriceInput);
    
    
    
    }
}
