package myJava;

public class OuterObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass out = new OuterClass();
		OuterClass.innerClass in = out.new innerClass();
		
		out.display();
		in.display();
		out.innerFunc();

	}

}
