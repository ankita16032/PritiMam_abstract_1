package abstract_1;

abstract class Animal {
	final int legs = 4;

	abstract public void sound();

	abstract public void fun();

	abstract public void fun1();

	public void classInfo(String type) {
		System.out.println("I belong to " + type + " has " + legs + "legs");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("The  dog barks....");
	}

	public void fun() {
		System.out.println("This is fun");
	}

	public void fun1() {
		System.out.println("This is fun1");
	}

}

class Lion extends Animal {
	public void sound() {
		System.out.println("The  Lion roar....");
	}

	public void fun() {
		System.out.println("This is fun");
	}

	public void fun1() {
		System.out.println("This is fun1");
	}

}

public class TestAnimal {

	public static void main(String[] args) {
		Dog tommy = new Dog();
		tommy.classInfo("Dog");
		tommy.sound();
		tommy.fun();
		tommy.fun1();
		System.out.println("----------------------------------");
		Lion simba = new Lion();
		simba.classInfo("Lion");
		simba.sound();
		simba.fun();
		simba.fun1();
	}
}
