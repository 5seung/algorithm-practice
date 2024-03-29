-- 코드를 입력하세요
-- 생산일자가 2022년 5월인 식품들
-- 1. 총매출을 기준으로 내림차순 정렬, 2. 식품 ID를 기준으로 오름차순
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(P.PRICE*O.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT P
INNER JOIN FOOD_ORDER O
ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE PRODUCE_DATE BETWEEN '2022-05-01' AND '2022-05-31'
GROUP BY P.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC
