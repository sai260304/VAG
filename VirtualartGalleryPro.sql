/* Designing the schema for a Virtual Art Gallery */
drop database Virtual_Art_Gallery;
create database Virtual_Art_Gallery;
use Virtual_Art_Gallery;

-- artwork table
create table Artwork(artworkID int primary key, 
title varchar(50),
description varchar(100), 
creationDate varchar(20), 
medium varchar(50), 
imageURL varchar(100));

alter table artwork add column artistID int ;
alter table artwork add foreign key (artistID) references artist(artistID);

select * from artwork;
desc artwork;

-- artist table
create table Artist(artistID int primary key,
name varchar(50), 
biography varchar(50), 
birthDate varchar(50), 
nationality varchar(50), 
website varchar(50), 
contactInformation varchar(50));

select * from artist;
desc artist;

-- user table
create table User(userID int Primary Key,
username varchar(50), 
password varchar(50), 
email varchar(50), 
firstName varchar(50), 
lastName varchar(50), 
dateOfBirth date,
profilePicture varchar(50),
FavoriteArtworks int,
foreign key (FavoriteArtworks) references artwork(artworkID));

select * from user;
desc user;

-- Gallery table
create table Gallery(galleryID int primary key, 
name varchar(50), 
description varchar(50), 
location varchar(50), 
curatorID int,
openingHours varchar(50),
foreign key (curatorID) references Artist(artistID)
);

select * from Gallery;
desc Gallery;
SET FOREIGN_KEY_CHECKS =1;
-- user_favourite_artwork table
create table FavoriteArtworks(userID int,
artworkID int,
primary key (userID, artworkID),
foreign key (userID) references User(userID) ON DELETE CASCADE ON UPDATE CASCADE,
foreign key (artworkID) references Artwork(artworkID)ON DELETE CASCADE ON UPDATE CASCADE

);

select * from FavouriteArtworks;
desc user_favourite_artwork;



