import time
from itertools import count

5
start = time.time()

N, M = map(int, input().split())
array = list(map(int, input().split()))
result = 0

for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if array[i] + array[j] + array[k] > M:
                continue
            else:
                result = max(result, array[i] + array[j] + array[k])
end = time.time()
print("time : ", end - start)
