package CISC181.Q3;

public class triangleException extends Exception {
	private Triangle t;
	public triangleException(Triangle t){
		super();
		this.t=t;
	}

}
