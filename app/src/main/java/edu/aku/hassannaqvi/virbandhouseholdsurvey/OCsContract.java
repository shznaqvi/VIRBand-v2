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
    private String UUID = "";
    private String formDate = ""; // Date
    private String areacode = "0000"; // Area Code
    private String subareacode = ""; // Cluster
    private String household = ""; // Household number
    private String childName = ""; // Household number
    //private String sA = "";
    private String sG = "";
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
        this.UUID = jsonObject.getString(singleOCs.COLUMN_NAME_UUID);
        this.formDate = jsonObject.getString(singleOCs.COLUMN_NAME_FORM_DATE);
        this.areacode = jsonObject.getString(singleOCs.COLUMN_NAME_AREA_CODE);
        this.subareacode = jsonObject.getString(singleOCs.COLUMN_NAME_SUBAREA_CODE);
        this.household = jsonObject.getString(singleOCs.COLUMN_NAME_HOUSEHOLD);
        this.childName = jsonObject.getString(singleOCs.COLUMN_NAME_CHILDNAME);
        this.sG = jsonObject.getString(singleOCs.COLUMN_NAME_SG);
        this.sOC01 = jsonObject.getString(singleOCs.COLUMN_NAME_SOC01);
        this.sOC02 = jsonObject.getString(singleOCs.COLUMN_NAME_SOC02);
        this.sOC03 = jsonObject.getString(singleOCs.COLUMN_NAME_SOC03);
        this.sOC04 = jsonObject.getString(singleOCs.COLUMN_NAME_SOC04);
        this.sOC05 = jsonObject.getString(singleOCs.COLUMN_NAME_SOC05);
        this.sOC06 = jsonObject.getString(singleOCs.COLUMN_NAME_SOC06);
        this.deviceID = jsonObject.getString(singleOCs.COLUMN_NAME_DEVICE_ID);
        this.synced = jsonObject.getString(singleOCs.COLUMN_NAME_SYNCED);
        this.synced_date = jsonObject.getString(singleOCs.COLUMN_NAME_SYNCED_DATE);

        return this;
    }

    public OCsContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleOCs._ID));
        this.UID = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_UID));
        this.UUID = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_UUID));
        this.formDate = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_FORM_DATE));
        this.areacode = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_AREA_CODE));
        this.subareacode = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SUBAREA_CODE));
        this.household = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_HOUSEHOLD));
        this.childName = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_CHILDNAME));
        this.sG = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SG));
        this.sOC01 = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SOC01));
        this.sOC02 = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SOC02));
        this.sOC03 = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SOC03));
        this.sOC04 = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SOC04));
        this.sOC05 = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SOC05));
        this.sOC06 = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SOC06));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_DEVICE_ID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleOCs.COLUMN_NAME_SYNCED_DATE));

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

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
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

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
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

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(OCsContract.singleOCs._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleOCs.COLUMN_NAME_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(singleOCs.COLUMN_NAME_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);
        json.put(singleOCs.COLUMN_NAME_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(singleOCs.COLUMN_NAME_DEVICE_ID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleOCs.COLUMN_NAME_FORM_DATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(singleOCs.COLUMN_NAME_AREA_CODE, this.areacode == null ? JSONObject.NULL : this.areacode);
        json.put(singleOCs.COLUMN_NAME_SUBAREA_CODE, this.subareacode == null ? JSONObject.NULL : this.subareacode);
        json.put(singleOCs.COLUMN_NAME_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(singleOCs.COLUMN_NAME_CHILDNAME, this.childName == null ? JSONObject.NULL : this.childName);
        json.put(singleOCs.COLUMN_NAME_SG, this.sG == null ? JSONObject.NULL : this.sG);
        json.put(singleOCs.COLUMN_NAME_SOC01, this.sOC01 == null ? JSONObject.NULL : this.sOC01);
        json.put(singleOCs.COLUMN_NAME_SOC02, this.sOC02 == null ? JSONObject.NULL : this.sOC02);
        json.put(singleOCs.COLUMN_NAME_SOC03, this.sOC03 == null ? JSONObject.NULL : this.sOC03);
        json.put(singleOCs.COLUMN_NAME_SOC04, this.sOC04 == null ? JSONObject.NULL : this.sOC04);
        json.put(singleOCs.COLUMN_NAME_SOC05, this.sOC05 == null ? JSONObject.NULL : this.sOC05);
        json.put(singleOCs.COLUMN_NAME_SOC06, this.sOC06 == null ? JSONObject.NULL : this.sOC06);



        return json;
    }

    public static abstract class singleOCs implements BaseColumns {

        public static final String TABLE_NAME = "ocs";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_UUID = "uuid";
        public static final String COLUMN_NAME_PROJECT_NAME = "projectname";
        public static final String COLUMN_NAME_DEVICE_ID = "deviceid";
        public static final String COLUMN_NAME_SYNCED = "sync";
        public static final String COLUMN_NAME_SYNCED_DATE = "sync_date";
        public static final String COLUMN_NAME_FORM_DATE = "fromdate";
        public static final String COLUMN_NAME_AREA_CODE = "areacode";
        public static final String COLUMN_NAME_SUBAREA_CODE = "subarea";
        public static final String COLUMN_NAME_HOUSEHOLD = "household";
        public static final String COLUMN_NAME_CHILDNAME = "childname";

        public static final String COLUMN_NAME_SG = "sg";
        public static final String COLUMN_NAME_SOC01 = "soc01";
        public static final String COLUMN_NAME_SOC02 = "soc02";
        public static final String COLUMN_NAME_SOC03 = "soc03";
        public static final String COLUMN_NAME_SOC04 = "soc04";
        public static final String COLUMN_NAME_SOC05 = "soc05";
        public static final String COLUMN_NAME_SOC06 = "soc06";

    }
}
