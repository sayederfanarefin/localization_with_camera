package thesis.others.erfan.mazid.localozation_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settings = getSharedPreferences("LEL", 0);
        if(!settings.getBoolean("loggedIn", false)){
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }

    }
}
