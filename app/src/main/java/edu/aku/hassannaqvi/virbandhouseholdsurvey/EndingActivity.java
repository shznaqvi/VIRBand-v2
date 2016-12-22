package edu.aku.hassannaqvi.virbandhouseholdsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EndingActivity extends Activity {

    private static final String TAG = EndingActivity.class.getSimpleName();


    @BindView(R.id.activity_ending)
    ScrollView activityEnding;
    @BindView(R.id.istatus)
    RadioGroup istatus;
    @BindView(R.id.istatusa)
    RadioButton istatusa;
    @BindView(R.id.istatusb)
    RadioButton istatusb;
    @BindView(R.id.istatusc)
    RadioButton istatusc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        istatusa.setEnabled(!(getIntent().getBooleanExtra("complete", false)));

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing Closing Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Closing Form!", Toast.LENGTH_SHORT).show();

                finish();

                Intent endSec = new Intent(this, MainActivity.class);
                MainApp.child_name = "TEST";
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateEnd();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        switch (istatus.getCheckedRadioButtonId()) {
            case R.id.istatusa:
                MainApp.fc.setIstatus("1");
                break;
            case R.id.istatusb:
                MainApp.fc.setIstatus("2");
                break;
            case R.id.istatusc:
                MainApp.fc.setIstatus("3");
                break;
            default:
                MainApp.fc.setIstatus("default");
                break;
        }

    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating Closing Section", Toast.LENGTH_SHORT).show();

        if (istatus.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.istatus), Toast.LENGTH_LONG).show();
            istatusc.setError("This data is Required!");
            Log.i(TAG, "mnd9: This data is Required!");
            return false;
        } else {
            istatusc.setError(null);
        }
        return true;
    }
}
