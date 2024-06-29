package test.Problem3;

import org.junit.jupiter.api.Test;

import src.main.java.Problem3.Solution3;

import static org.junit.jupiter.api.Assertions.*;

public class Problem3Test {

    private Solution3 solution = new Solution3();

    // using naive method

    @Test
    public void testEmptyString1() {
        assertEquals("", solution.longestPalindromicSubstring("", 1));
    }

    @Test
    public void testSingleCharacter1() {
        assertEquals("a", solution.longestPalindromicSubstring("a", 1));
    }

    @Test
    public void testAllSameCharacters1() {
        assertEquals("aaaa", solution.longestPalindromicSubstring("aaaa", 1));
    }

    @Test
    public void testTwoCharacterPalindrome1() {
        assertEquals("aa", solution.longestPalindromicSubstring("aa", 1));
    }

    @Test
    public void testTwoCharacterNonPalindrome1() {
        assertEquals("a", solution.longestPalindromicSubstring("ab", 1));
    }

    @Test
    public void testOddLengthPalindrome1() {
        assertEquals("aba", solution.longestPalindromicSubstring("aba", 1));
    }

    @Test
    public void testEvenLengthPalindrome1() {
        assertEquals("abba", solution.longestPalindromicSubstring("abba", 1));
    }

    @Test
    public void testLongestAtBeginning1() {
        assertEquals("abcba", solution.longestPalindromicSubstring("abcbaxyz", 1));
    }

    @Test
    public void testLongestAtEnd1() {
        assertEquals("zyxyz", solution.longestPalindromicSubstring("abczyxyz", 1));
    }

    @Test
    public void testLongestInMiddle1() {
        assertEquals("xyzzyx", solution.longestPalindromicSubstring("abxyzzyxaa", 1));
    }

    @Test
    public void testMultiplePalindromes1() {
        assertEquals("aca", solution.longestPalindromicSubstring("aacabdkacaa", 1));
    }

    @Test
    public void testLongString1() {
        String longString = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        assertEquals("ranynar", solution.longestPalindromicSubstring(longString, 1));
    }

    // without DP
    @Test
    public void testEmptyString2() {
        assertEquals("", solution.longestPalindromicSubstring("", 2));
    }

    @Test
    public void testSingleCharacter2() {
        assertEquals("a", solution.longestPalindromicSubstring("a", 2));
    }

    @Test
    public void testAllSameCharacters2() {
        assertEquals("aaaa", solution.longestPalindromicSubstring("aaaa", 2));
    }

    @Test
    public void testTwoCharacterPalindrome2() {
        assertEquals("aa", solution.longestPalindromicSubstring("aa", 2));
    }

    @Test
    public void testTwoCharacterNonPalindrome2() {
        assertEquals("a", solution.longestPalindromicSubstring("ab", 2));
    }

    @Test
    public void testOddLengthPalindrome2() {
        assertEquals("aba", solution.longestPalindromicSubstring("aba", 2));
    }

    @Test
    public void testEvenLengthPalindrome2() {
        assertEquals("abba", solution.longestPalindromicSubstring("abba", 2));
    }

    @Test
    public void testLongestAtBeginning2() {
        assertEquals("abcba", solution.longestPalindromicSubstring("abcbaxyz", 2));
    }

    @Test
    public void testLongestAtEnd2() {
        assertEquals("zyxyz", solution.longestPalindromicSubstring("abczyxyz", 2));
    }

    @Test
    public void testLongestInMiddle2() {
        assertEquals("xyzzyx", solution.longestPalindromicSubstring("abxyzzyxaa", 2));
    }

    @Test
    public void testMultiplePalindromes2() {
        assertEquals("aca", solution.longestPalindromicSubstring("aacabdkacaa", 2));
    }

    @Test
    public void testLongString2() {
        String longString = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        assertEquals("ranynar", solution.longestPalindromicSubstring(longString, 2));
    }

    // with DP

    @Test
    public void testEmptyString3() {
        assertEquals("", solution.longestPalindromicSubstring("", 3));
    }

    @Test
    public void testSingleCharacter3() {
        assertEquals("a", solution.longestPalindromicSubstring("a", 3));
    }

    @Test
    public void testAllSameCharacters33() {
        assertEquals("aaaa", solution.longestPalindromicSubstring("aaaa", 3));
    }

    @Test
    public void testTwoCharacterPalindrome33() {
        assertEquals("aa", solution.longestPalindromicSubstring("aa", 3));
    }

    @Test
    public void testTwoCharacterNonPalindrome3() {
        assertEquals("a", solution.longestPalindromicSubstring("ab", 3));
    }

    @Test
    public void testOddLengthPalindrome3() {
        assertEquals("aba", solution.longestPalindromicSubstring("aba", 3));
    }

    @Test
    public void testEvenLengthPalindrome3() {
        assertEquals("abba", solution.longestPalindromicSubstring("abba", 3));
    }

    @Test
    public void testLongestAtBeginning3() {
        assertEquals("abcba", solution.longestPalindromicSubstring("abcbaxyz", 3));
    }

    @Test
    public void testLongestAtEnd3() {
        assertEquals("zyxyz", solution.longestPalindromicSubstring("abczyxyz", 3));
    }

    @Test
    public void testLongestInMiddle3() {
        assertEquals("xyzzyx", solution.longestPalindromicSubstring("abxyzzyxaa", 3));
    }

    @Test
    public void testMultiplePalindromes3() {
        assertEquals("aca", solution.longestPalindromicSubstring("aacabdkacaa", 3));
    }

    @Test
    public void testLongString3() {
        String longString = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        assertEquals("ranynar", solution.longestPalindromicSubstring(longString, 3));
    }
}