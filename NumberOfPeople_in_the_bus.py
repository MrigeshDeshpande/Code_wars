"""There is a bus moving in the city, and it takes and drop some people in each bus stop.
You are provided with a list (or array) of integer arrays (or tuples). Each integer array has two items which represent number of people
get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
Your task is to return number of people who are still in the bus after the last bus station (after the last array)
Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D
Take a look on the test cases.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.
The second value in the first integer array is 0, since the bus is empty in the first bus stop.
"""
def number(bus_stops):
        people = 0
        for items in bus_stops:
            people += items[0]
            people -= items[1]

        return people

##descriptive solution ->
##====================

def number(arr):
  people_in = 0
  people_out = 0
  for stops in arr:
    people_in += stops[0]
    people_out += stops[1]
  return people_in - people_out