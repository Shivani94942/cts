package com.mycompany.hibernateone_to_one_bi.service;

import java.util.List;

import com.mycompany.hibernateone_to_one_bi.entity.Album;

public interface AlbumService {

	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album deleteAlbum(Integer id); 
}
