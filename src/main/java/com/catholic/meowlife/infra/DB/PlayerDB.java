package com.catholic.meowlife.infra.DB;

import com.catholic.meowlife.domain.entity.PlayerEntity;
import org.springframework.stereotype.Component;

//import java.util.ArrayList;
//import java.util.List;
import java.util.HashMap;
import java.util.Map;

@Component
public class PlayerDB {
    private static Map<String, PlayerEntity> playerMap = new HashMap<>();

    public static Map<String, PlayerEntity> getPlayerMap() {
        return playerMap;
    }
}