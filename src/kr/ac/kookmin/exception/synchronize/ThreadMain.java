package kr.ac.kookmin.exception.synchronize;

public class ThreadMain {
	static Datacount dc;

	public static void main(String arg[]) throws InterruptedException {
		ThreadMain tm = new ThreadMain();
		dc = new Datacount();

		tm.start();

		Thread.sleep(10);

		synchronized(/*  Coding here  */) {
			while(dc.getCnt() < 10) {
				dc.addCnt();
			}
			/*  Coding here  */;
		}
	}
	public void run() {
		dc.addCntUntil3();
	}	

}
