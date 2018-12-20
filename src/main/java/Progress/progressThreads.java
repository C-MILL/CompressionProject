package Progress;

public class progressThreads extends Thread{
	int DoneNumber;
	int NumberToDo;
	progressController progressController = new progressController();
	
	
	

	public progressThreads(int DoneNumber,int NumberToDo) {
		setDoneNumber(DoneNumber);
		setNumberToDo(NumberToDo);
	}
	public void setAll(int DoneNumber,int NumberToDo) {
		setDoneNumber(DoneNumber);
		setNumberToDo(NumberToDo);
	}


	public int getDoneNumber() {
		return DoneNumber;
	}



	public void setDoneNumber(int doneNumber) {
		DoneNumber = doneNumber;
	}



	public int getNumberToDo() {
		return NumberToDo;
	}



	public void setNumberToDo(int numberToDo) {
		NumberToDo = numberToDo;
	}



	public void run() {
		
		try {
			progressController.setAll(getDoneNumber(), getNumberToDo());
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}