create table `order`(
  id	int primary key auto_increment,
  petId	int,
  quantity	int,
  shipDate	datetime,
  status	enum('placed', 'approved', 'delivered'),
  complete	 tinyint(1)
);

create table Category(
  id	int primary key  auto_increment,
  name	text
);

create table `user` (
  id        int primary key auto_increment,
  username  varchar(40),
  firstName varchar(20),
  lastName  varchar(20),
  email     varchar(40),
  password  varchar(40),
  phone varchar(25),
  userStatus int
);

create  table Tag(
  id	int primary key auto_increment,
  name	varchar(20)
);

create table pet(
  id int primary key  auto_increment,
  category int ,
  name varchar(20),
  photoUrls text,
  tags int ,
  price int ,
  status enum( 'available', 'pending', 'sold' )
);

drop  table pet





