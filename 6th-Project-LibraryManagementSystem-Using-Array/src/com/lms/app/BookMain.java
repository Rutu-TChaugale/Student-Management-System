package com.lms.app;

import java.util.Scanner;


public class BookMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book[] arr = new Book[10];
		
		int index = 0;
		
		//String bookName, float bookPrice, String bookAuthor, int bookQty, String bookType, String bookLang
		arr[index++] = new Book("The Diary of a Young Girl", 12.99f, "Anne Frank", 5, "Historical", "English");
		arr[index++] = new Book("Introduction to Quantum Mechanics", 45.99f, "David J. Griffiths", 8,  "Technical", "English");
		arr[index++] = new Book("The Storyteller's Secret", 18.50f, "Carmine Gallo", 10, "Storyteller", "English");
		arr[index++] = new Book("The Man Who Knew Infinity", 16.99f, "Robert Kanigel", 7, "Mathematical", "English");
		arr[index++] = new Book("A Brief History of Time", 25.00f, "Stephen Hawking", 6, "Historical", "English");
		
		boolean flag = true;
		
		while(true)
		{
			System.out.println("------------------- WELCOME TO LIBRARY MANGEMENT SYSTEM -------------------");
			System.out.println("\t 1. Add book to the array. \n" + "\t 2. Print all books information. \n" + "\t 3. Filter the books using bookType. \n"
								+ "\t 4. Filter the books based on bookAuthor. \n" + "\t 5. Filter the books based on Price. \n"
								+ "\t 6. Get single book by bookName. \n" + "\t 7. Exit");
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			System.out.println("Enter choice from the menu: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				if(index < arr.length)
				{
					System.out.println("Enter Book details as name, price, author, qty, type, language: ");
					String name = sc.nextLine();
					float price = sc.nextFloat();
					String author = sc.next();
					int qty = sc.nextInt();
					String type = sc.next();
					String lang = sc.next();
					
					arr[index++] = new Book(name, price, author, qty, type, lang);
                    System.out.println("Registration successful!");
				}
				else
				{
					System.out.println("Array is full!!!!");
				}
				break;
				
			case 2:
				for(Book b : arr)
				{
					if(b != null)
					{
						System.out.println("Book Name: "+b.bookName);
						System.out.println("Book Price: "+b.bookPrice);
						System.out.println("Book Author: "+b.bookAuthor);
						System.out.println("Book Qty: "+b.bookQty);
						System.out.println("Book Type: "+b.bookType);
						System.out.println("Book Language: "+b.bookLang);
						System.out.println("--------------------------------------------------");
					}
				}
				
				break;
			
			case 3:
				System.out.println("Enter booktype: ");
				String btype = sc.next();
				
				for(Book b : arr)
				{
					if(b != null)
					{
						if(b.bookType.equalsIgnoreCase(btype))
						{
							System.out.println("Book Name: "+b.bookName);
							System.out.println("Book Price: "+b.bookPrice);
							System.out.println("Book Author: "+b.bookAuthor);
							System.out.println("Book Qty: "+b.bookQty);
							System.out.println("Book Type: "+b.bookType);
							System.out.println("Book Language: "+b.bookLang);
						}
					}
				}
				break;
				
			case 4:
				System.out.println("Enter bookauhtor: ");
				String bauthor = sc.nextLine();
				
				for(Book b : arr)
				{
					if(b != null)
					{
						if(b.bookAuthor.equalsIgnoreCase(bauthor))
						{
							System.out.println("Book Name: "+b.bookName);
							System.out.println("Book Price: "+b.bookPrice);
							System.out.println("Book Author: "+b.bookAuthor);
							System.out.println("Book Qty: "+b.bookQty);
							System.out.println("Book Type: "+b.bookType);
							System.out.println("Book Language: "+b.bookLang);
						}
					}
				}
				break;
				
			case 5:
				System.out.println("Enter bookprice: ");
				float bprice = sc.nextFloat();
				
				for(Book b : arr)
				{
					if(b != null)
					{
						if(b.bookPrice == bprice)
						{
							System.out.println("Book Name: "+b.bookName);
							System.out.println("Book Price: "+b.bookPrice);
							System.out.println("Book Author: "+b.bookAuthor);
							System.out.println("Book Qty: "+b.bookQty);
							System.out.println("Book Type: "+b.bookType);
							System.out.println("Book Language: "+b.bookLang);
						}
					}
				}
				break;
				
			case 6:
				System.out.println("Enter bookname: ");
				String bname = sc.nextLine();
				
				for(Book b : arr)
				{
					if(b != null)
					{
						if(b.bookName.equalsIgnoreCase(bname))
						{

							System.out.println("Book Name: "+b.bookName);
							System.out.println("Book Price: "+b.bookPrice);
							System.out.println("Book Author: "+b.bookAuthor);
							System.out.println("Book Qty: "+b.bookQty);
							System.out.println("Book Type: "+b.bookType);
							System.out.println("Book Language: "+b.bookLang);
						}
					}
				}
				break;
				
			case 7:
				System.out.println("Thank you for using..");
				flag = false;
				System.exit(0);			
			}
			/* sc.nextLine(); */
		}
		
		
	}
	
}
