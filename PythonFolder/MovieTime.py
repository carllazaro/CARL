from collections import deque
movies = deque([])
snacks = deque([])
for i in range(3):
    movie = input(f"Enter movie {i+1} of 3: ")
    movies.append(movie)
for j in range(3):
    snack = input(f"Enter snack {j+1} of 3: ")
    snacks.append(snack)
print(f"Movies to watch are: {movies}")
print(f"Snacks available are:  {snacks}")
print("Press S to finish snack")
for x in range(3):
    eat = input()
    snacks.popleft()
    if not snacks:
        print("No more snacks.")
    else:
        print(f"Snacks available are:  {snacks}")
