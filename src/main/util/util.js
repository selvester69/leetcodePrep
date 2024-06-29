export const isPalindromic = (str, start, end) => {
    if (!str) { return false };
    if (str.length == 1) return true;

    while (start < end) {
        if (str.charAt(start) !== str.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}