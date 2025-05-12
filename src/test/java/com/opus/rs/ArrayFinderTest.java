package com.opus.rs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArrayFinderTest {

    @ParameterizedTest(name = "arr1: {0}, arr2: {1}, expected: {2}")
    @MethodSource("generateCombinations")
    void testArray(int[] arr1, int[] arr2, int expected) {
        Assertions.assertThat(ArrayFinder.findIndex(arr1, arr2)).isEqualTo(expected);
    }

    private static Stream<Arguments> generateCombinations() {
        return Stream.of(
                Arguments.of(new int[0], new int[0], 0),
                Arguments.of(new int[0], new int[]{45, 26}, -1),
                Arguments.of(new int[]{45, 26}, new int[0], -1),
                Arguments.of(new int[]{56, 77, 17, 25, 33}, new int[]{17, 25}, 2),
                Arguments.of(new int[]{56, 77, 17, 17, 33, 25, 17}, new int[]{17, 25}, -1),
                Arguments.of(new int[]{56, 77, 17, 34, 26, 17, 25, 33}, new int[]{17, 25}, 5)
        );
    }

}