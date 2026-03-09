package campusquickserve_ice;

import javax.swing.JOptionPane;

public class QuickServeApp {
    
    double subtotal, vatAmount, totalCost;
    Order myOrder = new Order(); 
   
    public QuickServeApp(){
    subtotal = Order.subtotalCalc(myOrder.getQuantity(), myOrder.getPricePerItem());
    vatAmount = Order.vatCalc(subtotal);
    totalCost = Order.totalCalc(subtotal, vatAmount);
    }
    
    
   //Custom method for displaying
   public void displayOutput(){         
    String message = "<html><center><b>------ CAMPUS QUICKSERVE ------</b></center>"
            + "<center><b>Customer: " + myOrder.getCustomerName() + "</b></center>"
            + "<center><b>Student Number: " + myOrder.getStudentNum() + "</b></center>"
            + "<center><b> </b></center>"
            + "<center><b>Item Ordered: " + myOrder.getItemOrdered() + "</b></center>"
            + "<center><b>Quantity: " + myOrder.getQuantity() + "</b></center>"
            + "<center><b>Price per Item: " + myOrder.getPricePerItem() + "</b></center>"
            + "<center><b> </b></center>"
            + "<center><b>Subtotal: " + subtotal + "</b></center>"
            + "<center><b>VAT (15%): " + vatAmount + "</b></center>"
            + "<center><b>Total: " + totalCost + "</b></center>"
            + "<center><b> Thank you for your order!</b></center>"
            + "<center><b>--------------------------------</b></center></html>";
    JOptionPane.showMessageDialog(null, message);
   }
}
