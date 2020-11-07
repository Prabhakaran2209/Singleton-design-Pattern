package Practice;

public class singleton {
	
	//In OOPS, a singleton class is a class that can have only one object at a time (instance of class)
	//How to design singleton class:
	//Make constructor as private
	//create a public static method (get instance) that has return type of object of this singleton class 
	//(Lazy initialisation)
	//Diff btw normal class and singleton class
	//Normal class we use constructor (n num of constructor and objects)
	//Singleton class we use getinstance() method for instansiation 
	
	private static singleton singleton_instance = null;
	public String str;
	
	private singleton() {
		str = "I am learning singleton";
	}
	
	public static singleton singleton_method() {
		if (singleton_instance == null) {
			singleton_instance = new singleton();
		}
		return singleton_instance;
	}
	

	public static void main(String[] args) {
		singleton x = singleton.singleton_method();
		singleton y = singleton.singleton_method();
		singleton z = singleton.singleton_method();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		System.out.println(z.str);
		System.out.println(x.str);
		
	}

}
