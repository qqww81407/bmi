package tw.com.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result; //顯示計算結果用
    private EditText weight,height;  //讓使用者輸入數值用




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //將布局檔載入

        result = findViewById(R.id.result);  //定義布局檔中的元件
        weight = findViewById(R.id.userweight);
        height = findViewById(R.id.userheight);

    }
    public void bmiClick(View view){ //要讓布局檔呼叫的方法,權限一定要是public
        float userweight = Float.parseFloat(weight.getText().toString());
        float userheight = Float.parseFloat(height.getText().toString());
        float bmi = userweight / ((userheight/100) * (userheight/100));

        result.setText("結果:"+bmi);

    }
}