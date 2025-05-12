package com.opus.rs;

public class ArrayFinder {

    public static int findIndex(int[] arr1, int[] arr2) {
        if (arr1.length == 0 && arr2.length == 0) {
            return 0;
        }

        if (arr1.length == 0 || arr2.length == 0) {
            return -1;
        }

        int[] superSet;
        int[] subSet;

        if (arr1.length >= arr2.length) {
            superSet = arr1;
            subSet = arr2;
        } else {
            superSet = arr2;
            subSet = arr1;
        }

        var superSetIndex = fetchFirstMatch(0, superSet, subSet);
        var subSetIndex = 0;

        for (; superSetIndex < superSet.length && subSetIndex < subSet.length; superSetIndex++, subSetIndex++) {
            if (superSet[superSetIndex] != subSet[subSetIndex]) {
                superSetIndex = fetchFirstMatch(superSetIndex, superSet, subSet);
                if (superSetIndex == -1) {
                    return -1;
                }
                --superSetIndex;
                --subSetIndex;
                --subSetIndex;
            }
        }
        if (subSetIndex == subSet.length) {
            return superSetIndex - subSetIndex;
        }

        return -1;
    }

    private static int fetchFirstMatch(int superSetIndex, int[] superSet, int[] subSet) {
        while (superSetIndex < superSet.length && superSet[superSetIndex] != subSet[0]) {
            superSetIndex++;
        }
        if (superSetIndex == superSet.length || superSet.length - superSetIndex < subSet.length) {
            return -1;
        }

        return superSetIndex;
    }

}
