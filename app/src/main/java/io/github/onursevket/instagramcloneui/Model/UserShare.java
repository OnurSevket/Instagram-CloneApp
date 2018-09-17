package io.github.onursevket.instagramcloneui.Model;

/**
 * Created by Onur on 16.09.2018.
 */

public class UserShare {

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public UserShare(int user_share_id, int user_id, String user_photo_url, int user_share_like_count, String user_share_content, String user_share_time, String user_share_photo_url, String user_share_location_name, String user_name) {
        this.user_share_id = user_share_id;
        this.user_id = user_id;
        this.user_photo_url = user_photo_url;
        this.user_share_like_count = user_share_like_count;
        this.user_share_content = user_share_content;
        this.user_share_time = user_share_time;
        this.user_share_photo_url = user_share_photo_url;
        this.user_share_location_name = user_share_location_name;
        this.user_name = user_name;
    }

    public int getUser_share_id() {
        return user_share_id;
    }

    public void setUser_share_id(int user_share_id) {
        this.user_share_id = user_share_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_photo_url() {
        return user_photo_url;
    }

    public void setUser_photo_url(String user_photo_url) {
        this.user_photo_url = user_photo_url;
    }

    public int getUser_share_like_count() {
        return user_share_like_count;
    }

    public void setUser_share_like_count(int user_share_like_count) {
        this.user_share_like_count = user_share_like_count;
    }

    public String getUser_share_content() {
        return user_share_content;
    }

    public void setUser_share_content(String user_share_content) {
        this.user_share_content = user_share_content;
    }

    public String getUser_share_time() {
        return user_share_time;
    }

    public void setUser_share_time(String user_share_time) {
        this.user_share_time = user_share_time;
    }

    public String getUser_share_photo_url() {
        return user_share_photo_url;
    }

    public void setUser_share_photo_url(String user_share_photo_url) {
        this.user_share_photo_url = user_share_photo_url;
    }

    public String getUser_share_location_name() {
        return user_share_location_name;
    }

    public void setUser_share_location_name(String user_share_location_name) {
        this.user_share_location_name = user_share_location_name;
    }




    public UserShare() {
    }

    private int user_share_id;
    private int user_id;
    private String user_photo_url;
    private int user_share_like_count;
    private String user_share_content;
    private String user_share_time;
    private String user_share_photo_url;
    private String user_share_location_name;
    private String user_name;


}
