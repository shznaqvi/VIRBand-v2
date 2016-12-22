package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private final String projectName = "VIRBand Household Survey";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String UID = "";
    private String formDate = ""; // Date
    private String interviewer = ""; // Interviewer
    private String areacode = "0000"; // Area Code
    private String subareacode = ""; // Cluster
    private String household = ""; // Household number
    private String childName = ""; // Child Name
    private String childCount = ""; // Child Code
    private String istatus = ""; // Interview Status
    //private String sA = "";
    private String sB = "";
    private String sC = "";
    private String sD = "";
    private String sE = "";
    private String sIC01 = "";
    private String sIC02 = "";
    private String sIC03 = "";
    private String sIC04 = "";
    private String sIC05 = "";
    private String sIC06 = "";

    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public String getProjectName() {
        return projectName;
    }

    public String getID() {
        return _ID;
    }

    public void setID(String id) {
        this._ID = id;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getSubareacode() {
        return subareacode;
    }

    public void setSubareacode(String subareacode) {
        this.subareacode = subareacode;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildCount() {
        return childCount;
    }

    public void setChildCount(String childCount) {
        this.childCount = childCount;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }

    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }


    public String getsIC01() {
        return sIC01;
    }

    public void setsIC01(String sIC01) {
        this.sIC01 = sIC01;
    }

    public String getsIC02() {
        return sIC02;
    }

    public void setsIC02(String sIC02) {
        this.sIC02 = sIC02;
    }

    public String getsIC03() {
        return sIC03;
    }

    public void setsIC03(String sIC03) {
        this.sIC03 = sIC03;
    }

    public String getsIC04() {
        return sIC04;
    }

    public void setsIC04(String sIC04) {
        this.sIC04 = sIC04;
    }

    public String getsIC05() {
        return sIC05;
    }

    public void setsIC05(String sIC05) {
        this.sIC05 = sIC05;
    }

    public String getsIC06() {
        return sIC06;
    }

    public void setsIC06(String sIC06) {
        this.sIC06 = sIC06;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public FormsContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString("id");
        this.UID = jsonObject.getString("uid");
        this.formDate = jsonObject.getString("fromDate");
        this.interviewer = jsonObject.getString("interviewer");
        this.areacode = jsonObject.getString("areacode");
        this.subareacode = jsonObject.getString("subareacode");
        this.household = jsonObject.getString("household");
        this.childName = jsonObject.getString("childname");
        this.childCount = jsonObject.getString("childcount");
        this.istatus = jsonObject.getString("istatus");
        //this.sA = jsonObject.getString("sA");
        this.sB = jsonObject.getString("sB");
        this.sC = jsonObject.getString("sC");
        this.sD = jsonObject.getString("sD");
        this.sE = jsonObject.getString("sE");
        this.sIC01 = jsonObject.getString("sIC01");
        this.sIC02 = jsonObject.getString("sIC02");
        this.sIC03 = jsonObject.getString("sIC03");
        this.sIC04 = jsonObject.getString("sIC04");
        this.sIC05 = jsonObject.getString("sIC05");
        this.sIC06 = jsonObject.getString("sIC06");
        this.gpsLat = jsonObject.getString("gpsLat");
        this.gpsLng = jsonObject.getString("gpsLng");
        this.gpsTime = jsonObject.getString("gpsTime");
        this.gpsAcc = jsonObject.getString("gpsAcc");
        this.deviceID = jsonObject.getString("deviceID");
        this.synced = jsonObject.getString("synced");
        this.synced_date = jsonObject.getString("synced_date");
        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleForm._ID));
        this.UID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_FORM_DATE));
        this.areacode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_AREA_CODE));
        this.subareacode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SUBAREA_CODE));
        this.household = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_HOUSEHOLD));
        this.childName = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_CHILDNAME));
        this.childCount = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_CHILDCOUNT));
        this.istatus = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_ISTATUS));
        //this.sA = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SA));
        this.sB = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SB));
        this.sC = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SC));
        this.sD = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SE));
        this.sIC01 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SIC01));
        this.sIC02 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SIC02));
        this.sIC03 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SIC03));
        this.sIC04 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SIC04));
        this.sIC05 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SIC05));
        this.sIC06 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SIC06));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_GPS_LAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_GPS_LNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_GPS_TIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_GPS_ACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_DEVICE_ID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_SYNCED_DATE));
        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleForm._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleForm.COLUMN_NAME_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(singleForm.COLUMN_NAME_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        //json.put(singleForm.COLUMN_NAME_SURVEY_TYPE, this.surveyType == null?JSONObject.NULL:this.surveyType);
        json.put(singleForm.COLUMN_NAME_DEVICE_ID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleForm.COLUMN_NAME_GPS_LAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleForm.COLUMN_NAME_GPS_LNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleForm.COLUMN_NAME_GPS_TIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(singleForm.COLUMN_NAME_GPS_ACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleForm.COLUMN_NAME_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleForm.COLUMN_NAME_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);
        json.put(singleForm.COLUMN_NAME_FORM_DATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(singleForm.COLUMN_NAME_FORM_DATE, this.interviewer == null ? JSONObject.NULL : this.interviewer);
        json.put(singleForm.COLUMN_NAME_AREA_CODE, this.areacode == null ? JSONObject.NULL : this.areacode);
        json.put(singleForm.COLUMN_NAME_AREA_CODE, this.subareacode == null ? JSONObject.NULL : this.subareacode);
        json.put(singleForm.COLUMN_NAME_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(singleForm.COLUMN_NAME_CHILDNAME, this.childName == null ? JSONObject.NULL : this.childName);
        json.put(singleForm.COLUMN_NAME_CHILDCOUNT, this.childCount == null ? JSONObject.NULL : this.childCount);
        json.put(singleForm.COLUMN_NAME_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);

        //json.put(singleForm.COLUMN_NAME_SA, this.sA == null?JSONObject.NULL:this.sA);
        json.put(singleForm.COLUMN_NAME_SB, this.sB == null ? JSONObject.NULL : this.sB);
        json.put(singleForm.COLUMN_NAME_SB, this.sB == null ? JSONObject.NULL : this.sB);
        json.put(singleForm.COLUMN_NAME_SC, this.sC == null ? JSONObject.NULL : this.sC);
        json.put(singleForm.COLUMN_NAME_SD, this.sD == null ? JSONObject.NULL : this.sD);
        json.put(singleForm.COLUMN_NAME_SE, this.sE == null ? JSONObject.NULL : this.sE);
        json.put(singleForm.COLUMN_NAME_SIC01, this.sIC01 == null ? JSONObject.NULL : this.sIC01);
        json.put(singleForm.COLUMN_NAME_SIC02, this.sIC02 == null ? JSONObject.NULL : this.sIC02);
        json.put(singleForm.COLUMN_NAME_SIC03, this.sIC03 == null ? JSONObject.NULL : this.sIC03);
        json.put(singleForm.COLUMN_NAME_SIC04, this.sIC04 == null ? JSONObject.NULL : this.sIC04);
        json.put(singleForm.COLUMN_NAME_SIC05, this.sIC05 == null ? JSONObject.NULL : this.sIC05);
        json.put(singleForm.COLUMN_NAME_SIC06, this.sIC06 == null ? JSONObject.NULL : this.sIC06);

        return json;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_PROJECT_NAME = "projectname";
        //public static final String COLUMN_NAME_SURVEY_TYPE = "surveytype";
        public static final String COLUMN_NAME_DEVICE_ID = "deviceid";
        public static final String COLUMN_NAME_GPS_LAT = "gpslat";
        public static final String COLUMN_NAME_GPS_LNG = "gpslng";
        public static final String COLUMN_NAME_GPS_ACC = "gpsacc";
        public static final String COLUMN_NAME_GPS_TIME = "gpstime";
        public static final String COLUMN_NAME_SYNCED = "sync";
        public static final String COLUMN_NAME_SYNCED_DATE = "sync_date";
        public static final String COLUMN_NAME_FORM_DATE = "fromdate";
        public static final String COLUMN_NAME_INTERVIEWER = "interviewer";
        public static final String COLUMN_NAME_AREA_CODE = "areacode";
        public static final String COLUMN_NAME_SUBAREA_CODE = "subarea";
        public static final String COLUMN_NAME_HOUSEHOLD = "household";
        public static final String COLUMN_NAME_CHILDNAME = "childname";
        public static final String COLUMN_NAME_CHILDCOUNT = "childcount";
        public static final String COLUMN_NAME_ISTATUS = "istatus";

//        public static final String COLUMN_NAME_SA = "sa";

        public static final String COLUMN_NAME_SB = "sb";
        public static final String COLUMN_NAME_SC = "sc";
        public static final String COLUMN_NAME_SD = "sd";
        public static final String COLUMN_NAME_SE = "se";
        public static final String COLUMN_NAME_SIC01 = "sic01";
        public static final String COLUMN_NAME_SIC02 = "sic02";
        public static final String COLUMN_NAME_SIC03 = "sic03";
        public static final String COLUMN_NAME_SIC04 = "sic04";
        public static final String COLUMN_NAME_SIC05 = "sic05";
        public static final String COLUMN_NAME_SIC06 = "sic06";

    }
}
