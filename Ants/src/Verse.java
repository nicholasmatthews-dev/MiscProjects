
public class Verse {
	private String antNum;
	private String action;
	
	public Verse (String num, String act) {
		antNum = num;
		action = act;
	}
	
	public void print() {
		System.out.println("The ants go marching "+antNum+" by "+antNum+", hurrah, hurrah");
		System.out.println("The ants go marching "+antNum+" by "+antNum+", hurrah, hurrah");
		System.out.println("The ants go marching "+antNum+" by "+antNum);
		System.out.println("The little one stops to "+action);
		System.out.println("And they all go marching down to the ground");
		System.out.println();
	}
}
