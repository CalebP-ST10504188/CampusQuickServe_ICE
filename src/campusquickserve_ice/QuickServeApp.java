package campusquickserve_ice;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class QuickServeApp {
    
    double discount, subtotal, vatAmount, totalCost;
    Order myOrder = new Order(); 
   
    public QuickServeApp(){
    discount = Order.discountCalc(myOrder.getQuantity(), myOrder.getPricePerItem()); //Calls the discount calculation method.
    subtotal = Order.subtotalCalc(myOrder.getQuantity(), myOrder.getPricePerItem()) - discount; //Calls the subtotal calculation method and applies discount
    vatAmount = Order.vatCalc(subtotal); //Calls the VAT amount calculation method.
    totalCost = Order.totalCalc(subtotal, vatAmount); // Calls the total cost calculation method.
    }
    
    
   //Custom method for displaying the receipt
   public void displayOutput(){
       
    DecimalFormat decForm = new DecimalFormat("0.00"); //creates a decimal template for the decimal values.  
    
    String message = "<html><center><b>------ CAMPUS QUICKSERVE ------</b></center>"
            + "<center><b>Customer: " + myOrder.getCustomerName() + "</b></center>"
            + "<center><b>Student Number: " + myOrder.getStudentNum() + "</b></center>"
            + "<b><br></b>"
            + "<center><b>Item Ordered: " + myOrder.getItemOrdered() + "</b></center>"
            + "<center><b>Quantity: " + myOrder.getQuantity() + "</b></center>"
            + "<center><b>Price per Item: R" + decForm.format(myOrder.getPricePerItem()) + "</b></center>"
            + "<center><b> </b></center>"
            + "<center><b>Subtotal: R" + decForm.format(subtotal) + "</b></center>"
            + "<center><b>Discount Applied: R" + decForm.format(discount) + "</b></center>"
            + "<center><b>VAT (15%): R" + decForm.format(vatAmount) + "</b></center>"
            + "<center><b>Total: R" + decForm.format(totalCost) + "</b></center>"
            + "<b><br></b>"
            + "<center><b> Thank you for your order!</b></center>"
            + "<center><b>-----------------------------------------</b></center></html>";
    JOptionPane.showMessageDialog(null, message);
   }
}
