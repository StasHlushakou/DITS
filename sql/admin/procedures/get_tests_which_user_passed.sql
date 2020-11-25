CREATE DEFINER=`admin`@`%` PROCEDURE `get_tests_which_user_passed`(userId integer)
BEGIN
select distinct test.testId, test.name, test.description, test.topicId 
from test 
join question
on test.testId = question.testId
join statistic
on question.questionId = statistic.questionId
join user
on statistic.userId = user.userId
where user.userId = userId;
END