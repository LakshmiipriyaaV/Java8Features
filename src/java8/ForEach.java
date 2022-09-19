package java8;

public class ForEach {
	public static void main(String[] args) {
		int ages[] = {15, 18, 16, 17, 14, 12, 13, 20, 22, 25};
		int sum = 0;
		System.out.print("Ages of the group are : "); for (int x : ages)
		{
		System.out.print(x+" "); sum += x;
		}
		System.out.println("\n Average age of the group = " + (sum/10));
		}
}
