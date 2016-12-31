package com.forcerift.sjfox.project_bjet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        final Button view_budgets_button = (Button) findViewById(R.id._button_view_budgets);
        final Button delete_budgets_button = (Button) findViewById(R.id._button_delete_budgets);
        final Button add_budgets_button = (Button) findViewById(R.id._button_add_buttons);

        view_budgets_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, BudgetListView.class));
            }
        });

        delete_budgets_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, BudgetListView.class));
            }
        });

        add_budgets_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, BudgetCreationPage.class));
            }
        });
    }
}
