package tr.gov.diyanet.uygulama4sayfa171;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        EditText editText1=findViewById(R.id.editTextText1);
        EditText editText2=findViewById(R.id.editTextText2);
        EditText editText3=findViewById(R.id.editTextText3);
        TextView textView=findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(editText1.getText().toString());
                int number2=Integer.parseInt(editText2.getText().toString());
                int sonuc=topla(number1,number2);
                textView.setText("Sonuç:"+sonuc);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(editText1.getText().toString());
                int number2=Integer.parseInt(editText2.getText().toString());
                int number3=Integer.parseInt(editText3.getText().toString());
                int sonuc=topla(number1,number2,number3);
                textView.setText("Sonuç:"+sonuc);
            }
        });
    }
    private int topla(int number1,int number2){
        return number1+number2;
    }
    private int topla(int number1,int number2,int number3){
        return number1+number2+number3;
    }
}