package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject; /**
 * Created by hassan.naqvi on 11/30/2016.
 */

        public class OCsContract {

    private final String projectName = "VIRBand Household Survey";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String UID = "";
    private String formDate = ""; // Date
    private String areacode = "0000"; // Area Code
    private String subareacode = ""; // Cluster
    private String household = ""; // Household number
    private String childName = ""; // Household number
    //private String sA = "";
    private String sH = "";
    private String sOC01 = "";
    private String sOC02 = "";
    private String sOC03 = "";
    private String sOC04 = "";
    private String sOC05 = "";
    private String sOC06 = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public OCsContract() {
    }

    public OCsContract Sync (JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(singleOCs._ID);
        this.UID = jsonObject.getString(singleOCs.COLUMN_NAME_UID);
        this.formDate = jsonObject.getString(singleOCs.COLUMN_NAME_FORM_DATE);
        this.areacode = jsonObject.getString(singleOCs.COLUMN_NAME_AREA_CODE);
        this.subareacode = jsonObject.getString("subareacode");
        this.household = jsonObject.getString("household");
        this.childName = jsonObject.getString("childName");
        this.sH = jsonObject.getString("sH");
        this.sOC01 = jsonObject.getString("sOC01");
        this.sOC02 = jsonObject.getString("sOC02");
        this.sOC03 = jsonObject.getString("sOC03");
        this.sOC04 = jsonObject.getString("sOC04");
        this.sOC05 = jsonObject.getString("sOC05");
        this.sOC06 = jsonObject.getString("sOC06");
        this.deviceID = jsonObject.getString("deviceID");
        this.synced = jsonObject.getString("synced");
        this.synced_date = jsonObject.getString("synced_date");

        return this;
    }

    public OCsContract Hydrate(Cursor cursor) {
        this.formDate = cursor.getString(cursor.getColumnIndex("formDate"));
        this.areacode = cursor.getString(cursor.getColumnIndex("areacode"));
        this.subareacode = cursor.getString(cursor.getColumnIndex("subareacode"));
        this.household = cursor.getString(cursor.getColumnIndex("household"));
        this.childName = cursor.getString(cursor.getColumnIndex("childName"));
        this.sH = cursor.getString(cursor.getColumnIndex("sH"));
        this.sOC01 = cursor.getString(cursor.getColumnIndex("sOC01"));
        this.sOC02 = cursor.getString(cursor.getColumnIndex("sOC02"));
        this.sOC03 = cursor.getString(cursor.getColumnIndex("sOC03"));
        this.sOC04 = cursor.getString(cursor.getColumnIndex("sOC04"));
        this.sOC05 = cursor.getString(cursor.getColumnIndex("sOC05"));
        this.sOC06 = cursor.getString(cursor.getColumnIndex("sOC06"));
        this.deviceID = cursor.getString(cursor.getColumnIndex("deviceID"));
        this.synced = cursor.getString(cursor.getColumnIndex("synced"));
        this.synced_date = cursor.getString(cursor.getColumnIndex("synced_date"));

        return this;
    }

    public String getID() {
        return _ID;
    }

    public void setID(String _ID) {
        this._ID = _ID;
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

    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }

    public String getsOC01() {
        return sOC01;
    }

    public void setsOC01(String sOC01) {
        this.sOC01 = sOC01;
    }

    public String getsOC02() {
        return sOC02;
    }

    public void setsOC02(String sOC02) {
        this.sOC02 = sOC02;
    }

    public String getsOC03() {
        return sOC03;
    }

    public void setsOC03(String sOC03) {
        this.sOC03 = sOC03;
    }

    public String getsOC04() {
        return sOC04;
    }

    public void setsOC04(String sOC04) {
        this.sOC04 = sOC04;
    }

    public String getsOC05() {
        return sOC05;
    }

    public void setsOC05(String sOC05) {
        this.sOC05 = sOC05;
    }

    public String getsOC06() {
        return sOC06;
    }

    public void setsOC06(String sOC06) {
        this.sOC06 = sOC06;
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


    public static abstract class singleOCs implements BaseColumns {

        public static final String TABLE_NAME = "ocs";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_PROJECT_NAME = "projectname";
        public static final String COLUMN_NAME_DEVICE_ID = "deviceid";
        public static final String COLUMN_NAME_SYNCED = "sync";
        public static final String COLUMN_NAME_SYNCED_DATE = "sync_date";
        public static final String COLUMN_NAME_FORM_DATE = "fromdate";
        public static final String COLUMN_NAME_AREA_CODE = "areacode";
        public static final String COLUMN_NAME_SUBAREA_CODE = "subarea";
        public static final String COLUMN_NAME_HOUSEHOLD = "household";
        public static final String COLUMN_NAME_CHILDNAME = "childname";

        public static final String COLUMN_NAME_SH = "sh";
        public static final String COLUMN_NAME_SOC01 = "soc01";
        public static final String COLUMN_NAME_SOC02 = "soc02";
        public static final String COLUMN_NAME_SOC03 = "soc03";
        public static final String COLUMN_NAME_SOC04 = "soc04";
        public static final String COLUMN_NAME_SOC05 = "soc05";
        public static final String COLUMN_NAME_SOC06 = "soc06";

    }
}
