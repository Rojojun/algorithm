class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # 값 -> 인덱스. "이미 지나온 원소"만 담기므로 같은 원소를 두 번 쓰지 않는다.
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return []


if __name__ == "__main__":
    cases = [
        (([2, 7, 11, 15], 9), [0, 1]),
        (([3, 2, 4], 6), [1, 2]),
        (([3, 3], 6), [0, 1]),
        (([-4, -3, -2, -1], -6), [0, 2]),
        (([-1, -2, -3, -4], -6), [1, 3]),
    ]
    for (nums, target), expected in cases:
        actual = Solution().twoSum(nums, target)
        mark = "PASS" if actual == expected else "FAIL"
        print(f"{mark} nums={nums} target={target} -> {actual} (expected {expected})")
