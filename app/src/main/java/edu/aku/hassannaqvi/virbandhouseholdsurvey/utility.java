package edu.aku.hassannaqvi.virbandhouseholdsurvey;

/**
 * Created by Ali on 27-Dec-16.
 */

public class utility {

    public static boolean dobValidation(int y, int m, int d){

        if((y == MainApp.YEARS_LIMIT
                || y >= MainApp.YEARS_LIMIT)
                && (m > MainApp.MONTHS_UPPER_LIMIT
                || m > MainApp.MONTHS_LOWER_LIMIT)){
            return true;
        }
        else if(d > MainApp.DAYS_LIMIT
                || m > MainApp.MONTHS_UPPER_LIMIT){
            return true;
        }
        else {
            return false;
        }

    }

}
