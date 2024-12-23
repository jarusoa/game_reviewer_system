# Game Review System

## Objective
The Game Review System is a desktop application designed to simulate a game review platform. Users can log in, view games and their reviews, write new reviews, and manage their profiles. The system also includes a moderator dashboard with administrative capabilities such as adding or removing games, users, and specific reviews. This project demonstrates GUI development, object-oriented programming, and persistent data handling.

### Skills Learned
- GUI design and development using Java Swing.
- Object-oriented programming principles and design patterns.
- Persistent data storage with serialization.
- Multi-user systems with role-based functionality.
- Algorithm design for review and game management.

### Tools Used
- **Java**: Programming language for backend and GUI development.
- **NetBeans IDE**: For project development and execution.
- **Serialized Data Storage**: For storing user and game information persistently.

## Steps
### Running the Application
1. Run the pre-built JAR file (`gameRs.jar`) by double-clicking it, or import the project into NetBeans IDE for execution and editing. Ensure you have the latest version of Java Runtime Environment (JRE) or Java Development Kit (JDK) installed.

2. **Moderator Access**  
   Log in with the following credentials:  
   - Username: `mod`  
   - Password: `12345`

3. **Preloaded Data**  
   The program includes preloaded data (`games.data` and `users.data`) for a simulated environment. This data can be modified or reset if needed.

### Features
1. **User Dashboard**  
   - Users can log in to access the dashboard and perform the following actions:
     - View games and their reviews.
     - Write reviews for games.
     - Edit their profile, including changing their username.

2. **Moderator Dashboard**  
   - Moderators have additional administrative capabilities:
     - Add or remove games.
     - Remove users.
     - Delete specific reviews for games.

3. **Review System**  
   - Users can submit reviews with ratings for graphics, gameplay, performance, and audio.  
   - Existing reviews can be updated, and overall scores are averaged dynamically.

4. **Persistent Data**  
   - Data is stored in `games.data` and `users.data` using object serialization to ensure persistence across sessions.
