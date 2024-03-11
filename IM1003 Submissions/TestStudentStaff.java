

public class TestStudentStaff {

	public static void main(String[] args) {
		Person p1 = new Person("John Low","123 Avenue 3");
		System.out.println(String.format("Name:%s, Address:%s, P:"+p1,p1.getName(),p1.getAddress()));
		p1.setAddress("321 Street 5");
		System.out.println(p1.getAddress() + " is the new address.");
		
		Student mike = new Student("Michael Afton","FNAF","Law",1987,200.10);
		System.out.println(String.format("Name:%s,"
										+ "Address:%s,"
										+ "Program:%s,"
										+ "Year:%d,"
										+ "Fee:%g",
										mike.getName(),mike.getAddress(),mike.getProgram(),mike.getYear(),mike.getFee()));
		mike.setProgram("Crime");
		mike.setFee(10.15);
		mike.setYear(1983);
		System.out.println(mike);
		
		Staff will = new Staff("Will.i.am","IDK BRO","Florida or smt",1000.2);
		System.out.println(String.format("Name:%s,"
										+ "Address:%s"
										+ "School:%s"
										+ "Pay:%g",
										will.getName(),will.getAddress(),will.getSchool(),will.getPay()));
		will.setSchool("Fuck it NUS");
		will.setPay(50.3);
		System.out.println(will);
	}

}
