package org.example;

import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public String Scramble(String word)
    {
        Random r = new Random();
        char[] charList = word.toCharArray();
        for (int i = 0; i < charList.length; i++)
        {
            char temp = charList[i];
            int rand = r.nextInt(0, charList.length);
            charList[i] = charList[rand];
            charList[rand] = temp;
        }
        String result = "";
        for (char c : charList)
        {
            result += c;
        }
        return result;
    }
}