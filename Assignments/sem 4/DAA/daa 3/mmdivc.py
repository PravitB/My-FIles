def MinMaxDAC(A, i, j):
    if(i == j):
        return (A[i], A[i])
    if((j - i) == 1):
        if (A[i] < A[j]):
            return (A[i], A[j])
        else:
            return (A[j], A[i])
    else:
        mid = (i + j) // 2
        LMin, LMax = MinMaxDAC(A, i, mid)
        RMin, RMax = MinMaxDAC(A, mid + 1, j)
        if(LMax > RMax):
            max = LMax
        else:
            max = RMax
        if(LMin < RMin):    
            min = LMin
        else:
            min = RMin
        return (min, max)

arr = [5, 3, 2, 7, 1, 5, 8]
min, max = MinMaxDAC(arr, 0, len(arr) - 1)
print("Min:", min, "Max:", max)