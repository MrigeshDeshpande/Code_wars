"""Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter,
he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word,
check out how contractions are expected to be in the example below.
Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
"""
#solution=>

def to_jaden_case(string):
## First, we are going to convert the string input into a list by using split(). We assign the array to textArr.
            textArr= string.split(" ")
## We will create another variable called jadenCaseArr and assign it an empty list. This list will contain every word from string but capitalized.
jadenCaseArr = []
for word in textArr:
        jadenCaseArr.append(word.capitalize())
## Next, we will use the for loop to iterate through textArr and add each word into jadenCaseArr. We capitalize each word using capitalize().
        return " ".join(jadenCaseArr)
## Finally, we convert the list back into a string using join() and return the string.


#ALTERNATE SOLUTION
#==================>
import string

def toJadenCase(NonJadenStrings):
    return string.capwords(NonJadenStrings)