package test.Problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import src.main.java.Problem4.Solution4;

public class WordBreakTest {

    Solution4 s4 = new Solution4();

    @Test
    void testSimpleCase() {
        String s = "leetcode";
        Set<String> wordDict = Set.of("leet", "code");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testMultipleSegmentationsPossible() {
        String s = "applepenapple";
        Set<String> wordDict = Set.of("apple", "pen");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testNoValidSegmentation() {
        String s = "catsandog";
        Set<String> wordDict = Set.of("cats", "dog", "sand", "and", "cat");
        assertFalse(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testSingleCharacterWords() {
        String s = "aaaaaaa";
        Set<String> wordDict = Set.of("a", "aa", "aaa");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testEmptyString() {
        String s = "";
        Set<String> wordDict = Set.of("a", "aa", "aaa");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testDictionaryWithSingleWord() {
        String s = "apple";
        Set<String> wordDict = Set.of("apple");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testNonMatchingCharacters() {
        String s = "abcd";
        Set<String> wordDict = Set.of("a", "abc", "b", "cd");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testLargeInputWithRepetition() {
        String s = "abababababababababab";
        Set<String> wordDict = Set.of("ab", "aba");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testCaseWithOverlappingWords() {
        String s = "pineapplepenapple";
        Set<String> wordDict = Set.of("apple", "pen", "applepen", "pine", "pineapple");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    @Test
    void testDictionaryWithIrrelevantWords() {
        String s = "catsanddog";
        Set<String> wordDict = Set.of("cats", "dog", "sand", "and", "cat", "an");
        assertTrue(s4.wordBreak(s, wordDict, 1));
    }

    // test cases for DP solution
    @Test
    void testSimpleCase_DP() {
        String s = "leetcode";
        Set<String> wordDict = Set.of("leet", "code");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testMultipleSegmentationsPossible_DP() {
        String s = "applepenapple";
        Set<String> wordDict = Set.of("apple", "pen");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testNoValidSegmentation_DP() {
        String s = "catsandog";
        Set<String> wordDict = Set.of("cats", "dog", "sand", "and", "cat");
        assertFalse(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testSingleCharacterWords_DP() {
        String s = "aaaaaaa";
        Set<String> wordDict = Set.of("a", "aa", "aaa");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testEmptyString_DP() {
        String s = "";
        Set<String> wordDict = Set.of("a", "aa", "aaa");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testDictionaryWithSingleWord_DP() {
        String s = "apple";
        Set<String> wordDict = Set.of("apple");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testNonMatchingCharacters_DP() {
        String s = "abcd";
        Set<String> wordDict = Set.of("a", "abc", "b", "cd");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testLargeInputWithRepetition_DP() {
        String s = "abababababababababab";
        Set<String> wordDict = Set.of("ab", "aba");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testCaseWithOverlappingWords_DP() {
        String s = "pineapplepenapple";
        Set<String> wordDict = Set.of("apple", "pen", "applepen", "pine", "pineapple");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }

    @Test
    void testDictionaryWithIrrelevantWords_DP() {
        String s = "catsanddog";
        Set<String> wordDict = Set.of("cats", "dog", "sand", "and", "cat", "an");
        assertTrue(s4.wordBreak(s, wordDict, 2));
    }
}
