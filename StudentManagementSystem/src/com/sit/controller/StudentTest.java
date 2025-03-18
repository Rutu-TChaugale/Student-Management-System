package com.sit.controller;

import java.util.Scanner;

import com.sit.client.Student;

public class StudentTest {
	
	
	static int value=100;
	static int index =0;
	
	static Student[] student=new Student[value];
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("<-------Student MAnagement System--------->");
			System.out.println("1.Add the students \n"+"2.Diaply all Students \n"+"3.search student by id \n"+"4.search student by name \n"+"5.search student whose marks is greator than 65 \n"+"6.Exit");
			System.out.println("Enter Your choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the id:");
				int id=sc.nextInt();
				System.out.println("Enter the name:");
				String name=sc.next();
				System.out.println("Enter the marks: ");
				double marks=sc.nextDouble();
				
				Student obj=new Student();
				obj.s_id=id;
				obj.s_name=name;
				obj.s_marks=marks;
				
				student[index++]=obj;
				System.out.println("Student added successfully!!");
				break;
				
			case 2:
				System.out.println("List of students-->");
				for (Student stud : student) {
					if(stud!=null) {
					System.out.println(stud);
					}
				}
				break;
			case 3:
				System.out.println("Enetr the id:");
				int id1=sc.nextInt();
				
				for (Student stud : student) {
					if(stud != null && stud.s_id == id1) {
						System.out.println(stud);
					}
				}
				break;
				
			case 4:
				System.out.println("Enter the name:");
				String name1=sc.next();
				
				for (Student  stud : student) {
					if(stud != null && stud.s_name.equalsIgnoreCase(name1)) {
						System.out.println(stud);
					}
				}
				break;
				
			case 5:
				for (Student stud : student) {
					if(stud!=null && stud.s_marks > 65) {
						System.out.println(stud);
					}
				}
				break;
			case 6:
				System.out.println("Thank you visiting!!!");
				System.exit(0);
			}
			
		}
		
	}

}
