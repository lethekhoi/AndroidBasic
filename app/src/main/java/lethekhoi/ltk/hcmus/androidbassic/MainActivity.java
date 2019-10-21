package lethekhoi.ltk.hcmus.androidbassic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inSoChinhPhuong();
    }

    private void inSoChinhPhuong() {


        for (int i = 0; i <= 100; i += 1) {
            int j = 1;
            while (j * j <= i) {
                if (j * j == i) {
                    Log.d("BBB", i + "");
                }
                j = j + 1;
            }
        }

    }
}
