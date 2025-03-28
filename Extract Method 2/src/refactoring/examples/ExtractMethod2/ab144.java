package refactoring.examples.ExtractMethod2;

//class Source {
//	private int local = 15;
//	void method(Target target){
//		target.doSomething();
//		System.out.println("Executing source method with " + local);
//	}
//}
//
//class Target {
//	void doSomething() {
//		System.out.println("Executing target code");
//	}
//}

class SuperSource {
	  void m() {}
	}

class Source extends SuperSource {
	  Target t;
	  
	  public void m() {
		t.m();
	}
	}

class Target {

	public void m() {}
	}


