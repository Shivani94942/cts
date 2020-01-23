package com.mycompany.hibernateone_to_one_bi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import com.mycompany.hibernateone_to_one_bi.entity.Album;
import com.mycompany.hibernateone_to_one_bi.entity.MyImage;
import com.mycompany.hibernateone_to_one_bi.service.AlbumService;
import com.mycompany.hibernateone_to_one_bi.service.AlbumServiceImpl;


public class App 
{
	private static AlbumService service;
	static {
		service=new AlbumServiceImpl();
	}
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	
    	int choice = -1;
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	do {
			System.out.println("1. create album");
			System.out.println("2. display all albums");
			System.out.println("3. find album by id");
			System.out.println("4. update album");
			System.out.println("5. delete album");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			
			switch(choice)
			{
			case 1:
				System.out.println("Album name :");
				String aname=br.readLine().toString();
				LocalDate date1= LocalDate.now();
				Album a=new Album(aname,date1);
				System.out.println("enter url");
				String url=br.readLine().toString();
				MyImage img=new MyImage(url);				
				a.setImage(img);
				Album al=service.createAlbum(a);
				System.out.println("Creation of album successfull"+al);
				break;
			case 2:
			       System.out.println("Displaying all the albums : ");
			       List<Album> l=service.getAllAlbums();
					System.out.println(l);
					break;
			case 3:
				System.out.println("enter Id : ");
				Integer i= Integer.parseInt(br.readLine().toString());
				Album a1=service.findById(i);
				System.out.println(a1);
				break;
			case 4:
				System.out.println("enter Id : ");
				Integer i1= Integer.parseInt(br.readLine().toString());
				Album a2=service.updateAlbum(i1);
				System.out.println(a2);
				System.out.println("update sucessfull");
				break;
			case 5:
				System.out.println("enter Id : ");
				Integer i2= Integer.parseInt(br.readLine().toString());
				Album a3=service.deleteAlbum(i2);
				System.out.println("deletion sucessfull");
			case 0:
				System.out.println("exited");
				System.exit(0);
			}
    }while(choice!=0);
}
}
