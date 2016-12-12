package com.lcl.designfloatingactionbutton;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ThreeActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private FloatingActionButton floatingActionButton;
    private CoordinatorLayout coordinatorLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        coordinatorLayout= (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(ThreeActivity.this,LinearLayoutManager.VERTICAL,false));
        myRecyclerView.setItemAnimator(new DefaultItemAnimator());
        myRecyclerView.setAdapter(new MyRecyclerAdapter(ThreeActivity.this,new ArrayList<String>()));

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(coordinatorLayout, "FloatingActionButton", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
