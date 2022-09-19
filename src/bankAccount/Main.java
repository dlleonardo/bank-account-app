package bankAccount;

public class Main extends Thread {

	static Account luigi = new Account("Luigi", "Verdi", "Italiano", "Milano", "Via italica 78", 
								344778888, "LGVR");
	
	public static void main(String[] args) {
		Main thread = new Main();
		thread.start();
		// TODO Auto-generated method stub
		Account mario = new Account("Mario", "Rossi", "Italiano", "Firenze", "Via Corso Garibaldi 99",
									339887799, "MRRS");
		
		mario.menu();
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
			//System.out.println(luigi.get_funds());
			System.out.println("This code is running in a thread");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
