player1 = input("player 1 name")
player2 = input("player 2 name")

player1_input=input(player1 + "Chooose rock,papper or scissor? ").lower()
player2_input=input(player2 + "Chooose rock,papper or scissor? ").lower()

if player1_input==player2_input:
    print("It is Tie")
elif player1_input=="rock":
    if player2_input=="scissors":
        print("rock wins")
    else:
        print("paper wins")
elif player1_input =="scissors":
    if player2_input=="papper":
        print("Scissor wins")
    else:
        print("Rock wins")
elif player1_input=="papper":
    if player2_input=="rock":
        print("papper wins")
    else:
        print("scissors wins")
else:
    print("invalid input apart from rock, papper & scissor")
