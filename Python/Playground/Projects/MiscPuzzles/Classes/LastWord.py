# Length of the Last Word
# Given a string s consisting of some words separated by some number of spaces,
# return the length of the last word in the string.
# A word is a maximal substring consisting of non-space characters only.


# Example 1 Input: s = "Hello World"
# Output: 5
# Explanation: The words are "Hello" and "World", both of length 5.

# Example 2 Input: s = "   fly me   to   the moon  "
# Output: 4
# Explanation: The longest word is "moon" with length 4.
import re


def last_word(s):
    result_list = re.sub(' +', ' ', s).split()
    last_word_in_list = len(result_list)
    print(len(result_list[last_word_in_list - 1]))
    return len(result_list[last_word_in_list - 1])


last_word("Hello World")
last_word("   fly me   to   the moon  ")
last_word("luffy is still joyboy")
