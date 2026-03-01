interface Account 
{
	double minBalance=500.0;
	double CalculateBalance( );
}
interface Loan
{
	double calculateEMI( );
}
class customer implements Account,Loan
{
	String accountHolder,accountNumber;
	double currentBalance,loanAmount,annualIntersetRate;
	int loanTenureMonths;
	customer(String accountHolder,String accountNumber,doule currentBalance,double loanAmount,double annualInteresRate,int loanTenureMonths)
	{
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.currentBalance=currentBalance;
		this.loanAmount=loanAmount;
		this.annualInterestRate=annualInterestRate;
		ths.loanTenureMonths=loanTenureMonths;
	}
	public void CalculateBalance( )
	{
		if (currentBalance < minBalance)
		{
			System.out.println("Warning :  Balance below minimum required balance of " +minBalance);
		}
		return currentBalance;
	}
	public void CalculateEMI ( )
	{
		double monthlyInterestRate=( annualInterestRate / 12 ) * 100;
		double emi = (loanAmount * monthlyInterestRate * math.pow(1 + monthlInterestRate,loanTenureMonths)) / (math.pow(1 + monthlyInterestRate,loanTenureRate) - 1);
		return emi;
	}
	void DisplayCustomerDetails( )
	{
		System.out.println("Customer Name : "+accountHolder);		
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Current Balance : "+CurrentBalance( ));
		System.out.println("Minimum Balance required : "+minBalance);
		System.out.println("Loan Amount :" +loanAmount);
		System.out.println("Tenure (Months) :" +loanTonureMonths);
		System.out.println("Annual Interest Rate :"+annualInterestRate);
		System.out.println("Calculated EMI : "+CalculateEMI( ));
	}
}
class 	InterfaceDemo 
{
	public static void main(Strings[ ] args)
	{
		customer cust=new customer ("krishna","ACC247",4000.0,50000.0,8.5,24);
		cust.DisplayCustomerDetails( );
	}
}









	