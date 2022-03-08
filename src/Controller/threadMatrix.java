package Controller;

public class threadMatrix extends Thread{
	private int l;
	private int[] vetor;
	
	public threadMatrix(int l, int[] vetor) {
		this.l = l;
		this.vetor = vetor;
	}
	
	public void run() {
		int s = 0;
		for(int i = 0; i <  vetor.length; i++) {
			s += vetor[i];
		}
		
		System.out.println("Soma da linha " + l +": " + s);
	}
}