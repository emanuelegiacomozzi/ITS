def bubble_sort(x:list[float]):
    for i in range(len(x)):
        swap:bool = False
        for j in range(len(x) - i - 1):
            if x[j] > x[j+1]:
                temp:float = x[j+1]
                swap = True
                x[j+1] = x[j]
                x[j] = temp
        if not swap:
            break

a = [1,3,2,4,5]
swap = bubble_sort(a)
print(f"Ho fatto degli swap = {swap}")
print(a)