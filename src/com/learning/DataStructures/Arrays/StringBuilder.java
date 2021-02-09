package com.learning.DataStructures.Arrays;

public class StringBuilder {

    public final int MULTIPLIER = 2;
    public final int DEFAULT_SIZE = 16;

    private char[] str;
    private int size;
    private int charCount;

    public StringBuilder(){
        this.size = DEFAULT_SIZE;
        this.str = new char[size];
    }

    public StringBuilder append(String str){

        while(resizeRequired(str)){
            resizeBuffer(str);
        }

        addString(str);

        updateCountlength(str.length());

        return this;
    }


    public boolean resizeRequired(String str){
       return this.str.length + str.length() > this.size;
    }

    public StringBuilder resizeBuffer(String str){

        int oldSize = this.size;

        this.size = oldSize*MULTIPLIER;

        char[] newArray = new char[this.size];

        System.arraycopy(this.str, 0, newArray, 0, oldSize);

        this.str = newArray;

        return this;
    }

    public void addString(String str){

        System.arraycopy(str.toCharArray(), 0, this.str, this.charCount, str.length() );

    }

    public void updateCountlength(int charCount){

        this.charCount += charCount;

    }

}

class StringBuilderTest{

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

    }
}
