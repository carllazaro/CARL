basket = []
print("Catch and eat any of these fruits: " + "('apple','orange','mango','guava')")
num = int(input("How many fruits would you like to catch? "));
print("Choose a fruit to catch. Press A, O, M, G")
for i in range(num):
    fruit = input(f"Fruit {i+1} of {num}: ")
    def switch():
        def apple():
         basket.append("apple")
        def orange():
         basket.append("orange")
        def mango():
         basket.append("mango")
        def guava():
         basket.append("guava")
        dictionary = {
         "a": apple, 
         "o": orange,
         "m": mango,
         "g": guava
        }
        dictionary.get(fruit)()
    switch()
print(f"Your basket now has: {basket}")
for i in range(num):
    eat = input("Press E to eat a fruit. ")
    basket.pop()
    if basket:
        print(f"Fruit(s) in the basket: {basket}")
    else:
        print("No more fruits.")
