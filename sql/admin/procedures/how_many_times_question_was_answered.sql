CREATE PROCEDURE `how_many_times_question_was_answered`(questionId integer)
BEGIN
Select count(statisticId) 
from statistic
inner join question 
on question.questionId = statistic.questionId
where question.questionId = questionId;
END