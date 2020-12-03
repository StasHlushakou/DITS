USE `testsystemdb`;
DROP procedure IF EXISTS `NumberOfAnswerUserToQuestion`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `NumberOfAnswerUserToQuestion` (user_id INT, question_id INT)
BEGIN
    SELECT COUNT(statisticId) NumberOfAnswerUserToQuestion
    FROM testsystemdb.statistic
    WHERE userId=user_id and questionId=question_id;
END$$

DELIMITER ;