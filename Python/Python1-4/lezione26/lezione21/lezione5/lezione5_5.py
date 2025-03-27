def move_zeroes(nums:list[int]):
    for i in range(len(nums)):
         if nums[i] == 0:
            x = nums.pop(i)
            nums.append(x)
    return nums
print(move_zeroes([0,4,5,0,8,7,6]))

