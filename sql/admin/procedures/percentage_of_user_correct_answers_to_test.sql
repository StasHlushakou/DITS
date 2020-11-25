CREATE DEFINER=`admin`@`%` PROCEDURE `percentage_of_user_correct_answers_to_test`(userId integer, testId integer)
BEGIN
select ((
select sum(statistic.correct)
from statistic
join user
on statistic.userId = user.userId
join question
on statistic.questionId = question.questionId
join test
on question.testId = test.testId
where user.userId = userId and test.testId = testId ))
*100/
((select count(statistic.statisticId)
from statistic
join user
on statistic.userId = user.userId
join question
on statistic.questionId = question.questionId
join test
on question.testId = test.testId
where user.userId = userId and test.testId = testId )) as result;
END