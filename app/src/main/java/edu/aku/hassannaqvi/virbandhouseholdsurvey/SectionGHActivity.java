package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
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
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionGHActivity extends Activity {

    private static final String TAG = SectionGHActivity.class.getSimpleName();


    @BindView(R.id.activity_seaction_g_h)
    ScrollView activitySeactionGH;
    @BindView(R.id.crf2_header)
    TextView crf2Header;
    @BindView(R.id.vg01)
    EditText vg01;
    @BindView(R.id.vg02)
    RadioGroup vg02;
    @BindView(R.id.vg0201)
    RadioButton vg0201;
    @BindView(R.id.vg0202)
    RadioButton vg0202;
    @BindView(R.id.vgAgeDob)
    RadioGroup vgAgeDob;
    @BindView(R.id.vgDob)
    RadioButton vgDob;
    @BindView(R.id.vgAge)
    RadioButton vgAge;
    @BindView(R.id.fldGrpDOB_H)
    LinearLayout fldGrpDOBH;
    @BindView(R.id.vg03)
    DatePicker vg03;
    @BindView(R.id.fldGrpAge_H)
    LinearLayout fldGrpAgeH;
    @BindView(R.id.vg04d)
    EditText vg04d;
    @BindView(R.id.vg04m)
    EditText vg04m;
    @BindView(R.id.vg04y)
    EditText vg04y;
    @BindView(R.id.vg05)
    EditText vg05;
    @BindView(R.id.vg06)
    RadioGroup vg06;
    @BindView(R.id.vg0601)
    RadioButton vg0601;
    @BindView(R.id.vg0602)
    RadioButton vg0602;
    @BindView(R.id.vg0603)
    RadioButton vg0603;
    @BindView(R.id.vg0604)
    RadioButton vg0604;
    @BindView(R.id.vg0605)
    RadioButton vg0605;
    @BindView(R.id.vg0606)
    RadioButton vg0606;
    @BindView(R.id.vg0607)
    RadioButton vg0607;
    @BindView(R.id.vg0608)
    RadioButton vg0608;
    @BindView(R.id.vg0688)
    RadioButton vg0688;
    @BindView(R.id.vg0688x)
    EditText vg0688x;
    @BindView(R.id.vg07)
    EditText vg07;
    @BindView(R.id.vg08)
    EditText vg08;
    @BindView(R.id.vg09)
    RadioGroup vg09;
    @BindView(R.id.vg0901)
    RadioButton vg0901;
    @BindView(R.id.vg0902)
    RadioButton vg0902;
    @BindView(R.id.vg0903)
    RadioButton vg0903;
    @BindView(R.id.vg0904)
    RadioButton vg0904;
    @BindView(R.id.vg0988)
    RadioButton vg0988;
    @BindView(R.id.vg0988x)
    EditText vg0988x;
    @BindView(R.id.vg10)
    RadioGroup vg10;
    @BindView(R.id.vg1001)
    RadioButton vg1001;
    @BindView(R.id.vg1002)
    RadioButton vg1002;
    @BindView(R.id.vg11)
    RadioGroup vg11;
    @BindView(R.id.vg1101)
    RadioButton vg1101;
    @BindView(R.id.vg1102)
    RadioButton vg1102;
    @BindView(R.id.vg1103)
    RadioButton vg1103;
    @BindView(R.id.vg12)
    RadioGroup vg12;
    @BindView(R.id.vg1201)
    RadioButton vg1201;
    @BindView(R.id.vg1202)
    RadioButton vg1202;
    @BindView(R.id.vg1203)
    RadioButton vg1203;
    @BindView(R.id.fldGrpvg10)
    LinearLayout fldGrpvg10;
    @BindView(R.id.fldGrpvg11)
    LinearLayout fldGrpvg11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g_h);
        ButterKnife.bind(this);

        vgAgeDob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vgAge.isChecked()) {
                    fldGrpAgeH.setVisibility(View.VISIBLE);
                    fldGrpDOBH.setVisibility(View.GONE);
                } else if (vgDob.isChecked()) {
                    fldGrpDOBH.setVisibility(View.VISIBLE);
                    fldGrpAgeH.setVisibility(View.GONE);
                    vg04d.setText(null);
                    vg04m.setText(null);
                    vg04y.setText(null);
                }
            }
        });

        vg09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vg0988.isChecked()) {
                    vg0988x.setVisibility(View.VISIBLE);
                } else {
                    vg0988x.setVisibility(View.GONE);
                    vg0988x.setText(null);
                }
            }
        });

        vg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vg1001.isChecked()) {
                    fldGrpvg10.setVisibility(View.VISIBLE);
                } else {
                    fldGrpvg10.setVisibility(View.GONE);
                    vg11.clearCheck();
                    vg12.clearCheck();
                }
            }
        });
        vg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vg1101.isChecked()) {
                    fldGrpvg11.setVisibility(View.VISIBLE);
                } else {
                    fldGrpvg11.setVisibility(View.GONE);
                    vg12.clearCheck();
                }
            }
        });


        vg03.setMaxDate(new Date().getTime());
        vg03.setMinDate((long) (new Date().getTime() - ((MainApp.MILLISECONDS_IN_YEAR * 2.5)+ MainApp.MILLISECONDS_IN_DAY)));

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing Section G", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Closing Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing Section G", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section Index Child", Toast.LENGTH_SHORT).show();

                finish();

                Intent endSec = new Intent(this, SectionICActivity.class);
                endSec.putExtra("ic", false);
                startActivity(endSec);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = db.addOC(MainApp.oc);

        MainApp.oc.setID(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            MainApp.oc.setUID(
                    (MainApp.oc.getDeviceID() + MainApp.oc.getID()));
            Toast.makeText(this, "Current Form No: " + MainApp.oc.getUID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
        MainApp.oc = new OCsContract();
        MainApp.oc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.oc.setUUID(MainApp.fc.getUID());
        MainApp.oc.setFormDate(MainApp.fc.getFormDate());
        MainApp.oc.setAreacode(String.valueOf(MainApp.areaCode));
        MainApp.oc.setSubareacode(MainApp.fc.getSubareacode());
        MainApp.oc.setHousehold(MainApp.fc.getHousehold());
        MainApp.oc.setChildName(vg01.getText().toString());


        JSONObject sG = new JSONObject();

        sG.put("vg01", vg01.getText().toString());
        sG.put("vg02", vg0201.isChecked() ? "1" : vg0202.isChecked() ? "2" : "default");
        sG.put("vg03", new SimpleDateFormat("dd-MM-yyyy").format(vg03.getCalendarView().getDate()));
        sG.put("vg04d", vg04d.getText().toString());
        sG.put("vg04m", vg04m.getText().toString());
        sG.put("vg04y", vg04y.getText().toString());

        if (vgDob.isChecked()) {
            Calendar cal = Calendar.getInstance();
            cal.set(vg03.getYear(), vg03.getMonth(), vg03.getDayOfMonth());
            Date date1 = new Date();
            Date date2 = cal.getTime();
            long diff = date1.getTime() - date2.getTime();
            MainApp.ageindays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } else {
            int m2days = (int) (Integer.valueOf(vg04m.getText().toString()) * 30.4375);
            int y2days = (Integer.valueOf(vg04y.getText().toString()) * 365);
            MainApp.ageindays = m2days + y2days + Integer.valueOf(vg04d.getText().toString());
        }


        sG.put("vg05", vg05.getText().toString());
        sG.put("vg06", vg0601.isChecked() ? "1"
                : vg0602.isChecked() ? "2"
                : vg0603.isChecked() ? "3"
                : vg0604.isChecked() ? "4"
                : vg0605.isChecked() ? "5"
                : vg0606.isChecked() ? "6"
                : vg0607.isChecked() ? "7"
                : vg0608.isChecked() ? "8"
                : vg0688.isChecked() ? "88"
                : "default"

        );
        sG.put("vg0688x", vg0688x.getText().toString());

        sG.put("vg07", vg07.getText().toString());
        sG.put("vg08", vg08.getText().toString());
        sG.put("vg09", vg0901.isChecked() ? "1" : vg0902.isChecked() ? "2" : vg0903.isChecked() ? "3"
                : vg0904.isChecked() ? "4" : vg0988.isChecked() ? "88" : "");
        sG.put("vg0988x", vg0988x.getText().toString());
        sG.put("vg10", vg1001.isChecked() ? "1" : vg1002.isChecked() ? "2" : "default");
        sG.put("vg11", vg1101.isChecked() ? "1" : vg1102.isChecked() ? "2" : vg1103.isChecked() ? "3" : "default");
        sG.put("vg12", vg1201.isChecked() ? "1" : vg1202.isChecked() ? "2" : vg1203.isChecked() ? "3" : "default");


        MainApp.oc.setChildName(vg01.getText().toString());


        MainApp.oc.setsG(String.valueOf(sG));


        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        // Child Name
        if (vg01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg01), Toast.LENGTH_LONG).show();
            vg01.setError("This data is Required!");
            Log.i(TAG, "vg01: This data is Required!");
            return false;
        } else {
            vg01.setError(null);
        }

        // Gender
        if (vg02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg02), Toast.LENGTH_LONG).show();
            vg0201.setError("This data is Required!");
            Log.i(TAG, "vg02: This data is Required!");
            return false;
        } else {
            vg0201.setError(null);
        }

        // Switch ? Age : DOB
        if (vgAgeDob.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg04) + "یا" + getString(R.string.vg03), Toast.LENGTH_LONG).show();
            vgAge.setError("This data is Required!");
            Log.i(TAG, "vgAgeDOB: This data is Required!");
            return false;
        } else {
            vgAge.setError(null);
        }


