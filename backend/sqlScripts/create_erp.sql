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

create table domain(
        domain_id smallint,
        program varchar(30) NOT NULL,
        batch year NOT NULL,
        constraint pk_domain PRIMARY KEY (domain_id)
);
