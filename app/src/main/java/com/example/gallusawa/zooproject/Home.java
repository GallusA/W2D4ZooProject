package com.example.gallusawa.zooproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    TextView animalName;
    TextView animalCategory;
    TextView animalFood;
    TextView animalHabitat;
    ImageView imageView;
    TextView textView;
    Button button;

     Zoo zoo;

    private static final String TAG = "Third";
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

//        animalName= (TextView) findViewById(R.id.AnimalName);
//        animalCategory = (TextView) findViewById(R.id.textView1);
//        animalFood = (TextView) findViewById(R.id.AnimalFood);
//        animalHabitat = (TextView) findViewById(R.id.AnimalHabitat);
//        imageView = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.btnButtom4);

        button.setOnClickListener(this);



        webView = (WebView) findViewById(R.id.webview);
        WebViewClient webViewClient = new WebViewClient();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("http://mnzoo.org");

/*
        Intent i = getIntent();
        String postion = i.getStringExtra("Animal");
*/

        //textView = Integer.parseInt(animalId);
        //   textView.setText(animalId);


/*
        animalName.setText(zoo.getAnimalName());
       animalCategory.setText(String.valueOf(zoo.getAnimalCategory()));
        animalFood.setText(String.valueOf((zoo.getAnimalFood())));
        animalHabitat.setText(String.valueOf(zoo.getAnimalHabitat()));

   */



    }

       public void openZoo(View v) {

       }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Categories.class);
        startActivity(intent);
    }


}
