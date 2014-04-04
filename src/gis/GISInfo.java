/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author bagher
 */
public class GISInfo {
    private static GISInfo gisInfo;
    public ArrayList<LocationInfo> locations = new ArrayList<LocationInfo>();
    private GISInfo() {
        String csvFile = "gis.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] location = line.split(cvsSplitBy);
                System.out.println("Asset [N= " + location[1] + " , E=" + location[2] + "]");
                locations.add(new LocationInfo(location[0], Double.parseDouble(location[1]), Double.parseDouble(location[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");
    }

    public static GISInfo getInstance() {
        if (gisInfo != null) {
            return gisInfo;
        } else {
            gisInfo = new GISInfo();
            return gisInfo;
        }
    }

    public double getEast(String UID) {
        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).UID.equals(UID)) {
                return locations.get(i).east;
            }
        }
        return 0;
    }

    public double getNorth(String UID) {
        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).UID.equals(UID)) {
                return locations.get(i).north;
            }
        }
        return 0;
    }
}

class LocationInfo {
    String UID;
    double east;
    double north;

    public LocationInfo(String UID, double east, double west) {
        this.UID = UID;
        this.east = east;
        this.north = west;
    }
}
