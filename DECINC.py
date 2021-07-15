#https://www.codechef.com/problems/DECINC
a=int(input())
if a%4==0:
    a+=1
    print(a)
else:
    a-=1
    print(a)
