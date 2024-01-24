-- 2022년 5월에 예약한 환자 수, 진료과코드 별로 조회
--  진료과별 예약한 환자 수를 기준으로 오름차순 >  진료과 코드를 기준으로 오름차순
SELECT MCDP_CD 진료과코드, COUNT(APNT_NO) 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD BETWEEN '2022-5-1' AND '2022-5-31'
GROUP BY MCDP_CD
ORDER BY 5월예약건수 ASC, MCDP_CD ASC
