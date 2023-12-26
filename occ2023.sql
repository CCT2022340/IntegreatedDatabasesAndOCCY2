CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    UserType ENUM('Admin', 'Regular') NOT NULL,
    Username VARCHAR(50) UNIQUE NOT NULL,
    Password VARCHAR(50) NOT NULL,
    Name VARCHAR(50),
    Surname VARCHAR(50)
);

-- Create the Operations table
CREATE TABLE Operations (
    OperationID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT,
    Timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Description VARCHAR(255),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);