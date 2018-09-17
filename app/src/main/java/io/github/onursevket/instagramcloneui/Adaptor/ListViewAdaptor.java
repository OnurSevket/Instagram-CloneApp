package io.github.onursevket.instagramcloneui.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import io.github.onursevket.instagramcloneui.Model.UserShare;
import io.github.onursevket.instagramcloneui.R;

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

    ImageView iconFavori,iconShare,iconComment,ivProfilePicture,ivSharedPicture;
    TextView tvUserName,tvTime,tvSharedText,tvLocation,tvLikedCount;

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=layoutInflater.inflate(R.layout.listview_home,viewGroup,false);



        iconFavori=(ImageView)v.findViewById(R.id.icon_Like_ListView);
        iconShare=(ImageView)v.findViewById(R.id.icon_Share_ListView);
        iconComment=(ImageView)v.findViewById(R.id.icon_Comment_ListView);
        ivProfilePicture=(ImageView)v.findViewById(R.id.ivProfilePhoto_ListView);
        ivSharedPicture=(ImageView)v.findViewById(R.id.iVSharePhoto_ListView);

        tvUserName=(TextView) v.findViewById(R.id.tvUserName_ListView);
        tvTime=(TextView)v.findViewById(R.id.tvShareTime_ListView);
        tvSharedText=(TextView) v.findViewById(R.id.tvShareText_ListView);
        tvLocation=(TextView)v.findViewById(R.id.tvLocation_ListView);
        tvLikedCount=(TextView)v.findViewById(R.id.tvLike_Count_ListView);

        tvLikedCount.setText(""+userShareList.get(i).getUser_share_like_count());
        tvSharedText.setText(userShareList.get(i).getUser_share_content());
        tvTime.setText(userShareList.get(i).getUser_share_time());
        tvLocation.setText(userShareList.get(i).getUser_share_location_name());
        tvUserName.setText(userShareList.get(i).getUser_name());
        Picasso.with(context).load(userShareList.get(i).getUser_photo_url()).into(ivProfilePicture);
        Picasso.with(context).load(userShareList.get(i).getUser_share_photo_url()).into(ivSharedPicture);

        return v;
    }
}
