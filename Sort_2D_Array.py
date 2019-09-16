def sort2DArray(A):
    m, n = len(A), len(A[0])
    def helper(l, r):
        if l == r: return
        pivot = A[l // n][l % n]
        i, j = l + 1, r
        while i <= j:
            if A[i // n][i % n] < pivot:
                i += 1
            else:
                A[i // n][i % n], A[j // n][j % n] = A[j // n][j % n], A[i // n][i % n]
                j -= 1
        A[l // n][l % n], A[(i - 1) // n][(i - 1) % n] = A[(i - 1) // n][(i - 1) % n], A[l // n][l % n]
        helper(l, i - 1)
        helper(i, r)
    helper(0, m * n - 1)
        
A = [
    [ 5, 12, 17, 21, 23],
    [ 1,  2,  4,  6,  8],
    [12, 14, 18, 19, 27],
    [ 3,  7,  9, 15, 25]
]
sort2DArray(A)
for row in A: print(row)
