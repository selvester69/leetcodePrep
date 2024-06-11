package test.Problem1;

import org.junit.jupiter.api.Test;

import src.main.java.Problem1.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class Probem1Test {

    // --------------
    // Tests for method 1:
    // --------------

    @Test
    public void testRotateRight_EmptyArray() {
        int[] nums = {};
        Solution.rotateSolution3(nums, 3);
        assertArrayEquals(new int[] {}, nums);
    }

    @Test
    public void testRotateRight_OneElementArray() {
        int[] nums = { 1 };
        Solution.rotateSolution3(nums, 2);
        assertArrayEquals(new int[] { 1 }, nums);
    }

    @Test
    public void testRotateRight_ByZero() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution3(nums, 0);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    public void testRotateRight_ByOne() {
        int[] nums = { 1, 2, 3, 4, 5 };
        nums = Solution.rotateSolution1(nums, 1);
        assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, nums);
    }

    @Test
    public void testRotateRight_ByArrayLength() {
        int[] nums = { 1, 2, 3, 4, 5 };
        nums = Solution.rotateSolution1(nums, 5);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    public void testRotateRight_ByMoreThanArrayLength() {
        int[] nums = { 1, 2, 3, 4, 5 };
        nums = Solution.rotateSolution1(nums, 7);
        assertArrayEquals(new int[] { 4, 5, 1, 2, 3 }, nums);
    }

    @Test
    public void testRotateRight_GeneralCase() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        nums = Solution.rotateSolution1(nums, 3);
        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }

    // --------------
    // Tests for method 2
    // --------------
    @Test
    public void testRotateRight_EmptyArray2() {
        int[] nums = {};
        Solution.rotateSolution2(nums, 3);
        assertArrayEquals(new int[] {}, nums);
    }

    @Test
    public void testRotateRight_OneElementArray2() {
        int[] nums = { 1 };
        Solution.rotateSolution2(nums, 2);
        assertArrayEquals(new int[] { 1 }, nums);
    }

    @Test
    public void testRotateRight_ByZero2() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution2(nums, 0);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    public void testRotateRight_ByOne2() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution2(nums, 1);
        assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, nums);
    }

    @Test
    public void testRotateRight_ByArrayLength2() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution2(nums, 5);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    public void testRotateRight_ByMoreThanArrayLength2() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution2(nums, 7);
        assertArrayEquals(new int[] { 4, 5, 1, 2, 3 }, nums);
    }

    @Test
    public void testRotateRight_GeneralCase2() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        Solution.rotateSolution2(nums, 3);
        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }
    // --------------
    // Test for Method 3
    // --------------

    @Test
    public void testRotateRight_EmptyArray3() {
        int[] nums = {};
        Solution.rotateSolution3(nums, 3);
        assertArrayEquals(new int[] {}, nums);
    }

    @Test
    public void testRotateRight_OneElementArray3() {
        int[] nums = { 1 };
        Solution.rotateSolution3(nums, 2);
        assertArrayEquals(new int[] { 1 }, nums);
    }

    @Test
    public void testRotateRight_ByZero3() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution3(nums, 0);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    public void testRotateRight_ByOne3() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution3(nums, 1);
        assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, nums);
    }

    @Test
    public void testRotateRight_ByArrayLength3() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution3(nums, 5);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nums);
    }

    @Test
    public void testRotateRight_ByMoreThanArrayLength3() {
        int[] nums = { 1, 2, 3, 4, 5 };
        Solution.rotateSolution3(nums, 7);
        assertArrayEquals(new int[] { 4, 5, 1, 2, 3 }, nums);
    }

    @Test
    public void testRotateRight_GeneralCase3() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        Solution.rotateSolution3(nums, 3);
        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }
}
