CREATE PROCEDURE `percentage_of_correct_answers_to_question`(questionId integer)
BEGIN
select SUM(correct)*100/COUNT(statisticId) 
from statistic
inner join question 
on question.questionId = statistic.questionId
where question.questionId = questionId;
END