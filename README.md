# flightservice

### Create table with following details before running the project
create table flight (
	id int AUTO_INCREMENT PRIMARY KEY,
	flight_number varchar(20) not null,
	operating_airlines varchar(20) not null,
	departure_city varchar(20) not null,
	arrival_city varchar(20) not null,
	date_of_departure date not null,
	estimated_departure_time timestamp default current_timestamp
);

show tables;

insert into flight values(1,'AA1','American Airlines','AUS','NYC',str_to_date('02-05-18', '%m-%d-%y'),'2018-02-05 03:14:07');
insert into flight values(2,'AA2','American Airlines','AUS','EWR',str_to_date('02-05-18', '%m-%d-%y'),'2018-02-05 04:14:07');
insert into flight values(3,'AA3','American Airlines','AUS','DCC',str_to_date('02-05-18', '%m-%d-%y'),'2018-02-05 05:14:07');

select * from flight;