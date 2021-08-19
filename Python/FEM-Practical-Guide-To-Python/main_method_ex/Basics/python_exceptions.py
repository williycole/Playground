# this will throw an exception if the
# catch exceptions with try and except exception
# if you just print after the execption and aren't specific python
# will give you a hint as to what exception you should use
# you generally want to be as specific as possible with your exceptions
try:
    int("a")
except ValueError:
    print("An exception happened")

print("End of the program")