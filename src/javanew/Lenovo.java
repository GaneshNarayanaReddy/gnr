package javanew;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("lenovo copy the code");		
	}

	@Override
	public void paste() {
		System.out.println("lenovo paste the code");
	}

	@Override
	public void cut() {
		System.out.println("lenovo cut the code");		
	}

	@Override
	public void capture() {
		System.out.println("lenovo capture the code");		
	}

}
