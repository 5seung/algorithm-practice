-- 12세 이하인 여자환자
-- 전화번호가 없는 경우, 'NONE'으로 출력
-- 나이를 기준으로 내림차순, 환자이름을 기준으로 오름차순
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') TLNO
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC