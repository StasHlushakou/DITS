CREATE PROCEDURE `how_many_times_user_passed_test`(userId Integer, testId Integer)
BEGIN
select ((
select count(statistic.statisticId)
from statistic
join user
on statistic.userId = user.userId
join question
on statistic.questionId = question.questionId
join test
on question.testId = test.testId
where user.userId = userId and test.testId = testId
))
/
((
select count(question.questionId)
from question
join test
on question.testId = test.testId
where test.testId = testId
)) as result;
END