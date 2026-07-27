# class Solution:
#    def mySqrt(self, x: int) -> int: 
#        i = 0
#        while True:
#            if i * i > x:
#                i -= 1
#                break
#            i += 1
#        return i

x = int(input())
left = 0
right = x
mid = 0
answer = 0

while left <= right:
    mid = (left + right) // 2
    print(mid)
    if (mid * mid <= x):
        print('bigger = ', mid)

        answer = mid
        left = mid + 1
    else:
        print('smaller = ', mid)
        right = mid - 1 

print(answer)

