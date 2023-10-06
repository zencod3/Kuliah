def add(x, y):
    return x + y

def minus(x, y):
    return x - y

def mult(x, y):
    return x * y

def div(x, y):
    if y == 0:
        return "Tidak dapat membagi dengan nol"
    return x / y

def tree(operation, *args):
    if operation == "add":
        result = 0
        for arg in args:
            result = add(result, arg)
        return result
    elif operation == "minus":
        if len(args) < 2:
            return "Kurang dari 2 operand untuk pengurangan"
        result = args[0]
        for i in range(1, len(args)):
            result = minus(result, args[i])
        return result
    elif operation == "mult":
        result = 1
        for arg in args:
            result = mult(result, arg)
        return result
    elif operation == "div":
        if len(args) < 2:
            return "Kurang dari 2 operand untuk pembagian"
        result = args[0]
        for i in range(1, len(args)):
            result = div(result, args[i])
        return result
    else:
        return "Operasi aritmatik tidak valid"

print("Hasil = ", tree("add", 1, 2, 3))  # Output: 6
print("Hasil = ", tree("minus", 10, 2, 3))  # Output: 5
print("Hasil = ", tree("mult", 2, 3, 4))  # Output: 24
print("Hasil = ", tree("div", 20, 2, 5))  # Output: 2.0