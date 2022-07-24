package com.example.masters;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryRecyclerView = findViewById(R.id.categoryRecyclerView);

        categoryRecyclerView.setAdapter(new CategoryRecyclerViewAdapter());
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "fab", Toast.LENGTH_SHORT).show();

                displayCreateCategoryDialog();

            }
        });

    }

    private void displayCreateCategoryDialog() {

        String alertTitle = getString(R.string.alertTitle);
        String positiveButtonTitle = getString(R.string.positiveButtonTitle);

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        EditText categoryEditText = new EditText(this);
        categoryEditText.setInputType(InputType.TYPE_CLASS_TEXT);

        alertBuilder.setTitle(alertTitle);
        alertBuilder.setView(categoryEditText);

        alertBuilder.setPositiveButton(positiveButtonTitle, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();

            }
        });

        alertBuilder.create().show();

    }

}