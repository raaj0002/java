package abc;

class samay extends Thread {
	int min,sec,hour;
	public void run() {
		for(int sec=0;sec<60;sec++) {	
			System.out.print("\r" + (hour) +":" + (min) + ":" + (sec) + "ss ");		if(sec==59) {
				if(min == 59) {
					min=0;
					hour++;
				}
				min++;
				sec=0;
			}
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {}
		}
	}
}
	public class time {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			samay s = new samay();
			s.start();
		}
}