package COMPANY;

public class Main {

	public static void main(String[] args) {
		
		Company a = new SmallCompany();
		Company b = new BigCompany();
		
		System.out.println("\n\n-----------------------            INITIAL STATE          ---------------------------------");
		
		System.out.println("\n\t\t>>>>>>>>>>>>  To SmallCompany     >>>>>>>>");
		
		a.PerformContractType();
		a.PerformTaxesPayment();
		
		System.out.println("\t\t>>>>>>>>>>>>>>>      END     >>>>>>>>>>>>>>>");
		
		System.out.println("\n\t\t>>>>>>>>>>>>  To BigmallCompany     >>>>>>>");
		
		b.PerformContractType();
		b.PerformTaxesPayment();
		
		System.out.println("\t\t>>>>>>>>>>>>>>>       END       >>>>>>>>>>>>>>");
		
		
		
		System.out.println("\n\n-----------------------           WITH CHANGES	         ---------------------------------");
		
		System.out.println("\n\t\t>>>>>>>>>>>>  To SmallCompany     >>>>>>>>");
		
		a.setContracting( new DirectContract() );
		a.setPay(  new PayCash()   );
		
		a.PerformContractType();
		a.PerformTaxesPayment();
		
		System.out.println("\t\t>>>>>>>>>>>>>>>      END     >>>>>>>>>>>>>>>");

		System.out.println("\n\t\t>>>>>>>>>>>>  To BigmallCompany     >>>>>>>");
       
		b.setContracting( new  OutsContract());
		b.setPay( new PayLoans());
		
		b.PerformContractType();
		b.PerformTaxesPayment();
		
		System.out.println("\t\t>>>>>>>>>>>>>>>       END       >>>>>>>>>>>>>>");

	}

}
