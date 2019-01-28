package refactoring_gilbut.chapt02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import refactoring_gilbut.chapt02.after.FindIntBreak;
import refactoring_gilbut.chapt02.after.FindIntReturn;
import refactoring_gilbut.chapt02.befor.FindIntBefor;
import refactoring_gilbut.chapt02.simpleDatabaseBefor.SimpleDatabase;
import refactoring_gilbut.chapt02.simpleDatabaseafter.SimpleDatabaseApi;
import refactoring_gilbut.chapt02.simpleDatabaseafter.SimpleDatabasePattern;
import refactoring_gilbut.chapt02.simpleDatabaseafter.SimpleDatabaseRename;

public class Main {

	public static void main(String[] args)  {
		int[] data = {1,9,0,2,8,5,6,3,4,7};
		
		befor(data);
		
		afterBreak(data);
		
		afterReturn(data);
		
		befor_simpledatabase();
		
		after_rename_simpledatabase();
		
		after_Api_simpledatadase();
		
		after_Pattern_simpledatabase();
		
	}

	private static void after_Pattern_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			SimpleDatabasePattern db = new SimpleDatabasePattern(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n",key,db.getValue(key));
				
			}
			
		}catch (FileNotFoundException e) {
			System.err.println("해당 파일을찾을수없습니다.");
		}catch (Exception e) {
			System.err.println("해당파일에 문제가있어읽을수없습니다");
		}
	}

	private static void after_Api_simpledatadase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			SimpleDatabaseApi db = new SimpleDatabaseApi(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n",key,db.getValue(key));
				
			}
			
		}catch (FileNotFoundException e) {
			System.err.println("해당 파일을찾을수없습니다.");
		}catch (Exception e) {
			System.err.println("해당파일에 문제가있어읽을수없습니다");
		}
	}

	private static void after_rename_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			SimpleDatabaseRename db = new SimpleDatabaseRename(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n",key,db.getValue(key));
				
			}
			
		}catch (FileNotFoundException e) {
			System.err.println("해당 파일을찾을수없습니다.");
		}catch (Exception e) {
			System.err.println("해당파일에 문제가있어읽을수없습니다");
		}
	}

	private static void befor_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n",key,db.getValue(key));
				
			}
			
		}catch (FileNotFoundException e) {
			System.err.println("해당 파일을찾을수없습니다.");
		}catch (Exception e) {
			System.err.println("해당파일에 문제가있어읽을수없습니다");
		}
	}

	private static void afterReturn(int[] data) {
		if (FindIntReturn.find(data, 5)) {
			System.out.println("Found");
		}else {
			System.out.println("Not found...");
		}
	}

	private static void afterBreak(int[] data) {
		if (FindIntBreak.find(data, 5)) {
			System.out.println("Found");
		}else {
			System.out.println("Not found...");
		}
	}

	private static void befor(int[] data) {
		if (FindIntBefor.find(data, 5)) {
			System.out.println("Found");
		}else {
			System.out.println("Not found...");
		}
	}

}
