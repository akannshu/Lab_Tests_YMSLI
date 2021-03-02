package com.test.question1;

public class StaticBlock {
	private static StaticBlock staticBlock;

	private StaticBlock() {
	}

	static {
		staticBlock = new StaticBlock();
	}

	public static StaticBlock getStaticBlock() {
		return staticBlock;
	}

}