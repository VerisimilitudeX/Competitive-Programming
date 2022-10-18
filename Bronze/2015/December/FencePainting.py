a = 0
b = 0
c = 0
d = 0

with open("paint.in") as f:
    ab = f.readline()
    a = int(ab[0:ab.index(" ")])
    b = int(ab[ab.index(" ") + 1])

    count = 0
    for i in range(100):
        if (i >= a and i < b) or (i >= c and i < d):
            count += 1

    fp = open("paint.out", "w")
    fp.write(str(count))
