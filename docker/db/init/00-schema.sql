DROP TABLE IF EXISTS messages;

CREATE TABLE messages (
  id INT PRIMARY KEY AUTO_INCREMENT,
  lang CHAR(2) UNIQUE NOT NULL,
  text VARCHAR(32) NOT NULL
);
