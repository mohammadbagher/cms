/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snapshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author bagher
 */
public class Snapshot {

    private static Snapshot snpt;
    private ArrayList<CMSSpnt> snapshots = new ArrayList<>();
    private Snapshot() {
        final File folder = new File("snapshots");
        listFilesForFolder(folder);
    }

    public static void setSnpt(Snapshot snpt) {
        Snapshot.snpt = snpt;
    }

    public void setSnapshots(ArrayList<CMSSpnt> snapshots) {
        this.snapshots = snapshots;
    }

    public static Snapshot getSnpt() {
        return snpt;
    }

    public ArrayList<CMSSpnt> getSnapshots() {
        return snapshots;
    }

    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        new Snapshot();
    }

    public void listFilesForFolder(final File folder) {
//        for (final File fileEntry : folder.listFiles()) {
//            if (fileEntry.isDirectory()) {
//                listFilesForFolder(fileEntry);
//            } else {
//                String name = fileEntry.getName();
//                String[] names = name.split("_");
//                
//                snapshots.add(fileEntry.getName());
//                System.out.println(fileEntry.getName());
//            }
//        }
    }

    public static Snapshot getInstance() {
        if (snpt == null) {
            snpt = new Snapshot();
            return snpt;
        }
        return snpt;
    }

    
    
}
