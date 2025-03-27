#esercizio 2
def longest_palindrome(s: str) -> int:
    ss = set()
    for letter in s:
        if letter not in ss:
            ss.add(letter)
        else:
            ss.remove(letter)
    if len(ss) != 0:
        return len(s) - len(ss) + 1
    else:
        return len(s) 

#esercizio 3
#nums1 = [1, 2, 3, 0, 0, 0] -----> 3 ------> m
#nums2 =  [2, 5, 6] -----> 3 -----> n
#liste di interi crescente
def merge(nums1, m, nums2, n):
    for i in range(m,m+n):
        nums1[i]=nums2[i-m]
    nums1.sort()
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [3,5,7]
n = 2
print(merge(nums1, m, nums2, n))
print(nums1)

#esercizio 4
class Queue:
    pass


class MyStack:
    pass

#esercizio 5
def is_valid_parenthesis(s: str) -> bool:
    while '()' in s or '[]'in s or '{}' in s:
        s = s.replace('()','')
        s = s.replace('[]','')
        s = s.replace('{}','')
    if len(s) !=0:
        return False 
    else:
        return True
