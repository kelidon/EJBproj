package com.jwt.ejb.business.impl.view;

import javax.ejb.Remote; 

import com.jwt.ejb.entity.Song;

@Remote
public interface SongRemote {
	public boolean addSong(Song song);

}
