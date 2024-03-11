
public class CustomerAcc {
	
	private int id;
	private String name;
	private char gender;
	
	public CustomerAcc(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s(%d)", name, id);
	}
}
