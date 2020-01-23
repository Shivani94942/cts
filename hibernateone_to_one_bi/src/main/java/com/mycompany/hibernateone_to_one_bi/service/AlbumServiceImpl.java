package com.mycompany.hibernateone_to_one_bi.service;

import java.io.IOException;
import java.util.List;

import com.mycompany.hibernateone_to_one_bi.dao.AlbumDao;
import com.mycompany.hibernateone_to_one_bi.dao.AlbumDaoImpl;
import com.mycompany.hibernateone_to_one_bi.entity.Album;

public class AlbumServiceImpl implements AlbumService {

	private AlbumDao dao;
	{
		dao=new AlbumDaoImpl();
	}

	@Override
	public Album createAlbum(Album album) {
		return dao.createAlbum(album);
	}

	@Override
	public List<Album> getAllAlbums() {
		
		return dao.getAllAlbums();
	}

	@Override
	public Album findById(Integer id) {
		
		return dao.findById(id);
	}
	@Override
	public Album updateAlbum(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao.updateAlbum(id);
	}


	@Override
	public Album deleteAlbum(Integer id) {
		
		return dao.deleteAlbum(id);
	}

	
	
}
