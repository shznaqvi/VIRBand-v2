package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
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


public class SectionEActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();

    @BindView(R.id.activity_section_e)
    ScrollView activitySectionE;
    @BindView(R.id.ve01)
    RadioGroup ve01;
    @BindView(R.id.ve0101)
    RadioButton ve0101;
    @BindView(R.id.ve0102)
    RadioButton ve0102;
    @BindView(R.id.fldGrpve02)
    LinearLayout fldGrpve02;
    @BindView(R.id.ve0201)
    CheckBox ve0201;
    @BindView(R.id.ve0202)
    CheckBox ve0202;
    @BindView(R.id.ve0203)
    CheckBox ve0203;
    @BindView(R.id.ve0204)
    CheckBox ve0204;
    @BindView(R.id.ve0205)
    CheckBox ve0205;
    @BindView(R.id.ve0288)
    CheckBox ve0288;
    @BindView(R.id.ve0288x)
    EditText ve0288x;
    @BindView(R.id.ve0301)
    CheckBox ve0301;
    @BindView(R.id.ve0302)
    CheckBox ve0302;
    @BindView(R.id.ve0303)
    CheckBox ve0303;
    @BindView(R.id.ve0304)
    CheckBox ve0304;
    @BindView(R.id.ve0305)
    CheckBox ve0305;
    @BindView(R.id.ve0306)
    CheckBox ve0306;
    @BindView(R.id.ve0307)
    CheckBox ve0307;
    @BindView(R.id.ve0308)
    CheckBox ve0308;
    @BindView(R.id.ve0309)
    CheckBox ve0309;
    @BindView(R.id.ve0310)
    CheckBox ve0310;
    @BindView(R.id.ve0311)
    CheckBox ve0311;
    @BindView(R.id.ve0312)
    CheckBox ve0312;
    @BindView(R.id.ve0388)
    CheckBox ve0388;
    @BindView(R.id.ve0388x)
    EditText ve0388x;
    @BindView(R.id.ve04)
    RadioGroup ve04;
    @BindView(R.id.ve0401)
    RadioButton ve0401;
    @BindView(R.id.ve0402)
    RadioButton ve0402;
    @BindView(R.id.ve0499)
    RadioButton ve0499;
    @BindView(R.id.fldGrpve04)
    LinearLayout fldGrpve04;
    @BindView(R.id.fldGrpve04a)
    LinearLayout fldGrpve04a;
    @BindView(R.id.ve04a)
    RadioGroup ve04a;
    @BindView(R.id.ve04a01)
    RadioButton ve04a01;
    @BindView(R.id.ve04a02)
    RadioButton ve04a02;
    @BindView(R.id.ve04a03)
    RadioButton ve04a03;
    @BindView(R.id.ve04a04)
    RadioButton ve04a04;
    @BindView(R.id.ve04a05)
    RadioButton ve04a05;
    @BindView(R.id.ve04a99)
    RadioButton ve04a99;
    @BindView(R.id.ve04a88)
    RadioButton ve04a88;
    @BindView(R.id.ve04a88x)
    EditText ve04a88x;
    @BindView(R.id.fldGrpve04b)
    LinearLayout fldGrpve04b;
    @BindView(R.id.ve04b)
    RadioGroup ve04b;
    @BindView(R.id.ve04b01)
    RadioButton ve04b01;
    @BindView(R.id.ve04b02)
    RadioButton ve04b02;
    @BindView(R.id.ve04b03)
    RadioButton ve04b03;
    @BindView(R.id.ve04b04)
    RadioButton ve04b04;
    @BindView(R.id.ve04b99)
    RadioButton ve04b99;
    @BindView(R.id.ve04b88)
    RadioButton ve04b88;
    @BindView(R.id.ve04b88x)
    EditText ve04b88x;
    @BindView(R.id.ve05)
    RadioGroup ve05;
    @BindView(R.id.ve0501)
    RadioButton ve0501;
    @BindView(R.id.ve0502)
    RadioButton ve0502;
    @BindView(R.id.ve0503)
    RadioButton ve0503;
    @BindView(R.id.ve0504)
    RadioButton ve0504;
    @BindView(R.id.ve0505)
    RadioButton ve0505;
    @BindView(R.id.ve0599)
    RadioButton ve0599;
    @BindView(R.id.ve0588)
    RadioButton ve0588;
    @BindView(R.id.ve0588x)
    EditText ve0588x;
    @BindView(R.id.fldGrpve06)
    LinearLayout fldGrpve06;
    @BindView(R.id.ve06)
    RadioGroup ve06;
    @BindView(R.id.ve0601)
    RadioButton ve0601;
    @BindView(R.id.ve0602)
    RadioButton ve0602;
    @BindView(R.id.ve0603)
    RadioButton ve0603;
    @BindView(R.id.ve0604)
    RadioButton ve0604;
    @BindView(R.id.ve0699)
    RadioButton ve0699;
    @BindView(R.id.ve0688)
    RadioButton ve0688;
    @BindView(R.id.ve0688x)
    EditText ve0688x;
    @BindView(R.id.ve07)
    RadioGroup ve07;
    @BindView(R.id.ve0701)
    RadioButton ve0701;
    @BindView(R.id.ve0702)
    RadioButton ve0702;
    @BindView(R.id.ve0703)
    RadioButton ve0703;
    @BindView(R.id.ve0704)
    RadioButton ve0704;
    @BindView(R.id.ve0799)
    RadioButton ve0799;
    @BindView(R.id.ve0788)
    RadioButton ve0788;
    @BindView(R.id.ve0788x)
    EditText ve0788x;
    @BindView(R.id.ve08)
    RadioGroup ve08;
    @BindView(R.id.ve0801)
    RadioButton ve0801;
    @BindView(R.id.ve0802)
    RadioButton ve0802;
    @BindView(R.id.ve0899)
    RadioButton ve0899;
    @BindView(R.id.fldGrpve08)
    LinearLayout fldGrpve08;
    @BindView(R.id.fldGrpve08a)
    LinearLayout fldGrpve08a;
    @BindView(R.id.ve08a)
    RadioGroup ve08a;
    @BindView(R.id.ve08a01)
    RadioButton ve08a01;
    @BindView(R.id.ve08a02)
    RadioButton ve08a02;
    @BindView(R.id.ve08a03)
    RadioButton ve08a03;
    @BindView(R.id.ve08a04)
    RadioButton ve08a04;
    @BindView(R.id.ve08a05)
    RadioButton ve08a05;
    @BindView(R.id.ve08a99)
    RadioButton ve08a99;
    @BindView(R.id.ve08a88)
    RadioButton ve08a88;
    @BindView(R.id.ve08a88x)
    EditText ve08a88x;
    @BindView(R.id.fldGrpve08b)
    LinearLayout fldGrpve08b;
    @BindView(R.id.ve08b)
    RadioGroup ve08b;
    @BindView(R.id.ve08b01)
    RadioButton ve08b01;
    @BindView(R.id.ve08b02)
    RadioButton ve08b02;
    @BindView(R.id.ve08b03)
    RadioButton ve08b03;
    @BindView(R.id.ve08b04)
    RadioButton ve08b04;
    @BindView(R.id.ve08b99)
    RadioButton ve08b99;
    @BindView(R.id.ve08b88)
    RadioButton ve08b88;
    @BindView(R.id.ve08b88x)
    EditText ve08b88x;
    @BindView(R.id.ve09)
    RadioGroup ve09;
    @BindView(R.id.ve0901)
    RadioButton ve0901;
    @BindView(R.id.ve0902)
    RadioButton ve0902;
    @BindView(R.id.ve0903)
    RadioButton ve0903;
    @BindView(R.id.fldGrpve10)
    LinearLayout fldGrpve10;
    @BindView(R.id.ve10)
    TextView ve10;
    @BindView(R.id.ve1001)
    CheckBox ve1001;
    @BindView(R.id.ve1002)
    CheckBox ve1002;
    @BindView(R.id.ve1003)
    CheckBox ve1003;
    @BindView(R.id.ve1004)
    CheckBox ve1004;
    @BindView(R.id.ve1005)
    CheckBox ve1005;
    @BindView(R.id.ve1006)
    CheckBox ve1006;
    @BindView(R.id.ve1088)
    CheckBox ve1088;
    @BindView(R.id.ve1088x)
    EditText ve1088x;
    @BindView(R.id.ve11)
    RadioGroup ve11;
    @BindView(R.id.ve1101)
    RadioButton ve1101;
    @BindView(R.id.ve1102)
    RadioButton ve1102;
    @BindView(R.id.ve1103)
    RadioButton ve1103;
    @BindView(R.id.ve1104)
    RadioButton ve1104;
    @BindView(R.id.ve1105)
    RadioButton ve1105;
    @BindView(R.id.ve1106)
    RadioButton ve1106;
    @BindView(R.id.ve1107)
    RadioButton ve1107;
    @BindView(R.id.ve1108)
    RadioButton ve1108;
    @BindView(R.id.ve1109)
    RadioButton ve1109;
    @BindView(R.id.ve1188)
    RadioButton ve1188;
    @BindView(R.id.ve1188x)
    EditText ve1188x;
    @BindView(R.id.ve12)
    RadioGroup ve12;
    @BindView(R.id.ve1201)
    RadioButton ve1201;
    @BindView(R.id.ve1202)
    RadioButton ve1202;
    @BindView(R.id.fldGrpve12a)
    LinearLayout fldGrpve12a;
    @BindView(R.id.ve12a)
    RadioGroup ve12a;
    @BindView(R.id.ve12a01)
    RadioButton ve12a01;
    @BindView(R.id.ve12a02)
    RadioButton ve12a02;
    @BindView(R.id.ve12a03)
    RadioButton ve12a03;
    @BindView(R.id.ve12a99)
    RadioButton ve12a99;
    @BindView(R.id.ve12a88)
    RadioButton ve12a88;
    @BindView(R.id.ve12a88x)
    EditText ve12a88x;
    @BindView(R.id.ve13)
    RadioGroup ve13;
    @BindView(R.id.ve1301)
    RadioButton ve1301;
    @BindView(R.id.ve1302)
    RadioButton ve1302;
    @BindView(R.id.ve1399)
    RadioButton ve1399;
    @BindView(R.id.fldGrpve14)
    LinearLayout fldGrpve14;
    @BindView(R.id.fldGrpve16)
    LinearLayout fldGrpve16;
    @BindView(R.id.fldGrpve21)
    LinearLayout fldGrpve21;
    @BindView(R.id.ve14)
    RadioGroup ve14;
    @BindView(R.id.ve1401)
    RadioButton ve1401;
    @BindView(R.id.ve1402)
    RadioButton ve1402;
    @BindView(R.id.ve1403)
    RadioButton ve1403;
    @BindView(R.id.ve1404)
    RadioButton ve1404;
    @BindView(R.id.ve1405)
    RadioButton ve1405;
    @BindView(R.id.ve1406)
    RadioButton ve1406;
    @BindView(R.id.ve1499)
    RadioButton ve1499;
    @BindView(R.id.ve1488)
    RadioButton ve1488;
    @BindView(R.id.ve1488x)
    EditText ve1488x;
    @BindView(R.id.ve15)
    RadioGroup ve15;
    @BindView(R.id.ve1501)
    RadioButton ve1501;
    @BindView(R.id.ve1502)
    RadioButton ve1502;
    @BindView(R.id.ve1503)
    RadioButton ve1503;
    @BindView(R.id.ve1599)
    RadioButton ve1599;
    @BindView(R.id.ve1601)
    CheckBox ve1601;
    @BindView(R.id.ve1602)
    CheckBox ve1602;
    @BindView(R.id.ve1603)
    CheckBox ve1603;
    @BindView(R.id.ve1604)
    CheckBox ve1604;
    @BindView(R.id.ve1605)
    CheckBox ve1605;
    @BindView(R.id.ve1606)
    CheckBox ve1606;
    @BindView(R.id.ve1699)
    CheckBox ve1699;
    @BindView(R.id.ve1688)
    CheckBox ve1688;
    @BindView(R.id.ve1688x)
    EditText ve1688x;
    @BindView(R.id.ve17)
    RadioGroup ve17;
    @BindView(R.id.ve1701)
    RadioButton ve1701;
    @BindView(R.id.ve1702)
    RadioButton ve1702;
    @BindView(R.id.ve1703)
    RadioButton ve1703;
    @BindView(R.id.ve1704)
    RadioButton ve1704;
    @BindView(R.id.ve1705)
    RadioButton ve1705;
    @BindView(R.id.ve1706)
    RadioButton ve1706;
    @BindView(R.id.ve1799)
    RadioButton ve1799;
    @BindView(R.id.ve1788)
    RadioButton ve1788;
    @BindView(R.id.ve1788x)
    EditText ve1788x;
    @BindView(R.id.ve18)
    RadioGroup ve18;
    @BindView(R.id.ve1801)
    RadioButton ve1801;
    @BindView(R.id.ve1802)
    RadioButton ve1802;
    @BindView(R.id.ve1803)
    RadioButton ve1803;
    @BindView(R.id.ve1804)
    RadioButton ve1804;
    @BindView(R.id.ve1805)
    RadioButton ve1805;
    @BindView(R.id.ve1888)
    RadioButton ve1888;
    @BindView(R.id.ve1888x)
    EditText ve1888x;
    @BindView(R.id.ve19)
    RadioGroup ve19;
    @BindView(R.id.ve1901)
    RadioButton ve1901;
    @BindView(R.id.ve1902)
    RadioButton ve1902;
    @BindView(R.id.ve1903)
    RadioButton ve1903;
    @BindView(R.id.ve1904)
    RadioButton ve1904;
    @BindView(R.id.ve1905)
    RadioButton ve1905;
    @BindView(R.id.ve1988)
    RadioButton ve1988;
    @BindView(R.id.ve1988x)
    EditText ve1988x;
    @BindView(R.id.ve20)
    RadioGroup ve20;
    @BindView(R.id.ve2001)
    RadioButton ve2001;
    @BindView(R.id.ve2002)
    RadioButton ve2002;
    @BindView(R.id.ve2003)
    RadioButton ve2003;
    @BindView(R.id.ve2004)
    RadioButton ve2004;
    @BindView(R.id.ve2005)
    RadioButton ve2005;
    @BindView(R.id.ve2006)
    RadioButton ve2006;
    @BindView(R.id.ve2007)
    RadioButton ve2007;
    @BindView(R.id.ve21)
    RadioGroup ve21;
    @BindView(R.id.ve2101)
    RadioButton ve2101;
    @BindView(R.id.ve2102)
    RadioButton ve2102;
    @BindView(R.id.ve2199)
    RadioButton ve2199;
    @BindView(R.id.fldGrpve22)
    LinearLayout fldGrpve22;
    @BindView(R.id.ve22)
    RadioGroup ve22;
    @BindView(R.id.ve2201)
    RadioButton ve2201;
    @BindView(R.id.ve2202)
    RadioButton ve2202;
    @BindView(R.id.ve2203)
    RadioButton ve2203;
    @BindView(R.id.ve2299)
    RadioButton ve2299;
    @BindView(R.id.ve2288)
    RadioButton ve2288;
    @BindView(R.id.ve2288x)
    EditText ve2288x;
    @BindView(R.id.ve23)
    RadioGroup ve23;
    @BindView(R.id.ve2301)
    RadioButton ve2301;
    @BindView(R.id.ve2302)
    RadioButton ve2302;
    @BindView(R.id.ve2303)
    RadioButton ve2303;
    @BindView(R.id.ve2304)
    RadioButton ve2304;
    @BindView(R.id.ve2305)
    RadioButton ve2305;
    @BindView(R.id.ve2306)
    RadioButton ve2306;
    @BindView(R.id.ve2388)
    RadioButton ve2388;
    @BindView(R.id.ve2388x)
    EditText ve2388x;
    @BindView(R.id.ve24)
    RadioGroup ve24;
    @BindView(R.id.ve2401)
    RadioButton ve2401;
    @BindView(R.id.ve2402)
    RadioButton ve2402;
    @BindView(R.id.ve2499)
    RadioButton ve2499;
    @BindView(R.id.fldGrpve24)
    LinearLayout fldGrpve24;
    @BindView(R.id.fldGrpve24a)
    LinearLayout fldGrpve24a;
    @BindView(R.id.ve24a01)
    CheckBox ve24a01;
    @BindView(R.id.ve24a02)
    CheckBox ve24a02;
    @BindView(R.id.ve24a03)
    CheckBox ve24a03;
    @BindView(R.id.ve24a04)
    CheckBox ve24a04;
    @BindView(R.id.ve24a99)
    CheckBox ve24a99;
    @BindView(R.id.ve24a88)
    CheckBox ve24a88;
    @BindView(R.id.ve24a88x)
    EditText ve24a88x;
    @BindView(R.id.fldGrpve24b)
    LinearLayout fldGrpve24b;
    @BindView(R.id.ve24b01)
    CheckBox ve24b01;
    @BindView(R.id.ve24b02)
    CheckBox ve24b02;
    @BindView(R.id.ve24b03)
    CheckBox ve24b03;
    @BindView(R.id.ve24b04)
    CheckBox ve24b04;
    @BindView(R.id.ve24b99)
    CheckBox ve24b99;
    @BindView(R.id.ve24b88)
    CheckBox ve24b88;
    @BindView(R.id.ve24b88x)
    EditText ve24b88x;
    @BindView(R.id.ve25)
    RadioGroup ve25;
    @BindView(R.id.ve2501)
    RadioButton ve2501;
    @BindView(R.id.ve2502)
    RadioButton ve2502;
    @BindView(R.id.ve2599)
    RadioButton ve2599;
    @BindView(R.id.fldGrpve25a)
    LinearLayout fldGrpve25a;
    @BindView(R.id.ve25a01)
    CheckBox ve25a01;
    @BindView(R.id.ve25a02)
    CheckBox ve25a02;
    @BindView(R.id.ve25a03)
    CheckBox ve25a03;
    @BindView(R.id.ve25a04)
    CheckBox ve25a04;
    @BindView(R.id.ve25a05)
    CheckBox ve25a05;
    @BindView(R.id.ve25a99)
    CheckBox ve25a99;
    @BindView(R.id.ve25a88)
    CheckBox ve25a88;
    @BindView(R.id.ve25a88x)
    EditText ve25a88x;

    @BindView(R.id.ve13Text)
    TextView ve13Text;

    @BindView(R.id.vf01)
    RadioGroup vf01;
    @BindView(R.id.vf101)
    RadioButton vf101;
    @BindView(R.id.vf102)
    RadioButton vf102;
    @BindView(R.id.vf103)
    RadioButton vf103;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

