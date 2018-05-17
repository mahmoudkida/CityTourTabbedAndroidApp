package com.wshwsh.citytourtabbedandroidapp;

public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int NameResourceId;
    private int AddressResourceId;
    private int ImageResourseId = NO_IMAGE_PROVIDED;
    private int DescriptionResourceId;

    public Place(int nameResourceId, int addressResourceId, int descriptionResourceId, int imageResourseId) {
        NameResourceId = nameResourceId;
        AddressResourceId = addressResourceId;
        DescriptionResourceId = descriptionResourceId;
        ImageResourseId = imageResourseId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return ImageResourseId != NO_IMAGE_PROVIDED;
    }

    public int getImageeResourceId() {
        return ImageResourseId;
    }

    public int getNameResourceId() {
        return NameResourceId;
    }

    public int getAddressResourceId() {
        return AddressResourceId;
    }

    public int getDescriptionResourceId() {
        return DescriptionResourceId;
    }
}
