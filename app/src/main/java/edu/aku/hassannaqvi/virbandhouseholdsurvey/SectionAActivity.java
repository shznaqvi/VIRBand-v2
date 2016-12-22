package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();

    // District Spinner (used in LoginActivity)
    public static ArrayList<String> lables;
    public static ArrayList<String> values;


    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.activity_seaction_a)
    ScrollView activitySeactionA;
    @BindView(R.id.crf1_header)
    TextView crf1Header;
    @BindView(R.id.areaCode)
    TextView areaCode;
    @BindView(R.id.subAreaCode)
    EditText subAreaCode;
    @BindView(R.id.household)
    EditText household;
    @BindView(R.id.childCount)
    EditText childCount;
    @BindView(R.id.crf2_header)
    TextView crf2Header;
    @BindView(R.id.vb01)
    EditText vb01;
    @BindView(R.id.vb02)
    RadioGroup vb02;
    @BindView(R.id.vb0201)
    RadioButton vb0201;
    @BindView(R.id.vb0202)
    RadioButton vb0202;
    @BindView(R.id.vbAgeDob)
    RadioGroup vbAgeDob;
    @BindView(R.id.vbAge)
    RadioButton vbAge;
    @BindView(R.id.vbDob)
    RadioButton vbDob;
    @BindView(R.id.fldGrpDOB)
    LinearLayout fldGrpDOB;
    @BindView(R.id.vb03)
    DatePicker vb03;
    @BindView(R.id.fldGrpAge)
    LinearLayout fldGrpAge;
    @BindView(R.id.vb04d)
    EditText vb04d;
    @BindView(R.id.vb04m)
    EditText vb04m;
    @BindView(R.id.vb04y)
    EditText vb04y;
    @BindView(R.id.vb05)
    EditText vb05;
    @BindView(R.id.vb06)
    EditText vb06;
    @BindView(R.id.vb07)
    RadioGroup vb07;
    @BindView(R.id.vb0701)
    RadioButton vb0701;
    @BindView(R.id.vb0702)
    RadioButton vb0702;
    @BindView(R.id.vb0703)
    RadioButton vb0703;
    @BindView(R.id.vb0704)
    RadioButton vb0704;
    @BindView(R.id.vb0788)
    RadioButton vb0788;
    @BindView(R.id.vb0788x)
    EditText vb0788x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/jameelnoorinastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        ButterKnife.bind(this);

// Spinner Drop down elements
        lables = new ArrayList<String>();
        lables.add("Pehelwan Goth");
        lables.add("Sachal Goth");

        values = new ArrayList<String>();
        values.add("01");
        values.add("02");
        areaCode.setText(getString(R.string.AreaCode) + ": " + lables.get(values.indexOf(String.valueOf(MainApp.areaCode))));
        vb03.setMaxDate(new Date().getTime());
        vb03.setMinDate(new Date().getTime() - (MainApp.MILLISECONDS_IN_YEAR * 2));

        vbAgeDob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vbAge.isChecked()) {
                    fldGrpAge.setVisibility(View.VISIBLE);
                    fldGrpDOB.setVisibility(View.GONE);
                } else if (vbDob.isChecked()) {
                    fldGrpDOB.setVisibility(View.VISIBLE);
                    fldGrpAge.setVisibility(View.GONE);
                    vb04d.setText(null);
                    vb04m.setText(null);
                    vb04y.setText(null);
                }
            }
        });

        vb07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vb0788.isChecked()) {
                    vb0788x.setVisibility(View.VISIBLE);
                } else {
                    vb0788x.setVisibility(View.GONE);
                    vb0788x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Closing Section", Toast.LENGTH_SHORT).show();
                //Intent endSec = new Intent(this, EndingActivity.class);
                //endSec.putExtra("complete", false);
                //startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section C", Toast.LENGTH_SHORT).show();

//                Toast.makeText(getApplicationContext(),""+household.getText().toString().length(),Toast.LENGTH_LONG).show();

                finish();

                Intent secB = new Intent(this, SectionCActivity.class);
                startActivity(secB);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
        MainApp.fc = new FormsContract();
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setFormDate(dtToday);
        MainApp.fc.setInterviewer(MainApp.userName);
        MainApp.fc.setAreacode(String.valueOf(MainApp.areaCode));
        MainApp.fc.setSubareacode(subAreaCode.getText().toString());
        MainApp.fc.setHousehold(household.getText().toString());
        MainApp.fc.setChildName(vb01.getText().toString());
        MainApp.fc.setChildCount(childCount.getText().toString());

        JSONObject sB = new JSONObject();

        sB.put("vb01", vb01.getText().toString());
        sB.put("vb02", vb0201.isChecked() ? "1" : vb0202.isChecked() ? "2" : "x");
        sB.put("vb03", new SimpleDateFormat("dd-MM-yyyy").format(vb03.getCalendarView().getDate()));
        sB.put("vb04d", vb04d.getText().toString());
        sB.put("vb04m", vb04m.getText().toString());
        sB.put("vb04y", vb04y.getText().toString());

        if (vbDob.isChecked()) {
            Calendar cal = Calendar.getInstance();
            cal.set(vb03.getYear(), vb03.getMonth(), vb03.getDayOfMonth());
            Date date1 = new Date();
            Date date2 = cal.getTime();
            long diff = date1.getTime() - date2.getTime();
            MainApp.ageindays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } else {
            int m2days = (int) (Integer.valueOf(vb04m.getText().toString()) * 30.4375);
            int y2days = (Integer.valueOf(vb04y.getText().toString()) * 365);
            MainApp.ageindays = m2days + y2days + Integer.valueOf(vb04d.getText().toString());
        }


        sB.put("vb05", vb05.getText().toString());
        sB.put("vb06", vb06.getText().toString());
        sB.put("vb07", vb0701.isChecked() ? "1" : vb0702.isChecked() ? "2" : vb0703.isChecked() ? "3"
                : vb0704.isChecked() ? "4" : vb0788.isChecked() ? "88" : "");
        sB.put("vb0788x", vb0788x.getText().toString());

        MainApp.fc.setsB(String.valueOf(sB));
        setGPS();

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = null;
        rowId = db.addForm(MainApp.fc);

        MainApp.fc.setID(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            MainApp.fc.setUID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.getID()));
            Toast.makeText(this, "Current Form No: " + MainApp.fc.getUID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();

        // Sub Area Code 
        if (subAreaCode.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.subAreaCode), Toast.LENGTH_LONG).show();
            subAreaCode.setError("This data is Required!");
            Log.i(TAG, "vbSubAreaCode: This data is Required!");
            return false;
        } else {
            subAreaCode.setError(null);
        }
        if (household.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.household), Toast.LENGTH_LONG).show();
            household.setError("This data is Required!");
            Log.i(TAG, "household: This data is Required!");
            return false;
        } else {
            household.setError(null);
        }

        // Household
