package inheritanceDemo;

public class ParentABC {
	
	int a;
	String n;
	
	ParentABC(){
		
		System.out.println("Default parent constructor");
	}

	ParentABC(int a, String n){
		super();
		System.out.println("Parametrised parent constructor");
		
	}
}
