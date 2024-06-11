const assert = chai.assert;

//Test Cases for Type 1 solution

describe('Rotate Right Method 1', function () {
    it('should handle an empty array', function () {
        assert.deepEqual(rotateRight1([], 3), []);
    });

    it('should handle a one-element array', function () {
        assert.deepEqual(rotateRight1([1], 2), [1]);
    });

    it('should rotate by zero', function () {
        assert.deepEqual(rotateRight1([1, 2, 3, 4, 5], 0), [1, 2, 3, 4, 5]);
    });

    it('should rotate by one', function () {
        assert.deepEqual(rotateRight1([1, 2, 3, 4, 5], 1), [5, 1, 2, 3, 4]);
    });

    it('should rotate by the array length', function () {
        assert.deepEqual(rotateRight1([1, 2, 3, 4, 5], 5), [1, 2, 3, 4, 5]);
    });

    it('should rotate by more than the array length', function () {
        assert.deepEqual(rotateRight1([1, 2, 3, 4, 5], 7), [4, 5, 1, 2, 3]);
    });

    it('should handle a general case', function () {
        assert.deepEqual(rotateRight1([1, 2, 3, 4, 5, 6, 7], 3), [5, 6, 7, 1, 2, 3, 4]);
    });
});

//Test Cases for Type 2 solution


describe('Rotate Right Methos 2', function () {
    it('should handle an empty array', function () {
        assert.deepEqual(rotateRight2([], 3), []);
    });

    it('should handle a one-element array', function () {
        assert.deepEqual(rotateRight2([1], 2), [1]);
    });

    it('should rotate by zero', function () {
        assert.deepEqual(rotateRight2([1, 2, 3, 4, 5], 0), [1, 2, 3, 4, 5]);
    });

    it('should rotate by one', function () {
        assert.deepEqual(rotateRight2([1, 2, 3, 4, 5], 1), [5, 1, 2, 3, 4]);
    });

    it('should rotate by the array length', function () {
        assert.deepEqual(rotateRight2([1, 2, 3, 4, 5], 5), [1, 2, 3, 4, 5]);
    });

    it('should rotate by more than the array length', function () {
        assert.deepEqual(rotateRight2([1, 2, 3, 4, 5], 7), [4, 5, 1, 2, 3]);
    });

    it('should handle a general case', function () {
        assert.deepEqual(rotateRight2([1, 2, 3, 4, 5, 6, 7], 3), [5, 6, 7, 1, 2, 3, 4]);
    });
});

//Test Cases for Type 3 solution


describe('Rotate Right Methos 3', function () {
    it('should handle an empty array', function () {
        assert.deepEqual(rotateRight3([], 3), []);
    });

    it('should handle a one-element array', function () {
        assert.deepEqual(rotateRight3([1], 2), [1]);
    });

    it('should rotate by zero', function () {
        assert.deepEqual(rotateRight3([1, 2, 3, 4, 5], 0), [1, 2, 3, 4, 5]);
    });

    it('should rotate by one', function () {
        assert.deepEqual(rotateRight3([1, 2, 3, 4, 5], 1), [5, 1, 2, 3, 4]);
    });

    it('should rotate by the array length', function () {
        assert.deepEqual(rotateRight3([1, 2, 3, 4, 5], 5), [1, 2, 3, 4, 5]);
    });

    it('should rotate by more than the array length', function () {
        assert.deepEqual(rotateRight3([1, 2, 3, 4, 5], 7), [4, 5, 1, 2, 3]);
    });

    it('should handle a general case', function () {
        assert.deepEqual(rotateRight3([1, 2, 3, 4, 5, 6, 7], 3), [5, 6, 7, 1, 2, 3, 4]);
    });
});
