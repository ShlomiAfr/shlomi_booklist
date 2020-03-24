package com.example.shlomi_booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private static final String TAG = "MainActivity";

    TextView bookNameTv, authorNameTV, genreKindTV;
    Button addBookBtn, watchListBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d(TAG, "onCreate: started");

        bookNameTv = findViewById(R.id.nameTV);
        authorNameTV = findViewById(R.id.authorTv);
        genreKindTV = findViewById(R.id.genreTv);
        addBookBtn = findViewById(R.id.addBook);
        watchListBtn = findViewById(R.id.watchListTv);

        if (DataManager.getBookArrayList().size() >= 3)
            watchListBtn.setEnabled(true);

        addBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String book = bookNameTv.getText().toString();
                String author = authorNameTV.getText().toString();
                String genre = genreKindTV.getText().toString();
                if (book.equals("") || author.equals("") || genre.equals("")) {
                    Toast.makeText(MainActivity.this, "Fill in all the blanks", Toast.LENGTH_SHORT).show();
                    return;
                }

                Book newBook = new Book(book, author, genre);
                DataManager.addBook(newBook);
                bookNameTv.setText("");
                authorNameTV.setText("");
                genreKindTV.setText("");

                if (DataManager.getBookArrayList().size() >= 3)
                    watchListBtn.setEnabled(true);
            }
        });

        watchListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookList.class);
                startActivity(intent);
            }
        });
    }



}
