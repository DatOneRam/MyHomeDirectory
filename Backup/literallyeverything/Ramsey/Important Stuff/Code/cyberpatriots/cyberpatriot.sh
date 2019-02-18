#!/bin/bash

#CYBER STALLIONS COMPETITION SCRIPT
#run as root/use sudo
#made for ubuntu 14 but i dont see why it wouldn't work on another ubuntu
#ramsey alsheikh, 12/4/18

userToDelete=""

#uncomment to update/upgrade the system
#sudo apt-get install update
#sudo apt-get install upgrade


#remove aliases (a command that a user has preferenced to call by a different keyword)
printf "\nRemoving all aliases..."
unalias -a && echo "Done."

#remove all the multimedia files
printf "\nRemoving all unecessary multimedia files..."
find / -type f \( -iname \*.jpg -o -iname \*.png -o -iname \*.mp3 -o -iname \*.mp4 -o -iname \*.mov -o -iname \*.jpeg -o -iname \*.tiff -o -iname \*.avi -o -iname \*.wmv -o -iname \*.mpg -o -iname \*.mpeg -o -iname \*.flac -o -iname \*.ogg -o -iname \*.gif \) -delete && printf "\nDone."

#enable ufw (Ubuntu FireWall)
printf "\nEnabling firewall..."
ufw enable && echo "Done."

#uncomment to start ssh
#service ssh start

#delete all users the user wants to delete
printf "\nEnter all the names of users you want deleted. Entering done will end this part."
while [ "$userToDelete" != "done" ]
do
	read -p "Enter a user to delete: " userToDelete
	userdel "$userToDelete" && printf "\nDeleted user $userToDelete!"
	printf '\n'
done