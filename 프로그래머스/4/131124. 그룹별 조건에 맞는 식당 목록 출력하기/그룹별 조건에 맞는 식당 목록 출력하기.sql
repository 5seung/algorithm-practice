-- 코드를 입력하세요
-- 리뷰를 가장 많이 작성한 회원의 리뷰들
-- 리뷰 작성일(오름차순) > 리뷰 텍스트(오름차순)
SELECT MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') REVIEW_DATE
FROM REST_REVIEW R
JOIN MEMBER_PROFILE P
ON R.MEMBER_ID = P.MEMBER_ID
WHERE R.MEMBER_ID = (SELECT MEMBER_ID
                     FROM REST_REVIEW 
                     GROUP BY MEMBER_ID 
                     ORDER BY COUNT(MEMBER_ID) DESC
                     LIMIT 1)
ORDER BY REVIEW_DATE ASC, REVIEW_TEXT ASC