package io.github.onursevket.instagramcloneui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import io.github.onursevket.instagramcloneui.Adaptor.ListViewAdaptor;
import io.github.onursevket.instagramcloneui.Model.UserShare;
import io.github.onursevket.instagramcloneui.R;

/**
 * Created by Onur on 13.09.2018.
 */

public class FragmentHome extends Fragment {
    ListView listView;
    ArrayList<UserShare> userShareList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_layout_home,container,false);

        listView=(ListView)view.findViewById(R.id.listViewHomeShare);
        ListViewAdaptor adaptor=new ListViewAdaptor(getContext(),userShareList);
        listView.setAdapter(adaptor);

        return  view;
    }
}
