package javanew;


public interface Laptop {
	void copy();
	void paste();
	void cut();
	void capture();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenovo lenovo= new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.cut();
		lenovo.capture();
		Hp hp= new Hp();
		hp.paste();
		hp.copy();
		hp.cut();
		hp.capture();
		
	}

}
