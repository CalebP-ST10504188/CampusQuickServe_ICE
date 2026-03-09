package campusquickserve_ice;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class QuickServeApp {
    
    double subtotal, vatAmount, totalCost;
    Order myOrder = new Order(); 
   
    public QuickServeApp(){
    subtotal = Order.subtotalCalc(myOrder.getQuantity(), myOrder.getPricePerItem());
    vatAmount = Order.vatCalc(subtotal);
    totalCost = Order.totalCalc(subtotal, vatAmount);
    }
    
    
   //Custom method for displaying the receipt
   public void displayOutput(){
       
    DecimalFormat decForm = new DecimalFormat("0.00");   
    
    String message = "<html><center><b>------ CAMPUS QUICKSERVE ------</b></center>"
            + "<center><b>Customer: " + myOrder.getCustomerName() + "</b></center>"
            + "<center><b>Student Number: " + myOrder.getStudentNum() + "</b></center>"
            + "<b><br></b>"
            + "<center><b>Item Ordered: " + myOrder.getItemOrdered() + "</b></center>"
            + "<center><b>Quantity: " + myOrder.getQuantity() + "</b></center>"
            + "<center><b>Price per Item: " + decForm.format(myOrder.getPricePerItem()) + "</b></center>"
            + "<center><b> </b></center>"
            + "<center><b>Subtotal: " + decForm.format(subtotal) + "</b></center>"
            + "<center><b>VAT (15%): " + decForm.format(vatAmount) + "</b></center>"
            + "<center><b>Total: " + decForm.format(totalCost) + "</b></center>"
            + "<b><br></b>"
            + "<center><b> Thank you for your order!</b></center>"
            + "<center><b>-----------------------------------------</b></center></html>";
    JOptionPane.showMessageDialog(null, message);
   }
}
