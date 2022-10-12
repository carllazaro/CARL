#Carl Jason J. Lazaro - BSCPE 301
while True :
 x = input("Enter first number : ")
 if len(x) == 0 :
     print("Input something!")
     continue
 elif x.isalpha() == True :
     print("Number only!")
     continue
 else :
  while True :
   y = input("Enter second number : ")
   if len(y) == 0 :
      print("Input something!")
      continue
   elif y.isalpha() == True :
      print("Number only!")
      continue
   else :
    if x > y :
     print(str(x) + " (first number) is greater than " + str(y) + " (second number).")
     break
    elif x < y :
     print(str(y) + " (second number) is greater than " + str(x) + " (first number).")
    else :
     print("Both numbers are equal.")
    break
  break
