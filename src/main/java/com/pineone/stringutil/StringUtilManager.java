package com.pineone.stringutil;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class StringUtilManager {

    CastIntToString castIntToString = new CastIntToString();

    public void stringUtilManager(int number, int length){

        String stringNumber = castIntToString.castIntToString(number);

        int numberLength = stringNumber.length();

        int addZeroLength = length - numberLength;


        String zeroString = "";
        for(int i = 0; i < addZeroLength ; i++)
        {
            zeroString = zeroString + "0";
        }

        System.out.println(zeroString + number);

    }
}
