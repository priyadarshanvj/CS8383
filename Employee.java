import java.util.Scanner;
class Employee
{
    int Emp_id;
    String Emp_name;
    String Mail_Id;
    String Mobile_no;
    Employee(){}
    Employee(int id,String name,String addr,String addr,String mail,String mob)
    {
        this.Emp_id=id;
        this.Emp_name=name;
        this.Address=addr;
        this.Mail_Id=mail;
        this.Mobile_no=mob;
    }
}
class Programmer extends Employee
{
    double BP,Gross_salary,Net_Salary;
    public Programmer(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay()
    {
        System.out.print("Enter Basic Pay.");
        Scanner input=new Scanner(System.in);
        BP=input.nextDouble();
        double DA,HRA,PF,Fund;
        DA=(BP*97/100);
        HRA=(BP*10/100);
        PF=(BP*12/100);
        Fund=(BP*0.1/100);
        Gross_salary=BP+DA+HRA;
        Net_Salary=BP+DA+HRA-(PF+Fund);
        System.out.println("Emp_ID:"+Emp_id);
        System.out.println("Emp_Name:"+Emp_name);
        System.out.println("Address:"+Address);
        System.out.println("Mail_Id:"+Mail_Id);
        System.out.println("Mobile NUmber:"+Mobile_no);
        System.out.println("Gross Pay:"+Gross_salary);
        System.out.println("Net Pay:"+Net_Salary);
    }
}
class Asst_Professor extends Employee
{
    double BP,Gross_salary,Net_Salary;
    public Asst_Professor(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay()
    {
        System.out.print("Enter Basic Pay:");
        Scanner input=new Scanner(System.in);
        BP=input.nextDouble();
        Gross_salary=BP;
        double DA,HRA,PF,Fund;
        DA=(BP*97/100);
        HRA=(BP*10/100);
        PF=(BP*12/100);
        Fund=(BP*0.1/100);
        Net_Salary=BP+DA+HRA-(PF+Fund);
        System.out.println("Emp_Id:"+Emp_id);
        System.out.println("Emp_Name:"+Emp_name);
        System.out.println("Adress:"+Address);
        System.out.println("Mail_Id:"+Mail_Id);
        System.out.println("Moblie Number:"+Mobile_no);
        System.out.println("Gross Pay:"+Gross_salary);
        System.out.println("Net Pay:"+Net_Salary);
    }
}
class Associate_Professor extends Employee
{
    double BP,Gross_salary,Net_Salary;
    public Associate_Professor(int id,String name,String addr,String mail,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay()
    {
        System.out.println("Enter Basic Pay:");
        Scanner input=new Scanner(System.in);
        BP=input.nextDouble();
        Gross_salary=BP;
        double DA,HRA,PF,Fund;
        DA=(BP*97/100);
        HRA=(BP*10/100);
        PF=(BP*12/100);
        Fund=(BP*12/100);
        Net_Salary=BP+DA+HRA-(PF+Fund);
        System.out.println("Emp_ID:"+Emp_id);
        System.out.println("Emp_Name:"+Emp_name);
        System.out.println("Address:"+Address);
        System.out.println("Mail_ID:"+Mail_Id);
        System.out.println("Mobile Number:"+Mobile_no);
        System.out.println("Gross Pay:"+Gross_salary);
        System.out.println("Net Pay:"+Net_Salary);
    }
}
class Professor extends Employee
{
    double BP,Gross_salary,Net_Salary;
    public Professor(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
    }
    void computePay()
    {
        System.out.println("Enter Basic Pay:");
        Scanner input=new Scanner(System.in);
        BP=input.nextDouble();
        Gross_salary=BP;
        double DA,HRA,PF,Fund;
        DA=(BP*97/100);
        HRA=(BP*10/100);
        PF=(BP*12/100);
        Fund=(BP*0.1/100);
        Net_Salary=BP+DA+HRA-(PF-Fund);
        System.out.println("Emp_ID:"+Emp_id);
        System.out.println("Emp_Name:"+Emp_id);
        System.out.println("Adress:"+Address);
        System.out.println("Mail_ID:"+Mail_Id);
        System.out.println("Mobile Number:"+Mobile_no);
        System.out.println("Gross Pay:"+Gross_salary);
        System.out.println("Net Pay:"+Net_Salary);
    }
}
public class PaySlip
{
    public static void main(String[] args) {
        Programmer p=new Programmer(10,"AAA","xxx","aaa_xxx@gmail.com","11111111");
        System.out.println("---------Programmer-----------");
        p.computePay();
        Asst_Professor Ap=new
        Asst_Professor(20,"BBB","yyy","bbb_yyy@gmail.com","22222222222");
        System.out.println("-----Assistant Professor----");
        Ap.computePay();
        Associate_Professor As=new
        Associate_Professor(30,"CCC","zzz","ccc_zzz@gmail.com","333333333");
        System.out.println("--------Associate Professor-------");
        As.computePay();
        Professor pf=new
        Professor(40,"DDD","www","ddd_www@gmail.com","44444444444");
        System.out.println("-------Professor--------");
        pf.computePay();
    }
}
    
