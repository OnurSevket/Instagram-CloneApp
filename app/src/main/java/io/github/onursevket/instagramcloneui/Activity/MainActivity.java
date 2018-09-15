package io.github.onursevket.instagramcloneui.Activity;

import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import io.github.onursevket.instagramcloneui.Fragment.FragmentFavories;
import io.github.onursevket.instagramcloneui.Fragment.FragmentHome;
import io.github.onursevket.instagramcloneui.Fragment.FragmentProfile;
import io.github.onursevket.instagramcloneui.Fragment.FragmentSearch;
import io.github.onursevket.instagramcloneui.Fragment.FragmentTakePhoto;
import io.github.onursevket.instagramcloneui.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView ivHome,ivSearch,ivTakePhoto,ivLikes,ivProfile;
    int tabIndex=0;

    public void setDefaultImage(){
        ivHome.setImageResource(R.drawable.inst_home);
        ivSearch.setImageResource(R.drawable.inst_search);
        ivTakePhoto.setImageResource(R.drawable.compact_camera);
        ivLikes.setImageResource(R.drawable.heart_outline);
        ivProfile.setImageResource(R.drawable.inst_user);
    }

    public void changeFragment(int fragmentTabIndex){
        android.support.v4.app.Fragment fragment=null;
        switch (fragmentTabIndex){
            case 0:
                fragment=new FragmentHome();
                break;
            case 1:
                fragment=new FragmentSearch();
                break;
            case 2:
                fragment=new FragmentTakePhoto();
                break;
            case 3:
                fragment=new FragmentFavories();
                break;
            case 4:
                fragment=new FragmentProfile();
                break;
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.ivHome:
                tabIndex=0;
                setDefaultImage();
                ivHome.setImageResource(R.drawable.inst_home_filled);
                break;
            case R.id.ivSearch:
                tabIndex=1;
                setDefaultImage();
                ivSearch.setImageResource(R.drawable.inst_search_filled);
                break;
            case R.id.ivTakePhoto:
                tabIndex=2;
                setDefaultImage();
                ivTakePhoto.setImageResource(R.drawable.compact_camera_filled);
                break;
            case R.id.ivFavories:
                tabIndex=3;
                setDefaultImage();
                ivLikes.setImageResource(R.drawable.heart_outline_filled);
                break;
            case R.id.ivProfile:
                tabIndex=4;
                setDefaultImage();
                ivProfile.setImageResource(R.drawable.inst_user_filled);
                break;

        }
        changeFragment(tabIndex);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivHome=(ImageView)findViewById(R.id.ivHome);
        ivSearch=(ImageView)findViewById(R.id.ivSearch);
        ivTakePhoto=(ImageView)findViewById(R.id.ivTakePhoto);
        ivLikes=(ImageView)findViewById(R.id.ivFavories);
        ivProfile=(ImageView)findViewById(R.id.ivProfile);

        ivHome.setOnClickListener(this);
        ivSearch.setOnClickListener(this);
        ivTakePhoto.setOnClickListener(this);
        ivLikes.setOnClickListener(this);
        ivProfile.setOnClickListener(this);

        ivHome.setImageResource(R.drawable.inst_home_filled);

        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,new FragmentHome());
        fragmentTransaction.commit();

    }


}
