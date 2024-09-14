import math

n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort()
first = data[n - 1]
second = data[n - 2]

# k,3 / m, 8 -> m / k = 2 -> 반내림 => * k
count = math.floor(m / k) * k
secondCount = m - count

result = count * first + second * secondCount

print(result)
