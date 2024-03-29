-- 코드를 입력하세요
SELECT NAME, IN_TIME DATETIME
FROM (SELECT I.NAME, I.DATETIME IN_TIME, O.DATETIME OUT_TIME
        FROM ANIMAL_INS I
        LEFT JOIN ANIMAL_OUTS O
        ON I.ANIMAL_ID = O.ANIMAL_ID) IN_OUT
WHERE OUT_TIME IS NULL
ORDER BY IN_TIME
LIMIT  3