package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionICActivity extends Activity {

    private static final String TAG = SectionICActivity.class.getSimpleName();

    public int updcount;
    public Integer icTP;
    public boolean ic;

    @BindView(R.id.activity_section_ic)
    ScrollView activitySectionF;
    @BindView(R.id.vic)
    TextView vic;
    @BindView(R.id.vic01a)
    RadioGroup vic01a;
    @BindView(R.id.vic01a1)
    RadioButton vic01a1;
    @BindView(R.id.vic01a2)
    RadioButton vic01a2;
    @BindView(R.id.vic01c)
    DatePicker vic01c;
    @BindView(R.id.vic01b)
    RadioGroup vic01b;
    @BindView(R.id.vic01b1)
    RadioButton vic01b1;
    @BindView(R.id.vic01b2)
    RadioButton vic01b2;
    @BindView(R.id.vic01b3)
    RadioButton vic01b3;
    @BindView(R.id.vic01b4)
    RadioButton vic01b4;
    @BindView(R.id.vic01b5)
    RadioButton vic01b5;
    @BindView(R.id.vic01b6)
    RadioButton vic01b6;
    @BindView(R.id.vic01b7)
    RadioButton vic01b7;
    @BindView(R.id.vic01b99)
    RadioButton vic01b99;
    @BindView(R.id.vic01b88)
    RadioButton vic01b88;
    @BindView(R.id.vic01b88x)
    EditText vic01b88x;
    @BindView(R.id.vic01d)
    RadioGroup vic01d;
    @BindView(R.id.vic01d1)
    RadioButton vic01d1;
    @BindView(R.id.vic01d2)
    RadioButton vic01d2;
    @BindView(R.id.vic01d99)
    RadioButton vic01d99;
    @BindView(R.id.vic01d88)
    RadioButton vic01d88;
    @BindView(R.id.vic01d88x)
    EditText vic01d88x;
    @BindView(R.id.vic01e)
    RadioGroup vic01e;
    @BindView(R.id.vic01e1)
    RadioButton vic01e1;
    @BindView(R.id.vic01e2)
    RadioButton vic01e2;
    @BindView(R.id.vic01e3)
    RadioButton vic01e3;
    @BindView(R.id.vic01e88)
    RadioButton vic01e88;
    @BindView(R.id.vic01e88x)
    EditText vic01e88x;
    @BindView(R.id.vic01f1)
    CheckBox vic01f1;
    @BindView(R.id.vic01f2)
    CheckBox vic01f2;
    @BindView(R.id.vic01f3)
    CheckBox vic01f3;
    @BindView(R.id.vic01f4)
    CheckBox vic01f4;
    @BindView(R.id.vic01f5)
    CheckBox vic01f5;
    @BindView(R.id.vic01f6)
    CheckBox vic01f6;
    @BindView(R.id.vic01f99)
    CheckBox vic01f99;
    @BindView(R.id.vic01f88)
    CheckBox vic01f88;
    @BindView(R.id.vic01f88x)
    EditText vic01f88x;
    @BindView(R.id.vic01g1)
    CheckBox vic01g1;
    @BindView(R.id.vic01g2)
    CheckBox vic01g2;
    @BindView(R.id.vic01g3)
    CheckBox vic01g3;
    @BindView(R.id.vic01g4)
    CheckBox vic01g4;
    @BindView(R.id.vic01g5)
    CheckBox vic01g5;
    @BindView(R.id.vic01g6)
    CheckBox vic01g6;
    @BindView(R.id.vic01g99)
    CheckBox vic01g99;
    @BindView(R.id.vic01g88)
    CheckBox vic01g88;
    @BindView(R.id.vic01g88x)
    EditText vic01g88x;
    private int tp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ic);
        ButterKnife.bind(this);

        icTP = getIntent().getIntExtra("icTP", 0);
        icTP += 1;
        ic = getIntent().getBooleanExtra("ic", false);
        switch (icTP) {
            case 1:
                //DOV.setMinDate(new Date().getTime() - (VIRBandApp.MILLISECONDS_IN_DAY * VIRBandApp.ageindays));
                vic.setText(getString(R.string.vic1));
                break;
            case 2:
                //DOV.setMinDate(d.getTime());
                vic.setText(getString(R.string.vic2));
                break;
            case 3:
                //DOV.setMinDate(d.getTime());
                vic.setText(getString(R.string.vic3));
                break;
            case 4:
                //DOV.setMinDate(d.getTime());
                vic.setText(getString(R.string.vic4));
                break;
            case 5:
                //DOV.setMinDate(d.getTime());
                vic.setText(getString(R.string.vic5));
                break;
            case 6:
                //DOV.setMinDate(d.getTime());
                vic.setText(getString(R.string.vic6));
                break;

            default:
                //DOV.setMinDate(d.getTime() + VIRBandApp.MILLISECONDS_IN_DAY);
                break;
        }

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

        int updcount = db.updateSE();

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

        String DOB = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(vic01c.getCalendarView().getDate());

        JSONObject sic = new JSONObject();

        sic.put("vic01a", vic01a1.isChecked() ? "1" : vic01a2.isChecked() ? "2" : "default");
        sic.put("vic01b", vic01b1.isChecked() ? "1"
                : vic01b2.isChecked() ? "2"
                : vic01b3.isChecked() ? "3" :
                                vic01b4.isChecked() ? "4" :
                                        vic01b5.isChecked() ? "5" :
                                                vic01b6.isChecked() ? "6" :
                                                        vic01b7.isChecked() ? "7" :
                                                                vic01b88.isChecked() ? "88" :
                                                                        vic01b99.isChecked() ? "99" :
                                                                                "default"
        );
        sic.put("vic01b88x", vic01b88x.getText().toString());
        sic.put("vic01b", vic01b1.isChecked() ? DOB : "");
        sic.put("vic01d", vic01d1.isChecked() ? "1" :
                vic01d2.isChecked() ? "2" :
                        vic01d88.isChecked() ? "88" :
                                vic01d99.isChecked() ? "99" :
                                        "default");
        sic.put("vic01d88x", vic01d88x.getText().toString());
        sic.put("vic01e", vic01e1.isChecked() ? "1"
                : vic01e2.isChecked() ? "2"
                : vic01e3.isChecked() ? "3"
                : vic01e88.isChecked() ? "88"
                : "default");
        sic.put("vic01e88x", vic01e88x.getText().toString());
        sic.put("vic01f1", vic01f1.isChecked() ? "1" : "default");
        sic.put("vic01f2", vic01f2.isChecked() ? "2" : "default");
        sic.put("vic01f3", vic01f3.isChecked() ? "3" : "default");
        sic.put("vic01f4", vic01f4.isChecked() ? "4" : "default");
        sic.put("vic01f5", vic01f5.isChecked() ? "5" : "default");
        sic.put("vic01f6", vic01f6.isChecked() ? "6" : "default");
        sic.put("vic01f99", vic01f99.isChecked() ? "99" : "default");
        sic.put("vic01f88", vic01f88.isChecked() ? "88" : "default");
        sic.put("vic01f88x", vic01f88x.getText().toString());
        sic.put("vic01g1", vic01g1.isChecked() ? "1" : "default");
        sic.put("vic01g2", vic01g2.isChecked() ? "2" : "default");
        sic.put("vic01g3", vic01g3.isChecked() ? "3" : "default");
        sic.put("vic01g4", vic01g4.isChecked() ? "4" : "default");
        sic.put("vic01g5", vic01g5.isChecked() ? "5" : "default");
        sic.put("vic01g6", vic01g6.isChecked() ? "6" : "default");
        sic.put("vic01g99", vic01g99.isChecked() ? "99" : "default");
        sic.put("vic01g88", vic01g88.isChecked() ? "88" : "default");
        sic.put("vic01g88x", vic01g88x.getText().toString());

        /*sic.put("ve0201", ve0201.isChecked() ? "1" : "default");
        sic.put("ve0202", ve0202.isChecked() ? "2" : "default");
        sic.put("ve0203", ve0203.isChecked() ? "3" : "default");
        sic.put("ve0204", ve0204.isChecked() ? "4" : "default");
        sic.put("ve0205", ve0205.isChecked() ? "5" : "default");
        sic.put("ve0288", ve0288.isChecked() ? "88" : "default");
        sic.put("ve0288x", ve0288x.getText().toString());
        sic.put("ve03", ve0301.isChecked() ? "1"
                : ve0302.isChecked() ? "2"
                : ve0303.isChecked() ? "3"
                : ve0304.isChecked() ? "4"
                : ve0305.isChecked() ? "5"
                : ve0306.isChecked() ? "6"
                : ve0307.isChecked() ? "7"
                : ve0308.isChecked() ? "8"
                : ve0309.isChecked() ? "9"
                : ve0310.isChecked() ? "10"
                : ve0311.isChecked() ? "11"
                : ve0312.isChecked() ? "12"
                : ve0388.isChecked() ? "88"
                : "default");*/

        switch (icTP) {

            case 1:
                MainApp.fc.setsIC01(String.valueOf(sic));
                break;

            case 2:
                MainApp.fc.setsIC02(String.valueOf(sic));
                break;

            case 3:
                MainApp.fc.setsIC03(String.valueOf(sic));
                break;

            case 4:
                MainApp.fc.setsIC04(String.valueOf(sic));
                break;

            case 5:
                MainApp.fc.setsIC05(String.valueOf(sic));
                break;

            case 6:
                MainApp.fc.setsIC06(String.valueOf(sic));
                break;
            default:
                break;

        }

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        return true;
    }


}
