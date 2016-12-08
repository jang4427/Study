# Day 1
iSum = 0
iAVg = 0
aInputList = []
aInputList = list(map(int, input().split()))

for iValue in aInputList:
    iSum += float(iValue)

print('%.2f' % round(iSum/4, 3))
