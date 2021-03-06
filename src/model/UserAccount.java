package model;

import java.util.ArrayList;

public class UserAccount {

    private String username;
    private String password;
    private String gender;
    private String photo;
    private ArrayList<String> careers;
    private String birthday;
    private String favBrowser;

    public UserAccount(String username, String password, String gender, String photo, ArrayList<String> careers, String birthday, String favBrowser) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.photo = photo;
        this.careers = careers;
        this.birthday = birthday;
        this.favBrowser = favBrowser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCareers() {
        String careersString = "";
        for(int i = 0; i < careers.size(); i++){
            careersString += careers.get(i)+" ";
        }
        return careersString;
    }

    public void setCareers(ArrayList<String> careers) {
        this.careers = careers;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFavBrowser() {
        return favBrowser;
    }

    public void setFavBrowser(String favBrowser) {
        this.favBrowser = favBrowser;
    }
}
