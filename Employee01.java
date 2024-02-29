package Week03;

public class Employee01 {
	String empName;
	int empNo;
	String empDesig;
	byte expYrs;
	double basicSalary;
	double netSalary;
	double grossSalary;
	double dearnessAllowance;
	double HRA;
	double PA;
	double IT;
	Employee01()
	{
		empName=null;
		empNo=0;
		empDesig=null;
		expYrs=0;
		basicSalary=0.0d;
	}
	Employee01(String name,int no,String des,byte ex,double basicsalary)
	{
		empName=name;
		empNo=no;
		empDesig=des;
		expYrs=ex;
	    basicSalary=basicsalary;
	}
	Employee01(Employee01 obj1,Employee01 obj2)
	{
		empName=obj1.empName;
		empNo=obj2.empNo;
		empDesig=obj1.empDesig;
		expYrs=obj2.expYrs;
		basicSalary=obj2.basicSalary;
	}
	void getEmployee1()
	{
		dearnessAllowance=basicSalary*0.40;
		HRA=basicSalary*0.25;
		PA=basicSalary*10;
		grossSalary=basicSalary+dearnessAllowance+HRA+PA;
		
		IT=basicSalary*10;
		netSalary=grossSalary-IT;
		
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t\t"+expYrs+"\t\t"+basicSalary+"\t\t"+grossSalary+"\t\t"+netSalary);
	}
	public static void main(String[] args) {
		System.out.println("empName\tempNo\tempDesig\texpYrs\t\tbasicSalary\tgrossSalary\tnetSalary");
		Employee01 rakesh=new Employee01();
		rakesh.getEmployee1();
		Employee01 rahul=new Employee01("Rahul",100,"PM",(byte)10,10000.0d);
		rahul.getEmployee1();
		Employee01 ramya=new Employee01(rakesh,rahul);
		ramya.getEmployee1();
	}

}
