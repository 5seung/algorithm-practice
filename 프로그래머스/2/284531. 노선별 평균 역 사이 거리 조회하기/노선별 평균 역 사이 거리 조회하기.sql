-- TOTAL_DISTANCE : 테이블 내 존재하는 역들의 역 사이 거리의 총 합(소수 둘째자리 반올림)
-- AVERAGE_DISTANCE : 평균 역 사이 거리(소수 셋째자리 반올림)
-- 단위(km)를 함께 출력
-- 총 누계 거리를 기준으로 내림차순
SELECT ROUTE,
       CONCAT(ROUND(SUM(D_BETWEEN_DIST),1),'km') TOTAL_DISTANCE,
       CONCAT(ROUND(AVG(D_BETWEEN_DIST),2),'km') AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY SUM(D_BETWEEN_DIST) DESC