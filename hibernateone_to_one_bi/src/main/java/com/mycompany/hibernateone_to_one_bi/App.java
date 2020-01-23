package com.mycompany.hibernateone_to_one_bi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import com.mycompany.hibernateone_to_one_bi.entity.Album;
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
			System.out.println("1. create person");
			System.out.println("2. display all persons");
			System.out.println("3. find person by id");
			System.out.println("4. update person");
			System.out.println("5. delete person");
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
				System.out.println("Creation of album successfull"+a);
				break;
			case 2:
			       System.out.println("Displaying all the albums : ");
			       List<Album> l=service.getAllAlbums();
					System.out.println(l);
					break;
			case 3:
				
				
			}
    }while(choice!=0);
}
}
