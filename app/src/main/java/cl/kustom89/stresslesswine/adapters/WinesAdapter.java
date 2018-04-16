package cl.kustom89.stresslesswine.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cl.kustom89.stresslesswine.R;
import cl.kustom89.stresslesswine.data.Queries;
import cl.kustom89.stresslesswine.models.Wine;

/**
 * Created by kustom89 on 15-04-2018.
 */

public class WinesAdapter extends RecyclerView.Adapter<WinesAdapter.ViewHolder> {

    private List<Wine> wines=new Queries().wines();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_item_wine,parent,false );
        ViewHolder viewHolder=new ViewHolder( view );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {
        Wine wine= wines.get( position );
        holder.textView.setText( wine.getName() );

        holder.textView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );

    }

    @Override
    public int getItemCount() {
        return wines.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView textView;


        public ViewHolder(View itemView) {
            super( itemView );

            textView =itemView.findViewById( R.id.yearsTv );
        }
    }
}
