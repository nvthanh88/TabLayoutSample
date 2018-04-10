package vn.javis.tablayoutsample;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button btnOpenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnOpenFragment = (Button)findViewById(R.id.btnOpenTabLayout);
        btnOpenFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentTabLayoutSample fragmentTabLayoutSample = new FragmentTabLayoutSample();
                fragmentTransaction.replace(R.id.content,fragmentTabLayoutSample,"");
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
    }
}
