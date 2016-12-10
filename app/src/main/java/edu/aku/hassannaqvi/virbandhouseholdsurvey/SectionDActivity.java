package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionDActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getSimpleName();

    @BindView(R.id.activity_section_d)
    ScrollView activitySectionD;
    @BindView(R.id.fldGrpvd01)
    LinearLayout fldGrpvd01;
    @BindView(R.id.vd01)
    RadioGroup vd01;
    @BindView(R.id.vd0101)
    RadioButton vd0101;
    @BindView(R.id.vd0102)
    RadioButton vd0102;
    @BindView(R.id.vd0103)
    RadioButton vd0103;
    @BindView(R.id.vd0104)
    RadioButton vd0104;
    @BindView(R.id.vd0105)
    RadioButton vd0105;
    @BindView(R.id.vd0106)
    RadioButton vd0106;
    @BindView(R.id.vd0107)
    RadioButton vd0107;
    @BindView(R.id.vd0108)
    RadioButton vd0108;
    @BindView(R.id.vd0188)
    RadioButton vd0188;
    @BindView(R.id.vd0188x)
    EditText vd0188x;
    @BindView(R.id.vd02)
    RadioGroup vd02;
    @BindView(R.id.vd0201)
    RadioButton vd0201;
    @BindView(R.id.vd0202)
    RadioButton vd0202;
    @BindView(R.id.vd0203)
    RadioButton vd0203;
    @BindView(R.id.vd0204)
    RadioButton vd0204;
    @BindView(R.id.vd0205)
    RadioButton vd0205;
    @BindView(R.id.vd0206)
    RadioButton vd0206;
    @BindView(R.id.vd0207)
    RadioButton vd0207;
    @BindView(R.id.vd0208)
    RadioButton vd0208;
    @BindView(R.id.vd0299)
    RadioButton vd0299;
    @BindView(R.id.vd0288)
    RadioButton vd0288;
    @BindView(R.id.vd0288x)
    EditText vd0288x;
    @BindView(R.id.vd03)
    RadioGroup vd03;
    @BindView(R.id.vd0301)
    RadioButton vd0301;
    @BindView(R.id.vd0302)
    RadioButton vd0302;
    @BindView(R.id.vd0303)
    RadioButton vd0303;
    @BindView(R.id.vd0304)
    RadioButton vd0304;
    @BindView(R.id.vd0305)
    RadioButton vd0305;
    @BindView(R.id.vd0306)
    RadioButton vd0306;
    @BindView(R.id.vd0307)
    RadioButton vd0307;
    @BindView(R.id.vd0308)
    RadioButton vd0308;
    @BindView(R.id.vd0388)
    RadioButton vd0388;
    @BindView(R.id.vd0399)
    RadioButton vd0399;
    @BindView(R.id.vd0388x)
    EditText vd0388x;
    @BindView(R.id.vd04)
    RadioGroup vd04;
    @BindView(R.id.vd0401)
    RadioButton vd0401;
    @BindView(R.id.vd0402)
    RadioButton vd0402;
    @BindView(R.id.vd0403)
    RadioButton vd0403;
    @BindView(R.id.vd0404)
    RadioButton vd0404;
    @BindView(R.id.vd0405)
    RadioButton vd0405;
    @BindView(R.id.vd0499)
    RadioButton vd0499;
    @BindView(R.id.vd0488)
    RadioButton vd0488;
    @BindView(R.id.vd0488x)
    EditText vd0488x;
    @BindView(R.id.vd05)
    RadioGroup vd05;
    @BindView(R.id.vd0501)
    RadioButton vd0501;
    @BindView(R.id.vd0502)
    RadioButton vd0502;
    @BindView(R.id.vd0503)
    RadioButton vd0503;
    @BindView(R.id.vd0504)
    RadioButton vd0504;
    @BindView(R.id.vd0505)
    RadioButton vd0505;
    @BindView(R.id.vd0506)
    RadioButton vd0506;
    @BindView(R.id.vd0599)
    RadioButton vd0599;
    @BindView(R.id.vd0588)
    RadioButton vd0588;
    @BindView(R.id.vd0588x)
    EditText vd0588x;
    @BindView(R.id.vd06)
    RadioGroup vd06;
    @BindView(R.id.vd0601)
    RadioButton vd0601;
    @BindView(R.id.vd0602)
    RadioButton vd0602;
    @BindView(R.id.vd0603)
    RadioButton vd0603;
    @BindView(R.id.vd0604)
    RadioButton vd0604;
    @BindView(R.id.vd0605)
    RadioButton vd0605;
    @BindView(R.id.vd0606)
    RadioButton vd0606;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

        if (MainApp.isParent) {
            fldGrpvd01.setVisibility(View.VISIBLE);
            MainApp.isParent = false;
        }

        vd01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vd0188.isChecked()) {
                    vd0188x.setVisibility(View.VISIBLE);
                } else {
                    vd0188x.setVisibility(View.GONE);
                    vd0188x.setText(null);
                }
            }
        });
        
        vd02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vd0288.isChecked()) {
                    vd0288x.setVisibility(View.VISIBLE);
                } else {
                    vd0288x.setVisibility(View.GONE);
                    vd0288x.setText(null);
                }
            }
        });
        
              vd03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vd0388.isChecked()) {
                    vd0388x.setVisibility(View.VISIBLE);
                } else {
                    vd0388x.setVisibility(View.GONE);
                    vd0388x.setText(null);
                }
            }
        });
        vd04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vd0488.isChecked()) {
                    vd0488x.setVisibility(View.VISIBLE);
                } else {
                    vd0488x.setVisibility(View.GONE);
                    vd0488x.setText(null);
                }
            }
        });
        vd05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vd0588.isChecked()) {
                    vd0588x.setVisibility(View.VISIBLE);
                } else {
                    vd0588x.setVisibility(View.GONE);
                    vd0588x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();
                Intent secNext = new Intent(this, SectionEActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sd = new JSONObject();

        sd.put("vd01", vd0101.isChecked() ? "1" : vd0102.isChecked() ? "2" : vd0103.isChecked() ? "3"
                : vd0104.isChecked() ? "4" : vd0188.isChecked() ? "88" : "default");
        sd.put("vd02", vd0201.isChecked() ? "1" : vd0202.isChecked() ? "2" : vd0203.isChecked() ? "3"
                : vd0204.isChecked() ? "4"
                : vd0205.isChecked() ? "5"
                : vd0206.isChecked() ? "6"
                : vd0207.isChecked() ? "7"
                : vd0208.isChecked() ? "8"
                : vd0299.isChecked() ? "99"
                : vd0288.isChecked() ? "88"
                : "default");
        sd.put("vd0288x", vd0288x.getText().toString());
        sd.put("vd03", vd0301.isChecked() ? "1" : vd0302.isChecked() ? "2" : vd0303.isChecked() ? "3"
                : vd0304.isChecked() ? "4"
                : vd0305.isChecked() ? "5"
                : vd0306.isChecked() ? "6"
                : vd0307.isChecked() ? "7"
                : vd0308.isChecked() ? "8"
                : vd0399.isChecked() ? "99"
                : vd0388.isChecked() ? "88"
                : "default");
        sd.put("vd0388x", vd0388x.getText().toString());
        sd.put("vd04", vd0401.isChecked() ? "1" 
                : vd0402.isChecked() ? "2" 
                : vd0403.isChecked() ? "3"
                : vd0404.isChecked() ? "4"
                : vd0405.isChecked() ? "5"
                : vd0499.isChecked() ? "99"
                : vd0488.isChecked() ? "88"
                : "default");
        sd.put("vd0488x", vd0488x.getText().toString());
        sd.put("vd05", vd0501.isChecked() ? "1"
                : vd0502.isChecked() ? "2"
                : vd0503.isChecked() ? "3"
                : vd0504.isChecked() ? "4"
                : vd0505.isChecked() ? "5"
                : vd0599.isChecked() ? "99"
                : vd0588.isChecked() ? "88"
                : "default");
        sd.put("vd0588x", vd0588x.getText().toString());
        sd.put("vd06", vd0601.isChecked() ? "1"
                : vd0602.isChecked() ? "2"
                : vd0603.isChecked() ? "3"
                : vd0604.isChecked() ? "4"
                : vd0605.isChecked() ? "5"
                : vd0606.isChecked() ? "6"
                : "default");

        MainApp.fc.setsD(String.valueOf(sd));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (MainApp.isParent) {
            if (vd01.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vd01), Toast.LENGTH_LONG).show();
                vd0188.setError("This data is Required!");
                Log.i(TAG, "vd01: This data is Required!");
                return false;
            } else {
                vd0188.setError(null);
            }
            
        }
        if (vd0188.isChecked() && vd0188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vd01) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vd0188x.setError("This data is Required!");
            Log.i(TAG, "vd0188x: This data is Required!");
            return false;
        } else {
            vd0188x.setError(null);
        }
        
        if (vd02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vd02), Toast.LENGTH_LONG).show();
            vd0288.setError("This data is Required!");
            Log.i(TAG, "vd02: This data is Required!");
            return false;
        } else {
            vd0288.setError(null);
        }

        if (vd0288.isChecked() && vd0288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vd02) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vd0288x.setError("This data is Required!");
            Log.i(TAG, "vd0288x: This data is Required!");
            return false;
        } else {
            vd0288x.setError(null);
        }
        
        if (vd03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vd03), Toast.LENGTH_LONG).show();
            vd0388.setError("This data is Required!");
            Log.i(TAG, "vd03: This data is Required!");
            return false;
        } else {
            vd0388.setError(null);
        }

        if (vd0388.isChecked() && vd0388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vd03) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vd0388x.setError("This data is Required!");
            Log.i(TAG, "vd0388x: This data is Required!");
            return false;
        } else {
            vd0388x.setError(null);
        }
        
        if (vd04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vd04), Toast.LENGTH_LONG).show();
            vd0488.setError("This data is Required!");
            Log.i(TAG, "vd04: This data is Required!");
            return false;
        } else {
            vd0488.setError(null);
        }

        if (vd0488.isChecked() && vd0488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vd04) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vd0488x.setError("This data is Required!");
            Log.i(TAG, "vd0488x: This data is Required!");
            return false;
        } else {
            vd0488x.setError(null);
        }
        
        if (vd05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vd05), Toast.LENGTH_LONG).show();
            vd0588.setError("This data is Required!");
            Log.i(TAG, "vd05: This data is Required!");
            return false;
        } else {
            vd0588.setError(null);
        }

        if (vd0588.isChecked() && vd0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vd05) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vd0588x.setError("This data is Required!");
            Log.i(TAG, "vd0588x: This data is Required!");
            return false;
        } else {
            vd0588x.setError(null);
        }
        
        if (vd06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vd06), Toast.LENGTH_LONG).show();
            vd0606.setError("This data is Required!");
            Log.i(TAG, "vd06: This data is Required!");
            return false;
        } else {
            vd0606.setError(null);
        }
        return true;
    }

}
