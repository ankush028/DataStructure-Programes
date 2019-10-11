package week1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		UnOrderedList<String> list = new UnOrderedList<>();
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		File fr = new File("C:/Users/ashis/Desktop/FileInputOutput/Binary_Search.txt");
		BufferedReader fs = new BufferedReader(new FileReader(fr));
		String st;
		while((st =fs.readLine())!=null){
			String[] p= st.split("\\s");
			for(String m : p){
				list.add(m);
			}	
		}
		System.out.println("Enter the string to search in a file");
		String str = sc.nextLine();
		if(list.search(str)){
			System.out.println("found at index"+list.index(str));
			list.remove(str);
		}else{
			System.out.println("Not found");
			list.add(str);
		}
		
		list.show();
		list.removeAtLast();
		list.show();
		
		fs.close();
		sc.close();
		
	}

}
