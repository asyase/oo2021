package HW9;

public class ThreadsHW {
	public static void main(String args[]) {

		ThreadsHW thread1 = new ThreadsHW();
		Thread t_nr1 = new Thread(new Runnable() {
			public void run() {
				thread1.a_k();
			}
		});

		t_nr1.start();

		ThreadsHW thread2 = new ThreadsHW();
		Thread t_nr2 = new Thread(new Runnable() {
			public void run() {
				thread2.k_a();
			}
		});

		t_nr2.start();

		Thread thread3 = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("thread3 " + i);
					try {

						sleep(100);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}

		};
		// -------------------------------------------------------------------------------------------------------//

		Thread thread4 = new Thread() {

			public void run() {
				try {
					thread3.join();

				} catch (Exception e) {
					System.out.println(e);
				}

				for (int i = 10; i >= 1; i--) {
					System.out.println("thread4 " + i);
					try {
						sleep(100);
					} catch (Exception e)

					{
						System.out.println(e.getMessage());
					}

				}
			}
		};

		thread4.start();

		thread3.start();
	}

	// -------------------------------------------------------------------------------------------------//
	public void a_k() {
		char t2ht;
		for (t2ht = 'a'; t2ht <= 'k'; t2ht++) {
			try {
				System.out.println(t2ht);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}
	}

	// -----------------------------------------------------------------------------------------------------------//
	public void k_a() {
		char t2ht;
		for (t2ht = 'k'; t2ht >= 'a'; t2ht--) {
			try {
				System.out.println(t2ht);

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}
	}

}