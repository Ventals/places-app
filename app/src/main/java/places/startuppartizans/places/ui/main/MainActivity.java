package places.startuppartizans.places.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import places.startuppartizans.places.ui.login.LoginFragment;
import places.startuppartizans.places.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new LoginFragment()).commit();
        }

    }
}
