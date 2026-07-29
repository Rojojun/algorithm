x = float(input())
n = int(input())

answer = 1.0
exponent = abs(n)
current = x

while exponent > 0:
    if exponent % 2 == 1:
        answer *= current
        # 

    current *= current;
    exponent //= 2

if n < 0:
    answer = 1 / answer

print(answer)


# class Solution:
#     def myPow(self, x: float, n: int) -> float:
#         answer = <D-z>
#
#         for i in range(1, n + 1):
#             if (i <= 1):
#                 answer = x
#             else:
#                 answer = answer * x
#         return answer
