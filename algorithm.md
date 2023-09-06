Goal - The goal of the program is to be simulate a game reviewer system that users can login to, view games and their scores and reviews, see their profile, make reviews and see their own reviews. An alternative goal is also for their to be a moderator of the system that can add games, remove games, remove users, and remove specefic reviews of certain games.
Input - The program takes many inputs such as when the user creates their account, logins, makes reviews, changes thier username and so on. The moderator also can make inputs like adding games.
Output - The output of the program is to be a GUI that displays games and users data and in a compact but simple way, it also is to dynamically update according to the object's attributes.
Steps -

-- Main class
1. The main class will be to hold the new array lists of game and user objects. Theese will be the only new instances and therefore everything else in the GUI will be constructors that use these lists.
2. The main class will also serve to be the login page of the GUI system as everything within the system starts from logining in.
3. The writing and loading methods of the main class serve to load and write the user and game arraylists as I will use serialization to save and load these groups of objects to keep data peristsent as any review system needs to be persistent.

-- Create Account
1. The button within the login page that leads to create a account leads to the a new instance of the class create Account. This will be a GUI page that will ask the user for a username, password, and favorite genere but the favorite genre will only allow certain options found in a JComboBox. We will set a new user object to this and add it to the arraylist of users. Again we use constructirs fir this class so we effect the instance found in the Main instead of effecting new instances which wouldnt keep the data persistent.
2. This create account will also check to see if any users hold those usernames so they dont create a account with the same username as another user.

-- Dashboard
1. If the user logins succesfully they will get a new instance of a Dashboard which is the frame of the system.
2. It will take in the lists of games and users and it will also take in the instance of main. it will do this as when the user exits the dashboard by a button we will use save the objects and exit the program.
3. The dashboard will start out with the dashboard menu class that is connected to the dashboard button but twio other buttons for my profile and my reviews.

-- DashboardMenu , ViewGame, WriteReview
1. The dashboard menu will allow the user to choose a game to view or write. Depending on their choice we wil create new GUI classes of those actions.
2. For writing a review we will take in text using a editable java area, and sliders for each of the components of the review such as gameplay, graphics, performance, audio. We will then take in all that data, store them in variables, and then make a new review and add that object to the user's arraylist of reviews and the chosen game's review list. If the user already has a review for that game it will just override the review instead of creating a new one.
3. If the user decides to view the game we will use the new instance of ViewGame class. This class will display the game, its description, and the methods that will average out the scores for its overall and component scores. It also will display all reviews that belong to that game using a JTextArea and a method fo the review that appends text to that area.

-- Profile, changeUsername
1. the Profile class is created when the user clicks the profile button on the Dashboard.
2. This page of GUI will show the User's name, favorite genre, and amount of reviews in the form of a integer. It also will have a button for changing the Username which will create a new instance of changeUsername. This will take in input for a new username and if it isnt already a username of another user it will change the user's username and all the reviews that, that user has in any games too.

-- MyReviews
1. MyReviews class is created when the user clicks the my review button on the Dashboard.
2. This will be a internal jframe that has a jtext area that is printed into using a method but instead it will also show the game it belongs to as well as thats how its different from the base printReview method of review.

-- ModDashboard
1. The ModDashboard class will be created if the person login's with a username of mod and password of 12345. 
2. It will have three options/button, one to add/remove games, ont to remove a user, and one to remove a review of a specefic game that is chosen.

-- ModGame, CreateGame
1. If the user clicks on add/remove game they will create a new instance of the ModGame class.
2. From here They will get a default list model which the ycan choose to remove a game from. If the game is removed it will destroy the game object and its reviews but also any reviews in the users that pertain to that game.
3. If the moderator decides to click the create a game button it will create a new instance of CreateGame. 
4. It will ask the moderator for a game name, description ,and genre and then that will be added to the game_list of the main class.

--  RemoveUser
1. If the mod decides to click the Remove User button it will create a new instance of RemoveUser.
2. It will have a DefaultModelList that has all the users and can be selected.
3. If the user is selected and the button to remove is clicked it will remove the user and all the reviews the user made on games.

-- RemoveReview, RemoveReview2
1.  The RemoveReview class will be created when the user click the Remove Review button on the ModDashboard.
2. This will first ask you to select a game and then that will make RemoveReview2.
3. RemoveReview2 will have a box of users that have reviews for that game and a JavaTextArea that updates according to the user that is selected and their review for the game. If they click remove it will remove that review from the user and game.

On logout the data will be saved in games.data and users.data using object serialization.
