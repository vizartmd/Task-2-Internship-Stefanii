# Task-2 internship-Stefanii

# command model for testing the program from the command line

# Create new users - by running this command:
java -jar myaplication.jar createUser Scutaru Alexandru alex
#
java -jar myaplication.jar createUser Apostol Maria mary
#
java -jar myaplication.jar createUser Racu Valentin vali
#

# Show All Users - by running this command:
java -jar myaplication.jar showAllUsers
#

# Add a task to the user - by running this command:
java -jar myaplication.jar addTask alex 'task1 title for alex' 'task1 description for alex'
#
java -jar myaplication.jar addTask alex 'task2 title for alex' 'task2 description for alex'
#
java -jar myaplication.jar addTask alex 'task3 title for alex' 'task3 description for alex'
#
java -jar myaplication.jar addTask mary 'task1 title for mary' 'task1 description for mary'
#
java -jar myaplication.jar addTask mary 'task2 title for mary' 'task2 description for mary'
#
java -jar myaplication.jar addTask vali 'task1 title for vali' 'task1 description for vali'
#
java -jar myaplication.jar addTask vali 'task2 title for vali' 'task2 description for vali'
#
java -jar myaplication.jar addTask vali 'task3 title for vali' 'task3 description for vali'
#
java -jar myaplication.jar addTask vali 'task4 title for vali' 'task4 description for vali'

# Show user's tasks - by running this command:
java -jar myaplication.jar showTasks alex
#
java -jar myaplication.jar showTasks mary
#
java -jar myaplication.jar showTasks vali
