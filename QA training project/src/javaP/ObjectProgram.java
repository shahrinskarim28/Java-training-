package javaP;

public class ObjectProgram {
	ObjectProgram()
	{
		System.out.println("This will exceute with the object ");
	}
	
	
	void executeCode()
	{
		System.out.println("Excuting Code");
	}

	boolean displayOutput()
	{
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectProgram obj= new ObjectProgram();
		obj.executeCode();
		
		System.out.println(obj.displayOutput());		
	}

}
