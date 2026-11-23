a = int(input())
b = input().strip()

for ch in b[::-1]:
    print(a * int(ch))

print(a * int(b))