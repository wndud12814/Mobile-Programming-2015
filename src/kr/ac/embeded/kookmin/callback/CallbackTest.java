package kr.ac.embeded.kookmin.callback;

public class CallbackTest implements OnMaxNumberCb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbackTest callTest = new CallbackTest();
		Sum total = new Sum();
			
		total.setMaxNumber(40);
		total.setOnMaxNumberCb(callTest);
		
		for ( int i=1; i<=11; i++) {
			total.addNumber(i);//66���� ����
		}
		
		System.out.println("Total is" + total.getTotal());
	}

	@Override
	public void onMaxNumber(int number, int exceed) {
		// TODO Auto-generated method stub
		// �����Ͻÿ� //
		System.out.println("Current sum is "+ number+" and exceeds "+exceed);
	}
	

}
