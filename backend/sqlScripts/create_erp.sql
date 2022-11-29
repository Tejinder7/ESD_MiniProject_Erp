create table accounts_dept(
	employee_id smallint,
	first_name varchar(30),
	last_name varchar(30),
	email varchar(30),
	password varchar(30),
	constraint pk_accounts_dept PRIMARY KEY (employee_id)
);

create table student(
        student_id smallint,
        roll_no smallint NOT NULL UNIQUE,
        first_name varchar(30) NOT NULL,
        last_name varchar(30),
        domain smallint,
        constraint pk_student PRIMARY KEY (student_id)
);

create table bill (
	id smallint,
       	description varchar(30), 
	amount int, 
	bill_date varchar(30), 
	deadline varchar(30), 
	bill_student_id smallint, 
	constraint pk_bill PRIMARY KEY (id)
);
