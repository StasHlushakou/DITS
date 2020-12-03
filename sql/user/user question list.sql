USE `testsystemdb`;
DROP procedure IF EXISTS `getUserQuestionList`;

DELIMITER $$
USE `testsystemdb`$$
CREATE PROCEDURE `getUserQuestionList` (user_id INT)
BEGIN
    SELECT * FROM testsystemdb.question where questionId IN (SELECT questionId FROM testsystemdb.statistic where userId=user_id GROUP BY  questionId);
END$$

DELIMITER ;