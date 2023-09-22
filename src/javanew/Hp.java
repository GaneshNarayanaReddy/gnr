package javanew;

public class Hp implements Laptop {

	@Override
	public void copy() {
		System.out.println("hp copy the code");
	}

	@Override
	public void paste() {
		System.out.println("hp paste the code");
	}

	@Override
	public void cut() {
		System.out.println("hp cut the code");
	}

	@Override
	public void capture() {
		System.out.println("hp capture the code");
		
	}

}
