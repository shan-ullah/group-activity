package groupActivity6;

public interface Pen {

	void write();
	void reFill();
}

interface Pencil{
	void write();
	void sharpen();
} 

class student implements Pen, Pencil{
	
	void displayStudent() {
		System.out.println("student is writing");
	}

	@Override
	public void write() {
		System.out.println("write");
		
	}

	@Override
	public void reFill() {
		System.out.println("refill");
		
	}

	@Override
	public void sharpen() {
		System.out.println("sharpen");
	}
}