//        if (household.getText().toString().length() < 5 || !household.getText().toString().contains("-")) {

        if (household.getText().toString().length() != 5) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.household), Toast.LENGTH_LONG).show();
//            household.setError("This data is invalid!");
            household.setError("Field required 5 characters");
            Log.i(TAG, "household: This data is invalid!");
            return false;
        } else {
            household.setError(null);
        }

        // Child Count
        if (childCount.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.childCount), Toast.LENGTH_LONG).show();
            childCount.setError("This data is Required!");
            Log.i(TAG, "childCount: This data is Required!");
            return false;
        } else {
            childCount.setError(null);
        }


        // Child Name 04
        if (vb01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb01), Toast.LENGTH_LONG).show();
            vb01.setError("This data is Required!");
            Log.i(TAG, "vb01: This data is Required!");
            return false;
        } else {
            vb01.setError(null);
        }

        // Gender
        if (vb02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb02), Toast.LENGTH_LONG).show();
            vb0201.setError("This data is Required!");
            Log.i(TAG, "vb02: This data is Required!");
            return false;
        } else {
            vb0201.setError(null);
        }

        // Switch ? Age : DOB
        if (vbAgeDob.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb04) + "یا" + getString(R.string.vb03), Toast.LENGTH_LONG).show();
            vbAge.setError("This data is Required!");
            Log.i(TAG, "vbAgeDOB: This data is Required!");
            return false;
        } else {
            vbAge.setError(null);
        }
        if (vbAge.isChecked() && (vb04d.getText().toString().isEmpty() || vb04m.getText().toString().isEmpty() || vb04y.getText().toString().isEmpty())) {
            Toast.makeText(this, "ERROR(incomplete): " + getString(R.string.vb04), Toast.LENGTH_LONG).show();
            vb04d.setError("Age not given");
            Log.i(TAG, "vb04: Age no given");
            return false;
        }

        else if (vbAge.isChecked() && (Integer.valueOf(vb04d.getText().toString()) > MainApp.DAYS_LIMIT
                || Integer.valueOf(vb04m.getText().toString()) > MainApp.MONTHS_UPPER_LIMIT
                || Integer.valueOf(vb04m.getText().toString()) < MainApp.MONTHS_LOWER_LIMIT)) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.vb04), Toast.LENGTH_LONG).show();
            vb04m.setError("This is invalid");
            Log.i(TAG, "This is invalid");
            return false;
        } else {
            vb04d.setError(null);
        }

        // Father's Name 08
        if (vb05.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb05), Toast.LENGTH_LONG).show();
            vb05.setError("This data is Required!");
            Log.i(TAG, "vb05: This data is Required!");
            return false;
        } else {
            vb05.setError(null);
        }

        // Mother's Name 09
        if (vb06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb06), Toast.LENGTH_LONG).show();
            vb06.setError("This data is Required!");
            Log.i(TAG, "vb06: This data is Required!");
            return false;
        } else {
            vb06.setError(null);
        }

        // Place of Birth
        if (vb07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb07), Toast.LENGTH_LONG).show();
            vb0701.setError("This data is Required!");
            Log.i(TAG, "vb07: This data is Required!");
            return false;
        } else {
            vb0701.setError(null);
        }

        // Place of Birth -- Others
        if (vb0788.isChecked() && vb0788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vb07) + "-" + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vb0788x.setError("This data is Required!");
            Log.i(TAG, "vb07: This data is Required!");
            return false;
        } else {
            vb0788x.setError(null);
        }



        return true;
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        // CONVERTING GPS TIMESTAMP TO DATETIME FORMAT
        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        MainApp.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
        MainApp.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
        MainApp.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
        MainApp.fc.setGpsTime(date); // Timestamp is converted to date above

        Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
    }
}
