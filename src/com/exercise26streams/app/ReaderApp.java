package com.exercise26streams.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class ReaderApp {
	public static void main(String...args)
	{
		final int LIMIT = 24;
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		Scanner kInput = new Scanner(System.in);
		int table = 0;
		try
		{
			myFile = new File("D:\\0\\b.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			
			System.out.println("Input the multiplication table:");
			table = kInput.nextInt();
			
			for (int i = 1; i <= LIMIT; i++)
			{
				myBuffer.write(String.format("%d X %d = %d\n", table, i, table*i));
				//System.out.format("%d X %d = %d\n", table, i, table*i);
			}
			
			
			/*for (int i = 0; i < 100; i++)
			{				
				myBuffer.write("Luis Gutiérrez\n");
			}*/
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		kInput.close();
	}
}
