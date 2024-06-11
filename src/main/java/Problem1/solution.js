function method1(arr, n, k) {
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
    console.log(res);
}

function method2(arr, n, k) {
    for (let i = 0; i < k; i++) {
        for (let j = n - 1; j > 0; j--) {
            let temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
    }
    console.log(arr);
}
function method3(arr, n, k) {
    if (n <= 0 || k < 0) return
    let a = n - k;
    reverse(arr, 0, a - 1)
    reverse(arr, a, n - 1)
    reverse(arr, 0, n - 1);
    console.log(arr)
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




function testMain() {
    const arr = [1, 2, 3, 4, 5, 6, 7];
    const k = 3;
    method1([1, 2, 3, 4, 5, 6, 7], [1, 2, 3, 4, 5, 6, 7].length, k)
    method2([1, 2, 3, 4, 5, 6, 7], [1, 2, 3, 4, 5, 6, 7].length, k)
    method3([1, 2, 3, 4, 5, 6, 7], [1, 2, 3, 4, 5, 6, 7].length, k)
}

testMain();