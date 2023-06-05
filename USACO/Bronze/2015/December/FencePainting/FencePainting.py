# Hasn't been tested thoroughly, use the Java code for higher accuracy

a = 0
b = 0
c = 0
d = 0

f = open("paint.in", "r")
ab = ""
cd = ""

for i, line in enumerate(f):
    if i == 0:
        ab = line.strip("\n")
    elif i == 1:
        cd = line.strip("\n")

a = int(ab[0:ab.index(" ")])
b = int(ab[ab.index(" ") + 1::])

c = int(cd[0:cd.index(" ")])
d = int(cd[cd.index(" ") + 1])

count = 0
for i in range(100):
    if (i >= a and i < b) or (i >= c and i < d):
        count += 1

fp = open("paint.out", "w")
fp.write(str(count))
