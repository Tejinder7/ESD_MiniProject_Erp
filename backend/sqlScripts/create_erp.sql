create table accounts_dept(
	employee_id int NOT NULL AUTO_INCREMENT,
	first_name varchar(30),
	last_name varchar(30),
	email varchar(30),
	password varchar(30),
	constraint pk_accounts_dept PRIMARY KEY (employee_id)
);

create table student(
        student_id integer NOT NULL AUTO_INCREMENT,
        roll_no smallint NOT NULL UNIQUE,
        first_name varchar(30) NOT NULL,
        last_name varchar(30),
        domain smallint,
        constraint pk_student PRIMARY KEY (student_id)
);

create table bill (
	id integer NOT NULL AUTO_INCREMENT,
       	description varchar(30), 
	amount int, 
	bill_date varchar(30), 
	deadline varchar(30), 
	bill_student_id integer, 
	constraint pk_bill PRIMARY KEY (id)
);
