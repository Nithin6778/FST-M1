dict={
    "apple":250,
    "banana":100,
    "grape":200
}
fruit=str(input("Ente the fruits that u want to find: "))
if(fruit in dict):
     print("fruit is available")
else:
    print("fruit is not available")