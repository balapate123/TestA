package bhargav.marsonia.bhargavtesta;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class BhargavActivity extends AppCompatActivity {

    private EditText password;
    private Button signIN;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bhargav Marsonia 301108254");


        password = (EditText) findViewById(R.id.bhargavPassword);
        username = (EditText) findViewById(R.id.bhargavUserName);
        signIN = (Button) findViewById(R.id.signbhar123);

        signIN.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("bhargav.marsonia") && password.getText().toString().equals("301108254"))
                {
                    Bundle userNameBhargav = new Bundle();
                    Intent intent = new Intent(getApplicationContext(),
                            MarsoniaActivity.class);
                    intent.putExtra("bhargav.marsonia", userNameBhargav);
                    startActivity(intent);


                }
                else
                 {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(BhargavActivity.this);

                    dialog.setMessage("Invalid username/password. please try again");
                    dialog.setTitle("Bhargav Marsonia 301108254");
                    dialog.show();
                }

            }
        });


    }

}