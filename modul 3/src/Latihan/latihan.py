stack = []

stack.append("Aku")
stack.append("Anak")
stack.append("Indonesia")

print("Next : ", stack[-1])
stack.append("Raya")
print(stack.pop())
stack.append("!")

count = stack.count("Aku")
while count >= 0:
    stack.pop()
    count -= 1

print(stack.pop())
print(bool(stack))
