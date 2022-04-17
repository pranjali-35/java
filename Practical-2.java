/*Write a Java Program to demonstrate the working of a banking-system  
Instance variables: name, account_no, amount  
Instance methods:  deposit(), withdraw(), checkBalance(), insert() and display().
Here we can deposit and withdraw amount from our account using deposit() and withdraw() methods respectively.
The insert() method is to initialize state and display() method is to display state values.
*/

import java.util.*;
	class Bank{
		String name;
		int account_no,amount;
	

		void insert(String a,int b,int c){
		   name=a;
		   account_no=b;
		   amount=c;
		}
	
		void deposit(int d){
		   amount+=d;
		}

		void withdraw(int w){
		   if(w<amount){
		      amount-=w;
		   }else{
		      System.out.println("ERROR!!!");
		   }
		}
    
		void checkBalance(){
		   System.out.println("Balace: "+amount);
		}
	
		void display(){
		   System.out.println("Name: "+name);
		   System.out.println("Acc No.: "+account_no);
		   System.out.println("Amount: "+amount);
		}
	
		public static void main(String args[]){
      Bank st= new Bank();
			Scanner in= new Scanner(System.in);
			System.out.println("Enter 1. To Enter details \n\t2.To deposit Amount\n\t3.To Withdraw amount\n\t4.To Check balance\n\t5.To display all details\n\t6.To Exit"); 
			System.out.println("Enter Your Choice: ");
			int ch=in.nextInt();
			do
			{
				if(ch==1)
				{
					System.out.println("Enter the name of the acc holder: ");
					String s=in.next();
	
					System.out.println("Enter the acc no.: ");
					int ac=in.nextInt();
	 				in.nextLine();
	
					System.out.println("Enter the amt: ");
					int u=in.nextInt();
	        		st.insert(s,ac,u); 
				}else if(ch==2){
	        System.out.println("Enter the Deposit Amount");
					int da=in.nextInt();
					st.deposit(da);
				}else if(ch==3){
					System.out.println("Name of Withdraw Amount");		
					int wa=in.nextInt();
					st.withdraw(wa); 
        }else if(ch==4){	
					st.checkBalance();
				}else if(ch==5){
					st.display(); 
				}else{
					System.out.println("Enter a Valid Choice!!!!");
				}System.out.println("Enter Your Choice:");
				ch=in.nextInt();
			}while(ch!=6);
    }
  }
