USE `testsystemdb`;
DROP procedure IF EXISTS `getUserStatistic`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `getUserResultStatistic` (user_id INT, firstQuestionTime datetime , lastQuestionTime datetime)
BEGIN
    SELECT * FROM testsystemdb.statistic where userId=user_id and date between firstQuestionTime and lastQuestionTime;
END$$

DELIMITER ;