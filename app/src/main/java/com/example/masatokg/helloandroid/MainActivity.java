package com.example.masatokg.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tapHere = (Button)findViewById(R.id.tapHere);
        tapHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText("タップされました");
            }
        });

// Test用にコメント作成

    }
//    public void onClickButton(View view){
//        TextView textView = (TextView)findViewById(R.id.textView);
//        textView.setText("ボタンがタップされました！");
//    }


}
