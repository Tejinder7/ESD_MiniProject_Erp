alter table student 
	add constraint fk_domain FOREIGN KEY (domain) references domain(domain_id);

