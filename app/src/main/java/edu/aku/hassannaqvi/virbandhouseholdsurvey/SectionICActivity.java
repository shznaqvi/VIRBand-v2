package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
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
    //    @BindView(R.id.vic_g01)
//    CheckBox vic_g01;
//    @BindView(R.id.vic_g02)
//    CheckBox vic_g02;
//    @BindView(R.id.vic_g03)
//    CheckBox vic_g03;
//    @BindView(R.id.vic_g04)
//    CheckBox vic_g04;
//    @BindView(R.id.vic_g05)
//    CheckBox vic_g05;
//    @BindView(R.id.vic_g06)
//    CheckBox vic_g06;
//    @BindView(R.id.vic_g99)
//    CheckBox vic_g99;
//    @BindView(R.id.vic_g88)
//    CheckBox vic_g88;
//    @BindView(R.id.vic_g88x)
//    EditText vic_g88x;
    @BindView(R.id.fldGrpDOV)
    LinearLayout fldGrpDov;
    @BindView(R.id.fldGrpvic01)
    LinearLayout fldGrpvic01;
    @BindView(R.id.fldGrpvic02)
    LinearLayout fldGrpvic02;
    @BindView(R.id.fldGrpvic03)
    LinearLayout fldGrpvic03;

    @BindView(R.id.vic_f01g)
    Spinner vic_f01g;
    @BindView(R.id.vic_f02g)
    Spinner vic_f02g;
    @BindView(R.id.vic_f03g)
    Spinner vic_f03g;
    @BindView(R.id.vic_f04g)
    Spinner vic_f04g;
    @BindView(R.id.vic_f05g)
    Spinner vic_f05g;
    @BindView(R.id.vic_f06g)
    Spinner vic_f06g;

    private int tp = 0;


    ArrayAdapter<CharSequence> adapter;

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


        vic_c.setMinDate((long) (new Date().getTime() - ((MainApp.MILLISECONDS_IN_YEAR * 2.5) + MainApp.MILLISECONDS_IN_DAY)));
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


//        vic_g88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    vic_g88x.setVisibility(View.VISIBLE);
//                } else {
//                    vic_g88x.setVisibility(View.GONE);
//                    vic_g88x.setText(null);
//
//                }
//            }
//        });

//        For Checking of ques 1

//        fldGrpvic01.setVisibility(View.GONE);
//        fldGrpvic02.setVisibility(View.GONE);
//        fldGrpvic03.setVisibility(View.GONE);

        vic_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (vic_a01.isChecked()) {

                    fldGrpvic01.setVisibility(View.VISIBLE);
                    fldGrpvic03.setVisibility(View.VISIBLE);
                    fldGrpvic02.setVisibility(View.GONE);

                    vic_b.clearCheck();
                    vic_b88x.setText(null);
                    vic_d.clearCheck();
                    vic_d88x.setText(null);
                    vic_e.clearCheck();
                    vic_e88x.setText(null);

                    vic_f01.setChecked(false);
                    vic_f02.setChecked(false);
                    vic_f03.setChecked(false);
                    vic_f04.setChecked(false);
                    vic_f05.setChecked(false);
                    vic_f06.setChecked(false);
                    vic_f99.setChecked(false);
                    vic_f88.setChecked(false);
                    vic_f88x.setText(null);

//                    vic_g01.setChecked(false);vic_g02.setChecked(false);vic_g03.setChecked(false);vic_g04.setChecked(false);
//                    vic_g05.setChecked(false);vic_g06.setChecked(false);vic_g99.setChecked(false);vic_g88.setChecked(false);
//                    vic_g88x.setText(null);


                } else {
                    fldGrpvic01.setVisibility(View.GONE);
                    fldGrpvic02.setVisibility(View.VISIBLE);
                    fldGrpvic03.setVisibility(View.GONE);

                    vic_b.clearCheck();
                    vic_b88x.setText(null);
                    vic_d.clearCheck();
                    vic_d88x.setText(null);
                    vic_e.clearCheck();
                    vic_e88x.setText(null);

                    vic_f01.setChecked(false);
                    vic_f02.setChecked(false);
                    vic_f03.setChecked(false);
                    vic_f04.setChecked(false);
                    vic_f05.setChecked(false);
                    vic_f06.setChecked(false);
                    vic_f99.setChecked(false);
                    vic_f88.setChecked(false);
                    vic_f88x.setText(null);

//                    vic_g01.setChecked(false);vic_g02.setChecked(false);vic_g03.setChecked(false);vic_g04.setChecked(false);
//                    vic_g05.setChecked(false);vic_g06.setChecked(false);vic_g99.setChecked(false);vic_g88.setChecked(false);
//                    vic_g88x.setText(null);
                }

            }
        });

