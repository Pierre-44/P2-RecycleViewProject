package com.pierre44.recycleviewproject;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PersonAdapter adapter;
    private RecyclerView recyclerView;

    public static List<Person> List_Users = Arrays.asList(
        new Person("TOTO", "tintin"),
        new Person("TITI", "tata"),
        new Person("TUTU", "tété"),
        new Person("TATA", "tyty"));

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        configureRecyclerView();
    }

    private void configureRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new PersonAdapter(this, List_Users);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}