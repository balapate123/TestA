package bhargav.marsonia.bhargavtesta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MarsoniaActivity extends AppCompatActivity {

    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marsonia);

        String userNameBhargav = getIntent().getStringExtra("bhargav.marsonia");

         textview= (TextView) findViewById(R.id.bhargavTV2);
        textview.setText(userNameBhargav);
    }
}