//        End


//        Spinner Start

        adapter = ArrayAdapter.createFromResource(this, R.array.vic_g, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        vic_f01g.setAdapter(adapter);
        vic_f01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f01g.setVisibility(View.VISIBLE);
                } else {
                    vic_f01g.setVisibility(View.GONE);
                }
            }
        });


        vic_f02g.setAdapter(adapter);
        vic_f02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f02g.setVisibility(View.VISIBLE);
                } else {
                    vic_f02g.setVisibility(View.GONE);
                }
            }
        });

        vic_f03g.setAdapter(adapter);
        vic_f03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f03g.setVisibility(View.VISIBLE);
                } else {
                    vic_f03g.setVisibility(View.GONE);
                }
            }
        });

        vic_f04g.setAdapter(adapter);
        vic_f04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f04g.setVisibility(View.VISIBLE);
                } else {
                    vic_f04g.setVisibility(View.GONE);
                }
            }
        });

        vic_f05g.setAdapter(adapter);
        vic_f05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f05g.setVisibility(View.VISIBLE);
                } else {
                    vic_f05g.setVisibility(View.GONE);
                }
            }
        });

        vic_f06g.setAdapter(adapter);
        vic_f06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vic_f06g.setVisibility(View.VISIBLE);
                } else {
                    vic_f06g.setVisibility(View.GONE);
                }
            }
        });


