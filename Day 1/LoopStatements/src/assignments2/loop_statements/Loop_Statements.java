package assignments2.loop_statements;
import java.util.*;
public class Loop_Statements {
	public static void main(String[] args)
	{
			int i, j, k;

			for (i = 1; i <= 7; i++)
			{
				for (j = 1; j <= i; ++j)
				{
					System.out.print(j);
				}

				for (k = 7 - i; k >= 1; k--)
				{
					System.out.print("*");
				}

				System.out.print("\n");
			}

			new Scanner(System.in).nextLine();

	}
}
