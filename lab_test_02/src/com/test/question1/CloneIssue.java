package com.test.question1;

class LazyClone implements Cloneable {
	private static LazyClone lazyClone;

	private LazyClone() {}

	public static LazyClone getLazyClone() {
		if (lazyClone == null) {
			lazyClone = new LazyClone();
		}
		return lazyClone;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return lazyClone;
	}
}

public class CloneIssue {
	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		
		LazyClone instance = LazyClone.getLazyClone();
		LazyClone cloneInstance = (LazyClone) instance.clone();
		
		System.out.println("hashCode of instance 1 - " + instance.hashCode());
		System.out.println("hashCode of instance 2 - " + cloneInstance.hashCode());
	}

}