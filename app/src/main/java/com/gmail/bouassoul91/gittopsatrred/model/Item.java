package com.gmail.bouassoul91.gittopsatrred.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Bouassoul on 22/12/2017.
 */

public class Item {
	
	//All members should be exposed for JSON serialization.

    @SerializedName("name")
    @Expose
    private String repoName;

    @SerializedName("owner")
    @Expose
    private Owner owner;

    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("stargazers_count")
    @Expose
    private String stars;

    public Item(String repoName, Owner owner, String htmlUrl, String description, String stars){
        this.repoName = repoName;
        this.owner = owner;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.stars = stars;
    }

    public String getRepoName(){
        return repoName;
    }

    public void setRepoName(String repoName){
        this.repoName = repoName;
    }

    public Owner getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public String getHtmlUrl(){
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl){
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }
}
