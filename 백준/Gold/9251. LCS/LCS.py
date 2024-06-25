a = input()
b = input()
lcs = [[0]*(len(b)+1) for i in range(len(a)+1)]
for i in range(len(a)):
    for j in range(len(b)):
        if a[i]!=b[j]:
            lcs[i][j] = max(lcs[i][j-1],lcs[i-1][j])
        else:
            lcs[i][j] = lcs[i-1][j-1]+1
print(lcs[len(a)-1][len(b)-1])