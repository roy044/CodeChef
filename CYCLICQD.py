#https://www.codechef.com/START5C/problems/CYCLICQD
T=int(input())
n=4
result = []
for _ in range (0,T):
   num_list = list(int(num) for num in input().strip().split())[:n]
   A=num_list[0]
   B=num_list[1]
   C=num_list[2]
   D=num_list[3]
   if (A+C==180) and (B+D==180):
       result.append("YES")
       num_list.clear()
   else:
       result.append("NO")
       num_list.clear()
print(*result, sep = "\n")
