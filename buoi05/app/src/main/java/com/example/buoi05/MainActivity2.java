package com.example.buoi05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1,textView2;
    ImageView imageView;
    Obj obj2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if(bundle == null) {
            return;
        }else {
            obj2=(Obj) bundle.get("objobj");
        }
        textView1=findViewById(R.id.word2);
        textView2=findViewById(R.id.Sub_Image2);
        imageView = findViewById(R.id.image2);
        textView1.setText(obj2.getTitle());
        textView2.setText(obj2.getSub());
        imageView.setImageResource(obj2.getSrc());
    }
}