package io.github.onursevket.instagramcloneui.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import io.github.onursevket.instagramcloneui.Model.UserShare;

/**
 * Created by Onur on 16.09.2018.
 */

public class ListViewAdaptor extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private Context context;
    private ArrayList<UserShare> userShareList;

    public ListViewAdaptor(Context contextArrayList,ArrayList<UserShare> userShareList) {
        this.context=context;
        this.layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.userShareList=userShareList;

    }

    @Override
    public int getCount() {
        return userShareList.size();
    }

    @Override
    public UserShare getItem(int i) {
        return userShareList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return userShareList.get(i).getUser_id();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=null;


        return v;
    }
}
