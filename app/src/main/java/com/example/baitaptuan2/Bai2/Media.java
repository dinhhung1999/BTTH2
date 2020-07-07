package com.example.baitaptuan2.Bai2;

public class Media {
    String title;
    int resourceImage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(int resourceImage) {
        this.resourceImage = resourceImage;
    }

    public Media(String title, int resourceImage) {
        this.title = title;
        this.resourceImage = resourceImage;
    }
}
