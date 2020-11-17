package problems;
import java.util.Scanner;
import java.util.Arrays;

/**
 * This program attempts to solve the Problem "Allocation" for Google KickStart 2020 Round A.
 * Problem Link: https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d3f56
 * 
 * @user XGalilei
 * @version November 17, 2020
 */
public class Allocation {

	public static int maxHouses(int budget, int[] houses)
	{
		Arrays.sort(houses);
		int count = 0;
		for(int i = 0; i < houses.length; i++)
		{
			if(budget - houses[i] < 0)
				break;
			else
			{
				budget -= houses[i];
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		int n = 0, b = 0;
		
		for (int i = 0; i < t; i++) {
			String[] arr = sc.nextLine().split(" ");
			n = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			String[] hou = sc.nextLine().split(" ");
			int[] houses = new int[n];
			for(int j = 0; j < n; j++)
			{
				houses[j] = Integer.parseInt(hou[j]);
			}
			System.out.printf("Case #%d: %d\n", i + 1, Allocation.maxHouses(b, houses));
		}
		sc.close();
	}
}
