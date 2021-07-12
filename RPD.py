#Easy Math 
#https://www.codechef.com/problems/RPD/

def getSum(n): 
    sum = 0
    for digit in str(n):  
      sum += int(digit)       
    return sum

def solve():
    n=int(input())
    lst = list(int(num) for num in input().strip().split())[:n]
    maxx=0
    for i in range(1,n):
        for j in range (0,i):
            a=lst[j]*lst[i]
            b=getSum(a)
            if b>maxx:
                maxx=b
    print(maxx)

t=int(input())
while t>0:
    solve()
    t-=1
