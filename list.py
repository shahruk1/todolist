tasks=[]

def add():
    task = input("Enter the task: ")
    tasks.append(task)
    print(f"Task '{task}' task added")

def remove():
    task = input("Enter the task to remove: ")
    if task in tasks:
        tasks.remove(task)
        print(f"Task '{task} task removed")

def list():
    print(tasks)
for i in range(1,10):
    pass

while(True):
    print("Menu")
    print("1.Add task")
    print("2.remove task")
    print("3.show list of tasks")
    print("4.quit")

    a=input()

    if a == "1":
       add()
       print("task added")
    
    elif a == "2":
        remove()
        print("task removed")

    elif a == "3":
        list()
        
    elif a == "4":
        print("bye")
        break 
    else:
        print("invalid choice")   



    

