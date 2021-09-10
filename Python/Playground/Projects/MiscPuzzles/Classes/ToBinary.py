import math


def add_binary(a, b):
    # Step 0: Add the two numbers
    total = a + b
    # Step 1: Divide the number by 2 through %
    # (modulus operator) and store the remainder in a list
    binary_list = []
    remainder = total % 2
    binary_list.append(remainder)
    # print(binary_list)

    # Step 2: Divide the number by 2 through /
    # (division operator)
    mid_step_num = total / 2
    binary_list.append(mid_step_num)
    # print(binary_list)

    # Step 3: Repeat the step 2 until number is
    # greater than 0
    binary_list_copy = binary_list.copy()
    binary_list_copy.reverse()
    copy_num_check = binary_list[0]

    while copy_num_check > 0 != True:
        mid_step_num = total / 2
        binary_list.append(mid_step_num)
        break

    # address correcting beginning 0 for converting to binary
    # print(binary_list_copy)
    if binary_list_copy[0] == 0 or binary_list_copy[0] == 0.5:
        binary_list_copy.pop(0)
        # print(copy_num_check)
    # print(binary_list_copy)

    # Step 4: Return result as a string
    # concatenate string and return in reverse order
    res_math_floor = [math.floor(num) for num in binary_list_copy]
    res_str = [str(num) for num in res_math_floor]
    # print(res_str)
    final_res = ''.join(res_str)
    print(final_res)
    return final_res


# add_binary(1, 1)
# add_binary(0, 1)
# add_binary(1, 0)
add_binary(2, 2)
# add_binary(51, 12)
