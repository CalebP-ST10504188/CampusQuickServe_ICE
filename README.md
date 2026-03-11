**1.Project Name:** 
Campus QuickServe (CampusQuickServe_ICE)

**2.Problem Description:**
I was hired by a small campus food vendor called Campus QuickServe. They wanted a small Java Prototype application that takes customer details, takes an order,
calculates a total, displays a formatted receipt using a GUI output, and which demonstates basic OOP principles. 
They did not want a console-only program, they wanted a GUI-based interaction using JOptionPane. They also wanted the system to be structured properly using 
classes and methods (not everything inside the main file).

**3.Program Structure:**
I created two classes: "Order" and "QuickServeApp".

The Order Class contains the bulk of the methods, consisting of:
* Order (A constructor method that runs the Input JOptionPane dialogs and assigns the inputs to variables)
* Getter methods (To be able to read variables in other classes)
* discountCalc method (Determines whether the discount is valid and how much it should be before VAT)
* subtotalCalc method (Multiplies the quantity of items ordered with the price per item)
* vatCalc method (Determines how much VAT must be added)
* totalCalc method (Adds together the subtotal and VAT)

The QuickServeApp Class contains predominantly GUI Output methods, consisting of:
* QuickServeApp (A constructor method that runs all the getter methods from the Order Class)
* displayOutput method (Custom-made method for displaying the receipt)

**4.How I Approached the Problem:**
I began by creating an intital project set-up, with just a main file and an empty created class (Order). 
I then implemented a constructor method for the Order Class with JOptionPane dialogs for input, as well as methods subtotalCalc and VatCalc for 
calculation purposes.
Following that I created getters so as to be able to access the variables set in the Order Class from the QuickServeApp Class, as well as 
creating full input functionality using (JOptionPane.ShowInputDialog). Near full calculation logic was then added, with methods to calculate the 
subtotal (subtotalCalc), the vat amount (vatCalc), and the total combining the subtotal and vat amounts (totalCalc).
On my next commit I used HTML code for formatting purposes to create the displayOutput method in the QuickServeApp class. 
and I imported java.text.DecimalFormat for more formatting purposes.
For my final functionality commit, I implemented the discount calculation method fully, and modified the output to include the discount value,
and added more comments for code explanation means.

**5. OOP Concepts Used**
Classes vs objects: The Order Class is defined with it's various methods and an object being called in the QuickServeApp Class, but is predominantly 
used calculation methods and for calling the variables across to the QuickServeApp Class. The QuickServeApp Class is used for formatting and outputting 
the GUI receipt, with an object of it being called in the main file for execution at runtime.

Encapsulation: All the getter methods within the Order Class were set to private for protective purposes.

Constants: The VAT rate was set as a constant because it is unlikely to change within the next few years.

Methods: 
The Order Class contains the bulk of the methods, consisting of:
* Order (A constructor method that runs the Input JOptionPane dialogs and assigns the inputs to variables)
* Getter methods (To be able to read variables in other classes)
* discountCalc method (Determines whether the discount is valid and how much it should be before VAT)
* subtotalCalc method (Multiplies the quantity of items ordered with the price per item)
* vatCalc method (Determines how much VAT must be added)
* totalCalc method (Adds together the subtotal and VAT)

The QuickServeApp Class contains predominantly GUI Output methods, consisting of:
* QuickServeApp (A constructor method that runs all the getter methods from the Order Class)
* displayOutput method (Custom-made method for displaying the receipt)


Screenshot Showing what the GUI output appears like:
<img width="327" height="408" alt="image" src="https://github.com/user-attachments/assets/264bb1c3-5421-44e6-9356-ac5d167a865a" />





