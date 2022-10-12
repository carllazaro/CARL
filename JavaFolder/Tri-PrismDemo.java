import java.util.Scanner;

class TriPrism<T> {
	private T length;
	private T base;
	private T height;

	void setLength(T length) {
		this.length = length;
	}

	T getLength() {
		return length;
	}

	void setBase(T base) {
		this.base = base;
	}

	T getBase() {
		return base;
	}

	void setHeight(T height) {
		this.height = height;
	}

	T getHeight() {
		return height;
	}
}

public class TriPrismDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TriPrism<Integer> tp1 = new TriPrism<Integer>();
		TriPrism<Double> tp2 = new TriPrism<Double>();
		double volume;
		System.out.println("Triangular Prism 1");
		System.out.print("\nLength: ");
		tp1.setLength(s.nextInt());
		System.out.print("\nBase: ");
		tp1.setBase(s.nextInt());
		System.out.print("\nHeight: ");
		tp1.setHeight(s.nextInt());
		volume = tp1.getLength() * (0.5 * tp1.getBase() * tp1.getHeight());
		System.out.println("\nThe volume of the triangular prism is " + volume + ".");

		System.out.println("\nTriangular Prism 2");
		System.out.print("\nLength: ");
		tp2.setLength(s.nextDouble());
		System.out.print("\nBase: ");
		tp2.setBase(s.nextDouble());
		System.out.print("\nHeight: ");
		tp2.setHeight(s.nextDouble());
		volume = tp2.getLength() * (0.5 * tp2.getBase() * tp2.getHeight());
		System.out.println("\nThe volume of the triangular prism is " + volume + ".");
	}
}
