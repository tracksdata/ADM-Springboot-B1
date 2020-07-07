
CREATE TABLE `airline_info` (
  `airline_id` bigint(20) NOT NULL,
  `airline_logo` varchar(255) DEFAULT NULL,
  `name_of_airline` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`airline_id`)
);


INSERT INTO `airline_info` VALUES (1, '', 'Air India');
INSERT INTO `airline_info` VALUES (6, '', 'Indigo');
INSERT INTO `airline_info` VALUES (11, '', 'Air Asia');
INSERT INTO `airline_info` VALUES (16, '', 'Spicejet');
INSERT INTO `airline_info` VALUES (21, '', 'Vistara');
INSERT INTO `airline_info` VALUES (26, '', 'Trujet');
INSERT INTO `airline_info` VALUES (31, '', 'GoAir');




CREATE TABLE `fare` (
  `fare_id` bigint(20) NOT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `fare` double NOT NULL,
  PRIMARY KEY (`fare_id`)
);



INSERT INTO `fare` VALUES (37, 'INR', 4500);
INSERT INTO `fare` VALUES (40, 'INR', 3500);
INSERT INTO `fare` VALUES (43, 'INR', 5000);
INSERT INTO `fare` VALUES (46, 'INR', 2546);
INSERT INTO `fare` VALUES (49, 'INR', 7500);
INSERT INTO `fare` VALUES (52, 'INR', 10000);
INSERT INTO `fare` VALUES (55, 'INR', 7438);
INSERT INTO `fare` VALUES (58, 'INR', 8743);
INSERT INTO `fare` VALUES (61, 'INR', 1955);
INSERT INTO `fare` VALUES (64, 'INR', 2500);
INSERT INTO `fare` VALUES (67, 'INR', 4943);



CREATE TABLE `flight` (
  `id` bigint(20) NOT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `duration` varchar(255) DEFAULT NULL,
  `flight_date` datetime DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  `origin` varchar(255) DEFAULT NULL,
  `fare_id` bigint(20) DEFAULT NULL,
  `flight_infoid` bigint(20) DEFAULT NULL,
  `inv_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpekyhxlpp2g4l0emd9vj9qjvc` (`fare_id`),
  KEY `FKh342xxi0c2ciiqifrhhc9g2kf` (`flight_infoid`),
  KEY `FKi31ay2wj2odp6ij5uvfunmk0y` (`inv_id`),
  CONSTRAINT `FKh342xxi0c2ciiqifrhhc9g2kf` FOREIGN KEY (`flight_infoid`) REFERENCES `flight_info` (`flight_infoid`),
  CONSTRAINT `FKi31ay2wj2odp6ij5uvfunmk0y` FOREIGN KEY (`inv_id`) REFERENCES `inventory` (`inv_id`),
  CONSTRAINT `FKpekyhxlpp2g4l0emd9vj9qjvc` FOREIGN KEY (`fare_id`) REFERENCES `fare` (`fare_id`)
);



INSERT INTO `flight` VALUES (36, 'CHENNAI', '2 hrs 15 mins', '2020-08-21 02:12:00', 'AI-840', 'DELHI', 37, 2, 38);
INSERT INTO `flight` VALUES (39, 'HYDERABAD', '2 hrs 45 mins', '2020-08-21 06:56:00', 'AI-850', 'DELHI', 40, 3, 41);
INSERT INTO `flight` VALUES (42, 'MUMBAI', '2 hrs 50 mins', '2020-08-21 08:23:00', 'AI-860', 'CHENNAI', 43, 4, 44);
INSERT INTO `flight` VALUES (45, 'HYDERABAD', '1 hrs 45 mins', '2020-08-21 01:38:00', 'AI-870', 'PUNE', 46, 5, 47);
INSERT INTO `flight` VALUES (48, 'PORTBLAIR', '3 hrs 00 mins', '2020-08-21 03:30:00', '6E-6684', 'CHENNAI', 49, 7, 50);
INSERT INTO `flight` VALUES (51, 'DELHI', '3 hrs 15 mins', '2020-08-21 09:15:00', '6E-6685', 'BENGULURU', 52, 8, 53);
INSERT INTO `flight` VALUES (54, 'PUNE', '4 hrs 07 mins', '2020-08-21 11:15:00', '6E-6686', 'DELHI', 55, 9, 56);
INSERT INTO `flight` VALUES (57, 'MANGALORE', '3 hrs 30 mins', '2020-08-27 11:45:00', '6E-6687', 'HYDERABAD', 58, 10, 59);
INSERT INTO `flight` VALUES (60, 'AHMADABAD', '6 hrs 00 mins', '2020-08-25 07:15:00', 'I5-755', 'MUMBAI', 61, 12, 62);
INSERT INTO `flight` VALUES (63, 'KOLKATA', '3 hrs 15 mins', '2020-09-12 09:45:00', 'I5-756', 'HYDERABAD', 64, 13, 65);
INSERT INTO `flight` VALUES (66, 'DELHI', '1 hrs 00 mins', '2020-10-05 11:45:00', 'I5-757', 'KOLKATA', 67, 14, 68);
COMMIT;


