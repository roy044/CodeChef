def isPrime(n):
    c=0
    for i in range(1,n+1):
        if n%i==0:
            c+=1
    if c==2:
        return True
    else:
        return False

Z=int(input())
while Z>0:
    a=int(input())
    ans=isPrime(a)
    if ans== True:
        print("yes")
    else:
        print("no")
    Z-=1
