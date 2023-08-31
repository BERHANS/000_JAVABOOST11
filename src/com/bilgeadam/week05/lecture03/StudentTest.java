package com.bilgeadam.week05.lecture03;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.isim = "berhan";
		student1.kaydet();
		Student student2 = new Student(); 
		student2.isim = "sezer";
		student2.kaydet();
		
		System.out.println(student1.isim);
		System.out.println(Student.ogrenciNumarası);
	
	}

}
