"""
Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11

"""
def binary_array_to_number(arr):
    i = 0
    n = len(arr)-1
    num = 0
    while n >= 0:
        num += arr[n]*pow(2, i)
        i += 1
        n -= 1
    return num

######################################################
#Alternate Solution
def binary_array_to_number(arr):
    l = len(arr)
    power = 0
    res = 0
for i in range(l, 0, -1):
        res += arr[i - 1] * (2 ** power)
        power += 1
        return res

