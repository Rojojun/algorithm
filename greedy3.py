n, k = map(int, input().split())
result = 0
# n = 17, k = 4 -> r = 0

if n % k != 0:
    result += 1
    n -= 1
    print("conditional : ", result)

# n = 16, k = 4 - > r = 1

while n != 1:
    n //= k
    result += 1
    print("roop : ", result)

print(result)
