package com.example.pelulastab.primerEjercicio;

import android.os.Parcel;
import android.os.Parcelable;

public class Pelicula implements Parcelable {
    private String title, author, sinopsis, year;
    private int photo;

    public Pelicula(String title, String author, String sinopsis, String year, int photo) {
        this.title = title;
        this.author = author;
        this.sinopsis = sinopsis;
        this.year = year;
        this.photo = photo;
    }

    private Pelicula(Parcel in) {

        title = in.readString();
        author = in.readString();
        sinopsis = in.readString();
        year = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Pelicula> CREATOR = new Creator<Pelicula>() {
        @Override
        public Pelicula createFromParcel(Parcel in) {
            return new Pelicula(in);
        }

        @Override
        public Pelicula[] newArray(int size) {
            return new Pelicula[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(author);
        dest.writeString(sinopsis);
        dest.writeString(year);
        dest.writeInt(photo);
    }
}
