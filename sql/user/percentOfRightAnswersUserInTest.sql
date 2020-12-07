USE `testsystemdb`;
DROP procedure IF EXISTS `PercentOfRightAnswerUserInTest`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `PercentOfRightAnswerUserInTest` (user_id INT, firstQuestionTime datetime , lastQuestionTime datetime)
BEGIN
    SELECT SUM(correct)*100/COUNT(statisticId) AS PercentOfRightAnswerUserInTest
    FROM testsystemdb.statistic
    WHERE  userId=user_id and date between firstQuestionTime and lastQuestionTime;
END$$

DELIMITER ;