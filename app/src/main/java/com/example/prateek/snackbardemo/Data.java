package com.example.prateek.snackbardemo;


// This class will store the data like images
public class Data {
    private String imagepath;
    private String description;
    public Data(String imagepath, String description){
        this.imagepath= imagepath;
        this.description= description;
    }

    public String getImagepath() {
        return imagepath;
    }
    public String getDescription(){
        return description;
    }
}
