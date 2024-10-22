/*
 * Q2) Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information.
 */

class patient extends Exception
{
	
	String pname;
	int age,ol,hrct;
	patient(String pname,int age,int ol,int hrct) throws Exception 
	{
		this.pname=pname;
		this.age=age;
		this.ol=ol;
		this.hrct=hrct;
		
		if(ol>95 && hrct>10)
		{
			throw new Exception("Patient is Covid Positive(+)");
		}
		else
		{
			System.out.println("Name "+pname);
			System.out.println("Age "+age);
			System.out.println("Oxygen level "+ol);
			System.out.println("Hrtc "+hrct);
		}
	}
	
}
public class Slip_03_Q2 
{
	public static void main(String[] args) throws Exception 
	{
		patient ob=new patient("om", 20, 79, 8);
		patient ob1=new patient("om", 20, 99, 18);
	}
}


/*
 * Name om
Age 20
Oxygen level 79
Hrtc 8
Exception in thread "main" java.lang.Exception: Patient is Covid Positive(+)
	at patient.<init>(Slips_03_Q2.java:21)
	at Slips_03_Q2.main(Slips_03_Q2.java:38)

 */

