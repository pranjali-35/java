import java.util.Scanner;
class Account{
    int acc_no;
    String name;
    float amt;
    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number : ");
        acc_no = sc.nextInt();
        System.out.println("Enter account holder's name : ");
        name = sc.next();
        System.out.println("Enter amount : ");
        amt = sc.nextFloat();
    }
    
    void checkBalance(){
        System.out.println("Amount : "+amt);
    }
    
    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you want to deposit : ");
        amt = amt + sc.nextInt();
    }
    
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you want to withdraw : ");
        float a = sc.nextInt();
        if(a > amt)
            System.out.println("Error!!");
        else
            amt = amt - a;
    }
    
    void display(){
        System.out.println("Account number : "+acc_no);
        System.out.println("Account holder's name : "+name);
        System.out.println("Amount : "+amt);
    }
    
    public static void main(String args[]){
        Account st = new Account();
        int choice = 1;
        while(choice){
            System.out.println("Enter your choice : 0.Exit\n1.Insert details\n2.Check balance\n3.Deposit\n4.Withdraw\n5.Display details\n");
            //input value of choice
            switch(choice){
                case 1:
                    st.insert();
                    break;
                case 2:
                    st.checkBalance();
                    break;
                case 3:
                    st.deposit();
                    break;
                case 4:
                    st.withdraw();
                    break;
                case 5:
                    st.display();
                    break;
                default:
                    System.out.println("Invalid choice\n");
            } 
        }
    }
}
