import sys

input = sys.stdin.readline

cro = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

words = input().rstrip("\n")

i = 0
count = 0

while i < len(words):
    if words[i : i + 3] == "dz=":
        count += 1
        i += 3
    elif words[i : i + 2] in cro:
        count += 1
        i += 2
    else:
        count += 1
        i += 1
print(count)