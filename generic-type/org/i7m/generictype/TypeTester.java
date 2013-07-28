package org.i7m.generictype;

import java.io.PrintStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class TypeTester implements Runnable {

	public static void main(String[] args) {
		new TypeTester("instance", new GenericType<Monitor>()).run();
		new TypeTester("subtype", new GenericType<Monitor>() {
		}).run();
	}

	private final String experimentName;

	private final GenericType<?> object;

	public TypeTester(String experimentName, GenericType<?> object) {
		this.experimentName = experimentName;
		this.object = object;
	}

	@Override
	public void run() {
		PrintStream out = System.out;
		out.append(experimentName).append(": ");

		Type t = object.getClass().getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) t;
			out.println(Arrays.asList(pt.getActualTypeArguments()));
		} else {
			out.println("no type information available");
		}
	}

}
