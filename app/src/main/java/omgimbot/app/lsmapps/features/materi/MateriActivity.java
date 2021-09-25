package omgimbot.app.lsmapps.features.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import omgimbot.app.lsmapps.Utils.LinkedHashMapAdapter;
import omgimbot.app.lsmapps.features.dashboard.DashboardActivity;
import omgimbot.app.sidangapps.R;

public class MateriActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @BindView(R.id.toolbar_default_in)
    Toolbar mToolbar;

    @BindView(R.id.mMt)
    Spinner mMt;

    @BindView(R.id.data1)
    CardView data1;

    @BindView(R.id.data2)
    CardView data2;

    @BindView(R.id.data3)
    CardView data3;

    String value;
    String idSpinner;
    private LinkedHashMap<String, String> mt;
    private LinkedHashMapAdapter<String, String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Materi");
        mToolbar.setTitleTextColor(getResources().getColor(R.color.color_default_blue));
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_back_left));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mt = new LinkedHashMap<String, String>();
        mt.put("1", "Semua Materi");
        mt.put("2", "Video");

        adapter = new LinkedHashMapAdapter<String, String>(this, R.layout.spinnermt, mt);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mMt.setAdapter(adapter);
        mMt.setOnItemSelectedListener(MateriActivity.this);
        data1.setOnClickListener(view ->this.gotoContentMateri());
    }

    void gotoContentMateri() {
        startActivity(new Intent(MateriActivity.this, ContentMateriActivity.class));
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goToDashboard();
    }

    public void goToDashboard() {
        Intent a = new Intent(this, DashboardActivity.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.mMt:
                Map.Entry<String, String> itemMt = (Map.Entry<String, String>) mMt.getSelectedItem();
                idSpinner = itemMt.getKey();
                value = itemMt.getValue();
                if (!idSpinner.equals("1")) {
                    data1.setVisibility(View.GONE);
                    data2.setVisibility(View.GONE);
                } else {
                    data1.setVisibility(View.VISIBLE);
                    data2.setVisibility(View.VISIBLE);
                    data3.setVisibility(View.VISIBLE);
                }

                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
