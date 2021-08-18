# Create a function that takes two arrays and insert the second array in the middle of the first array.
# Examples
# tuck_in([1, 10], [2, 3, 4, 5, 6, 7, 8, 9]) ➞ [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# tuck_in([15,150], [45, 75, 35]) ➞ [15, 45, 75, 35, 150]
# tuck_in([[1, 2], [5, 6]], [[3, 4]]) ➞ [[1, 2], [3, 4], [5, 6]]

def tuck_in(list1, list2):
    # creates shallow copies of list1 and list 2
    shallow_copy_list2 = list2.copy()
    shallow_copy_list1 = list1.copy()

    # saves 1st and last element in list1 to values and places them
    # in correct positions of shallow_copy_list2 to return as result
    beg = shallow_copy_list1[0]
    end = shallow_copy_list1[1]
    shallow_copy_list2.insert(0, beg)
    shallow_copy_list2.insert(len(shallow_copy_list2), end)

    print(shallow_copy_list2)
    return shallow_copy_list2


tuck_in([1, 10], [2, 3, 4, 5, 6, 7, 8, 9])
tuck_in([15,150], [45, 75, 35])
tuck_in([[1, 2], [5, 6]], [[3, 4]])
