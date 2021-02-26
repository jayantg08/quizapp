package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizapp.R;

import java.util.ArrayList;

import models.quiz;

public class quizAdapter extends RecyclerView.Adapter<quizAdapter.Viewholder> {



        private Context context;
        private ArrayList<quiz> quizModelArrayList;

        // Constructor
        public quizAdapter(Context context, ArrayList<quiz> quizModelArrayList) {
            this.context = context;
            this.quizModelArrayList= quizModelArrayList;
        }

        @NonNull
        @Override
        public quizAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // to inflate the layout for each item of recycler view.
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz_item,parent,false);
            return new adapters.quizAdapter.Viewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull adapters.quizAdapter.Viewholder holder, int position) {
            // to set data to textview and imageview of each card layout
            quiz model = quizModelArrayList.get(position);
            holder.courseNameTV.setText(model.getQuiztitle());
            holder.courseIV.setImageResource(model.getQuizicon());
        }

        @Override
        public int getItemCount() {
            // this method is used for showing number
            // of card items in recycler view.
            return quizModelArrayList.size();
        }

        // View holder class for initializing of
        // your views such as TextView and Imageview.
        public class Viewholder extends RecyclerView.ViewHolder {
            private ImageView courseIV;
            private TextView courseNameTV;

            public Viewholder(@NonNull View itemView) {
                super(itemView);
                courseIV = itemView.findViewById(R.id.quizicon);
                courseNameTV = itemView.findViewById(R.id.quiztitle);
            }
        }
    }
