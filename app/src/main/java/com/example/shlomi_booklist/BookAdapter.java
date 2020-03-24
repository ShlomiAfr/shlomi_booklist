package com.example.shlomi_booklist;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    //public static final String TAG ="BookAdapter";



    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_cell, parent, false);
        BookViewHolder bookViewHolder = new BookViewHolder(view);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        //Log.d(TAG, "onBindViewHolder: called.");
        Book currentBook = DataManager.getBookAt(position);
        holder.bookName.setText(currentBook.getBookName());
    }

    @Override
    public int getItemCount() {
        return DataManager.getBookArrayList().size();
    }

    class  BookViewHolder extends RecyclerView.ViewHolder{
        TextView bookName;

        public BookViewHolder(@NonNull View itemView/*, TextView bookName*/) {
            super(itemView);
            this.bookName = itemView.findViewById(R.id.bookTitle);
        }

        /*public BookViewHolder(View view) {
            super(view);
        }*/
    }
}