//        String childName = getString(R.string.ve13_a) +""+ FormsContract.getChildN()+""+getString(R.string.ve13_b);

        ve13Text.setText(ve13Text.getText().toString().replace("Test", FormsContract.getChildN()));


        ve01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve0102.isChecked()) {
                    fldGrpve02.setVisibility(View.GONE);
                    ve0201.setChecked(false);
                    ve0202.setChecked(false);
                    ve0203.setChecked(false);
                    ve0204.setChecked(false);
                    ve0205.setChecked(false);
                    ve0288.setChecked(false);
                    ve0288x.setText(null);
                    ve0301.setChecked(false);
                    ve0302.setChecked(false);
                    ve0303.setChecked(false);
                    ve0304.setChecked(false);
                    ve0305.setChecked(false);
                    ve0306.setChecked(false);
                    ve0307.setChecked(false);
                    ve0308.setChecked(false);
                    ve0309.setChecked(false);
                    ve0310.setChecked(false);
                    ve0311.setChecked(false);
                    ve0312.setChecked(false);
                    ve0388.setChecked(false);
                    ve0388x.setText(null);
                } else {
                    fldGrpve02.setVisibility(View.VISIBLE);
                }
            }
        });

        ve04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve0401.isChecked()) {
                    fldGrpve04.setVisibility(View.VISIBLE);
                    fldGrpve04a.setVisibility(View.VISIBLE);
                    fldGrpve04b.setVisibility(View.GONE);
                    ve04b.clearCheck();
                    ve04a88x.setText(null);
                } else if (ve0402.isChecked()) {
                    fldGrpve04.setVisibility(View.VISIBLE);
                    fldGrpve04a.setVisibility(View.GONE);
                    fldGrpve04b.setVisibility(View.VISIBLE);
                    ve04a.clearCheck();
                    ve04a88x.setText(null);
                } else if (ve0499.isChecked()) {
                    fldGrpve04.setVisibility(View.GONE);
                    ve04b.clearCheck();
                    ve04a88x.setText(null);
                    ve04a.clearCheck();
                    ve04a88x.setText(null);
                }
            }
        });

        ve05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve0599.isChecked()) {
                    fldGrpve06.setVisibility(View.GONE);
                    ve06.clearCheck();
                    ve0688x.setText(null);
                } else {
                    fldGrpve06.setVisibility(View.VISIBLE);
                }
            }
        });

        ve08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve0801.isChecked()) {
                    fldGrpve08.setVisibility(View.VISIBLE);
                    fldGrpve08a.setVisibility(View.VISIBLE);
                    fldGrpve08b.setVisibility(View.GONE);
                    ve08b.clearCheck();
                    ve08a88x.setText(null);
                } else if (ve0802.isChecked()) {
                    fldGrpve08.setVisibility(View.VISIBLE);
                    fldGrpve08a.setVisibility(View.GONE);
                    fldGrpve08b.setVisibility(View.VISIBLE);
                    ve08a.clearCheck();
                    ve08a88x.setText(null);
                } else if (ve0899.isChecked()) {
                    fldGrpve08.setVisibility(View.GONE);
                    ve08b.clearCheck();
                    ve08a88x.setText(null);
                    ve08a.clearCheck();
                    ve08a88x.setText(null);
                }
            }
        });

        ve09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve0901.isChecked()) {
                    fldGrpve10.setVisibility(View.VISIBLE);
                } else {
                    fldGrpve10.setVisibility(View.GONE);
                    ve1001.setChecked(false);
                    ve1002.setChecked(false);
                    ve1003.setChecked(false);
                    ve1004.setChecked(false);
                    ve1005.setChecked(false);
                    ve1006.setChecked(false);
                    ve1088.setChecked(false);
                    ve0688x.setText(null);
                }
            }
        });

        ve12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve1201.isChecked()) {
                    fldGrpve12a.setVisibility(View.GONE);
                    ve12a.clearCheck();
                    ve12a88x.setText(null);
                } else {
                    fldGrpve12a.setVisibility(View.VISIBLE);
                }
            }
        });

        ve13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve1301.isChecked() || ve1399.isChecked()) {
                    fldGrpve14.setVisibility(View.GONE);
                    fldGrpve16.setVisibility(View.VISIBLE);
                    fldGrpve21.setVisibility(View.VISIBLE);
                    ve1488x.setText(null);
                    ve1688x.setText(null);
                    ve2288x.setText(null);
                    ve14.clearCheck();

                } else {
                    fldGrpve14.setVisibility(View.VISIBLE);
                    fldGrpve16.setVisibility(View.GONE);
                    fldGrpve21.setVisibility(View.GONE);
                    ve1601.setChecked(false);
                    ve1602.setChecked(false);
                    ve1603.setChecked(false);
                    ve1604.setChecked(false);
                    ve1605.setChecked(false);
                    ve1606.setChecked(false);
                    ve1699.setChecked(false);
                    ve1688.setChecked(false);
                    ve21.clearCheck();
                    ve22.clearCheck();
                }
            }
        });

        ve15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if ((ve1502.isChecked() || ve1599.isChecked()) && ((ve1302.isChecked() || ve1399.isChecked()))) {
                    fldGrpve16.setVisibility(View.GONE);
                    fldGrpve21.setVisibility(View.GONE);
                    ve1601.setChecked(false);
                    ve1602.setChecked(false);
                    ve1603.setChecked(false);
                    ve1604.setChecked(false);
                    ve1605.setChecked(false);
                    ve1606.setChecked(false);
                    ve1699.setChecked(false);
                    ve1688.setChecked(false);
                    ve21.clearCheck();
                    ve22.clearCheck();
                } else {
                    fldGrpve16.setVisibility(View.VISIBLE);
                    fldGrpve21.setVisibility(View.VISIBLE);
                }
            }
        });

        ve21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve2101.isChecked()) {
                    fldGrpve22.setVisibility(View.VISIBLE);
                } else {
                    fldGrpve22.setVisibility(View.GONE);
                    ve22.clearCheck();
                    ve2288x.setText(null);
                }
            }
        });
        ve24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve2401.isChecked()) {
                    fldGrpve24.setVisibility(View.VISIBLE);
                    fldGrpve24a.setVisibility(View.VISIBLE);
                    fldGrpve24b.setVisibility(View.GONE);
                    ve24b01.setChecked(false);
                    ve24b02.setChecked(false);
                    ve24b03.setChecked(false);
                    ve24b04.setChecked(false);
                    ve24b99.setChecked(false);
                    ve24b88.setChecked(false);
                    ve24b88x.setText(null);
                } else if (ve2402.isChecked()) {
                    fldGrpve24.setVisibility(View.VISIBLE);
                    fldGrpve24a.setVisibility(View.GONE);
                    fldGrpve24b.setVisibility(View.VISIBLE);
                    ve24a01.setChecked(false);
                    ve24a02.setChecked(false);
                    ve24a03.setChecked(false);
                    ve24a04.setChecked(false);
                    ve24a88.setChecked(false);
                    ve24a99.setChecked(false);
                    ve24a88x.setText(null);
                } else if (ve2499.isChecked()) {
                    fldGrpve24.setVisibility(View.GONE);
                    ve24b01.setChecked(false);
                    ve24b02.setChecked(false);
                    ve24b03.setChecked(false);
                    ve24b04.setChecked(false);
                    ve24b99.setChecked(false);
                    ve24b88.setChecked(false);
                    ve24b88x.setText(null);
                    ve24a01.setChecked(false);
                    ve24a02.setChecked(false);
                    ve24a03.setChecked(false);
                    ve24a04.setChecked(false);
                    ve24a99.setChecked(false);
                    ve24a88.setChecked(false);
                    ve24a88x.setText(null);
                }
            }
        });

        ve25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ve2501.isChecked()) {
                    fldGrpve25a.setVisibility(View.VISIBLE);

                } else if (ve2502.isChecked()) {
                    fldGrpve25a.setVisibility(View.GONE);
                    ve25a01.setChecked(false);
                    ve25a02.setChecked(false);
                    ve25a03.setChecked(false);
                    ve25a04.setChecked(false);
                    ve25a05.setChecked(false);
                    ve25a99.setChecked(false);
                    ve25a88.setChecked(false);
                    ve25a88x.setText(null);
                }
            }
        });

        ve0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve0288x.setVisibility(View.VISIBLE);
                } else {
                    ve0288x.setVisibility(View.GONE);
                    ve0288x.setText(null);
                }
            }
        });

        ve0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve0388x.setVisibility(View.VISIBLE);
                } else {
                    ve0388x.setVisibility(View.GONE);
                    ve0388x.setText(null);
                }
            }
        });

        ve04a88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve04a88x.setVisibility(View.VISIBLE);
                } else {
                    ve04a88x.setVisibility(View.GONE);
                    ve04a88x.setText(null);
                }
            }
        });

        ve04b88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve04b88x.setVisibility(View.VISIBLE);
                } else {
                    ve04b88x.setVisibility(View.GONE);
                    ve04b88x.setText(null);
                }
            }
        });

        ve0588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve0588x.setVisibility(View.VISIBLE);
                } else {
                    ve0588x.setVisibility(View.GONE);
                    ve0588x.setText(null);
                }
            }
        });

        ve0688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve0688x.setVisibility(View.VISIBLE);
                } else {
                    ve0688x.setVisibility(View.GONE);
                    ve0688x.setText(null);
                }
            }
        });

        ve0788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve0788x.setVisibility(View.VISIBLE);
                } else {
                    ve0788x.setVisibility(View.GONE);
                    ve0788x.setText(null);
                }
            }
        });

        ve08a88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve08a88x.setVisibility(View.VISIBLE);
                } else {
                    ve08a88x.setVisibility(View.GONE);
                    ve08a88x.setText(null);
                }
            }
        });

        ve08b88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve08b88x.setVisibility(View.VISIBLE);
                } else {
                    ve08b88x.setVisibility(View.GONE);
                    ve08b88x.setText(null);
                }
            }
        });

        ve1088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1088x.setVisibility(View.VISIBLE);
                } else {
                    ve1088x.setVisibility(View.GONE);
                    ve1088x.setText(null);
                }
            }
        });

        ve1188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1188x.setVisibility(View.VISIBLE);
                } else {
                    ve1188x.setVisibility(View.GONE);
                    ve1188x.setText(null);
                }
            }
        });

        ve12a88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve12a88x.setVisibility(View.VISIBLE);
                } else {
                    ve12a88x.setVisibility(View.GONE);
                    ve12a88x.setText(null);
                }
            }
        });

        ve1488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1488x.setVisibility(View.VISIBLE);
                } else {
                    ve1488x.setVisibility(View.GONE);
                    ve1488x.setText(null);
                }
            }
        });

        ve1688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1688x.setVisibility(View.VISIBLE);
                } else {
                    ve1688x.setVisibility(View.GONE);
                    ve1688x.setText(null);
                }
            }
        });

        ve1788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1788x.setVisibility(View.VISIBLE);
                } else {
                    ve1788x.setVisibility(View.GONE);
                    ve1788x.setText(null);
                }
            }
        });

        ve1888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1888x.setVisibility(View.VISIBLE);
                } else {
                    ve1888x.setVisibility(View.GONE);
                    ve1888x.setText(null);
                }
            }
        });

        ve1988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve1988x.setVisibility(View.VISIBLE);
                } else {
                    ve1988x.setVisibility(View.GONE);
                    ve1988x.setText(null);
                }
            }
        });

        ve2288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve2288x.setVisibility(View.VISIBLE);
                } else {
                    ve2288x.setVisibility(View.GONE);
                    ve2288x.setText(null);
                }
            }
        });

        ve2388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve2388x.setVisibility(View.VISIBLE);
                } else {
                    ve2388x.setVisibility(View.GONE);
                    ve2388x.setText(null);
                }
            }
        });

        ve24a88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve24a88x.setVisibility(View.VISIBLE);
                } else {
                    ve24a88x.setVisibility(View.GONE);
                    ve24a88x.setText(null);
                }
            }
        });

        ve24b88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve24b88x.setVisibility(View.VISIBLE);
                } else {
                    ve24b88x.setVisibility(View.GONE);
                    ve24b88x.setText(null);
                }
            }
        });

        ve25a88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ve25a88x.setVisibility(View.VISIBLE);
                } else {
                    ve25a88x.setVisibility(View.GONE);
                    ve25a88x.setText(null);
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
                if (MainApp.gotoIM) {
                    Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();
                    Intent secNext = new Intent(this, SectionICActivity.class);
                    secNext.putExtra("ic", true);

                    startActivity(secNext);
                } else if (MainApp.gotoOC) {
                    Toast.makeText(this, "Starting Form Other Child Section", Toast.LENGTH_SHORT).show();
                    MainApp.ocCount--;

                    Intent ghSec = new Intent(this, SectionGHActivity.class);
                    startActivity(ghSec);

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

        JSONObject se = new JSONObject();

        se.put("ve01", ve0101.isChecked() ? "1" : ve0102.isChecked() ? "2" : "default");
        se.put("ve0201", ve0201.isChecked() ? "1" : "default");
        se.put("ve0202", ve0202.isChecked() ? "2" : "default");
        se.put("ve0203", ve0203.isChecked() ? "3" : "default");
        se.put("ve0204", ve0204.isChecked() ? "4" : "default");
        se.put("ve0205", ve0205.isChecked() ? "5" : "default");
        se.put("ve0288", ve0288.isChecked() ? "88" : "default");
        se.put("ve0288x", ve0288x.getText().toString());
        se.put("ve03", ve0301.isChecked() ? "1"
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
                : "default");
        se.put("ve0388x", ve0388x.getText().toString());
        se.put("ve04", ve0401.isChecked() ? "1" : ve0402.isChecked() ? "2" : ve0499.isChecked() ? "99" : "default");
        se.put("ve04a", ve04a01.isChecked() ? "1"
                : ve04a02.isChecked() ? "2"
                : ve04a03.isChecked() ? "3"
                : ve04a04.isChecked() ? "4"
                : ve04a05.isChecked() ? "5"
                : ve04a99.isChecked() ? "99"
                : ve04a88.isChecked() ? "88"
                : "default");
        se.put("ve04a88x", ve04a88x.getText().toString());
        se.put("ve04b", ve04b01.isChecked() ? "1"
                : ve04b02.isChecked() ? "2"
                : ve04b03.isChecked() ? "3"
                : ve04b04.isChecked() ? "4"
                : ve04b99.isChecked() ? "99"
                : ve04b88.isChecked() ? "88"
                : "default");
        se.put("ve04b88x", ve04b88x.getText().toString());
        se.put("ve05", ve0501.isChecked() ? "1"
                : ve0502.isChecked() ? "2"
                : ve0503.isChecked() ? "3"
                : ve0504.isChecked() ? "4"
                : ve0505.isChecked() ? "5"
                : ve0599.isChecked() ? "99"
                : ve0588.isChecked() ? "88"
                : "default");
        se.put("ve0588x", ve0588x.getText().toString());
        se.put("ve06", ve0601.isChecked() ? "1"
                : ve0602.isChecked() ? "2"
                : ve0603.isChecked() ? "3"
                : ve0604.isChecked() ? "4"
                : ve0699.isChecked() ? "99"
                : ve0688.isChecked() ? "88"
                : "default");
        se.put("ve0688x", ve0688x.getText().toString());
        se.put("ve07", ve0701.isChecked() ? "1"
                : ve0702.isChecked() ? "2"
                : ve0703.isChecked() ? "3"
                : ve0704.isChecked() ? "4"
                : ve0799.isChecked() ? "99"
                : ve0788.isChecked() ? "88"
                : "default");
        se.put("ve0788x", ve0788x.getText().toString());
        se.put("ve08", ve0801.isChecked() ? "1" : ve0802.isChecked() ? "2" : ve0899.isChecked() ? "99" : "default");
        se.put("ve08a", ve08a01.isChecked() ? "1"
                : ve08a02.isChecked() ? "2"
                : ve08a03.isChecked() ? "3"
                : ve08a04.isChecked() ? "4"
                : ve08a05.isChecked() ? "5"
                : ve08a99.isChecked() ? "99"
                : ve08a88.isChecked() ? "88"
                : "default");
        se.put("ve08a88x", ve08a88x.getText().toString());
        se.put("ve08b", ve08b01.isChecked() ? "1"
                : ve08b02.isChecked() ? "2"
                : ve08b03.isChecked() ? "3"
                : ve08b04.isChecked() ? "4"
                : ve08b99.isChecked() ? "99"
                : ve08b88.isChecked() ? "88"
                : "default");
        se.put("ve08b88x", ve08b88x.getText().toString());
        se.put("ve09", ve0901.isChecked() ? "1" : ve0902.isChecked() ? "2" : ve0903.isChecked() ? "3" : "default");
        se.put("ve1001", ve1001.isChecked() ? "1" : "default");
        se.put("ve1002", ve1002.isChecked() ? "2" : "default");
        se.put("ve1003", ve1003.isChecked() ? "3" : "default");
        se.put("ve1004", ve1004.isChecked() ? "4" : "default");
        se.put("ve1005", ve1005.isChecked() ? "5" : "default");
        se.put("ve1006", ve1006.isChecked() ? "6" : "default");
        se.put("ve1088", ve1088.isChecked() ? "88" : "default");
        se.put("ve1088x", ve1088x.getText().toString());
        se.put("ve11", ve1101.isChecked() ? "1"
                : ve1102.isChecked() ? "2"
                : ve1103.isChecked() ? "3"
                : ve1104.isChecked() ? "4"
                : ve1105.isChecked() ? "5"
                : ve1106.isChecked() ? "6"
                : ve1107.isChecked() ? "7"
                : ve1108.isChecked() ? "8"
                : ve1109.isChecked() ? "9"
                : ve1188.isChecked() ? "88"
                : "default");
        se.put("ve1188x", ve1188x.getText().toString());
        se.put("ve12", ve1201.isChecked() ? "1" : ve1202.isChecked() ? "2" : "default");
        se.put("ve12a", ve12a01.isChecked() ? "1"
                : ve12a02.isChecked() ? "2"
                : ve12a03.isChecked() ? "3"
                : ve12a99.isChecked() ? "99"
                : ve12a88.isChecked() ? "88"
                : "default");
        se.put("ve12a88x", ve12a88x.getText().toString());
        se.put("ve13", ve1301.isChecked() ? "1" : ve1302.isChecked() ? "2" : ve1399.isChecked() ? "99" : "default");

        MainApp.gotoIM = !ve1302.isChecked();

        se.put("ve14", ve1401.isChecked() ? "1"
                : ve1402.isChecked() ? "2"
                : ve1403.isChecked() ? "3"
                : ve1404.isChecked() ? "4"
                : ve1405.isChecked() ? "5"
                : ve1406.isChecked() ? "6"
                : ve1499.isChecked() ? "99"
                : ve1488.isChecked() ? "88"
                : "default");
        se.put("ve1488x", ve1488x.getText().toString());
        se.put("ve15", ve1501.isChecked() ? "1" : ve1502.isChecked() ? "2" : ve1503.isChecked() ? "3" : ve1599.isChecked() ? "99" : "default");

        MainApp.gotoOC = ve1501.isChecked();


        se.put("ve1601", ve1601.isChecked() ? "1" : "default");
        se.put("ve1602", ve1602.isChecked() ? "2" : "default");
        se.put("ve1603", ve1603.isChecked() ? "3" : "default");
        se.put("ve1604", ve1604.isChecked() ? "4" : "default");
        se.put("ve1605", ve1605.isChecked() ? "5" : "default");
        se.put("ve1606", ve1606.isChecked() ? "6" : "default");
        se.put("ve1699", ve1699.isChecked() ? "99" : "default");
        se.put("ve1688", ve1688.isChecked() ? "88" : "default");

        se.put("ve1688x", ve1688x.getText().toString());
        se.put("ve17", ve1701.isChecked() ? "1"
                : ve1702.isChecked() ? "2"
                : ve1703.isChecked() ? "3"
                : ve1704.isChecked() ? "4"
                : ve1705.isChecked() ? "5"
                : ve1706.isChecked() ? "6"
                : ve1799.isChecked() ? "99"
                : ve1788.isChecked() ? "88"
                : "default");
        se.put("ve1788x", ve1788x.getText().toString());
        se.put("ve18", ve1801.isChecked() ? "1"
                : ve1802.isChecked() ? "2"
                : ve1803.isChecked() ? "3"
                : ve1804.isChecked() ? "4"
                : ve1805.isChecked() ? "5"
                : ve1888.isChecked() ? "88"
                : "default");
        se.put("ve1888x", ve1888x.getText().toString());
        se.put("ve19", ve1901.isChecked() ? "1"
                : ve1902.isChecked() ? "2"
                : ve1903.isChecked() ? "3"
                : ve1904.isChecked() ? "4"
                : ve1905.isChecked() ? "5"
                : ve1988.isChecked() ? "88"
                : "default");
        se.put("ve1988x", ve1988x.getText().toString());
        se.put("ve20", ve2001.isChecked() ? "1"
                : ve2002.isChecked() ? "2"
                : ve2003.isChecked() ? "3"
                : ve2004.isChecked() ? "4"
                : ve2005.isChecked() ? "5"
                : ve2006.isChecked() ? "6"
                : ve2007.isChecked() ? "7"
                : "default");
        se.put("ve21", ve2101.isChecked() ? "1" : ve2102.isChecked() ? "2" : ve2199.isChecked() ? "99" : "default");
        se.put("ve22", ve2201.isChecked() ? "1"
                : ve2202.isChecked() ? "2"
                : ve2203.isChecked() ? "3"
                : ve2299.isChecked() ? "99"
                : ve2288.isChecked() ? "88"
                : "default");
        se.put("ve2288x", ve2288x.getText().toString());
        se.put("ve23", ve2301.isChecked() ? "1"
                : ve2302.isChecked() ? "2"
                : ve2303.isChecked() ? "3"
                : ve2304.isChecked() ? "4"
                : ve2305.isChecked() ? "5"
                : ve2306.isChecked() ? "6"
                : ve2388.isChecked() ? "88"
                : "default");
        se.put("ve2388x", ve2388x.getText().toString());
        se.put("ve24", ve2401.isChecked() ? "1" : ve2402.isChecked() ? "2" : ve2499.isChecked() ? "99" : "default");
        se.put("ve24a01", ve24a01.isChecked() ? "1" : "default");
        se.put("ve24a02", ve24a02.isChecked() ? "2" : "default");
        se.put("ve24a03", ve24a03.isChecked() ? "3" : "default");
        se.put("ve24a04", ve24a04.isChecked() ? "4" : "default");
        se.put("ve24a99", ve24a99.isChecked() ? "99" : "default");
        se.put("ve24a88", ve24a88.isChecked() ? "88" : "default");
        se.put("ve24a88x", ve24a88x.getText().toString());
        se.put("ve24b01", ve24b01.isChecked() ? "1" : "default");
        se.put("ve24b02", ve24b02.isChecked() ? "2" : "default");
        se.put("ve24b03", ve24b03.isChecked() ? "3" : "default");
        se.put("ve24b04", ve24b04.isChecked() ? "4" : "default");
        se.put("ve24b99", ve24b99.isChecked() ? "99" : "default");
        se.put("ve24b88", ve24b88.isChecked() ? "88" : "default");
        se.put("ve24b88x", ve24b88x.getText().toString());
        se.put("ve25a01", ve25a01.isChecked() ? "1" : "default");
        se.put("ve25a02", ve25a02.isChecked() ? "2" : "default");
        se.put("ve25a03", ve25a03.isChecked() ? "3" : "default");
        se.put("ve25a04", ve25a04.isChecked() ? "4" : "default");
        se.put("ve25a99", ve25a99.isChecked() ? "99" : "default");
        se.put("ve25a88", ve25a88.isChecked() ? "88" : "default");
        se.put("ve25a88x", ve25a88x.getText().toString());
        se.put("ve25", ve2501.isChecked() ? "1" : ve2502.isChecked() ? "2" : ve2599.isChecked() ? "99" : "default");
        se.put("ve25a", ve25a01.isChecked() ? "1"
                : ve25a02.isChecked() ? "2"
                : ve25a03.isChecked() ? "3"
                : ve25a04.isChecked() ? "4"
                : ve25a05.isChecked() ? "5"
                : ve25a88.isChecked() ? "88"
                : ve25a99.isChecked() ? "99"
                : "default");
        se.put("ve25a88x", ve25a88x.getText().toString());

        se.put("vf01", vf101.isChecked() ? "1" : vf102.isChecked() ? "2" : vf103.isChecked() ? "3" : "default");

        MainApp.fc.setsE(String.valueOf(se));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (ve01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve01), Toast.LENGTH_LONG).show();
            ve0102.setError("This data is Required!");
            Log.i(TAG, "ve01: This data is Required!");
            return false;
        } else {
            ve0102.setError(null);
        }

        if (ve0101.isChecked()) {

            if (!(ve0201.isChecked()
                    || ve0202.isChecked()
                    || ve0203.isChecked()
                    || ve0204.isChecked()
                    || ve0205.isChecked()
                    || ve0288.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve02), Toast.LENGTH_LONG).show();
                ve0288.setError("This data is Required!");
                Log.i(TAG, "ve028: This data is Required!");
                return false;
            } else {
                ve0288.setError(null);
            }

            if (ve0288.isChecked() && ve0288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve02) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve0288x.setError("This data is Required!");
                Log.i(TAG, "ve0288x: This data is Required!");
                return false;
            } else {
                ve0288x.setError(null);
            }

            if (!(ve0301.isChecked()
                    || ve0302.isChecked()
                    || ve0303.isChecked()
                    || ve0304.isChecked()
                    || ve0305.isChecked()
                    || ve0306.isChecked()
                    || ve0307.isChecked()
                    || ve0308.isChecked()
                    || ve0309.isChecked()
                    || ve0310.isChecked()
                    || ve0311.isChecked()
                    || ve0312.isChecked()
                    || ve0388.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve03), Toast.LENGTH_LONG).show();
                ve0388.setError("This data is Required!");
                Log.i(TAG, "ve038: This data is Required!");
                return false;
            } else {
                ve0388.setError(null);
            }

            if (ve0388.isChecked() && ve0388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve03) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve0388x.setError("This data is Required!");
                Log.i(TAG, "ve0388x: This data is Required!");
                return false;
            } else {
                ve0388x.setError(null);
            }


        }

        if (ve04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve04), Toast.LENGTH_LONG).show();
            ve0499.setError("This data is Required!");
            Log.i(TAG, "ve04: This data is Required!");
            return false;
        } else {
            ve0499.setError(null);
        }

        if (ve0401.isChecked()) {

            // RadioGroup
            if (ve04a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve04a), Toast.LENGTH_LONG).show();
                ve04a99.setError("This data is Required!");
                Log.i(TAG, "ve04a: This data is Required!");
                return false;
            } else {
                ve04a99.setError(null);
            }

            // Others
            if (ve04a88.isChecked() && ve04a88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve04a) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve04a88x.setError("This data is Required!");
                Log.i(TAG, "ve04a88x: This data is Required!");
                return false;
            } else {
                ve04a88x.setError(null);
            }


        }

        if (ve0402.isChecked()) {

            // RadioGroup
            if (ve04b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve04b), Toast.LENGTH_LONG).show();
                ve04b99.setError("This data is Required!");
                Log.i(TAG, "ve04b: This data is Required!");
                return false;
            } else {
                ve04b99.setError(null);
            }

            // Others
            if (ve04b88.isChecked() && ve04b88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve04b) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve04b88x.setError("This data is Required!");
                Log.i(TAG, "ve04b88x: This data is Required!");
                return false;
            } else {
                ve04b88x.setError(null);
            }


        }


        // RadioGroup
        if (ve05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve05), Toast.LENGTH_LONG).show();
            ve0599.setError("This data is Required!");
            Log.i(TAG, "ve05: This data is Required!");
            return false;
        } else {
            ve0599.setError(null);
        }

        // Others
        if (ve0588.isChecked() && ve0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve05) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            ve0588x.setError("This data is Required!");
            Log.i(TAG, "ve0588x: This data is Required!");
            return false;
        } else {
            ve0588x.setError(null);
        }


        if (!(ve0599.isChecked())) {

            if (ve06.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve06), Toast.LENGTH_LONG).show();
                ve0699.setError("This data is Required!");
                Log.i(TAG, "ve06: This data is Required!");
                return false;
            } else {
                ve0699.setError(null);
            }

            // Others
            if (ve0688.isChecked() && ve0688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve06) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve0688x.setError("This data is Required!");
                Log.i(TAG, "ve0688x: This data is Required!");
                return false;
            } else {
                ve0688x.setError(null);
            }
        }


        if (ve07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve07), Toast.LENGTH_LONG).show();
            ve0799.setError("This data is Required!");
            Log.i(TAG, "ve07: This data is Required!");
            return false;
        } else {
            ve0799.setError(null);
        }

        // Others
        if (ve0788.isChecked() && ve0788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve07) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            ve0788x.setError("This data is Required!");
            Log.i(TAG, "ve0788x: This data is Required!");
            return false;
        } else {
            ve0788x.setError(null);
        }

        if (ve08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve08), Toast.LENGTH_LONG).show();
            ve0899.setError("This data is Required!");
            Log.i(TAG, "ve08: This data is Required!");
            return false;
        } else {
            ve0899.setError(null);
        }
        if (ve0801.isChecked()) {

            // RadioGroup
            if (ve08a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve08a), Toast.LENGTH_LONG).show();
                ve08a99.setError("This data is Required!");
                Log.i(TAG, "ve08a: This data is Required!");
                return false;
            } else {
                ve08a99.setError(null);
            }

            // Others
            if (ve08a88.isChecked() && ve08a88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve08a) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve08a88x.setError("This data is Required!");
                Log.i(TAG, "ve08a88x: This data is Required!");
                return false;
            } else {
                ve08a88x.setError(null);
            }


        }

        if (ve0802.isChecked()) {

            // RadioGroup
            if (ve08b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve08b), Toast.LENGTH_LONG).show();
                ve08b99.setError("This data is Required!");
                Log.i(TAG, "ve08b: This data is Required!");
                return false;
            } else {
                ve08b99.setError(null);
            }

            // Others
            if (ve08b88.isChecked() && ve08b88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve08b) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve08b88x.setError("This data is Required!");
                Log.i(TAG, "ve08b88x: This data is Required!");
                return false;
            } else {
                ve08b88x.setError(null);
            }


        }

        // RadioGroup
        if (ve09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve09), Toast.LENGTH_LONG).show();
            ve0903.setError("This data is Required!");
            Log.i(TAG, "ve09: This data is Required!");
            return false;
        } else {
            ve0903.setError(null);
        }

        if (ve0901.isChecked()) {

            if (!(ve1001.isChecked()
                    || ve1002.isChecked()
                    || ve1003.isChecked()
                    || ve1004.isChecked()
                    || ve1005.isChecked()
                    || ve1006.isChecked()
                    || ve1088.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve10), Toast.LENGTH_LONG).show();
                ve1088.setError("This data is Required!");
                Log.i(TAG, "ve108: This data is Required!");
                return false;
            } else {
                ve1088.setError(null);
            }

            if (ve1088.isChecked() && ve1088x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve10) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve1088x.setError("This data is Required!");
                Log.i(TAG, "ve1088x: This data is Required!");
                return false;
            } else {
                ve1088x.setError(null);
            }
        }
        if (!(ve1101.isChecked()
                || ve1102.isChecked()
                || ve1103.isChecked()
                || ve1104.isChecked()
                || ve1105.isChecked()
                || ve1106.isChecked()
                || ve1107.isChecked()
                || ve1108.isChecked()
                || ve1109.isChecked()
                || ve1188.isChecked()
        )) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve11), Toast.LENGTH_LONG).show();
            ve1188.setError("This data is Required!");
            Log.i(TAG, "ve118: This data is Required!");
            return false;
        } else {
            ve1188.setError(null);
        }

        if (ve1188.isChecked() && ve1188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve11) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
            ve1188x.setError("This data is Required!");
            Log.i(TAG, "ve1188x: This data is Required!");
            return false;
        } else {
            ve1188x.setError(null);
        }

        if (ve12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve12), Toast.LENGTH_LONG).show();
            ve1202.setError("This data is Required!");
            Log.i(TAG, "ve12: This data is Required!");
            return false;
        } else {
            ve1202.setError(null);
        }

        if (ve1202.isChecked()) {

            if (ve12a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve12a), Toast.LENGTH_LONG).show();
                ve12a88.setError("This data is Required!");
                Log.i(TAG, "ve12a: This data is Required!");
                return false;
            } else {
                ve12a88.setError(null);
            }

            if (ve12a88.isChecked() && ve12a88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve12a) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve12a88x.setError("This data is Required!");
                Log.i(TAG, "ve12a88x: This data is Required!");
                return false;
            } else {
                ve12a88x.setError(null);
            }
        }
        // RadioGroup
        if (ve13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve13), Toast.LENGTH_LONG).show();
            ve1399.setError("This data is Required!");
            Log.i(TAG, "ve13: This data is Required!");
            return false;
        } else {
            ve1399.setError(null);
        }

        if (ve1302.isChecked()) {

            if (ve14.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve14), Toast.LENGTH_LONG).show();
                ve1488.setError("This data is Required!");
                Log.i(TAG, "ve14: This data is Required!");
                return false;
            } else {
                ve1488.setError(null);
            }

            if (ve1488.isChecked() && ve1488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve14) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve1488x.setError("This data is Required!");
                Log.i(TAG, "ve1488x: This data is Required!");
                return false;
            } else {
                ve1488x.setError(null);
            }
        }

        // RadioGroup
        if (ve15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve15), Toast.LENGTH_LONG).show();
            ve1599.setError("This data is Required!");
            Log.i(TAG, "ve15: This data is Required!");
            return false;
        } else {
            ve1599.setError(null);
        }

        if (!(ve1502.isChecked() || ve1599.isChecked()) && (ve1301.isChecked())) {

            if (!(ve1601.isChecked()
                    || ve1602.isChecked()
                    || ve1603.isChecked()
                    || ve1604.isChecked()
                    || ve1605.isChecked()
                    || ve1606.isChecked()
                    || ve1699.isChecked()
                    || ve1688.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve16), Toast.LENGTH_LONG).show();
                ve1688.setError("This data is Required!");
                Log.i(TAG, "ve168: This data is Required!");
                return false;
            } else {
                ve1688.setError(null);
            }

            if (ve17.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve17), Toast.LENGTH_LONG).show();
                ve1788.setError("This data is Required!");
                Log.i(TAG, "ve178: This data is Required!");
                return false;
            } else {
                ve1788.setError(null);
            }
            if (ve18.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve18), Toast.LENGTH_LONG).show();
                ve1888.setError("This data is Required!");
                Log.i(TAG, "ve188: This data is Required!");
                return false;
            } else {
                ve1888.setError(null);
            }
            if (ve19.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve19), Toast.LENGTH_LONG).show();
                ve1988.setError("This data is Required!");
                Log.i(TAG, "ve198: This data is Required!");
                return false;
            } else {
                ve1988.setError(null);
            }
            if (ve20.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve20), Toast.LENGTH_LONG).show();
                ve2007.setError("This data is Required!");
                Log.i(TAG, "ve208: This data is Required!");
                return false;
            } else {
                ve2007.setError(null);
            }
            if (ve1302.isChecked()) {

                if (ve21.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve21), Toast.LENGTH_LONG).show();
                    ve2199.setError("This data is Required!");
                    Log.i(TAG, "ve21: This data is Required!");
                    return false;
                } else {
                    ve2199.setError(null);
                }

                if (ve2101.isChecked()) {

                    if (ve22.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve22), Toast.LENGTH_LONG).show();
                        ve2288.setError("This data is Required!");
                        Log.i(TAG, "ve22: This data is Required!");
                        return false;
                    } else {
                        ve2288.setError(null);
                    }

                    if (ve2288.isChecked() && ve2288x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve22) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                        ve2288x.setError("This data is Required!");
                        Log.i(TAG, "ve2288x: This data is Required!");
                        return false;
                    } else {
                        ve2288x.setError(null);
                    }
                }
            }
            if (ve23.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve23), Toast.LENGTH_LONG).show();
                ve2388.setError("This data is Required!");
                Log.i(TAG, "ve238: This data is Required!");
                return false;
            } else {
                ve2388.setError(null);
            }

        }

        if (ve24.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve24), Toast.LENGTH_LONG).show();
            ve2499.setError("This data is Required!");
            Log.i(TAG, "ve24: This data is Required!");
            return false;
        } else {
            ve2499.setError(null);
        }

        if (ve2401.isChecked()) {

            if (!(ve24a01.isChecked()
                    || ve24a02.isChecked()
                    || ve24a03.isChecked()
                    || ve24a04.isChecked()
                    || ve24a99.isChecked()
                    || ve24a88.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve24a), Toast.LENGTH_LONG).show();
                ve24a88.setError("This data is Required!");
                Log.i(TAG, "ve24a: This data is Required!");
                return false;
            } else {
                ve24a88.setError(null);
            }

            if (ve24a88.isChecked() && ve24a88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve24a) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve24a88x.setError("This data is Required!");
                Log.i(TAG, "ve24a88x: This data is Required!");
                return false;
            } else {
                ve24a88x.setError(null);
            }
        }
        if (ve2402.isChecked()) {

            if (!(ve24b01.isChecked()
                    || ve24b02.isChecked()
                    || ve24b03.isChecked()
                    || ve24b04.isChecked()
                    || ve24b99.isChecked()
                    || ve24b88.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve24b), Toast.LENGTH_LONG).show();
                ve24b88.setError("This data is Required!");
                Log.i(TAG, "ve24b: This data is Required!");
                return false;
            } else {
                ve24b88.setError(null);
            }

            if (ve24b88.isChecked() && ve24b88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve24b) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve24b88x.setError("This data is Required!");
                Log.i(TAG, "ve24b88x: This data is Required!");
                return false;
            } else {
                ve24b88x.setError(null);
            }
        }
        if (ve25.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve25), Toast.LENGTH_LONG).show();
            ve2599.setError("This data is Required!");
            Log.i(TAG, "ve25: This data is Required!");
            return false;
        } else {
            ve2599.setError(null);
        }

        if (ve2501.isChecked()) {

            if (!(ve25a01.isChecked()
                    || ve25a02.isChecked()
                    || ve25a03.isChecked()
                    || ve25a04.isChecked()
                    || ve25a05.isChecked()
                    || ve25a99.isChecked()
                    || ve25a88.isChecked()
            )) {
                Toast.makeText(this, "ERROR(not selected): " + getString(R.string.ve25a), Toast.LENGTH_LONG).show();
                ve25a88.setError("This data is Required!");
                Log.i(TAG, "ve25a: This data is Required!");
                return false;
            } else {
                ve25a88.setError(null);
            }

            if (ve25a88.isChecked() && ve25a88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ve25a) + " - " + getString(R.string.Others), Toast.LENGTH_LONG).show();
                ve25a88x.setError("This data is Required!");
                Log.i(TAG, "ve25a88x: This data is Required!");
                return false;
            } else {
                ve25a88x.setError(null);
            }
        }

        if (vf01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getString(R.string.vg12), Toast.LENGTH_LONG).show();
            vf103.setError("This data is Required!");
            Log.i(TAG, "vg12: This data is Required!");
            return false;
        } else {
            vf103.setError(null);
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
