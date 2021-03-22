package com.pierre44.recycleviewproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by pmeignen on 22/03/2021.
 */
public class PersonViewHolder extends RecyclerView.ViewHolder
{
    private TextView myNom;
    private TextView myPrenom;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        myNom = itemView.findViewById(R.id.textView1);
        myPrenom = itemView.findViewById(R.id.textView2);
    }

    public void bind(Person person) {
        myNom.setText(person.mNom);
        myPrenom.setText(person.mPrenom);
    }
}
