package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		//Reader 준비
		  //리더+버퍼	--> 빨대 PhoneDB.txt / UTF-8
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		//반복
		while(true) {
		//파일을 1줄씩 읽는다
			String str = br.readLine();
			
		//null 이면 반복문을 나간다(읽을 것이 없음)
			if(str == null) {
					break;
				}
			
		//,(콤마) 로 분리한다
			//name = 정우성
			//hp = 010-0220-222
			//company = 02-222-2222
			
			String[] personInfo = str.split(",");
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			
		//출력한다
				System.out.println("이름 : " + name);
				System.out.println("hp : " + hp);
				System.out.println("회사 : " + company);
				
				System.out.println("");
			}
			
		
		//종료
		
		br.close();
		
		
		

	}

}
