package generlisation_Class_Work;
public class Calling extends SBI {
	public static void main(String[] args) {
		System.out.println(RBI.Name);
		System.out.println(RBI.HeadOffice);
		System.out.println(RBI.ATM);
		System.out.println(RBI.FD);
		Implementationclass i = new Implementationclass();
		i.Insurance();
		i.Account();
		i.Loan();
		System.out.println("RBI BANK RULES");
		System.out.println("==================================================================");
		SBI s = new SBI();
		System.out.println(s.Name);
		System.out.println(s.HeadOffice);
		System.out.println(s.ATM);
		System.out.println(s.FD);
		s.Insurance();
		s.Account();
		s.Loan();
		System.out.println("THANK YOU FOR VISITING SBI BANK");
		System.out.println("==================================================================");
		HDFC h = new HDFC();
		System.out.println(h.Name);
		System.out.println(h.HeadOffice);
		System.out.println(h.ATM);
		System.out.println(h.FD);
        h.Insurance();
		h.Account();
		h.Loan();
		System.out.println("THANK YOU FOR VISITING HDFC BANK ");
		System.out.println("==================================================================");
		Kotak k = new Kotak();
		System.out.println(k.Name);
		System.out.println(k.HeadOffice);
		System.out.println(k.ATM);
		System.out.println(k.FD);
        k.Insurance();
		k.Account();
		k.Loan();
		
		
		
		System.out.println("THANK YOU FOR VISITING Kotak BANK");
	
		System.out.println("==================================================================");

		
		
		
		
	}

}
