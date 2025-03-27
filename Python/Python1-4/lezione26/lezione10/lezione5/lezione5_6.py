def intersection(nums1: list[int], nums2:list[int]):
    nums1:set[int] = set(nums1)
    nums2:set[int] = set(nums2)
    elementi_in_comune:list[int] = []
    for num in nums2:
        if num in nums2 and num not in elementi_in_comune:
            elementi_in_comune.append(num)
    return elementi_in_comune
print(intersection([1,2,3,4],[5,2,3,7]))