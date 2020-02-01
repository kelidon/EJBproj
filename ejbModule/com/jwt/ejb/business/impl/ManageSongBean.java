package com.jwt.ejb.business.impl;
 

import com.jwt.ejb.business.impl.view.SongRemote;
import com.jwt.ejb.entity.Song;
 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
 
/**
 * Session Bean implementation class ManageEmployeeBean
 * 
 */
@Stateless
public class ManageSongBean implements SongRemote {
 
    @PersistenceContext(unitName = "EmpMgmtPU")
    private EntityManager entityManager;
 
    public ManageSongBean() {
 
    }
 
    public boolean addSong(Song song) {
        entityManager.persist(song);
        return true;
    }
 
}