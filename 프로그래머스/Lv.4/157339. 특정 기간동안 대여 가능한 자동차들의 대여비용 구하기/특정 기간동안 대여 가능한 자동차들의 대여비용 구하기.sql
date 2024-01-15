-- 코드를 입력하세요
-- 자동차 종류가 '세단' 또는 'SUV'
-- 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능
-- 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차
-- 금액을 기준으로 내림차순, 자동차 종류를 기준으로 오름차순, 자동차 ID를 기준으로 내림차순
SELECT C.CAR_ID, C.CAR_TYPE, 
    ROUND((DAILY_FEE*30)*(100-(SELECT DISCOUNT_RATE 
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                    WHERE CAR_TYPE = C.CAR_TYPE 
                    AND DURATION_TYPE = "30일 이상"))/100)
    AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY RH
ON C.CAR_ID = RH.CAR_ID
WHERE C.CAR_TYPE IN ("세단", "SUV")
AND (C.CAR_ID NOT IN (SELECT CAR_ID 
                       FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                       WHERE START_DATE <= '2022-11-01' and END_DATE >= '2022-11-01'))
GROUP BY C.CAR_ID    
HAVING FEE >= 500000 AND FEE < 2000000
ORDER BY FEE DESC, CAR_TYPE ASC, CAR_ID DESC
