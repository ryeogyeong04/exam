-- 3. 부서번호(DNO)가 10 또는 30 에 속하고, 
-- 부서번호별, 부서명별 최고급여가 3000 이상인 사원의 
-- 부서번호, 부서명, 최고급여를 화면에 표시하세요

-- 부서번호 : DNO
-- 부서명 : DNAME
-- 급여 : SALARY
-- 사원테이블 : EMPLOYEE
-- 부서테이블 : DEPARTMENT


SELECT D.DNO, D.DNAME, MAX(E.SALARY) AS "최고 급여"
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DNO = D.DNO
WHERE E.DNO IN (10 , 30)
GROUP BY D.DNO, D.DNAME
HAVING MAX(E.SALARY) >= 3000;