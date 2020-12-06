CREATE DEFINER=`admin`@`%` PROCEDURE `how_many_times_test_passed`(testId integer)
BEGIN
Select max((
Select count(statisticId) 
from statistic
inner join question 
on question.questionId = statistic.questionId
where question.questionId = q_id)) as result
from (
select question.questionId as q_id
from question
join test
on question.testId = test.testId
where test.testId = testId) as t;
END