package com.catholic.meowlife.domain.repository;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.infra.DB.CatDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CatRepository {


    @Autowired
    private CatEntity catEntity;
    @Autowired
    PlayerEntity playerEntity;
    @Autowired
    PlayerDTO playerDTO;

    public CatEntity getCatEntity(String playerName) {
        catEntity = CatDB.getCatMap().get(playerName);
        return catEntity;
    }

    public void updateWeight(CatEntity catEntity, String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void updateEnergy(CatEntity catEntity, String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void updateExp(CatEntity catEntity , String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void updateLevel(CatEntity catEntity, String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void setCatDB(String playerId, CatEntity catEntity) {
        CatDB.getCatMap().put(playerId, catEntity);
    }
    
    public void createCatInDB(String catName, String catBreeds) {
        catEntity = new CatEntity(catName, catBreeds, 50, 2, 0, 1);
        String playerId = PlayerDTO.loginPlayer.getId();
        CatDB.getCatMap().put(playerId, catEntity);
    }
  
    public void deleteCatDB(){
        CatDB.getCatMap().remove(PlayerDTO.loginPlayer.getId());
    }

}
