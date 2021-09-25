package omgimbot.app.lsmapps.features.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import omgimbot.app.lsmapps.App;
import omgimbot.app.sidangapps.R;

public class ContentMateriActivity extends AppCompatActivity {
 @BindView(R.id.text_view)
    TextView textView ;
    @BindView(R.id.toolbar_default_in)
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_materi);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Materi");
        mToolbar.setTitleTextColor(getResources().getColor(R.color.color_default_blue));
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_back_left));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView.setText(Html.fromHtml(App.getApplication().getString(R.string.sampleMateri)));
    }
}
