create table `order`(
  id	int primary key auto_increment,
  petId	int,
  quantity	int,
  shipDate	datetime,
  status	enum('placed', 'approved', 'delivered'),
  complete	 tinyint(1)
);

create table Category(
  c_id	int primary key  auto_increment,
  c_name	text
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
  t_id	int primary key auto_increment,
  t_name	varchar(20)
);

create table pet(
  id int primary key  auto_increment,
  categoryid int ,
  name varchar(20),
  photoUrls text,
  tags int ,
  price int ,
  status enum( 'available', 'pending', 'sold' )
);

drop  table pet





