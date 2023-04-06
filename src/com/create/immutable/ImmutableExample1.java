package com.create.immutable;

final class ImmutableExample1 {
	
	private int i;
	
	public ImmutableExample1(int i) {
		
		this.i = i;
	}

	public ImmutableExample1 modify(int i)
	{
		if(this.i==i)
			return this;
		else
			return new ImmutableExample1(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableExample1 example1 = new ImmutableExample1(10);
		ImmutableExample1 example12 = example1.modify(10);
		
		System.out.println(example1);
		System.out.println(example12);

	}

}
