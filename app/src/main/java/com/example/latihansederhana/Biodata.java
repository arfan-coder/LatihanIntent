package com.example.latihansederhana;

import android.os.Parcel;
import android.os.Parcelable;

public class Biodata implements Parcelable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Biodata(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    protected Biodata(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<Biodata> CREATOR = new Parcelable.Creator<Biodata>() {
        @Override
        public Biodata createFromParcel(Parcel source) {
            return new Biodata(source);
        }

        @Override
        public Biodata[] newArray(int size) {
            return new Biodata[size];
        }
    };
}
