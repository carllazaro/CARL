print("ex. username@gmail.com")
email = input("Enter email : ")
index = email.index("@")
username = email[:index]
sjsjsj = email[index:]
print(f'Your username is {username} and {sjsjsj}')
