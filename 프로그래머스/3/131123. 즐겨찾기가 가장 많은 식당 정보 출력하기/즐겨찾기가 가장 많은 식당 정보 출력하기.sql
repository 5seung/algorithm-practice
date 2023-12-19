-- 코드를 입력하세요
-- "Every derived table must have its own alias" : 서브쿼리에 alias(이름)을 지정해야된다.
SELECT A.FOOD_TYPE, A.REST_ID, A.REST_NAME, A.FAVORITES
FROM REST_INFO A
INNER JOIN (
    SELECT FOOD_TYPE, MAX(FAVORITES) FAVORITES
    FROM REST_INFO 
    GROUP BY FOOD_TYPE
) B
ON A.FAVORITES = B.FAVORITES AND A.FOOD_TYPE = B.FOOD_TYPE
ORDER BY A.FOOD_TYPE DESC