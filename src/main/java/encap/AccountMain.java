package encap;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a =new Account();
		
		a.setAcctno(1010);
		System.out.println(a.getAcctno());
		a.setAcctname("NNNN");
		System.out.println(a.getAcctname());
		a.setAmt(8888);
	System.out.println(a.getAmt());
	}

}