//        Age Validation

        if (vgAge.isChecked() && (vg04d.getText().toString().isEmpty() || vg04m.getText().toString().isEmpty() || vg04y.getText().toString().isEmpty())) {
            Toast.makeText(this, "ERROR(incomplete): " + getString(R.string.vg04), Toast.LENGTH_LONG).show();
            vg04d.setError("Age not given");
            Log.i(TAG, "vg04: Age no given");
            return false;
        }
        else if(vgAge.isChecked() && (new utility().dobValidation(Integer.valueOf(vg04y.getText().toString()),Integer.valueOf(vg04m.getText().toString()),
                Integer.valueOf(vg04d.getText().toString())))){
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.vb04), Toast.LENGTH_LONG).show();
            vg04m.setError("This is invalid");
            Log.i(TAG, "This is invalid");
            return false;
        }
        else {
            vg04d.setError(null);
        }

        // Father's Name 08
        if (vg07.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg07), Toast.LENGTH_LONG).show();
            vg07.setError("This data is Required!");
            Log.i(TAG, "vg07: This data is Required!");
            return false;
        } else {
            vg07.setError(null);
        }

        // Mother's Name 09
        if (vg08.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg08), Toast.LENGTH_LONG).show();
            vg08.setError("This data is Required!");
            Log.i(TAG, "vg08: This data is Required!");
            return false;
        } else {
            vg08.setError(null);
        }

        // Place of Birth
        if (vg09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg09), Toast.LENGTH_LONG).show();
            vg0901.setError("This data is Required!");
            Log.i(TAG, "vg09: This data is Required!");
            return false;
        } else {
            vg0901.setError(null);
        }

        // Place of Birth -- Others
        if (vg0988.isChecked() && vg0988x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg09) + "-" + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vg0988x.setError("This data is Required!");
            Log.i(TAG, "vg09: This data is Required!");
            return false;
        } else {
            vg0988x.setError(null);
        }

        if (vg10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg10), Toast.LENGTH_LONG).show();
            vg1002.setError("This data is Required!");
            Log.i(TAG, "vg10: This data is Required!");
            return false;
        } else {
            vg1002.setError(null);
        }
        if (vg1001.isChecked()) {
            if (vg11.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg11), Toast.LENGTH_LONG).show();
                vg1103.setError("This data is Required!");
                Log.i(TAG, "vg11: This data is Required!");
                return false;
            } else {
                vg1103.setError(null);
            }
            if (vg1101.isChecked()) {
                if (vg12.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.vg12), Toast.LENGTH_LONG).show();
                    vg1203.setError("This data is Required!");
                    Log.i(TAG, "vg12: This data is Required!");
                    return false;
                } else {
                    vg1203.setError(null);
                }
            }
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"You Can't go back",Toast.LENGTH_LONG).show();
    }
}
