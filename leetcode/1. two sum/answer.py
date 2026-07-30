nums = list(map(int, input().split()))
target = int(input())

left = 0
right = len(nums) - 1

while left <= right:
    if (nums[left] + nums[right] > target):
        right -= 1
    elif (nums[left] + nums[right] < target):
        left += 1
    else:
        break;

print(nums[left], nums[right])
