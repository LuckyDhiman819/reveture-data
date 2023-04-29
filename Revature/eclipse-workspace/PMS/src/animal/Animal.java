package animal;

abstract public class Animal implements allMethod {
	
	String Picture;
	String foode;
	String hunger;
	String bounderies;
	String location;
	
	public abstract void makeNoise();
	
	public abstract void eat();
	public void sleep() {
		System.out.println("Aimal is sleeping right now");
	};
	
	public abstract  void roam();
	
	
}
