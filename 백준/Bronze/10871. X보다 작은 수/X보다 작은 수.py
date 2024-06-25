n,l = map(int, input().split())
b = list(map(int,input().split()))
a = []

for i in b:
    if i < l:
        print(i,end=' ')