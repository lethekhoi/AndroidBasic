package lethekhoi.ltk.hcmus.androidbassic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Math method
        //static : mặc định đã có ko cần tạo lại
        // 1 : làm tròn : Math.round()
        float number1 = 0.4f;
        number1 = Math.round(number1);
        Log.d("AAA", number1 + "");
//        // 2 : làm tròn lên : 2.1 ->3
//        float number2 = 2.1f;
//
//        number2 = (float) Math.ceil(number2);
//        Log.d("BBB", number2 + "");
//        // 3 : làm tròn xuống : 2.9->2
//        float number3 = 2.9f;
//        number3 = (float) Math.floor(number3);
//
        //4 : Math.random
//random sao cho các số có tỉ lệ đều nhau (cộng cho 1 rồi mới nhân sau đó lấy floor xuống )
//        for (int i = 0; i <= 100; i++) {
//            double number4 = Math.flooLog.d("CCC", number3 + "");r(Math.random() * 6);
//            Log.d("CCC", number4 + "");
// 5 tìm ra số lớn nhát so nhỏ nhất   Log.d("CCC", number3 + "");
        int[] a = {1, 10, 11, 20, 20, 19, 21, 99};//phan khai bao va khoi tao
//bai tap :
// 1 : tong gia tri trong mang
// 2 :tim kiếm giá trị trong mảng +nếu có trả về vị tri
        //                      +nếu ko trả về -1
        //3 : tim kiếm gia tri o vị tri dau tien + có in vị trí +ko in ra -1;
        //4 : xoa cac phan tu bị trung trong mang
        // [1, 2 ,3 ,3, 4, 5] => [1,2,3,4,5]
//        int tong = 0;
////        for (int value : a) {
////
////            tong = tong + value;
////
////        }
////        Log.d("BBB", tong + "");
        //bai tap 3
        int m = 20;
        int i = 0;
        int dem = 0;
        for (; i < a.length; i++) {

            if (a[i] == m) {
                Log.d("BBB", i + "");
                dem++;
            }
        }
        if (dem == 0) {
            Log.d("BBB", "-1");
        }


    }

}
