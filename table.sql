SET SCHEMA 'healthy-recipes';

 CREATE TABLE users (
 	user_id SERIAL PRIMARY KEY,
 	username VARCHAR(50) UNIQUE NOT NULL,
 	pass VARCHAR(50) NOT NULL,
 	email VARCHAR(150) UNIQUE NOT NULL,
 	avatar TEXT
 )

SELECT * FROM users

 CREATE TABLE diet_label_table (
 	diet_label_id SERIAL PRIMARY KEY,
 	diet_label VARCHAR(50) NOT NULL
 );

 SELECT * FROM diet_label_table

 CREATE TABLE recipe_table (
 	recipe_id SERIAL PRIMARY KEY,
 	image TEXT,
 	recipe_url TEXT UNIQUE ,
 	recipe_name TEXT, -- api is label for food name
 	health_label TEXT,
 	diet_label_id INTEGER references diet_label_table(diet_label_id),
 	ingredients TEXT,
 	yield INTEGER,
 	calories NUMERIC,
 	fat NUMERIC, -- FAT
 	protein NUMERIC, --PROCNT
 	carbs NUMERIC, --CHOCDF
 	fiber NUMERIC, --FIBTG
 	sodium NUMERIC, -- NA
 	cholesterol NUMERIC --CHOLE
 );

 SELECT * FROM recipe_table

 CREATE TABLE comment_table (
 	user_id INTEGER REFERENCES users(user_id),
 	recipe_id INTEGER REFERENCES recipe_table(recipe_id),
 	post TEXT 
 );

 SELECT * FROM comment_table

 INSERT INTO diet_label_table (diet_label) VALUES ('balanced'), ('high protein'), ('high fiber'), ('low fat'), ('low carb'), ('low sodium');









