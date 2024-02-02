-- 저자 별, 카테고리 별 매출액
SELECT B.AUTHOR_ID, AUTHOR_NAME, CATEGORY, SUM(SALES*PRICE) TOTAL_SALES
FROM BOOK B
JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
JOIN BOOK_SALES BS ON B.BOOK_ID = BS.BOOK_ID
WHERE SALES_DATE LIKE "2022-01-%"
GROUP BY B.AUTHOR_ID, CATEGORY
ORDER BY AUTHOR_ID ASC, CATEGORY DESC
