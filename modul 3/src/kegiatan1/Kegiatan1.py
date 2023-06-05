stack = []

string = input("Masukkan input : ")

for char in string:
    stack.append(char)

reversed_string = ""

while len(stack) != 0:
    reversed_string += stack.pop()

print("Reversed : " + reversed_string)
