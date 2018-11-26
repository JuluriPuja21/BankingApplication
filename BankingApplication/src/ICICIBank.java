import java.util.LinkedList; 
  
 
 public class ICICIBank { 
 	 
 	 
  	LinkedList<Account> accounts=new LinkedList<>(); 
 	 
  	 
  	public String createAccount(int accountNumber,int amount) 
  	{ 
  		Account account = new Account(accountNumber,amount); 
  		 
 		accounts.add(account); 
	 
 		return "account created successfully"; 
		} 
  	 
  	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException 
  	{ 
 		 
  		for(Account account : accounts) 
  		{ 
  			if(account.getAccountNumber()==accountNumber) 
  			{ 
  				return account; 
  			} 
  		} 
  		throw new InvalidAccountNumberException(); 
 		 
 	} 
  	public int DepositeAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
    {
        Account account=searchAccount(accountNumber);
        
        if((account.getAmount()+amount)>=0)
        {
            account.setAmount(account.getAmount()+amount);
            return account.getAmount();
        }
        
        throw new InsufficientBalanceException();
    }
 	 
	 public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException 
 	{ 
 		Account account=searchAccount(accountNumber); 
  		 
  		if((account.getAmount()-amount)>=0) 
  		{ 
  			account.setAmount(account.getAmount()-amount); 
  			return account.getAmount(); 
  		} 
  		 
  		throw new InsufficientBalanceException(); 
  	}  
	 
	 public int FunderTransfer(int i,int j, int k) throws InsufficientBalanceException, InvalidAccountNumberException
	  {
	      Account account1=searchAccount(i);
	      Account account2=searchAccount(j);
	      
	      if((account1.getAmount()-k>=0))
	      {
	          account1.setAmount(account1.getAmount()-k);
	          account2.setAmount(account2.getAmount()+k);
	          return account1.getAmount();
	      }
	          throw new InsufficientBalanceException();
	  }

 
  } 