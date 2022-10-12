role1 = 'warrior'
role2 = 'mage'
name = input("Enter username : ")
print("a. warrior | b. mage")
class_ = input("Select class : ")
if class_ == 'a':
    user = {
    'name': f'Username : {name}',
    'class': f'\nRole : {role1}'
}
elif class_=='b':
    user = {
        'name': f'Username : {name}',
        'class': f'\nRole : {role2}'
    }
x = user['name']
y = user['class']
print(x,y)
