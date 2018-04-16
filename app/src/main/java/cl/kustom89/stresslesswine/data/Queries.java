package cl.kustom89.stresslesswine.data;

import java.util.ArrayList;
import java.util.List;

import cl.kustom89.stresslesswine.models.Wine;

/**
 * Created by kustom89 on 15-04-2018.
 */

public class Queries {

    public List<Wine> wines(){

        List<Wine>wines= new ArrayList<>(  );
        List<Wine>wineList=Wine.listAll( Wine.class );
        if(wineList!=null&&wineList.size()>0){

            wines.addAll( wineList );
        }
        return wineList;

    }





}
