package COMPANY;

public abstract class Company {
		
		Contract  contracting;
		Pay  payment;
		
		public Company() {
			
		}

		public void setContracting(Contract a) {
			this.contracting = a;
		}
		
		public void setPay(Pay a) {
			this.payment = a;
		}
		
		public void PerformContractType() {
			this.contracting.WayToContract();
		};
		
		public void PerformTaxesPayment() {
			this.payment.WayToPay();
		};
		
}
