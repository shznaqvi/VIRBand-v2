package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionCActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getSimpleName();


    @BindView(R.id.activity_seaction_a)
    ScrollView activitySeactionA;
    @BindView(R.id.crf1_header)
    TextView crf1Header;
    @BindView(R.id.vc01)
    EditText vc01;
    @BindView(R.id.vc02)
    EditText vc02;
    @BindView(R.id.vc03)
    RadioGroup vc03;
    @BindView(R.id.vc0301)
    RadioButton vc0301;
    @BindView(R.id.vc0302)
    RadioButton vc0302;
    @BindView(R.id.vc04)
    EditText vc04;
    @BindView(R.id.vc05)
    RadioGroup vc05;
    @BindView(R.id.vc0501)
    RadioButton vc0501;
    @BindView(R.id.vc0502)
    RadioButton vc0502;
    @BindView(R.id.vc0601)
    EditText vc0601;
    @BindView(R.id.vc0602)
    EditText vc0602;
    @BindView(R.id.vc07)
    RadioGroup vc07;
    @BindView(R.id.vc0701)
    RadioButton vc0701;
    @BindView(R.id.vc0702)
    RadioButton vc0702;
    @BindView(R.id.vc0703)
    RadioButton vc0703;
    @BindView(R.id.vc0788)
    RadioButton vc0788;
    @BindView(R.id.vc0788x)
    EditText vc0788x;
    @BindView(R.id.vc08)
    RadioGroup vc08;
    @BindView(R.id.vc0801)
    RadioButton vc0801;
    @BindView(R.id.vc0802)
    RadioButton vc0802;
    @BindView(R.id.vc09)
    RadioGroup vc09;
    @BindView(R.id.vc0901)
    RadioButton vc0901;
    @BindView(R.id.vc0902)
    RadioButton vc0902;
    @BindView(R.id.vc0903)
    RadioButton vc0903;
    @BindView(R.id.vc0904)
    RadioButton vc0904;
    @BindView(R.id.vc0905)
    RadioButton vc0905;
    @BindView(R.id.vc0906)
    RadioButton vc0906;
    @BindView(R.id.vc0988)
    RadioButton vc0988;
    @BindView(R.id.vc0988x)
    EditText vc0988x;
    @BindView(R.id.vc10)
    RadioGroup vc10;
    @BindView(R.id.vc1001)
    RadioButton vc1001;
    @BindView(R.id.vc1002)
    RadioButton vc1002;
    @BindView(R.id.vc1003)
    RadioButton vc1003;
    @BindView(R.id.vc1004)
    RadioButton vc1004;
    @BindView(R.id.vc1005)
    RadioButton vc1005;
    @BindView(R.id.vc11)
    RadioGroup vc11;
    @BindView(R.id.vc1101)
    RadioButton vc1101;
    @BindView(R.id.vc1102)
    RadioButton vc1102;
    @BindView(R.id.vc1103)
    RadioButton vc1103;
    @BindView(R.id.vc1104)
    RadioButton vc1104;
    @BindView(R.id.vc1105)
    RadioButton vc1105;
    @BindView(R.id.vc1106)
    RadioButton vc1106;
    @BindView(R.id.vc1107)
    RadioButton vc1107;
    @BindView(R.id.vc1108)
    RadioButton vc1108;
    @BindView(R.id.vc1188)
    RadioButton vc1188;
    @BindView(R.id.vc1188x)
    EditText vc1188x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        vc07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vc0788.isChecked()) {
                    vc0788x.setVisibility(View.VISIBLE);
                } else {
                    vc0788x.setVisibility(View.GONE);
                    vc0788x.setText(null);
                }
            }
        });

        vc09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vc0988.isChecked()) {
                    vc0988x.setVisibility(View.VISIBLE);
                } else {
                    vc0988x.setVisibility(View.GONE);
                    vc0988x.setText(null);
                }
            }
        });

        vc11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vc1188.isChecked()) {
                    vc1188x.setVisibility(View.VISIBLE);
                } else {
                    vc1188x.setVisibility(View.GONE);
                    vc1188x.setText(null);
                }
            }
        });


        vc03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vc0301.isChecked()){
                    vc1101.setEnabled(false);
                    vc1103.setEnabled(false);
                    vc1105.setEnabled(false);
                    vc1107.setEnabled(false);

                    vc1102.setEnabled(true);
                    vc1104.setEnabled(true);
                    vc1106.setEnabled(true);
                    vc1108.setEnabled(true);

                }
                else {
                    vc1102.setEnabled(false);
                    vc1104.setEnabled(false);
                    vc1106.setEnabled(false);
                    vc1108.setEnabled(false);

                    vc1101.setEnabled(true);
                    vc1103.setEnabled(true);
                    vc1105.setEnabled(true);
                    vc1107.setEnabled(true);
                }

                if(vc1001.isChecked()){
                    vc1101.setEnabled(false);
                    vc1102.setEnabled(false);
                }
            }
        });

        vc10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vc1001.isChecked()){
                    vc1101.setEnabled(false);
                    vc1102.setEnabled(false);
                }else {
                    if (vc0301.isChecked()){
                        vc1102.setEnabled(true);
                    }
                    else {
                        vc1101.setEnabled(true);
                    }
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

                finish();

                Intent secNext = new Intent(this, SectionDActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSC();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for Section C", Toast.LENGTH_SHORT).show();

        JSONObject sc = new JSONObject();

        sc.put("vc01", vc01.getText().toString());
        sc.put("vc02", vc02.getText().toString());
        sc.put("vc03", vc0301.isChecked() ? "1" : vc0302.isChecked() ? "2" : "0");
        sc.put("vc04", vc04.getText().toString());
        sc.put("vc05", vc0501.isChecked() ? "1" : vc0502.isChecked() ? "2" : "0");
        sc.put("vc0601", vc0601.getText().toString());
        sc.put("vc0602", vc0602.getText().toString());
        sc.put("vc07", vc0701.isChecked() ? "1" : vc0702.isChecked() ? "2"
                : vc0703.isChecked() ? "3" : vc0788.isChecked() ? "88" : "");
        sc.put("vc0788x", vc0788x.getText().toString());
        sc.put("vc08", vc0801.isChecked() ? "1" : vc0802.isChecked() ? "2" : "0");
        sc.put("vc09", vc0901.isChecked() ? "1" : vc0902.isChecked() ? "2"
                : vc0903.isChecked() ? "3" : vc0904.isChecked() ? "4" : vc0905.isChecked() ? "5"
                : vc0906.isChecked() ? "6" : vc0988.isChecked() ? "88" : "");
        sc.put("vc0988x", vc0988x.getText().toString());
        sc.put("vc10", vc1001.isChecked() ? "1" : vc1002.isChecked() ? "2"
                : vc1003.isChecked() ? "3" : vc1004.isChecked() ? "4" : vc1005.isChecked() ? "5"
                : "");
        sc.put("vc11", vc1101.isChecked() ? "1" : vc1102.isChecked() ? "2"
                : vc1103.isChecked() ? "3" : vc1104.isChecked() ? "4" : vc1105.isChecked() ? "5"
                : vc1106.isChecked() ? "6" : vc1107.isChecked() ? "7" : vc1108.isChecked() ? "8"
                : vc1188.isChecked() ? "88" : "");
        sc.put("vc1188x", vc1188x.getText().toString());

        if (vc1101.isChecked() || vc1102.isChecked()) {
            MainApp.isParent = true;
        }

        MainApp.fc.setsC(String.valueOf(sc));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating Section C", Toast.LENGTH_SHORT).show();

        // Name of Respondent
        if (vc01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vc01), Toast.LENGTH_LONG).show();
            vc01.setError("This data is Required!");
            Log.i(TAG, "vc01: This data is Required!");
            return false;
        } else {
            vc01.setError(null);
        }

        // Age of Respondent
        if (vc02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vc02), Toast.LENGTH_LONG).show();
            vc02.setError("This data is Required!");
            Log.i(TAG, "vc02: This data is Required!");
            return false;
        } else {
            vc02.setError(null);
        }

        // Age of Respondent
        if (!vc02.getText().toString().isEmpty() && Integer.valueOf(vc02.getText().toString()) < MainApp.RESPONDENTS_AGE_LIMIT) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.vc02), Toast.LENGTH_LONG).show();
            vc02.setError("This data is Invalid!");
            Log.i(TAG, "vc02: This data is Invalid!");
            return false;
        } else {
            vc02.setError(null);
        }


        // Gender
        if (vc03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vc03), Toast.LENGTH_LONG).show();
            vc0301.setError("This data is Required!");
            Log.i(TAG, "vc03: This data is Required!");
            return false;
        } else {
            vc0301.setError(null);
        }

        // Address
        if (vc04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vc04), Toast.LENGTH_LONG).show();
            vc04.setError("This data is Required!");
            Log.i(TAG, "vc04: This data is Required!");
            return false;
        } else {
            vc04.setError(null);
        }

        // Residence
        if (vc05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vc05), Toast.LENGTH_LONG).show();
            vc0501.setError("This data is Required!");
            Log.i(TAG, "vc05: This data is Required!");
            return false;
        } else {
            vc0501.setError(null);
        }

        // PTCL
        if (vc0601.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vc0601), Toast.LENGTH_LONG).show();
            vc0601.setError("This data is Required!");
            Log.i(TAG, "vc06: This data is Required!");
            return false;
        } else {
            vc0601.setError(null);
        }

        // Mobile
        if (vc0602.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vc0602), Toast.LENGTH_LONG).show();
            vc0602.setError("This data is Required!");
            Log.i(TAG, "vc06: This data is Required!");
            return false;
        } else {
            vc0602.setError(null);
        }

        // Religion
        if (vc07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not Selected): " + getString(R.string.vc07), Toast.LENGTH_LONG).show();
            vc0788.setError("This data is Required!");
            Log.i(TAG, "vc07: This data is Required!");
            return false;
        } else {
            vc0788.setError(null);
        }

        // Religion - Others 
        if (vc0788.isChecked() && vc0788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vc07) + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vc0788x.setError("This data is Required!");
            Log.i(TAG, "vc06: This data is Required!");
            return false;
        } else {
            vc0788x.setError(null);
        }

        if (vc08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not Selected): " + getString(R.string.vc08), Toast.LENGTH_LONG).show();
            vc0802.setError("This data is Required!");
            Log.i(TAG, "vc08: This data is Required!");
            return false;
        } else {
            vc0802.setError(null);
        }


        if (vc09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not Selected): " + getString(R.string.vc09), Toast.LENGTH_LONG).show();
            vc0988.setError("This data is Required!");
            Log.i(TAG, "vc09: This data is Required!");
            return false;
        } else {
            vc0988.setError(null);
        }

        if (vc0988.isChecked() && vc0988x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vc09) + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vc0988x.setError("This data is Required!");
            Log.i(TAG, "vc06: This data is Required!");
            return false;
        } else {
            vc0988x.setError(null);
        }

        if (vc10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not Selected): " + getString(R.string.vc10), Toast.LENGTH_LONG).show();
            vc1005.setError("This data is Required!");
            Log.i(TAG, "vc10: This data is Required!");
            return false;
        } else {
            vc1005.setError(null);
        }

// Relation with Index Child
        if (vc11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not Selected): " + getString(R.string.vc11), Toast.LENGTH_LONG).show();
            vc1188.setError("This data is Required!");
            Log.i(TAG, "vc11: This data is Required!");
            return false;
        } else {
            vc1188.setError(null);
        }

        // Relation - Others
        if (vc1188.isChecked() && vc1188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vc11) + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vc1188x.setError("This data is Required!");
            Log.i(TAG, "vc06: This data is Required!");
            return false;
        } else {
            vc1188x.setError(null);
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"You Can't go back",Toast.LENGTH_LONG).show();
    }


}
