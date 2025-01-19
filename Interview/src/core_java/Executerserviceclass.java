package core_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executerserviceclass {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(2);

		ex.submit(() -> {

			System.out.println("Task 1");

		});

		ex.submit(() -> {

			String str = "Hello";
			char ch;

			String rev = "";

			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				rev = ch + rev;
			}
			System.out.println(rev);

		});

		ex.submit(() -> {

			System.out.println("Task 3");

		});

		ex.shutdown();

	}

}
