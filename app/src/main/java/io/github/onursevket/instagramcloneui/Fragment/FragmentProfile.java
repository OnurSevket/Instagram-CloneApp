package io.github.onursevket.instagramcloneui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView ivBackButton=(ImageView)view.findViewById(R.id.btnProfileBackButton);
        ImageView ivProfileMenu=(ImageView)view.findViewById(R.id.btnProfileMenu);
        ImageView ivProfilePhoto=(ImageView)view.findViewById(R.id.ivProfilePhoto);

        TextView tvProfileFollowCount=(TextView) view.findViewById(R.id.tvProfileFollowCount);
        TextView tvProfilePostCount=(TextView) view.findViewById(R.id.tvProfilePostCount);
        TextView tvProfileFollowerCount=(TextView) view.findViewById(R.id.tvProfileFollowerCount);

        TextView tvUserName=(TextView) view.findViewById(R.id.tvProfileUserName);
        TextView tvDescription=(TextView) view.findViewById(R.id.tvProfileDescription);
        TextView tvUserWebSite=(TextView) view.findViewById(R.id.tvProfileWebSite);
        TextView tvProfileTitle=(TextView) view.findViewById(R.id.tvProfileTitle);

        Button btnUpdateProfile=(Button) view.findViewById(R.id.btnProfileUpdate);

        tvProfileFollowCount.setText("500");
        tvProfileFollowerCount.setText("70");
        tvProfilePostCount.setText("20");
        tvProfileTitle.setText("Onur Özdemir");
        tvUserName.setText("Onur");
        tvUserWebSite.setText("onursevket.github.io");
        tvDescription.setText("Programmer,Physics Engineer,Musician,Always Junior Developer");
        Picasso.with(getContext())
                .load("https://pbs.twimg.com/profile_images/834394800296046594/RV-RySzn_400x400.jpg")
                .into(ivProfilePhoto);

        Linkify.addLinks(tvUserWebSite,Linkify.WEB_URLS);

    }
}
