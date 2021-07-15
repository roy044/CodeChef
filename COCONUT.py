#https://www.codechef.com/problems/COCONUT
for _ in range(int(input())):
    l = list(map(int,input().split()))
    num = (l[2]/l[0]) + (l[3]/l[1])
    print(int(num))
