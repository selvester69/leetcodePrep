function rotateRight1(arr, k) {
    let n = arr.length;
    let res = [];

    if (k > n) k = k % n;
    for (let i = 0; i < k; i++) {
        res[i] = arr[n - k + i];
    }
    let j = 0;
    for (let i = k; i < n; i++) {
        res[i] = arr[j];
        j++;
    }
    return res;
}

function rotateRight2(arr, k) {
    let n = arr.length;
    if (k > n) k = k % n;
    for (let i = 0; i < k; i++) {
        for (let j = n - 1; j > 0; j--) {
            let temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
    }
    return arr;
}
function rotateRight3(arr, k) {
    let n = arr.length;
    if (n <= 0 || k < 0) return arr;
    if (k > n) k = k % n;
    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1)
    reverse(arr, k, n - 1);
    return arr;
}
function reverse(arr, l, r) {
    if (l == r) return;
    while (l < r) {
        let temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++; r--;
    }
}


if (typeof module !== 'undefined' && module.exports) {
    module.exports = { rotateRight, rotateRight2, rotateRight3 };
}