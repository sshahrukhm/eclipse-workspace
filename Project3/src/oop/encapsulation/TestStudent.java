package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
			
		Students st = new Students();
		st.setStName("Shahrukh");
		st.getStName();
		st.setDob("01-01-00");
		st.getDob();
		
		System.out.println(st.getStName() + " " + st.getDob());
	}

}
