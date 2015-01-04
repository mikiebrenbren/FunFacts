package com.veechie.mikiebrenbren.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private RelativeLayout mRelativeLayout;
    private String[] mColors = {"#39add1","#3079ab", "#c25975","#e15258", "#f9845b","#838cc7", "#b7c0c7"};
    private Button showFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare our view variables and assign them the views from the layout files
        mRelativeLayout = (RelativeLayout) this.findViewById(R.id.main_relative_layout);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton); //alt + enter

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factLabel.setText(mFactBook.getFact());
                changeBackgroundColor();
            }
        };
        showFactButton.setOnClickListener(listener);
    }

    private void changeBackgroundColor(){
            int colorAsInt = Color.parseColor(mColors[FactBook.randomNum]);
            mRelativeLayout.setBackgroundColor(colorAsInt);
            showFactButton.setTextColor(colorAsInt);
    }
}
