package sg.edu.rp.c346.database;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TaskArrayAdapter extends ArrayAdapter<Task> {
    ArrayList<Task> al;
    Context context;
    int resource;
    TextView tvID, tvDesc, tvDate;

    public TaskArrayAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        this.context = context;
        this.al = objects;
        this.resource = resource;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);
        tvID = (TextView) rowView.findViewById(R.id.textView);
        tvDesc = (TextView)rowView.findViewById(R.id.textView2);
        tvDate = (TextView)rowView.findViewById(R.id.textView3);

        Task data = al.get(position);
        tvID.setText(""+data.get_id());
        tvDesc.setText(data.getDescription());
        tvDate.setText(data.getDate());
        return rowView;
    }
}

