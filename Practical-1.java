/*Create a class “Student” having following instance variables and methods.
Instance variables: ID, Name, Branch and university
Method: setDetails() and showDetails().
The setDetails() method sets the values of ID, Name, Branch and University.
And showDetails() method shows the value of each field.
*/

class Student{
    int ID;
    String Name,Branch,University;

    void setDetails(int r,String a,String b,String c){
       ID= r;
       Name= a;
       Branch= b;
       University= c;
	}

	void showDetails(){
	    System.out.println(ID);
	    System.out.println(Name);
	    System.out.println(Branch);
	    System.out.println(University);
	}

	public static void main(String args[]){
	     Student s=new Student();
	     int r= Integer.parseInt(args[0]);
	     s.setDetails(r,args[1],args[2],args[3]);
	     s.showDetails();
	}
}
