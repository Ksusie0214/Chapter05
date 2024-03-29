package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			ArrayList<Person> pList = new ArrayList<Person>();
			
			String[] pInfo = str.split(",");
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];
			
			Person p01 = new Person(pInfo[0], pInfo[1], pInfo[2]);
			Person p02 = new Person(pInfo[0], pInfo[1], pInfo[2]);
			Person p03 = new Person(pInfo[0], pInfo[1], pInfo[2]);
			
			pList.add(p01);
			pList.add(p02);
			pList.add(p03);
			
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			}
			
		FileWriter wr = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wr);

		br.close();
		bw.close();

		
	}
		
		
	}

