class Books{
	private int pageNo;
	public void setPageNo(int x) { 
		if(x<0)
			System.out.println("Invalid input to page Number");
		else
			pageNo = x;
	} 
	public int getPageNo() { return pageNo;}
}

public class LaunchEncap {

	public static void main(String[] args) {
		Books b;
		b = new Books();
		b.setPageNo(-100);
		System.out.println(b.getPageNo());

	}

}
