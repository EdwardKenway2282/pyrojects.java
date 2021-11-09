import time as t

x = int(input("Enter the first number:- "))
y = int(input("Enter the second number:- "))

if (x > y):
    s = y + 1
    g = (x * y) + 1
else:
    s = x + 1
    g = (x * y) + 1

for i in range(1, s):
    if (x % i == 0 and y % i == 0):
        hcf = i

z = 0
while True:
    z = z + 1
    if (z % x == 0 and z % y == 0):
        break

print("The HCF of", x, "and", y, "is", hcf)
print("The LCM of", x, "and", y, "is", z)

t.sleep(10)
