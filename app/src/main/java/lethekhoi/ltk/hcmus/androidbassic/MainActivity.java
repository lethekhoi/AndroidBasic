package lethekhoi.ltk.hcmus.androidbassic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inSoNguyenTo();
    }

    private void inSoNguyenTo() {


        for (int i = 0; i <= 100; i++) {
            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag = flag + 1;
                }

            }
            if (flag == 2) Log.d("BBB", i + "");
        }

    }
}
