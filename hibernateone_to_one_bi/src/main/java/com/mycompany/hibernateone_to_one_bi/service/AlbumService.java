package com.mycompany.hibernateone_to_one_bi.service;

import java.io.IOException;
import java.util.List;

import com.mycompany.hibernateone_to_one_bi.entity.Album;

public interface AlbumService {

	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album findById(Integer id);
	public Album updateAlbum(Integer id)throws IOException;
	public Album deleteAlbum(Integer id); 
}
