package hospital;

public class Janitor extends Employee implements Sweeping{

	public Janitor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public boolean isSweeping(boolean sweeping) {
		if (sweeping) {
			return true;
		}
		return false;
	}

	@Override
	public void sweeping() {
		// TODO Auto-generated method stub
		
	}

//	public boolean isSweeping(boolean sweeping) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
