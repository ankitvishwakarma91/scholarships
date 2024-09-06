CREATE TABLE IF NOT EXISTS `registration_page` (
--                                              `contact_id` int AUTO_INCREMENT  PRIMARY KEY,
                                             `firstname` varchar(100) NOT NULL,
    `middlename` varchar(100) NOT NULL,
    `lastname` varchar(100) NOT NULL,
    `mobileno` varchar(10) NOT NULL,
    `email` varchar(100) NOT NULL,
    `address` varchar(500) NOT NULL,
    `city` varchar(10) NOT NULL,
    `password` varchar(50) NOT NULL
    );