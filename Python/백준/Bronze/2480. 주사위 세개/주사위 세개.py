import sys

input = sys.stdin.readline

h, m, n = map(int, input().split())

if h == m  and m == n:
    price = int(h * 1000 + 10000)
elif h == m or h == n:
    price = int(h * 100 + 1000)
elif m == n:
    price = int(m * 100 + 1000)
else:
    price = max(h, m, n) * 100
print(price)