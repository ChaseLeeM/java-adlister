USE adlister_db;

INSERT INTO users (username, email, password) VALUES ('user1', 'user1@email.email', 'password');

INSERT INTO ads (user_id, title, description) VALUES
                                                  (1, 'title1', 'description1'),
                                                    (1, 'title2', 'description2'),
                                                    (1, 'title3', 'description3'),
                                                    (1, 'title4', 'description4'),
                                                    (1, 'title5', 'description5'),
                                                    (1, 'title6', 'description6'),
                                                    (1, 'title7', 'description7'),
                                                    (1, 'title8', 'description8'),
                                                    (1, 'title9', 'description9'),
                                                    (1, 'title10', 'description10');
