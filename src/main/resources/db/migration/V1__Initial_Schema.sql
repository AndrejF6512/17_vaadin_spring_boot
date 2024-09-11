CREATE TABLE person (
  id bigint auto_increment,
  birth_day timestamp,
  email varchar(255) not null,
  name varchar(50) not null,
  phone_number varchar(255),
  primary key (id));

INSERT INTO person (id,name,birth_day,email) VALUES (1,'Anna Horná','1991-01-20','anna.horna@gmail.com'),(2,'Peter Dolný','1993-06-29','peter.dolny@gmail.com'),(3,'Ján Stredný','1991-06-11','jan.stredny@gmail.com');
