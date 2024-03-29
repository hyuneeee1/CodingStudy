SELECT
      USER_ID
    , NICKNAME
    , (CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2) AS 전체주소
    , CASE WHEN LENGTH(TLNO) = 11 THEN SUBSTR(TLNO,0,3) || '-' || SUBSTR(TLNO,4,4) || '-' || SUBSTR(TLNO,8,4)
    END AS 전화번호
FROM USED_GOODS_USER
WHERE USER_ID IN (
                    SELECT
                        B.USER_ID
                    FROM USED_GOODS_BOARD A, USED_GOODS_USER B
                    WHERE A.WRITER_ID = B.USER_ID
                    GROUP BY B.USER_ID
                    HAVING COUNT(*) >=3
                )
ORDER BY USER_ID DESC;