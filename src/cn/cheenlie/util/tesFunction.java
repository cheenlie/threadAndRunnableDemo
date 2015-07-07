package cn.cheenlie.util;

public class tesFunction {
	
	//①实现Thread
//	public static void main(String[] args){
//		MultiThread1 t1=new MultiThread1("window1");
//		MultiThread1 t2=new MultiThread1("window2");
//		MultiThread1 t3=new MultiThread1("window3");
//		t1.start();
//		t2.start();
//		t3.start();
//	}
	//②实现runnable接口
	public static void main(String[] args){
		MultiThread1 t1=new MultiThread1("window1");
		MultiThread1 t2=new MultiThread1("window2");
		MultiThread1 t3=new MultiThread1("window3");
		t1.start();
		t2.start();
		t3.start();
	}
	
	//③共享变量
//	public static void main(String[] args) {
//		MultiThread multiThread = new MultiThread();
//		Thread thr1 = new Thread(multiThread, "window1");
//		Thread thr2 = new Thread(multiThread, "window2");
//		Thread thr3 = new Thread(multiThread, "window3");
//		thr1.start();
//		thr2.start();
//		thr3.start();
//	}

}



//①实现Thread
class MultiThread1 extends Thread {
	private int tickets = 6;

	public MultiThread1(String name) {
		super(name);
	}

	public void run() {
		while (tickets > 0) {
			System.out.println(tickets-- + " is saled by "
					+ Thread.currentThread().getName());
		}
	}
}

//②实现runnable接口
class MultiThread2  implements Runnable{
	private int tickets=6;
	
	public void run() {
		while(tickets>0){}
		System.out.println(tickets-- + " is saled by "
				+ Thread.currentThread().getName());
	}
}


//③共享变量
class MultiThread implements Runnable {
	private int tickets = 6;

	public void run() {
		while (tickets > 0) {
			System.out.println(tickets-- + " is saled by "
					+ Thread.currentThread().getName());
		}
	}

}

//http://www.cnblogs.com/whgw/archive/2011/10/03/2198506.html