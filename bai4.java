import java.util.Scanner;
public class bai4 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a,i;
	System.out.println("nhập vào một số:");
	a = sc.nextInt();
	for (i = 1; i <= a; i++)
	if (a==i)
		System.out.println("Tháng " +i);
}
}
		