CREATE TABLE `flight_info` (
  `flight_infoid` bigint(20) NOT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  `flight_type` varchar(255) DEFAULT NULL,
  `numberof_seats` int(11) NOT NULL,
  PRIMARY KEY (`flight_infoid`)
);



INSERT INTO `flight_info` VALUES (2, 'AI-840', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (3, 'AI-850', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (4, 'AI-860', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (5, 'AI-870', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (7, '6E-6684', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (8, '6E-6685', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (9, '6E-6686', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (10, '6E-6687', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (12, 'I5-755', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (13, 'I5-756', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (14, 'I5-757', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (15, 'I5-758', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (17, 'SG-432', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (18, 'SG-433', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (19, 'SG-434', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (20, 'SG-435', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (22, 'UK-830', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (23, 'UK-831', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (24, 'UK-832', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (25, 'UK-833', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (27, '2T-518', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (28, '2T-519', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (29, '2T-520', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (30, '2T-521', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (32, 'G8-424', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (33, 'G8-425', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (34, 'G8-426', 'Airbus', 150);
INSERT INTO `flight_info` VALUES (35, 'G8-427', 'Airbus', 150);
COMMIT;



CREATE TABLE `flights_info` (
  `airline_id` bigint(20) NOT NULL,
  `flight_infoid` bigint(20) NOT NULL,
  UNIQUE KEY `UK_mnghyk14c0ufcb2gs2k6fab40` (`flight_infoid`),
  KEY `FKm5m2579nqtr1wele0bimvme8m` (`airline_id`),
  CONSTRAINT `FKlda61sltnw69kxw7b0gx6sj5s` FOREIGN KEY (`flight_infoid`) REFERENCES `flight_info` (`flight_infoid`),
  CONSTRAINT `FKm5m2579nqtr1wele0bimvme8m` FOREIGN KEY (`airline_id`) REFERENCES `airline_info` (`airline_id`)
);

INSERT INTO `flights_info` VALUES (1, 2);
INSERT INTO `flights_info` VALUES (1, 3);
INSERT INTO `flights_info` VALUES (1, 4);
INSERT INTO `flights_info` VALUES (1, 5);
INSERT INTO `flights_info` VALUES (6, 7);
INSERT INTO `flights_info` VALUES (6, 8);
INSERT INTO `flights_info` VALUES (6, 9);
INSERT INTO `flights_info` VALUES (6, 10);
INSERT INTO `flights_info` VALUES (11, 12);
INSERT INTO `flights_info` VALUES (11, 13);
INSERT INTO `flights_info` VALUES (11, 14);
INSERT INTO `flights_info` VALUES (11, 15);
INSERT INTO `flights_info` VALUES (16, 17);
INSERT INTO `flights_info` VALUES (16, 18);
INSERT INTO `flights_info` VALUES (16, 19);
INSERT INTO `flights_info` VALUES (16, 20);
INSERT INTO `flights_info` VALUES (21, 22);
INSERT INTO `flights_info` VALUES (21, 23);
INSERT INTO `flights_info` VALUES (21, 24);
INSERT INTO `flights_info` VALUES (21, 25);
INSERT INTO `flights_info` VALUES (26, 27);
INSERT INTO `flights_info` VALUES (26, 28);
INSERT INTO `flights_info` VALUES (26, 29);
INSERT INTO `flights_info` VALUES (26, 30);
INSERT INTO `flights_info` VALUES (31, 32);
INSERT INTO `flights_info` VALUES (31, 33);
INSERT INTO `flights_info` VALUES (31, 34);
INSERT INTO `flights_info` VALUES (31, 35);
COMMIT;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
);



INSERT INTO `hibernate_sequence` VALUES (69);
INSERT INTO `hibernate_sequence` VALUES (69);
INSERT INTO `hibernate_sequence` VALUES (69);
INSERT INTO `hibernate_sequence` VALUES (69);
INSERT INTO `hibernate_sequence` VALUES (69);
COMMIT;



CREATE TABLE `inventory` (
  `inv_id` bigint(20) NOT NULL,
  `count` int(11) NOT NULL,
  PRIMARY KEY (`inv_id`)
);


INSERT INTO `inventory` VALUES (38, 100);
INSERT INTO `inventory` VALUES (41, 100);
INSERT INTO `inventory` VALUES (44, 100);
INSERT INTO `inventory` VALUES (47, 100);
INSERT INTO `inventory` VALUES (50, 100);
INSERT INTO `inventory` VALUES (53, 100);
INSERT INTO `inventory` VALUES (56, 100);
INSERT INTO `inventory` VALUES (59, 100);
INSERT INTO `inventory` VALUES (62, 100);
INSERT INTO `inventory` VALUES (65, 100);
INSERT INTO `inventory` VALUES (68, 100);
COMMIT;

