package core_java;

import java.lang.reflect.Constructor;

public class Singleton {

	private static Singleton singleton;

	private static boolean instanceCreated = false;

	private Singleton() {

		//prevent reflection
		if (instanceCreated) {
			throw new IllegalStateException("Instance already created.");
		}
		instanceCreated = true;

	}

	public static synchronized Singleton getInstatnce() {

		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;
	}

	public static void main(String[] args) throws Exception {

		Singleton singleton1 = Singleton.getInstatnce();

		System.out.println(singleton1);

		Singleton singleton2 = Singleton.getInstatnce();

		System.out.println(singleton2);

		Singleton singleton3 = null;

		// using reflection to access private constructor we can break singleton pattern
		Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();

		declaredConstructor.setAccessible(true);

		singleton3 = declaredConstructor.newInstance();

		System.out.println(singleton3);

	}

}
