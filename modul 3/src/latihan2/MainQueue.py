from queue import Queue

queue = Queue()
queue.put("Java")
queue.put("Dotnet")
queue.put("PHP")
queue.put("HTML")

print("get : " + queue.get())
print("peek : " + queue.queue[0])
print("get : " + queue.get())
print("peek : " + queue.queue[0])
