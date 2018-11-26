  public class Client { 
  
 
  	public static void main(String[] args) { 
  		ICICIBank bank = new ICICIBank(); 
  		 try{
 		System.out.println(bank.createAccount(101,4500));
 		System.out.println(bank.createAccount(102,550));
 		}
  		 catch(InsufficientOpeningBalanceexception iobe)
  		 {
 		System.out.println("invalid opening balance");
  		 }
 		try 
  		{ 
 			System.out.println("Balance = "+bank.withdrawAmount(101, 2000)); 
 		}catch(InvalidAccountNumberException i) 
  		{ 
 			System.out.println("Invalid account number "); 
 		} 
 		catch(InsufficientBalanceException ibe){ 
			System.out.println("insufficient balance"); 
		} 
 		
 		try{
 			System.out.println(bank.DepositeAmount(101, 500));
 		}
 		catch(InvalidAccountNumberException i) {
 		
 		System.out.println("invalid accountnumber");
  	} 
  
 } 
  }
  }
  }
  }
  }