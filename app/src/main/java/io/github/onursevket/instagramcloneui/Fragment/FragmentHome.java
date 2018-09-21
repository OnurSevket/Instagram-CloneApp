package io.github.onursevket.instagramcloneui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
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
    ArrayList<UserShare> userShareList = new ArrayList<>();

    private void init() {
        userShareList.add(new UserShare(
                1,
                1,
                "https://pbs.twimg.com/profile_images/834394800296046594/RV-RySzn_400x400.jpg",
                50,
                "The first Shared",
                "5 minute",
                "https://pbs.twimg.com/profile_images/834394800296046594/RV-RySzn_400x400.jpg",
                "Atasehir/Istanbul",
                "Onur Ozdemir")
        );


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        try {
            View view = inflater.inflate(R.layout.fragment_layout_home, container, false);

            init();
            listView = (ListView) view.findViewById(R.id.listViewHomeShare);
            ListViewAdaptor adaptor = new ListViewAdaptor(getContext(), userShareList);
            listView.setAdapter(adaptor);

            return view;
        } catch (Exception e) {
            Log.e("Test", "onCreateView", e);
            throw e;
        }


    }
}
