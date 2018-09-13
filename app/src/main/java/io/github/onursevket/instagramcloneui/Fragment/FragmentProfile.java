package io.github.onursevket.instagramcloneui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.onursevket.instagramcloneui.R;

/**
 * Created by Onur on 13.09.2018.
 */

public class FragmentProfile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_layout_profile,container,false);
        return  view;
    }
}
