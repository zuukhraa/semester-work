create table users (
    id serial primary key,
    first_name varchar(30) not null,
    last_name varchar(30) not null,
    login varchar(30) not null,
    password varchar(20) not null,
    phone_number varchar(15) not null,
    faculty_name varchar(30) not null
);

select * from users;