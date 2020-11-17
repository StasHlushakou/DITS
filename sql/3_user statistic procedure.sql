USE `testsystemdb`;
DROP procedure IF EXISTS `getUserStatistic`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `getUserStatistic` (user_id INT)
BEGIN
       SELECT SUM(correct) AS correctAnswer, COUNT(statisticId) AS numberOfAnswer, SUM(correct)*100/COUNT(statisticId) AS percentOfRightAnswer 
    FROM testsystemdb.statistic 
    WHERE userId=user_id;
END$$

DELIMITER ;