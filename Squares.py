import math

num = float(input("Enter a number: "))


def squareRoot(x, tolerance):
    for i in range(0, math.ceil(x) + 1):
        if (i * i == x):
            return i
        elif (i * i > x):
            guess = i
            return helperRoot(x, guess, tolerance)
        

def squareRoot2(x, iterations):
    for i in range(0, math.ceil(x) + 1):
        if (i * i == x):
            return i
        elif (i * i > x):
            guess = i
            return helperRoot2(x, guess, iterations)


def helperRoot(n, guess, tolerance):
    
    x1 = guess
    y1 = guess * guess
    
    slope = 2 * guess


    while abs( (x1 * x1) - n ) > tolerance:
        x2 = ((n - y1) / slope) + x1

        x1 = x2
        y1 = x1 * x1
        slope = 2 * x1

        # print(x1)

    return x1



def helperRoot2(n, guess, iterations):
    
    x1 = guess
    y1 = guess * guess
    
    slope = 2 * guess


    for i in range(0, iterations):
        x2 = ((n - y1) / slope) + x1

        x1 = x2
        y1 = x1 * x1
        slope = 2 * x1

        # print(x1)

    return x1

# print("Estimate Value: " + str(   squareRoot(num, 0.0000001)   ))
print("Estimate Value: " + str(   squareRoot2(num, 500)   ))
print("Real Value: " + str(  math.sqrt(num)  ))

