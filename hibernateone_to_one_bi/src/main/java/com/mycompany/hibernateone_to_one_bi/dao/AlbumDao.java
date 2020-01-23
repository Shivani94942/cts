package com.mycompany.hibernateone_to_one_bi.dao;

import java.io.IOException;
import java.util.List;

import com.mycompany.hibernateone_to_one_bi.entity.Album;

public interface AlbumDao {
	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album findById(Integer id);
	public Album updateAlbum(Integer id)throws IOException;
	public Album deleteAlbum(Integer id); 
	

}
