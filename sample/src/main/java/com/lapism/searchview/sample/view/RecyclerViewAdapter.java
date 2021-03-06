package com.lapism.searchview.sample.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lapism.searchview.sample.R;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<String> mValues;
    private final Context mContext;

    public RecyclerViewAdapter(Context context, List<String> items) {
        //context.getTheme().resolveAttribute(R.attr.selectableItemBackground, mTypedValue, true);
        //TypedValue mTypedValue = new TypedValue();
        //int mBackground = mTypedValue.resourceId;
        mContext = context;
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_search, parent, false);
        //view.setBackgroundResource(mBackground);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mTextView.setText(mValues.get(position));
        holder.mImageView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorAccent));
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    /*Context context = v.getContext();
                    Intent intent = news Intent(context, ExampleDetailActivity.class);
                    intent.putExtra(ExampleDetailActivity.EXTRA_NAME, holder.mBoundString);
                    context.startActivity(intent);*/
            }
        });

        //holder.mImageView.getContext())
        //Cheeses2.getRandomCheeseDrawable
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        final View mView;
        final TextView mTextView;
        final ImageView mImageView;

        ViewHolder(View view) {
            super(view);
            mView = view;
            mTextView = (TextView) view.findViewById(R.id.text);
            mImageView = (ImageView) view.findViewById(R.id.imageView);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTextView.getText();
        }
    }

}