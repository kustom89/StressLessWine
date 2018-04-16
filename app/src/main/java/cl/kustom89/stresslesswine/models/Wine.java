package cl.kustom89.stresslesswine.models;

import com.orm.SugarRecord;

/**
 * Created by kustom89 on 14-04-2018.
 */

public class Wine extends SugarRecord {
    private String name, year, type;

    public Wine() {
    }

    public Wine(String name,String year,String type) {
        this.name = name;
        this.year = year;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
