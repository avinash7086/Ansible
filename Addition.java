import java.lang.String;
import java.lang.System;
class EmpData //SubClass
{
   String empId,empName,empDesg;
   void getEmpData()
	{
System.out.println("EmpId="+empId);
System.out.println("EmpName="+empName);
System.out.println("EmpDesg="+empDesg);
	}
}
class EmpAddress //SubClass
{
	String hNo,sName,city;
	int pinCode;
    void getEmpAddress()
	{
System.out.println("HNO="+hNo);
System.out.println("sName="+sName);
System.out.println("City="+city);
System.out.println("PinCode="+pinCode);
	}
}
class EMainClass //MainClass
{
	public static void main(String[] args) 
	{
EmpData ed = new EmpData();
EmpAddress ea = new EmpAddress();
 
ed.empId = "A121";
ed.empName = "Raj";
ed.empDesg = "SE";
 
ea.hNo = "12-23/h";
ea.sName = "SR Nagar";
ea.city = "HYD";
ea.pinCode = 612345;
 
ed.getEmpData();
ea.getEmpAddress();
	}
}
