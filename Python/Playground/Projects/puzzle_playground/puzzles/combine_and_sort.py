# Create a function that takes two arrays, combines them, and sorts them.
# Examples
# combine_and_sort([1, 10], [2, 3, 4, 5, 6, 7, 8, 9]) ➞ [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# combine_and_sort([15,150], [45, 75, 35]) ➞ [15, 45, 75, 35, 150]
# combine_and_sort([[1, 2], [5, 6]], [[3, 4]]) ➞ [[1, 2], [3, 4], [5, 6]]


def combine_and_sort(list1, list2):
    # shallow copies arr1
    result = list1.copy()
    # loops through arr2 and .appends() item to result
    for item in list2:
        result.append(item)
    # sorts and returns result
    result.sort()
    print(result)
    return result


combine_and_sort([1, 10], [2, 3, 4, 5, 6, 7, 8, 9])
combine_and_sort([15, 150], [45, 75, 35])
combine_and_sort([[1, 2], [5, 6]], [[3, 4]])
