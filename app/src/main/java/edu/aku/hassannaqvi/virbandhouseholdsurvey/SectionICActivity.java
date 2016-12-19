package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
import java.util.Date;

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
    @BindView(R.id.vic_a)
    RadioGroup vic_a;
    @BindView(R.id.vic_a01)
    RadioButton vic_a01;
    @BindView(R.id.vic_a02)
    RadioButton vic_a02;
    @BindView(R.id.vic_c)
    DatePicker vic_c;
    @BindView(R.id.vic_b)
    RadioGroup vic_b;
    @BindView(R.id.vic_b01)
    RadioButton vic_b01;
    @BindView(R.id.vic_b02)
    RadioButton vic_b02;
    @BindView(R.id.vic_b03)
    RadioButton vic_b03;
    @BindView(R.id.vic_b04)
    RadioButton vic_b04;
    @BindView(R.id.vic_b05)
    RadioButton vic_b05;
    @BindView(R.id.vic_b06)
    RadioButton vic_b06;
    @BindView(R.id.vic_b07)
    RadioButton vic_b07;
    @BindView(R.id.vic_b99)
    RadioButton vic_b99;
    @BindView(R.id.vic_b88)
    RadioButton vic_b88;
    @BindView(R.id.vic_b88x)
    EditText vic_b88x;
    @BindView(R.id.vic_d)
    RadioGroup vic_d;
    @BindView(R.id.vic_d01)
    RadioButton vic_d01;
    @BindView(R.id.vic_d02)
    RadioButton vic_d02;
    @BindView(R.id.vic_d99)
    RadioButton vic_d99;
    @BindView(R.id.vic_d88)
    RadioButton vic_d88;
    @BindView(R.id.vic_d88x)
    EditText vic_d88x;
    @BindView(R.id.vic_e)
    RadioGroup vic_e;
    @BindView(R.id.vic_e01)
    RadioButton vic_e01;
    @BindView(R.id.vic_e02)
    RadioButton vic_e02;
    @BindView(R.id.vic_e03)
    RadioButton vic_e03;
    @BindView(R.id.vic_e88)
    RadioButton vic_e88;
    @BindView(R.id.vic_e88x)
    EditText vic_e88x;
    @BindView(R.id.vic_f01)
    CheckBox vic_f01;
    @BindView(R.id.vic_f02)
    CheckBox vic_f02;
    @BindView(R.id.vic_f03)
    CheckBox vic_f03;
    @BindView(R.id.vic_f04)
    CheckBox vic_f04;
    @BindView(R.id.vic_f05)
    CheckBox vic_f05;
    @BindView(R.id.vic_f06)
    CheckBox vic_f06;
    @BindView(R.id.vic_f99)
    CheckBox vic_f99;
    @BindView(R.id.vic_f88)
    CheckBox vic_f88;
    @BindView(R.id.vic_f88x)
    EditText vic_f88x;
    @BindView(R.id.vic_g01)
    CheckBox vic_g01;
    @BindView(R.id.vic_g02)
    CheckBox vic_g02;
    @BindView(R.id.vic_g03)
    CheckBox vic_g03;
    @BindView(R.id.vic_g04)
    CheckBox vic_g04;
    @BindView(R.id.vic_g05)
    CheckBox vic_g05;
    @BindView(R.id.vic_g06)
    CheckBox vic_g06;
    @BindView(R.id.vic_g99)
    CheckBox vic_g99;
    @BindView(R.id.vic_g88)
    CheckBox vic_g88;
    @BindView(R.id.vic_g88x)
    EditText vic_g88x;
    @BindView(R.id.fldGrpDOV)
    LinearLayout fldGrpDov;

    private int tp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ic);
        ButterKnife.bind(this);

        icTP = getIntent().getIntExtra("icTP", 1);
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
        vic_c.setMinDate(new Date().getTime() - (MainApp.MILLISECONDS_IN_DAY * (MainApp.ageindays)));
        vic_c.setMaxDate(new Date().getTime() + MainApp.MILLISECONDS_IN_DAY);

        vic_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vic_b01.isChecked()) {
                    fldGrpDov.setVisibility(View.VISIBLE);
                } else {
                    fldGrpDov.setVisibility(View.GONE);
                }
                if (vic_b88.isChecked()) {
                    vic_b88x.setVisibility(View.VISIBLE);
                } else {
                    vic_b88x.setVisibility(View.GONE);
                    vic_b88x.setText(null);
                }
            }
        });
        
        vic_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vic_d88.isChecked()) {
                    vic_d88x.setVisibility(View.VISIBLE);
                } else {
                    vic_d88x.setVisibility(View.GONE);
                    vic_d88x.setText(null);

                }
            }
        });
         
        vic_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (vic_e88.isChecked()) {
                    vic_e88x.setVisibility(View.VISIBLE);
                } else {
                    vic_e88x.setVisibility(View.GONE);
                    vic_e88x.setText(null);

                }
            }
        });
        
        vic_f88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f88x.setVisibility(View.VISIBLE);
                } else {
                    vic_f88x.setVisibility(View.GONE);
                    vic_f88x.setText(null);

                }
            }
        });

        vic_g88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_g88x.setVisibility(View.VISIBLE);
                } else {
                    vic_g88x.setVisibility(View.GONE);
                    vic_g88x.setText(null);

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
                if (icTP >= 1 && icTP < 6) {
                    Intent repSec = new Intent(this, SectionICActivity.class);
                    repSec.putExtra("icTP", icTP);
                    if (ic) {
                        repSec.putExtra("ic", true);
                    } else {
                        repSec.putExtra("ic", false);
                    }
                    startActivity(repSec);
                } else {
                    Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                    Intent endSec = new Intent(this, EndingActivity.class);
                    endSec.putExtra("complete", false);
                    startActivity(endSec);
                }
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        if (ic) {
            updcount = db.updateSIC(icTP);
        } else {
            // updcount = db.updateSOC(icTP);
        }

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

        String DOV = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(vic_c.getCalendarView().getDate());

        JSONObject sic = new JSONObject();

        sic.put("vic" + icTP + "a", vic_a01.isChecked() ? "1" : vic_a02.isChecked() ? "2" : "default");
        sic.put("vic" + icTP + "b", vic_b01.isChecked() ? "1"
                : vic_b02.isChecked() ? "2"
                : vic_b03.isChecked() ? "3" :
                vic_b04.isChecked() ? "4" :
                        vic_b05.isChecked() ? "5" :
                                vic_b06.isChecked() ? "6" :
                                        vic_b07.isChecked() ? "7" :
                                                vic_b88.isChecked() ? "88" :
                                                        vic_b99.isChecked() ? "99" :
                                                                "default"
        );
        sic.put("vic" + icTP + "b88x", vic_b88x.getText().toString());
        sic.put("vic" + icTP + "c", vic_b01.isChecked() ? DOV : "");

        sic.put("vic" + icTP + "d", vic_d01.isChecked() ? "1" :
                vic_d02.isChecked() ? "2" :
                        vic_d88.isChecked() ? "88" :
                                vic_d99.isChecked() ? "99" :
                                        "default");
        sic.put("vic" + icTP + "d88x", vic_d88x.getText().toString());
        sic.put("vic" + icTP + "e", vic_e01.isChecked() ? "1"
                : vic_e02.isChecked() ? "2"
                : vic_e03.isChecked() ? "3"
                : vic_e88.isChecked() ? "88"
                : "default");
        sic.put("vic" + icTP + "e88x", vic_e88x.getText().toString());
        sic.put("vic" + icTP + "f1", vic_f01.isChecked() ? "1" : "default");
        sic.put("vic" + icTP + "f2", vic_f02.isChecked() ? "2" : "default");
        sic.put("vic" + icTP + "f3", vic_f03.isChecked() ? "3" : "default");
        sic.put("vic" + icTP + "f4", vic_f04.isChecked() ? "4" : "default");
        sic.put("vic" + icTP + "f5", vic_f05.isChecked() ? "5" : "default");
        sic.put("vic" + icTP + "f6", vic_f06.isChecked() ? "6" : "default");
        sic.put("vic" + icTP + "f99", vic_f99.isChecked() ? "99" : "default");
        sic.put("vic" + icTP + "f88", vic_f88.isChecked() ? "88" : "default");
        sic.put("vic" + icTP + "f88x", vic_f88x.getText().toString());
        sic.put("vic" + icTP + "g1", vic_g01.isChecked() ? "1" : "default");
        sic.put("vic" + icTP + "g2", vic_g02.isChecked() ? "2" : "default");
        sic.put("vic" + icTP + "g3", vic_g03.isChecked() ? "3" : "default");
        sic.put("vic" + icTP + "g4", vic_g04.isChecked() ? "4" : "default");
        sic.put("vic" + icTP + "g5", vic_g05.isChecked() ? "5" : "default");
        sic.put("vic" + icTP + "g6", vic_g06.isChecked() ? "6" : "default");
        sic.put("vic" + icTP + "g99", vic_g99.isChecked() ? "99" : "default");
        sic.put("vic" + icTP + "g88", vic_g88.isChecked() ? "88" : "default");
        sic.put("vic" + icTP + "g88x", vic_g88x.getText().toString());

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

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (vic_a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_a), Toast.LENGTH_LONG).show();
            vic_a02.setError("This data is Required!");
            Log.i(TAG, "vic_a: This data is Required!");
            return false;
        } else {
            vic_a02.setError(null);
        }

        // RadioGroup
        if (vic_b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_b), Toast.LENGTH_LONG).show();
            vic_b99.setError("This data is Required!");
            Log.i(TAG, "vic_b: This data is Required!");
            return false;
        } else {
            vic_b99.setError(null);
        }

        // Others
        if (vic_b88.isChecked() && vic_b88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vic_b) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vic_b88x.setError("This data is Required!");
            Log.i(TAG, "vic_b88x: This data is Required!");
            return false;
        } else {
            vic_b88x.setError(null);
        }

        // RadioGroup
        if (vic_d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_d), Toast.LENGTH_LONG).show();
            vic_d99.setError("This data is Required!");
            Log.i(TAG, "vic_d: This data is Required!");
            return false;
        } else {
            vic_d99.setError(null);
        }

        // Others
        if (vic_d88.isChecked() && vic_d88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vic_d) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vic_d88x.setError("This data is Required!");
            Log.i(TAG, "vic_d88x: This data is Required!");
            return false;
        } else {
            vic_d88x.setError(null);
        }
        // RadioGroup
        if (vic_e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_e), Toast.LENGTH_LONG).show();
            vic_e88.setError("This data is Required!");
            Log.i(TAG, "vic_e: This data is Required!");
            return false;
        } else {
            vic_e88.setError(null);
        }

        // Others
        if (vic_e88.isChecked() && vic_e88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vic_e) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vic_e88x.setError("This data is Required!");
            Log.i(TAG, "vic_e88x: This data is Required!");
            return false;
        } else {
            vic_e88x.setError(null);
        }

        if (!(vic_f01.isChecked()
                || vic_f02.isChecked()
                || vic_f03.isChecked()
                || vic_f04.isChecked()
                || vic_f05.isChecked()
                || vic_f06.isChecked()
                || vic_f88.isChecked()
        )) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_f), Toast.LENGTH_LONG).show();
            vic_f88.setError("This data is Required!");
            Log.i(TAG, "vic_f8: This data is Required!");
            return false;
        } else {
            vic_f88.setError(null);
        }

        if (vic_f88.isChecked() && vic_f88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vic_f) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vic_f88x.setError("This data is Required!");
            Log.i(TAG, "vic_f88x: This data is Required!");
            return false;
        } else {
            vic_f88x.setError(null);
        }
        if (!(vic_g01.isChecked()
                || vic_g02.isChecked()
                || vic_g03.isChecked()
                || vic_g04.isChecked()
                || vic_g05.isChecked()
                || vic_g06.isChecked()
                || vic_g88.isChecked()
        )) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_g), Toast.LENGTH_LONG).show();
            vic_g88.setError("This data is Required!");
            Log.i(TAG, "vic_g8: This data is Required!");
            return false;
        } else {
            vic_g88.setError(null);
        }

        if (vic_g88.isChecked() && vic_g88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vic_g) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            vic_g88x.setError("This data is Required!");
            Log.i(TAG, "vic_g88x: This data is Required!");
            return false;
        } else {
            vic_g88x.setError(null);
        }


        return true;
    }


}
