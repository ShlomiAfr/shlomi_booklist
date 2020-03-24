package com.example.shlomi_booklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        RecyclerView recyclerView = findViewById(R.id.container);
        BookAdapter adapter = new BookAdapter();
        recyclerView.setAdapter(adapter);

        Button addBookTv = findViewById(R.id.addBook);

        addBookTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookList.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
