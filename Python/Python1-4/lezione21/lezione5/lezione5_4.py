def majority_element(nums:list[int]):
    for i in nums:
        if nums.count(i) > len(nums) / 2:
            return i
    return None
print(majority_element([2,2,1,1,1]))

            