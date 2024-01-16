package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonApp {

	public static void main(String[] args) throws IOException {

		//리더
		
		FileReader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//반복문
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
		//리스트 만들기
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
			
		//출력
			System.out.println("이름: "+name);
			System.out.println("핸드폰 : "+ hp);
			System.out.println("회사 : "+company);
			System.out.println(" ");
			
		}
		
		//라이터
		
		FileWriter wr = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wr);
		
		
		
		//종료
		
		br.close();
		bw.close();

	}

}