//        end


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
                    if (MainApp.gotoOC && MainApp.ocCount > 0) {
                        Toast.makeText(this, "Starting Form Other Child Section", Toast.LENGTH_SHORT).show();

                        MainApp.ocCount -= 1;

                        Intent ghSec = new Intent(this, SectionGHActivity.class);
                        startActivity(ghSec);

                    } else {
                        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                        Intent endSec = new Intent(this, EndingActivity.class);
                        endSec.putExtra("complete", false);
                        startActivity(endSec);
                    }
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
            updcount = db.updateSOC(icTP);
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

        String icCheck = ic ? "vic" : "voc";

        sic.put(icCheck + icTP + "a", vic_a01.isChecked() ? "1" : vic_a02.isChecked() ? "2" : "default");

        sic.put(icCheck + icTP + "b", vic_b01.isChecked() ? "1"
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
        sic.put(icCheck + icTP + "b88x", vic_b88x.getText().toString());
        sic.put(icCheck + icTP + "c", vic_b01.isChecked() ? DOV : "");

        sic.put(icCheck + icTP + "d", vic_d01.isChecked() ? "1" :
                vic_d02.isChecked() ? "2" :
                        vic_d88.isChecked() ? "88" :
                                vic_d99.isChecked() ? "99" :
                                        "default");
        sic.put(icCheck + icTP + "d88x", vic_d88x.getText().toString());
        sic.put(icCheck + icTP + "e", vic_e01.isChecked() ? "1"
                : vic_e02.isChecked() ? "2"
                : vic_e03.isChecked() ? "3"
                : vic_e88.isChecked() ? "88"
                : "default");
        sic.put(icCheck + icTP + "e88x", vic_e88x.getText().toString());
        sic.put(icCheck + icTP + "f1", vic_f01.isChecked() ? "1" : "default");
        sic.put(icCheck + icTP + "f2", vic_f02.isChecked() ? "2" : "default");
        sic.put(icCheck + icTP + "f3", vic_f03.isChecked() ? "3" : "default");
        sic.put(icCheck + icTP + "f4", vic_f04.isChecked() ? "4" : "default");
        sic.put(icCheck + icTP + "f5", vic_f05.isChecked() ? "5" : "default");
        sic.put(icCheck + icTP + "f6", vic_f06.isChecked() ? "6" : "default");

        sic.put(icCheck + icTP + "f1g", vic_f01.isChecked() ? getResources().getStringArray(R.array.vic_g_value)[vic_f01g.getSelectedItemPosition()] : "default");
        sic.put(icCheck + icTP + "f2g", vic_f02.isChecked() ? getResources().getStringArray(R.array.vic_g_value)[vic_f02g.getSelectedItemPosition()] : "default");
        sic.put(icCheck + icTP + "f3g", vic_f03.isChecked() ? getResources().getStringArray(R.array.vic_g_value)[vic_f03g.getSelectedItemPosition()] : "default");
        sic.put(icCheck + icTP + "f4g", vic_f04.isChecked() ? getResources().getStringArray(R.array.vic_g_value)[vic_f04g.getSelectedItemPosition()] : "default");
        sic.put(icCheck + icTP + "f5g", vic_f05.isChecked() ? getResources().getStringArray(R.array.vic_g_value)[vic_f05g.getSelectedItemPosition()] : "default");
        sic.put(icCheck + icTP + "f6g", vic_f06.isChecked() ? getResources().getStringArray(R.array.vic_g_value)[vic_f06g.getSelectedItemPosition()] : "default");

        sic.put(icCheck + icTP + "f99", vic_f99.isChecked() ? "99" : "default");
        sic.put(icCheck + icTP + "f88", vic_f88.isChecked() ? "88" : "default");
        sic.put(icCheck + icTP + "f88x", vic_f88x.getText().toString());
//        sic.put(icCheck + icTP + "g1", vic_g01.isChecked() ? "1" : "default");
//        sic.put(icCheck + icTP + "g2", vic_g02.isChecked() ? "2" : "default");
//        sic.put(icCheck + icTP + "g3", vic_g03.isChecked() ? "3" : "default");
//        sic.put(icCheck + icTP + "g4", vic_g04.isChecked() ? "4" : "default");
//        sic.put(icCheck + icTP + "g5", vic_g05.isChecked() ? "5" : "default");
//        sic.put(icCheck + icTP + "g6", vic_g06.isChecked() ? "6" : "default");
//        sic.put(icCheck + icTP + "g99", vic_g99.isChecked() ? "99" : "default");
//        sic.put(icCheck + icTP + "g88", vic_g88.isChecked() ? "88" : "default");
//        sic.put(icCheck + icTP + "g88x", vic_g88x.getText().toString());

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

        if (ic) {
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
        } else {

//            MainApp.oc = new OCsContract();

            switch (icTP) {

                case 1:
                    MainApp.oc.setsOC01(String.valueOf(sic));
                    break;

                case 2:
                    MainApp.oc.setsOC02(String.valueOf(sic));
                    break;

                case 3:
                    MainApp.oc.setsOC03(String.valueOf(sic));
                    break;

                case 4:
                    MainApp.oc.setsOC04(String.valueOf(sic));
                    break;

                case 5:
                    MainApp.oc.setsOC05(String.valueOf(sic));
                    break;

                case 6:
                    MainApp.oc.setsOC06(String.valueOf(sic));
                    break;
                default:
                    break;

            }
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

        if (vic_a01.isChecked()) {

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


            if (!(vic_f01.isChecked()
                    || vic_f02.isChecked()
                    || vic_f03.isChecked()
                    || vic_f04.isChecked()
                    || vic_f05.isChecked()
                    || vic_f06.isChecked()
                    || vic_f88.isChecked()
                    || vic_f99.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_f), Toast.LENGTH_LONG).show();
                vic_f88.setError("This data is Required!");
                Log.i(TAG, "vic_f8: This data is Required!");
                return false;
            } else {
                vic_f88.setError(null);
            }


            //        Spinner Validation

            if ((vic_f01.isChecked() && vic_f01g.getSelectedItemId() == 0)
                    || (vic_f02.isChecked() && vic_f02g.getSelectedItemId() == 0)
                    || (vic_f03.isChecked() && vic_f03g.getSelectedItemId() == 0)
                    || (vic_f04.isChecked() && vic_f04g.getSelectedItemId() == 0)
                    || (vic_f05.isChecked() && vic_f05g.getSelectedItemId() == 0)
                    || (vic_f06.isChecked() && vic_f06g.getSelectedItemId() == 0)
                    ) {
                Toast.makeText(this, "ERROR: " + getString(R.string.vic_f), Toast.LENGTH_LONG).show();
                vic_f88.setError("This data is Required!");
                Log.i(TAG, "vic_f8: Spinner data is Required!");
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
//            if (!(vic_g01.isChecked()
//                    || vic_g02.isChecked()
//                    || vic_g03.isChecked()
//                    || vic_g04.isChecked()
//                    || vic_g05.isChecked()
//                    || vic_g06.isChecked()
//                    || vic_g88.isChecked()
//                    || vic_g99.isChecked()
//            )) {
//                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vic_g), Toast.LENGTH_LONG).show();
//                vic_g88.setError("This data is Required!");
//                Log.i(TAG, "vic_g8: This data is Required!");
//                return false;
//            } else {
//                vic_g88.setError(null);
//                vic_g88.setError(null);
//            }
//
//            if (vic_g88.isChecked() && vic_g88x.getText().toString().isEmpty()) {
//                Toast.makeText(this, "ERROR(empty): " + getString(R.string.vic_g) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
//                vic_g88x.setError("This data is Required!");
//                Log.i(TAG, "vic_g88x: This data is Required!");
//                return false;
//            } else {
//                vic_g88x.setError(null);
//            }

        } else {

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

        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
