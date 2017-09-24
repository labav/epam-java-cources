package com.epam.university.java.core.task007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Doomsday Device on 24.09.2017.
 */
public class Task007Impl implements Task007 {
    @Override
    public Collection<Integer> multiplyPolynomial(Collection<Integer> first, Collection<Integer> second) {
        int[] resultArray = new int[first.size() + second.size() - 1];

        int i = 0;
        int j = 0;

        if (first.size() <= second.size()) {
            for (Integer elemFirst : first) {
                for (Integer elemSecond : second) {
                    resultArray[i] += elemFirst * elemSecond;
                    i++;
                }
                i = j + 1;
                j++;
            }
        } else {
            for (Integer elemSecond : second) {
                for (Integer elemFirst : first) {
                    resultArray[i] += elemFirst * elemSecond;
                    i++;
                }
                i = j + 1;
                j++;
            }
        }

        Collection<Integer> result = new ArrayList<>();

        int zeroCount = 0;
        for (int k = 0; k < resultArray.length; k++) {
            if (resultArray[k] == 0) {
                zeroCount++;
            }
            result.add(resultArray[k]);
        }

        if (zeroCount == result.size()) {
            return new ArrayList<>(Arrays.asList(0));
        }
        return result;
    }
}
