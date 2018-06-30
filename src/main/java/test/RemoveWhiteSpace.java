package test;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str=" Vinothini Kandasamy ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s", ""));

	}

}
