import sys
import time

a = []
b = a
print(sys.getrefcount(a))

threads: list = []

def thread_function(name):

    print(f"{name} Time - {time.time()}")
    time.sleep(2)
    print(f"{name} Time - {time.time()}")

import threading
for i in range(3):

    x = threading.Thread(target=thread_function, args=(1, ))
    threads.append(x)
    x.start()

for t in threads:

    t.join()

print(f"Prima di thread")
x.start() #mando in esecuzione
print(f"Thread Partito")
x.join()
print("Thread finito????")