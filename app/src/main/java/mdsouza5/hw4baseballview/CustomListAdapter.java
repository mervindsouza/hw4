package mdsouza5.hw4baseballview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import mdsouza5.hw4baseballview.MainActivity;

/**
 * Created by Merv on 2/15/2018.
 */

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity Context;
    private final String[] ListItemsName;
    private final Integer[] Imagename;
    private final String[] ListItemsDescription;

    public CustomListAdapter(Activity context, String[] listitemsname, String[] listitemsdescription, Integer[] imagename) {
        super(context, R.layout.myteams, listitemsname);
        this.Context = context;
        this.ListItemsName = listitemsname;
        this.ListItemsDescription = listitemsdescription;
        this.Imagename = imagename;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.myteams, null, true);
        TextView ListViewItems = (TextView) ListViewSingle.findViewById(R.id.teamname);
        TextView ListViewDescription = (TextView) ListViewSingle.findViewById(R.id.teamdescription);
        ImageView ListViewImage = (ImageView) ListViewSingle.findViewById(R.id.teamicon);

        ListViewImage.setImageResource(Imagename[position]);
        ListViewItems.setText(ListItemsName[position]);
        ListViewDescription.setText(ListItemsDescription[position]);

        return ListViewSingle;
    }
}
