package com.example.jpmorgan.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jpmorgan.R;
import com.example.jpmorgan.roomdb.Person;

import java.util.List;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.LanViewHolder> {
public static String TAG = LangAdapter.class.getSimpleName();

   // String[] langs;
   List<Person> personList;
   /* public LangAdapter(String[] langs) {
        this.langs = langs;
    }*/

    public LangAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override //inflate the row -- garima-- buy the  plank from market
    public LanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG,"garima bought a plank and kept in the holder");
        View plank = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new LanViewHolder(plank);
    }

    @Override
    public void onBindViewHolder(@NonNull LanViewHolder holder, int position) {
        Log.i(TAG,"kusum is writing"+ personList.get(position));
                //langs[position]);
        holder.rowTv.setText(personList.get(position).toString());

    }

    @Override //manas keeps the count of no of items in the array
    public int getItemCount() {
        Log.i(TAG,"sandeep say the count is--"+personList.size());

        return personList.size();
    }

    class LanViewHolder extends RecyclerView.ViewHolder {
        TextView rowTv;
        public LanViewHolder(@NonNull View plank) {
            super(plank);
            Log.i(TAG,"manas got it in the holder");
            rowTv = plank.findViewById(R.id.tvRow);

        }
    }
}
