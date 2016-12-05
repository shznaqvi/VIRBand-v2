package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

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
    @BindView(R.id.crf2_header)
    TextView crf2Header;
    @BindView(R.id.vb04)
    EditText vb04;
    @BindView(R.id.vb05)
    RadioGroup vb05;
    @BindView(R.id.vb0501)
    RadioButton vb0501;
    @BindView(R.id.vb0502)
    RadioButton vb0502;
    @BindView(R.id.vbAgeDob)
    RadioGroup vbAgeDob;
    @BindView(R.id.vbAge)
    RadioButton vbAge;
    @BindView(R.id.vbDob)
    RadioButton vbDob;
    @BindView(R.id.fldGrpDOB)
    LinearLayout fldGrpDOB;
    @BindView(R.id.vb06)
    DatePicker vb06;
    @BindView(R.id.fldGrpAge)
    LinearLayout fldGrpAge;
    @BindView(R.id.vb07d)
    EditText vb07d;
    @BindView(R.id.vb07m)
    EditText vb07m;
    @BindView(R.id.vb07y)
    EditText vb07y;
    @BindView(R.id.vb08)
    EditText vb08;
    @BindView(R.id.vb09)
    EditText vb09;
    @BindView(R.id.vb10)
    RadioGroup vb10;
    @BindView(R.id.vb1001)
    RadioButton vb1001;
    @BindView(R.id.vb1002)
    RadioButton vb1002;
    @BindView(R.id.vb1003)
    RadioButton vb1003;
    @BindView(R.id.vb1004)
    RadioButton vb1004;
    @BindView(R.id.vb1088)
    RadioButton vb1088;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);
// Spinner Drop down elements
        lables = new ArrayList<String>();
        lables.add("Pehelwan Goth");
        lables.add("Sachal Goth");

        values = new ArrayList<String>();
        values.add("01");
        values.add("02");
        areaCode.setText(getString(R.string.AreaCode) + ": " + lables.get(values.indexOf(String.valueOf(MainApp.areaCode))));

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btn_End)
    boolean onBtnEndLongClick() {
        //TODO implement
        return true;
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btn_Continue)
    boolean onBtnContinueLongClick() {
        //TODO implement
        return true;
    }
}
