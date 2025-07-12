package com.practice.programes;

@FunctionalInterface
interface FunctionalInterfff {
	 abstract void run();
	

	}

 class FunctionalInterfacee{
    public static void main(String[] args) {
		FunctionalInterfff obj = ()
				->{
					System.out.println("run method running");
		};
		obj.run();
		
	
	
		
	}
		
	}



