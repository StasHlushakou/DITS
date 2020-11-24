CREATE PROCEDURE `percentage_of_correct_answers_to_test` (testId integer)
BEGIN
select ((select sum(statistic.correct)
from statistic
join question
on statistic.questionId = question.questionId
join test
on question.testId = test.testId
where test.testId = testId))*100/all_ans as result
from (
select count(statistic.statisticId) as all_ans
from statistic
join question
on statistic.questionId = question.questionId
join test
on question.testId = test.testId
where test.testId = testId) as t;
END
