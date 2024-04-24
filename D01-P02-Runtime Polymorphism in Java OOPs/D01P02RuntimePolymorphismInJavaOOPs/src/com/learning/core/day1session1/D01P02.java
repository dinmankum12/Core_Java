package com.learning.core.day1session1;

//Interface to represent a drug
interface MedicineInfo {
 void displayLabel();
}

//Implementing interface with different medicine classes
class Tablet implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Store Tablets in a cool dry place.");
 }
}

class Syrup implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Syrup is consumable only on prescription.");
 }
}

class Ointment implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Ointment is for external use only.");
 }
}

//TestClass to demonstrate polymorphic behavior
public class D01P02 {
 public static void main(String[] args) {
     // Declare Medicine instances
     MedicineInfo medicine1 = new Tablet();
     MedicineInfo medicine2 = new Syrup();
     MedicineInfo medicine3 = new Ointment();
     
     // Check polymorphic behavior of displayLabel method
     medicine1.displayLabel();
     medicine2.displayLabel();
     medicine3.displayLabel();
 }
}
