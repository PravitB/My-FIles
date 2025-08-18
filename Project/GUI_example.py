import tkinter as tk
#output text
def say_hello():
    label = tk.Label(root, text="Hello, world!")
    label.pack()
#input button
root = tk.Tk()
button = tk.Button(root, text="Click me!", command=say_hello)
button.pack()
root.mainloop()