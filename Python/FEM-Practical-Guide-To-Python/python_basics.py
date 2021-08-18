# in file: hello.py

greetings = ["Hello", "Bonjour", "Hola"]

for greeting in greetings:
    print(f"{greeting}, World! This is a f String")
    print("This is a normal String.")

#remember these three commands for the python repl or in general dir() help() type()

#helpful methods for math min() max() round()

word_list = ["cat", "dog", "rabbit"]
letter_list = []
for a_word in word_list:
    for a_letter in a_word:
        letter_list.append(a_letter)

no_duplicates_list = list(set(letter_list))
print(letter_list)
print(no_duplicates_list)
#calling hash(something) will tell you if your type is immuntable or not and cannot contain duplicates
#sets do not have order and the order will change so you can't access sets like my_set[0] or add to a set like this
#you would have to use the built in set commands, you also have to use a trailing comma if you only want one item in a set
# for an empyt set just use the set() fuction, lists, sets, and dictionaries are un hashable, but tuples are hashable (Immutable)
my_set={1,}
my_number_set ={1,2,3,4,6}
empty_set = set()
hash(my_number_set)
hash(empty_set)

# Dictionaries, dictionary keys can only be immutable but the dictionary its self is mutable, this is because dictionary keys need to be hashable
# dictionaries allow fast item or member look up, weird side note you could use a tuple as a dictionary key because its immutable
# if you want an empty dictionary you just have to put colon inside your dictionary
# empty_dict = {:}
# dictionaries don't have order they have keys so you would access data like
nums_dict = {1: "one", 2: "two", 3: "three"}
nums_dict[1]
# most useful dictionary fucntion
nums_dict.items()
# use pprint import pprint to look at complex code broken down line by line

# for funcitons don't use mutable types as default arguments!! They don't behave the way that you expect
# example
# def do_stuf(my_list[]):
    # my_list.append("stuff")

# Boolean Logic Truthyness
bool(0)
bool(3 < 5)
bool(None)

# to check if  two list point to the same thing in memory you can do list1 is list2
list1 = [1,2,3]
list2 = [1,2,3]
list1 is list2

# python logical operators
# has, and, or, not


#List Comprehensions
names_no_comprehensions = ["Nina", "Max", "Rose", "Jimmy"]
my_list = [] # empty list
for name in names_no_comprehensions:
    my_list.append(len(names_no_comprehensions))
print(my_list)
[4, 3, 4, 5]

names_comprenshions = ["Nina", "Max", "Rose", "Jimmy"]
#         [(what you want) forloop --optional conditions--] ie a one liner forloop and the result you want
my_list = [len(name) for name in names_comprenshions]
my_list = [("length", len(name) * 2) for name in names_comprenshions]
print(my_list)
