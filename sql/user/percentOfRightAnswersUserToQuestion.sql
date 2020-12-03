USE `testsystemdb`;
DROP procedure IF EXISTS `PercentOfRightAnswerUserToQuestion`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `PercentOfRightAnswerUserToQuestion` (user_id INT, question_id INT)
BEGIN
    SELECT SUM(correct)*100/COUNT(statisticId) AS PercentOfRightAnswerUserToQuestion
    FROM testsystemdb.statistic
    WHERE userId=user_id and questionId=question_id;
END$$

DELIMITER ;