package com.example.buoi05;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    WordListAdapter wordListAdapter;
    ConstraintLayout constraint;
    Obj obj;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.revyclerview);
        constraint = findViewById(R.id.constraint);
        List<Obj> objList = new ArrayList<>();
        objList.add(new Obj("Hinh 1", R.drawable.a, "Văn học hay ngữ văn (thường gọi tắt là văn) theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn, thì văn học là dạng văn bản được coi là một hình thức nghệ thuật, hoặc bất kỳ một bài viết nào được coi là có giá trị nghệ thuật hoặc trí tuệ"));
        objList.add(new Obj("Hinh 2", R.drawable.b, "Văn học hay ngữ văn (thường gọi tắt là văn) theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn, thì văn học là dạng văn bản được coi là một hình thức nghệ thuật, hoặc bất kỳ một bài viết nào được coi là có giá trị nghệ thuật hoặc trí tuệ"));
        objList.add(new Obj("Hinh 3", R.drawable.c, "Văn học hay ngữ văn (thường gọi tắt là văn) theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn, thì văn học là dạng văn bản được coi là một hình thức nghệ thuật, hoặc bất kỳ một bài viết nào được coi là có giá trị nghệ thuật hoặc trí tuệ"));
        objList.add(new Obj("Hinh 4", R.drawable.a, "Văn học hay ngữ văn (thường gọi tắt là văn) theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn, thì văn học là dạng văn bản được coi là một hình thức nghệ thuật, hoặc bất kỳ một bài viết nào được coi là có giá trị nghệ thuật hoặc trí tuệ"));
        objList.add(new Obj("Hinh 5", R.drawable.b, "Văn học hay ngữ văn (thường gọi tắt là văn) theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn, thì văn học là dạng văn bản được coi là một hình thức nghệ thuật, hoặc bất kỳ một bài viết nào được coi là có giá trị nghệ thuật hoặc trí tuệ"));
        objList.add(new Obj("Hinh 6", R.drawable.c, "Văn học hay ngữ văn (thường gọi tắt là văn) theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn, thì văn học là dạng văn bản được coi là một hình thức nghệ thuật, hoặc bất kỳ một bài viết nào được coi là có giá trị nghệ thuật hoặc trí tuệ"));
        wordListAdapter = new WordListAdapter(this, objList);
        recyclerView.setAdapter(wordListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}