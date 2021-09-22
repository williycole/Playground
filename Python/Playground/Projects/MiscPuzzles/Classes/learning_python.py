# variables
taco_johns = 'taco johns'
year_of_birth = 1992
current_temp = 75.6

# Basic if, elif, else, and logical operators
x = 5
if x < 10:
    print('smaller')
if x > 20:
    print('bigger')
print("----------------------")
name = input('Enter your name: ')
if name == 'Cole':
    print("ahhhh " + name + " ! Welcome Back! ")
elif name != 'Cole' and name != '':
    print('Hello ' + name)
else:
    print("Hello user! You forgot to put your name.")
print("----------------------")

# try catch, concatenating strings/numbers
coles_age = 28
what_is_your_age = input('What is your age? ')
input_value = int(what_is_your_age)
try:
    input_value = int(what_is_your_age)
except:
    what_is_your_age = -1
    print('thats not a number')
if input_value == coles_age:
    print('You are the same age as Cole!')
else:
    print('Cole is ' + str(coles_age) + ' years old')
    print(f'{input_value} is how old you are')
print("----------------------")


# Functions and Loops
def my_function(your_name):
    print("This is " + str(your_name) + "'s Function")


my_function('Cole')  # ^^Two blank spaces after end of a function
print("----------------------")

n = 5
while n > 0:
    print(n)
    print("----------------------")
    n = n - 1
print('Blastoff!')
print("----------------------")
