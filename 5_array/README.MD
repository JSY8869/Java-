# 배열의 복사
- `ArrayEx3`
- `ArrayEx4`
# 배열의 활용
1. 총합과 평균 (`각 인덱스의 합 / 인덱스의 총 개수`)
2. 최대값과 최소값(`sort를 쓰는게....`)
3. 섞기 (`ArrayEx8`)
4. 임의의 값으로 배열 채우기 (`Math.random() 활용`)
5. 정렬하기(`sort를 쓰는게 가장 편함...`)
6. 빈도수 구하기(`ArrayEx11`)
# String Class
- char 배열을 사용하는 것보다 String클래스를 사용하는 것이 문자열을 다루기 더 편리함
- String 객체는 읽을수만 있고, 변경 불가
- 변경 시 새로운 문자열이 생성되는 것임
## 주요 메서드
- char charAt(int index) `->` 문자열에서 해당 위치에 있는 문자 반환
- int length() `->` 문자열의 길이 반환
- String substring(int from, int to) `->` 문자열의 해당 범위(from ~ to)에 있는 문자열 반환 (to는 범위에서 제외)
- boolean equals(Object obj) `->` 문자열의 내용이 obj와 같으면 `true` 다르면 `false` 반환
- char[] toCharArray() `->` 문자열을 문자배열로 변환해서 반환
## 커맨드 라인을 통해 입력받기
- 커맨드를 통해 실행 시 입력
- args라는 array에 들어가게 됨
# 다차원 배열
- 타입 변수이름[][] = {1,2,3},{4,5,6};<br>
- 2차원 array의 모든 요소의 합
```
for (int[] tmp : source){
    for (int i : tmp){
        sum += i;
    } 
}
```
- 각각 크기가 다른 2차원 배열도 생성 가능
```
int [][] score = new int[3][];
score[0] = new int[4];
score[2] = new int[2];
score[1] = new int[3];
```
# 다차원 배열의 활용
1. 좌표에 x표하기 (`MultiArrEx1`)
2. 빙고 (`MultiArrEx2`)