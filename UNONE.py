# cook your dish here
t=int(input())
for i in range(t):
    n=int(input())
    ai=map(int,input().split())
    odd=[]
    even=[]
    for a in ai:
        if a%2==0:
            even.append(str(a))
        else:
            odd.append(str(a))
    ans=even+odd
    print(' '.join(ans))
