USE `testsystemdb`;
DROP procedure IF EXISTS `getUserResultStatistic`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `getUserResultStatistic` (user_id INT, firstQuestionTime datetime , lastQuestionTime datetime)
BEGIN
    SELECT * FROM testsystemdb.statistic where userId=user_id and correct=0 and date between firstQuestionTime and lastQuestionTime;
END$$

DELIMITER ;