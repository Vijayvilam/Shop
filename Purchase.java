//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : @Retail Store
//  @ File Name : @Purchase.java
//  @ Date : @14/09/2018
//  @ Author : @Vijayakumar
//
//




public class Purchase
{
	boolean Grocery;
  public Object Orderid;
  public Object CustId;
  float BillAmt,finalAmt,Amount,Deduction,GroceryAmt;
  public void Discount()
  {
  // EMPLOYEE
        if (CustId.ID<10000)
           BillAmt=  GenerateBill() ;
               finalAmt = BillAmt*30/100;
        // Affiliate
        if (CustId.ID>50000 && CustId.ID<100000 )
           BillAmt=  GenerateBill(); 
               finalAmt = BillAmt*10/100;
        //2Years Customer
        if (CustId.ID>100000 )
           BillAmt=  GenerateBill(); 
               finalAmt = BillAmt*5/100;
        
  }
  
  public float GenerateBill()
  {
            if (Grocery)
            Amount = Amount - GroceryAmt;

           if (Amount > 100)
            Deduction = Amount % 100;
           Amount = Amount - Deduction;

        return Amount;
  
  }
}
