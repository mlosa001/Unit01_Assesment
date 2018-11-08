package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Algorithms implements DataStructures {


    //
//            * `stringToCharArray`, which should take every `char` in the `String` parameter passed into the method,
//    add it to a `char[]` array, then return that `char[]` array object

    @Override
    public char[] stringToCharArray(String word) {
        char[] myArray =

        for (int i = 0; i < word.charAt(i); i++) {


        }
        return myArray;
    }

//    `multiplicationTableList`, which should add every number from 1 to 10, multiplied
//    by the parameter passed into the method, to an `ArrayList` object with a parameterized type
//    of `Integer`, then return that `ArrayList<Integer>` object

    @Override
    public ArrayList<Integer> multiplicationTableList(int number) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < 10; i++) {

            count = i * number;
            arrayList.add(count);
        }
        return arrayList;
    }

//    wordLength`, which should take every `String` in the `String[]` array parameter passed into the
////    method, and put it in a `HashMap` object with with parameterized key/values types of `String` and
////    `Integer` respectively, with the `String` as a key, and the `String`'s size as a value, then return that
// `HashMap<String, Integer>` object

    @Override
    public HashMap<String, Integer> wordLength(String[] wordArray) {

//        for(int i = 0; i < wordArray.length(); i++)


        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : wordArray
        ) {

        }


        return hashMap;

    }

//    * `uniqueCharacters`, which should take every unique `char` in the `String` parameter passed
//    into the method, and add it to a `HashSet` object with a parameterized type of `Character`, then return that `HashSet<Character>` object

    @Override
    public HashSet<Character> uniqueCharacters(String word) {
        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            hashSet.add(word.charAt(i));

        }
        return hashSet;
    }
//

}
