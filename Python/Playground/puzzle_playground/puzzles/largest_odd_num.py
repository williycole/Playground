def largest_odd_num(nums):
    # checks if the nums converted to an int is already odd before splitting to smaller numbers
    nums_is_even = bool(int(nums) % 2 == 0)
    print("Checking for largest odd number in string...")

    if not nums_is_even:
        print(f'Largest odd number found for {nums} is {nums} \n')
        return int(nums)
    else:
        # convert string to list of numbers to remove further check for largest odd number
        nums_list = [int(num) for num in str(nums)]

        # if all items in list are even return string " " else continue hunting largest odd number
        all_nums_true = all(num % 2 == 0 for num in nums_list)
        if all_nums_true:
            print(f'No largest odd number found in given String...\n')
            return " "

        else:
            # reference to last number in nums_list
            last_digit_in_list = nums_list[len(nums_list) - 1]
            # else while last items in list are 0 remove them until its not then concatenate and return number
            while last_digit_in_list % 2 == 0:
                print("Still checking for largest odd num...")
                nums_list.remove(last_digit_in_list)
                break

            ints_to_string = [str(nums) for nums in nums_list]
            combined_string = "".join(ints_to_string)
            result = int(combined_string)
            print(f'Largest odd number found for  {nums} is: {str(result)} \n')
            return result


largest_odd_num("52")
largest_odd_num("4206")
largest_odd_num("35427")
largest_odd_num("6758")
largest_odd_num("123456")
largest_odd_num("2342389")
