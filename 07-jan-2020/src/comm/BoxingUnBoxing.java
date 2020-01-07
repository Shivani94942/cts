package comm;

public class BoxingUnBoxing {
	private Integer wInt;
	private int pInt;
	public BoxingUnBoxing(Integer wInt, int pInt) {
		super();
		this.wInt = wInt;
		this.pInt = pInt;
	}
	@Override
	public String toString() {
		return "BoxingUnboxingDemo [wInt=" + wInt + ", pInt=" + pInt + "]";
	}
	
	public void display()
	{
		int tempP=wInt;//auto unboxing
		Integer tempW=pInt;//auto boxing
		System.out.println(this);
		System.out.printf("After Auto Boxing/unboxing: %d %d ",wInt,pInt);
	}
	
	
}