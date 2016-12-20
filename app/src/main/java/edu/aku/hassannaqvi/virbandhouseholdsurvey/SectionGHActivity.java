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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionGHActivity extends Activity  {

    @BindView(R.id.activity_seaction_g_h) ScrollView activitySeactionGH;
    @BindView(R.id.crf1_header) TextView crf1Header;
    @BindView(R.id.areaCode) TextView areaCode;
    @BindView(R.id.subAreaCode) EditText subAreaCode;
    @BindView(R.id.fldGrpDOB) LinearLayout fldGrpDOB;
    @BindView(R.id.vg03) DatePicker vg03;
    @BindView(R.id.household) EditText household;
    @BindView(R.id.crf2_header) TextView crf2Header;
    @BindView(R.id.vh01) EditText vh01;
    @BindView(R.id.vh02) RadioGroup vh02;
    @BindView(R.id.vh0201) RadioButton vh0201;
    @BindView(R.id.vh0202) RadioButton vh0202;
    @BindView(R.id.vhAgeDob) RadioGroup vhAgeDob;
    @BindView(R.id.vhDob) RadioButton vhDob;
    @BindView(R.id.vhAge) RadioButton vhAge;
    @BindView(R.id.fldGrpDOB_H) LinearLayout fldGrpDOBH;
    @BindView(R.id.vh03) DatePicker vh03;
    @BindView(R.id.fldGrpAge_H) LinearLayout fldGrpAgeH;
    @BindView(R.id.vh04d) EditText vh04d;
    @BindView(R.id.vh04m) EditText vh04m;
    @BindView(R.id.vh04y) EditText vh04y;
    @BindView(R.id.vh05) EditText vh05;
    @BindView(R.id.vh06) RadioGroup vh06;
    @BindView(R.id.vh0601) RadioButton vh0601;
    @BindView(R.id.vh0602) RadioButton vh0602;
    @BindView(R.id.vh0603) RadioButton vh0603;
    @BindView(R.id.vh0604) RadioButton vh0604;
    @BindView(R.id.vh0605) RadioButton vh0605;
    @BindView(R.id.vh0606) RadioButton vh0606;
    @BindView(R.id.vh0607) RadioButton vh0607;
    @BindView(R.id.vh0608) RadioButton vh0608;
    @BindView(R.id.vh0688) RadioButton vh0688;
    @BindView(R.id.vh0688x) EditText vh0688x;
    @BindView(R.id.vh07) EditText vh07;
    @BindView(R.id.vh08) EditText vh08;
    @BindView(R.id.vh09) RadioGroup vh09;
    @BindView(R.id.vh0901) RadioButton vh0901;
    @BindView(R.id.vh0902) RadioButton vh0902;
    @BindView(R.id.vh0903) RadioButton vh0903;
    @BindView(R.id.vh0904) RadioButton vh0904;
    @BindView(R.id.vh0988) RadioButton vh0988;
    @BindView(R.id.vh0988x) EditText vh0988x;
    @BindView(R.id.vh10) RadioGroup vh10;
    @BindView(R.id.vh1001) RadioButton vh1001;
    @BindView(R.id.vh1002) RadioButton vh1002;
    @BindView(R.id.vh11) RadioGroup vh11;
    @BindView(R.id.vh1101) RadioButton vh1101;
    @BindView(R.id.vh1102) RadioButton vh1102;
    @BindView(R.id.vh1103) RadioButton vh1103;
    @BindView(R.id.vh12) RadioGroup vh12;
    @BindView(R.id.vh1201) RadioButton vh1201;
    @BindView(R.id.vh1202) RadioButton vh1202;
    @BindView(R.id.vh1203) RadioButton vh1203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g_h);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {
        //TODO implement
    }

}
