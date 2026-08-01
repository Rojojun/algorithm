nums = list(map(int, input().split()))
target = int(input())

left = 0
right = len(nums) - 1

while left <= right:
    if (target > 0):
        if (nums[left] + nums[right] > target):
            print(nums[left], ", ", nums[right])
            right -= 1
        elif (nums[left] + nums[right] < target):
            print(nums[left], ", ", nums[right])
            left += 1
        else:
            break;
    else:
        if (nums[left] + nums[right] < target):
            print(nums[left], ", ", nums[right])
            right -= 1
        elif (nums[left] + nums[right] > target):
            print(nums[left], ", ", nums[right])
            left += 1
        else:
            break;



print(nums[left], nums[right])

