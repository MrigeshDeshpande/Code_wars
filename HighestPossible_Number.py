"""
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321

"""
def Descending_Order(num):
    list=[]
    while num/10 !=0 :
        list.append(num%10)
        num=num/10
    list.append(num)
    list.sort()
    print list
    numb=0;
    i=0
    print i
    while i <len(list):
        numb+=list[i]*pow(10,i)
        i+=1
        print numb
    return numb

#ALTERNATE SOLUTION
#==================>

    def Descending_Order1(num):
        a = sorted(str(num))
        a.reverse()
        a = int(''.join(a))
        return a

##ALTERNATE SOLUTION
#==================>
        def Descending_Order2(num):
            l = list(str(num))
            l.sort(reverse=True)
            return int("".join(l))