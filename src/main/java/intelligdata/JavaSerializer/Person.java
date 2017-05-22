package intelligdata.JavaSerializer;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String lanme;
	String fname;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String lanme, String fname) {
		super();
		this.lanme = lanme;
		this.fname = fname;
	}
	@Override
	public String toString(){
		return lanme+" "+fname;
	}
}
