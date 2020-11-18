insert into topic (name, description)
VALUES ('Java Core', 'There are some tests about JDK, Java Versions, SDK and etc.'),
       ('Data Structures', 'You can check your knowledge about native structures of data here.');

insert into test (name, description, topicId)
VALUES ('Java Development Kit', 'How good you know JDK, JRE, JVM? Check it out that here.', 1),
       ('Java Core - Parent Class', 'The first things that every java developer must know.', 2);

insert into question (description, testId)
VALUES ('What is JRE?', 1),
       ('What is JVM?', 1),
       ('Is there java compiler?', 1),
       ('Select correct syntax of main-method java class.',2),
       ('what method is missing in the Object class?',2),
       ('How to compare 2 objects in java?',2),
       ('Where are objects stored in java?',2),
       ('How to compare 2 primitives in java?',2),
       ('Select correct class declaration in Java.',2),
       ('What is the NEW operator used for?',2),
       ('What does the extends keyword mean?',2),
       ('What does method overloading mean in Java?',2),
       ('What does overriding a method mean in Java.',2);

insert into answer (description, correct, questionId)
VALUES ('Java Runnable Entity', false, 1),
       ('Java Runtime Environment', true, 1),
       ('Java Runnable Environment', false, 1),
       ('Java Vendor Macintosh', false, 2),
       ('Java Virtual Model', false, 2),
       ('Java Virtual Machine', true, 2),
       ('In the JDK', true, 3),
       ('In the JRE', false, 3),
       ('In the JVM', false, 3),
       ('Compiler must be installed from a separate package (file)', false, 3),
       ('public int main(String[] args)',0,4),
       ('public static void main(String[] args)',1,4),
       ('public static int main(String[] args)',0,4),
       ('private static void main(String[] args)',0,4),
       ('waitAll()',1,5),
       ('toString()',0,5),
       ('equals()',0,5),
       ('hashCode()',0,5),
       ('Use operator ==',0,6),
       ('Use method compareTo()',0,6),
       ('Use method equals()',1,6),
       ('Use operator =',0,6),
       ('In collection',0,7),
       ('In string pool',0,7),
       ('In stack',0,7),
       ('In heap',1,7),
       ('Use operator ==',1,8),
       ('Use method compareTo()',0,8),
       ('Use method equals()',0,8),
       ('Use method equals()',0,8),
       ('new class MyClass {}',0,9),
       ('class MyClass {}',1,9),
       ('select * from class MyClass {}',0,9),
       ('MyClass extends class {}',0,9),
       ('To create a new variable.',0,10),
       ('To declare a new class.',0,10),
       ('To create an instance of a class.',1,10),
       ('It is the antagonist of the OLD operator.',0,10),
       ('That it is an additional module of a class that extends its properties.',0,11),
       ('That the two classes are doing the same thing.',0,11),
       ('That this is the largest class in the program.',0,11),
       ('That the given class is inherited from another.',1,11),
       ('Several methods with the same name but different set of parameters.',1,12),
       ('Several different classes with the same method.',0,12),
       ('Changing the behavior of a class method relative to a child.',0,12),
       ('Changing the behavior of a class method relative to its parent.',0,12),
       ('Changing the behavior of a class method relative to a child.',0,13),
       ('Changing the behavior of a class method relative to its parent.',1,13),
       ('Several methods with the same name but different set of parameters.',0,13),
       ('Several different classes with the same method.',0,13);

insert into role (role)
values ('USER'),
       ('ADMIN'),
       ('TUTOR');

insert into user (firstName, lastName, login, password)
values ('Stanislav', 'Hlushakou', 'rom', '$2y$12$HzCOIhFhLuJW8S9KcUU5jeBM2S/GY.Ew3NFdv6lBHCn93mAqFBcLy'),
       ('Pavel', 'Pobol', 'pobol', '$2y$12$HzCOIhFhLuJW8S9KcUU5jeBM2S/GY.Ew3NFdv6lBHCn93mAqFBcLy'),
       ('Tutor', 'Tutorov', 'tutor', '$2y$12$HzCOIhFhLuJW8S9KcUU5jeBM2S/GY.Ew3NFdv6lBHCn93mAqFBcLy');

insert into UsersRole (userId, roleId)
VALUES (1, 1),
       (2, 2),
       (3, 3);

insert into statistic (date, correct, questionId, userId)
VALUES ('10.10.2020', true, 1, 1),
       ('10.10.2020', true, 2, 1),
       ('10.10.2020', false, 3, 1),
       ('10.10.2020', true, 1, 2),
       ('10.10.2020', false, 2, 2),
       ('10.10.2020', true, 3, 2),
       ('10.10.2020', false, 1, 3),
       ('10.10.2020', true, 2, 3),
       ('10.10.2020', true, 3, 3);

insert into literature (description, questionId)
VALUES ('The best help you can find to google:)', 1),
       ('Wiki. About JVM.', 2),
       ('Wiki. About JDK.', 3),
       ('Java Fundamentals Tutorial: Hello World',4),
       ('Topic \"Object class in Java\"',5),
       ('Topic \"Difference between == and .equals() method in Java\"',6),
       ('Topic \"Stack Memory and Heap Space in Java\"',7),
       ('Topic \"Difference between == and .equals() method in Java\"',8),
       ('Topic \"new operator in Java\"',10),
       ('Topic \"The Class Declaration\"',9),
       ('Topic \"Java extends Keyword\"',11),
       ('Documentation \"Overriding and Hiding Methods\"',13),
       ('Topic \"Method Overloading in Java with examples\"',12);

insert into link (link, literatureId) 
VALUES ('https://www.google.com/search?q=What+is+JRE%3F%27&oq=What+is+JRE%3F%27&aqs=chrome..69i57.571j0j4&sourceid=chrome&ie=UTF-8', 1),
       ('https://en.wikipedia.org/wiki/Java_virtual_machine', 2),
       ('https://ru.wikipedia.org/wiki/Java_Development_Kit', 3),
       ('https://www.protechtraining.com/content/java_fundamentals_tutorial-hello_world',4),
       ('https://www.javatpoint.com/object-class',5),
       ('https://www.javatpoint.com/java-string-equals#:~:text=The%20java%20string%20equals(),()%20method%20of%20Object%20class.',6),
       ('https://www.javatpoint.com/java-string-equals#:~:text=The%20java%20string%20equals(),()%20method%20of%20Object%20class.',7),
       ('https://www.javatpoint.com/java-string-equals#:~:text=The%20java%20string%20equals(),()%20method%20of%20Object%20class.',8),
       ('https://www.cs.princeton.edu/courses/archive/spr96/cs333/java/tutorial/java/javaOO/classdecl.html#:~:text=The%20class%20declaration%20component%20declares,class%20that%20you%20are%20defining.',10),
       ('https://www.geeksforgeeks.org/new-operator-java/',9),
       ('https://www.w3schools.com/java/ref_keyword_extends.asp#:~:text=The%20extends%20keyword%20extends%20a,that%20inherits%20from%20another%20class',11),
       ('https://beginnersbook.com/2013/05/method-overloading/',13),
       ('https://docs.oracle.com/javase/tutorial/java/IandI/override.html#:~:text=The%20ability%20of%20a%20subclass,the%20method%20that%20it%20overrides.',12);
