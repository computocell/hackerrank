package br.com.computocell.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/simple-array-sum
 * @author jefferson
 *
 */
public class SimpleSum {

	static int simplArraySum(int[] ar) {
		int soma = 0;
		for (int i = 0; i < ar.length; i++) {
			soma +=ar[i]; 
		}
		return soma;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:/hackerrank/teste.txt"));

		int arCount = Integer.parseInt(scanner.nextLine().trim());
		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simplArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

}
